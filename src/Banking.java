//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Banking {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Bank.Account acc1 = bank.createAccount("Иванов", "АК123456");
        Bank.Account acc2 = bank.createAccount("Петров", "АЕ123456",50);

        AccountOperation oper1 = new AccountOperation(acc1,100);

        CrossAccountOperation oper2 = new CrossAccountOperation(acc1, acc2,10);

        bank.addOperation(oper1);
        bank.addOperation(oper2);

        bank.runOperations();
        System.out.print(bank);
    }

}