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
            int max = (i == 1) ? 9 : 10;
            for (int j = i; j <= max; j+=2) {
                System.out.println(t.getName()+" ("+t.getPriority()+") : "+j + " ");
                Thread.sleep(100);
            }
            System.out.println();
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }
}

public class Thread3 {
    public static void main(String args[]) {
        NewThread obj1 = new NewThread(1, "Thread A",1);
        NewThread obj2 = new NewThread(2, "Thread B",5);

        try {
            obj1.t.start();
            obj2.t.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
