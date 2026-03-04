package BankAccount;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class BankAccountImp implements BankAccountCurd {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("post");
	EntityManager em  = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	@Override
	public void saveBank(Bank bank) {
		et.begin();
		em.persist(bank);
		et.commit();
		System.out.print("saved");
		
	}
	@Override
	public void updatebank(int id,String name) {
		Bank b = em.find(Bank.class, id);
		b.setBankname(name);
		et.begin();
		em.merge(b);
		et.commit();
		System.out.print("updated");
		
	}
	@Override
	public Bank findBankID(int id) {
		Bank b = em.find(Bank.class, id);
		return b;
		
	}
	@Override
	public Bank findBankByName(String name) {
		Query q = em.createQuery("select b from Bank b where b.Bankname = :name");
		q.setParameter("name", name);
		return (Bank) q.getSingleResult();
		
	}
	@Override
	public void assigngiveAccountToBank(int bankId,Account newAccount) {
		
		Bank b = em.find(Bank.class, bankId);
	    List<Account> acc =b.getAcc();
	    acc.add(newAccount);
	    b.setAccs(acc);
	    newAccount.setBank(b);
	    et.begin();
	    em.persist(newAccount);
	    et.commit();
	    System.out.println("done");
		
		}
	@Override
	public void assigngiveAccountsToBank(int bankId,List<Account>accounts) {
		Bank b = em.find(Bank.class, bankId);
		 List<Account> as = b.getAcc();
		 as.addAll(accounts);
		 b.setAccs(as);
		 et.begin();
		 em.merge(b);
		 et.commit();
	}
	@Override
	public List<Account> findAllAccountBank(int bankId){
		Bank b = em.find(Bank.class, bankId);
		
		return b.getAcc();
	
		
	}
	
	public static void main(String[] args) {
		BankAccountImp bi= new BankAccountImp();
		Bank b = new Bank(10,"IcIcI");
		bi.saveBank(b);
//		List<Account> accy = new ArrayList<>();
//		accy.add(new Account(101,"Vignan"));
//		accy.add(new Account(102,"Pavan"));
	
		//bi.updatebank(10,"sbi");
		//System.out.print(bi.findBankID(10).getBankname());
		//System.out.println(bi.findBankByName("sbi").getId());
		Account a = new Account(101,"Pavan");
		bi.assigngiveAccountToBank(10,a);
		
	
	}
}
