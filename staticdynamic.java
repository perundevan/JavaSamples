class animal{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}
class dog extends animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
    void specialBehavior(){
        System.out.println("Dog wags tail");
    }
}
public class staticdynamic {
     static void main(String[] arg) {
        animal a = new animal();
        a.sound();
        animal dog = new dog();
        dog.sound();
        dog specificdog = new dog();
        specificdog.specialBehavior();
    }
}