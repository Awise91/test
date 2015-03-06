import java.sql.Date;

import junit.framework.TestCase;


public class AccountTest extends TestCase {

	
	public void testCases() {
	Account a = new Account(1122, 20000, 4.5, Date.valueOf("11-12-22"));

	assertEquals(17500, a.withdraw(2500));
	assertEquals(20500, a.deposit(3000.00));
	
	}
	
	public static void main(String[] args){
		System.out.println(Account.getBalance());
		System.out.println(Account.getAnnualInterestRate());
		System.out.println(Account.getdateCreated());
	}

	protected static void setUpBeforeClass() throws Exception {
	}

	protected static void tearDownAfterClass() throws Exception {
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
