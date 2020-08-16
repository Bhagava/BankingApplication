package com.springboot.web.service;

import java.math.BigDecimal;
import java.security.Principal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PrimaryAccountDao;
import com.dao.SavingsAccountDao;
import com.springboot.web.model.PrimaryAccount;
import com.springboot.web.model.SavingsAccount;

@Service
public class AccountService {

	private static Long accountNumber =  (long) 12345431;
	
	@Autowired
	PrimaryAccountDao primaryAccountDao;
	
	@Autowired
	SavingsAccountDao savingsAccountDao;
	
	public PrimaryAccount createPrimaryAccount()
	{
		PrimaryAccount primaryAccount = new PrimaryAccount();
		primaryAccount.setAccountNumber(Nextaccount());
		primaryAccount.setAccountbalance(0.0);
		
		primaryAccountDao.save(primaryAccount);
		
		return primaryAccountDao.findByAccountNumber(primaryAccount.getAccountNumber());
	}
	
	
	public SavingsAccount createSavingsAccount()
	{
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.setAccountnumber(Nextaccount());
		savingsAccount.setAccountbalance(0.0);
		
		savingsAccountDao.save(savingsAccount);
		
		return savingsAccountDao.findByAccountnumber(savingsAccount.getAccountnumber());
	}
	
	
//	public void deposit(String accountType, double amount, Principal principal) {
//        com.springboot.web.model.User user = userService.findByUsername(principal.getName());
//
//        if (accountType.equalsIgnoreCase("Primary")) {
//            PrimaryAccount primaryAccount = user.getPrimaryAccount();
//            primaryAccount.setAccountBalance(primaryAccount.getAccountBalance().add(new BigDecimal(amount)));
//            primaryAccountDao.save(primaryAccount);
//
//            Date date = new Date();
//
//            PrimaryTransaction primaryTransaction = new PrimaryTransaction(date, "Deposit to Primary Account", "Account", "Finished", amount, primaryAccount.getAccountBalance(), primaryAccount);
//            transactionService.savePrimaryDepositTransaction(primaryTransaction);
//            
//        } else if (accountType.equalsIgnoreCase("Savings")) {
//            SavingsAccount savingsAccount = user.getSavingsAccount();
//            savingsAccount.setAccountBalance(savingsAccount.getAccountBalance().add(new BigDecimal(amount)));
//            savingsAccountDao.save(savingsAccount);
//
//            Date date = new Date();
//            SavingsTransaction savingsTransaction = new SavingsTransaction(date, "Deposit to savings Account", "Account", "Finished", amount, savingsAccount.getAccountBalance(), savingsAccount);
//            transactionService.saveSavingsDepositTransaction(savingsTransaction);
//        }
//    }
//    
//    public void withdraw(String accountType, double amount, Principal principal) {
//        User user = userService.findByUsername(principal.getName());
//
//        if (accountType.equalsIgnoreCase("Primary")) {
//            PrimaryAccount primaryAccount = user.getPrimaryAccount();
//            primaryAccount.setAccountBalance(primaryAccount.getAccountBalance().subtract(new BigDecimal(amount)));
//            primaryAccountDao.save(primaryAccount);
//
//            Date date = new Date();
//
//            PrimaryTransaction primaryTransaction = new PrimaryTransaction(date, "Withdraw from Primary Account", "Account", "Finished", amount, primaryAccount.getAccountBalance(), primaryAccount);
//            transactionService.savePrimaryWithdrawTransaction(primaryTransaction);
//        } else if (accountType.equalsIgnoreCase("Savings")) {
//            SavingsAccount savingsAccount = user.getSavingsAccount();
//            savingsAccount.setAccountBalance(savingsAccount.getAccountBalance().subtract(new BigDecimal(amount)));
//            savingsAccountDao.save(savingsAccount);
//
//            Date date = new Date();
//            SavingsTransaction savingsTransaction = new SavingsTransaction(date, "Withdraw from savings Account", "Account", "Finished", amount, savingsAccount.getAccountBalance(), savingsAccount);
//            transactionService.saveSavingsWithdrawTransaction(savingsTransaction);
//        }
//    }
//
	
	
	
	
	private Long Nextaccount()
	{
		return ++accountNumber;
	}
}
