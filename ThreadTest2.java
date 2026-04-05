public class ThreadTest2 {
    static void main() {
        Test1 t1 = new Test1();
        Thread t = new Thread(t1);

        t.start();
    }
}

class Test1 implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}