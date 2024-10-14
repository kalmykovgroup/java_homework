import java.util.Comparator;

public class Client implements Comparator {

    private String passport;
    private String name;

    public Bank.Account account;

    public Client(String name, String passport){
        this.passport = passport;
        this.name = name;
    }
    public String getPassport() {
        return passport;
    }
    public String getName() {
        return name;
    }
    public String toString(){
        return this.name+" "+this.passport;
    }
 

    @Override
    public int compare(Object o1, Object o2) {
        double bal1 = ((Client)o1).account.getBalance();
        double bal2 = ((Client)o2).account.getBalance();
        return Double.compare(bal1, bal2);
    }
}
