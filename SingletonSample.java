public class SingletonSample {

    private static SingletonSample singletonSample;

    private SingletonSample(){

    }

    public static SingletonSample getInstance(){
        if(singletonSample != null){
            return singletonSample;
        } else{
            singletonSample = new SingletonSample();
            return singletonSample;
        }
    }


    static void main() {

        SingletonSample singletonSample = SingletonSample.getInstance();

    }
}

