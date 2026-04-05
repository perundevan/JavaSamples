public class ThreadTest {

    static void main() {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.start();
        t2.start();
    }

}

class Test extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread()+"" +i);
        }
    }
}