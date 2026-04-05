public class StringSample {
    static void main() {
        String name = "2,3,5,6,7,8,9,9,5,3,3";

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(3));
        System.out.println(name.concat("jaya"));

        String[] s = name.split(",");

        for (String s1 : s) {
            System.out.println(s1);
        }

    }
}
