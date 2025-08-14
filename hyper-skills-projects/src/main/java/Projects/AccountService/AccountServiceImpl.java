package Projects.AccountService;

class AccountServiceImpl implements AccountService {
    // TODO: store the array here (consider making it private final)
    private /* final */ Account[] accounts;

    // TODO: constructor that accepts Account[] and stores it
    AccountServiceImpl(Account[] accounts) {
        // TODO: assign the field
        this.accounts = accounts;
    }

    @Override
    public Account findAccountByOwnerId(long id) {
        // TODO:
        // loop over accounts
        // if account.getOwner().getId() == id -> return that account
        // if none found -> return null
        return null; // placeholder
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        // TODO:
        // long count = 0;
        // loop over accounts
        // if account.getBalance() > value -> count++
        // return count
        return 0L; // placeholder
    }
}