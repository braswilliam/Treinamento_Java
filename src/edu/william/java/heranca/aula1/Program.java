package edu.william.java.heranca.aula1;

public class Program {

    public static void main(String[] args) {


        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);


        //UPCASTING:
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Will", 0.0, 0.01); //acc3 é uma instância de SavingsAccount


        //DOWNCASTING:
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);


        if(acc3 instanceof BusinessAccount) { //false
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount) { //true vai executar
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }


        Account accout1 = new Account(1001, "Alex", 1000.00);
        accout1.withdraw(200);

        System.out.println(accout1.getBalance());

        Account accaunt2 = new SavingsAccount(1002, "Bob", 1000.00, 0.01);
        accaunt2.withdraw(200);

        System.out.println(accaunt2.getBalance());


        Account accout3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        accout3.withdraw(200.0);
        System.out.println(accout3.getBalance());


        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
        Account z = new BusinessAccount(1023, "Maria", 1000.0,500.0);
        x.withdraw(50.0);
        y.withdraw(50.0);
        z.withdraw(50.0);

    }

}
