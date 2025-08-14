package Projects.AccountService;

class AccountServiceImpl implements AccountService {
    private final Account[] accounts;

    AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public Account findAccountByOwnerId(long id) {
        for(Account account:accounts){
            if(account.getId()==id){
                return account;
            }
        }
        return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {

        return 0L;
    }
}