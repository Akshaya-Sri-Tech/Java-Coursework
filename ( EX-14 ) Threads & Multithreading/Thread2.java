class NewThread extends Thread {
    int i;
    String str;
    NewThread(int i, String str,int pri) {
        this.i = i;
        this.str = str;
        super.setName(str);
        super.setPriority(pri);
    }
    public void run() {
        try {
            System.out.println("Priority "+str+" : "+super.getPriority());
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

public class Thread2 {
    public static void main(String args[]) {
        NewThread obj1 = new NewThread(2, "Thread A",1);
        NewThread obj2 = new NewThread(5, "Thread B",5);
        NewThread obj3 = new NewThread(10, "Thread C",10);

        try {
            if(!obj1.isAlive()) { System.out.println("A is Not Alive"); }
            obj1.start();
            if(obj1.isAlive()) { System.out.println("A is Alive"); }
            obj1.join();
            if(!obj1.isAlive()) { System.out.println("A is Not Alive"); }
            
            obj2.start();
            obj2.join();

            obj3.start();
            obj3.join();

            System.out.println("All three threads have completed execution.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
