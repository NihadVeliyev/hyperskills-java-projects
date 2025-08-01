package Projects.BankAccount;

public class CheckingAccount extends BankAccount{
    Long fee;

    public CheckingAccount(Long fee,Long balance,String number) {
        super(number, balance);
        this.fee = fee;

    }
}
