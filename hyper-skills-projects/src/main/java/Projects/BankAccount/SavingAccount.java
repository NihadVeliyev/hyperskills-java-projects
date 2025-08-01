package Projects.BankAccount;

public class SavingAccount extends BankAccount{
Long interestRate;

    public SavingAccount(Long interestRate,Long balance,String number){
        super(number, balance);
        this.interestRate=interestRate;
    }


}
