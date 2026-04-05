import java.sql.SQLOutput;

class Calculator{
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }

}
public class Static{
    public static void main(String[]args){
        Calculator c = new Calculator();
        System.out.println(c.add(20,40));
        System.out.println(c.add(20,40,60));
    }
}
