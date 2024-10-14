import javax.management.OperationsException;

public class AccountOperation extends Operation {

    //Счет учавствующий в операции
    private Bank.Account account;

    public AccountOperation(Bank.Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }
    public void doWork() throws  OperationsException {
        double balance = account.getBalance();
        double result = balance + amount;
        if (result < 0){
            throw new OperationsException("Недостаточно денежных средств на счете " + account);
        }


       account.setBalance(result);
    }

}
