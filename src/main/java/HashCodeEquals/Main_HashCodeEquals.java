package HashCodeEquals;

public class Main_HashCodeEquals {
    public static void main(String[] args) {

        Client c1 = new Client("Anelisi", "anelisi@southsystem.com");
        Client c2 = new Client("Arthur", "arthur@southsystem.com");
        Client c3 = new Client("Anelisi", "anelisi@unisinos.com");

        String a = "Test";
        String b = "Test";
        String c = new String("Test");
        String d = new String("Test");


        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(a == b);
        System.out.println(c == d);
    }
}
