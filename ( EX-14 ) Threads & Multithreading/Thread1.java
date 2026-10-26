class NewThread implements Runnable {
    Thread t;
    int i;
    String str;
    NewThread(int i, String str,int pri) {
        this.i = i;
        this.str = str;
        t = new Thread(this);
        t.setName(str);
        t.setPriority(pri);
    }
    public void run() {
        try {
            System.out.println("Priority "+str+" : "+t.getPriority());
            for (int j = 1; j <= 5; j++) {
                System.out.print((i * j) + " ");
                Thread.sleep(100);
            }
            System.out.println();
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }
}

public class Thread1 {
    public static void main(String args[]) {
        NewThread obj1 = new NewThread(2, "Thread A",1);
        NewThread obj2 = new NewThread(3, "Thread B",5);
        NewThread obj3 = new NewThread(5, "Thread C",10);

        try {
            if(!obj1.t.isAlive()) { System.out.println("A is Not Alive"); }
            obj1.t.start();
            if(obj1.t.isAlive()) { System.out.println("A is Alive"); }
            obj1.t.join();
            if(!obj1.t.isAlive()) { System.out.println("A is Not Alive"); }
            
            obj2.t.start();
            obj2.t.join();

            obj3.t.start();
            obj3.t.join();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/* The join() method in Java is used to pause the execution of the current thread
 (in this case, the main thread)
 until the thread it's called on (obj1.t, which is Thread A) completely dies
 (finishes executing its run() method). */