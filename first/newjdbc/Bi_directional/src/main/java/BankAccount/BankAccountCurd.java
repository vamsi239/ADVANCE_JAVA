package BankAccount;

import java.util.List;

public interface BankAccountCurd {
	void saveBank(Bank bank);
	void updatebank(int id,String name);
	
	Bank findBankID(int id);
	
	Bank findBankByName(String name);
	
	void assigngiveAccountToBank(int bankId,Account newAccount);
	void assigngiveAccountsToBank(int bankId,List<Account>accounts);
	
	List<Account> findAllAccountBank(int bankId);

}
