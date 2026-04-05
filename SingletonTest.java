//public class SingletonTest {
//}
class SingletonClass {

    private static SingletonClass instance;

     private SingletonClass() {
        // private constructor
    }

    public static synchronized SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}

public class SingletonTest {
    public static void main(String[] args) {

        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);
    }
}