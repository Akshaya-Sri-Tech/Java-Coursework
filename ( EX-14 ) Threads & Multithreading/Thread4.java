class PetrolStation {
    int fuel = 0;
    synchronized void produce() throws InterruptedException {
        while (fuel > 0)
            wait();
        for (int i = 0; i < 2; i++) {
            fuel++;
            System.out.println("Producer: Added 1 unit of fuel. Fuel level: " + fuel);
        }
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (fuel == 0)
            wait();
        fuel--;
        System.out.println("Consumer: Consumed 1 unit of fuel. Fuel level: " + fuel);
        if (fuel == 0)
            notify();
    }
}

class Producer implements Runnable {
    PetrolStation p;
    Producer(PetrolStation p) {
        this.p = p;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                p.produce();
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

class Consumer implements Runnable {
    PetrolStation p;
    Consumer(PetrolStation p) {
        this.p = p;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                p.consume();
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

class Thread4 {
    public static void main(String[] args) {
        PetrolStation p = new PetrolStation();
        Thread producer = new Thread(new Producer(p));
        Thread consumer = new Thread(new Consumer(p));
        producer.start();
        consumer.start();
    }
}
