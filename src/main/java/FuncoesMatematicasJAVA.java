public class FuncoesMatematicasJAVA {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(z);

        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de " + z + " = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + "² = " + B);
        System.out.println("5² = " + C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("O valor absoluto de " + y + " = " + A);
        System.out.println("O valor absoluto de " + z + " = " + B);

        double delta;
        double a = 2;
        double b = 8;
        double c = 4;
        double x1;
        double x2;

        delta = Math.pow(b, 2.0) - 4 * a * c;

        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (- b - Math.sqrt(delta)) / (2.0 * a);

        System.out.println(delta);
        System.out.println(x1);
        System.out.println(x2);

    }
}
