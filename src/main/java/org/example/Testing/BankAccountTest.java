package org.example.Testing;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest
{
    private static BankAccount account;
    private static int count;

    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("This executes before any tests. Count = "+ count++);
    }
    @Before
    public void setup()
    {
        account = new BankAccount("Dylan","Fennelly",1000,1);
    }
    @Test
    public void deposit()
    {
        double balance = account.deposit(200,true);
        double expBalance =1200;
        assertEquals(expBalance,balance,0.0001);
    }
    @Test
    public void withdraw()
    {
        double balance = account.withdraw(50,true);
        double expBalance = 950;
        assertEquals(expBalance,balance,0.0001);
    }
    @Test
    public void getBalance_deposit()
    {
        account.deposit(200,true);
        assertEquals(1200,account.getBalance(),0.0001);
    }
    @Test
    public void getBalance_withdraw()
    {
        account.withdraw(50,true);
        assertEquals(950,account.getBalance(),0.0001);
    }
    @Test
    public void isCurrent_true()
    {
        assertTrue("This account is not the current account", account.isCurrent());
    }
    @Test
    public void withdrawBranch()
    {

    }
    @AfterClass
    public static void afterClass()
    {
        System.out.println("This executes after all of the test cases.Count = "+count++);
    }


}