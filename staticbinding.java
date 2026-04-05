class human{
    void walk(){
        System.out.println("Human walks");
    }
}
class boy extends human{
    void walk(){
        System.out.println(" boy walks");
    }
}
public class staticbinding{
    public static void main(String[]args){
        human obj = new boy();
        human obj1 = new human();
        obj.walk();
        obj1.walk();
    }
}
