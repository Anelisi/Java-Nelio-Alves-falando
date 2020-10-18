package Bank;

public class Main_Bank {

    public static void main(String[] args) {

        Account acc = new Account(1001,"Arthur", 67000,1);
        BusinessAccount bscc = new BusinessAccount(1002, "Tutui", 200000, 2,17000);

        // UPCASTING

        Account acc1 = bscc;
        Account acc2 = new BusinessAccount(1003,"Anelisi",800000,2,17000);
        Account acc3 = new SavingsAccount(1004,"Anelisi",14000,1,0.02);

        // DOWNCASTING
        BusinessAccount bscc1 = (BusinessAccount)acc2;
        bscc1.loan(400);
        acc.withDraw(122);
        acc1.withDraw(211);
        acc2.withDraw(50);
        acc3.withDraw(80);
        acc3.deposit(2500);
        bscc.withDraw(20);
        bscc1.withDraw(1400);




       /* System.out.println(acc);
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        System.out.println(bscc);
        System.out.println(bscc1);*/

        int conta = 5;
        Account c = null;
        for (int i = 0; i < conta; i ++) {

            switch (i) {
                case 0:  c = acc;
                    break;

                case 1: c = acc1;
                    break;

                case 2: c = acc2;
                    break;

                case 3: c = acc3;
                    break;

                case 4: c = bscc;
                    break;

                case 5: c = bscc1;
                    break;
            }
            System.out.println("============================================");
            System.out.print("Cliente: " + c.getHolder() + "\nNº da conta: " + c.getNumber());
            if (c.getTipoConta()== 1) {
                System.out.println("\nTipo de conta: Poupança");
            } else System.out.println("\nTipo de conta: Empresarial");
            System.out.printf("Saldo da conta: R$ %.2f", c.getBalance());
            System.out.println("\n============================================");
        }
    }
}
