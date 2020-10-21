package hello;

public class assignment6p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  CheckingAccount ch1 = new CheckingAccount("Steve", "Jobs", 50); // he was poor once before
	        System.out.println(ch1);

	        ch1.DebitTransaction(0.25); // he was cheap back then too
	        System.out.println(ch1);    // should be $39.75 (= $49.75 - $10 fee)

	        ch1.CreditTransaction(7.00); // small expense check
	        System.out.println(ch1);     // should be $36.75 (= $39.75 + $7.00 - $10 fee)

	        ch1.CreditTransaction(1000000); // a huge bonus!!
	        System.out.println(ch1); // should be $1000036.75
	}

}
class Account
{
    // instance data members
    protected String FirstName, LastName; // two String members
    protected double CurBalance;

    // methods
    public Account(String fname, String lname, double cb)
    {
        FirstName = fname; LastName = lname; CurBalance = cb;
    }

    public String getAcctType()
    {
        return this.getClass().getName(); // returns the string of the class name
    }

    public double DebitTransaction(double debitAmount)
    {
    	CurBalance-=debitAmount;
        return CurBalance;
    }

    public double CreditTransaction(double creditAmount)
    {
    	CurBalance+=creditAmount;
        return CurBalance;
    }

    public String toString()
    {
        return "Account name: " + FirstName + " " + LastName + ", Account Type: " + getAcctType() + ", Balance: " + String.format("$%.2f", CurBalance);
    }}
class CheckingAccount extends Account
{
    // static data members
    static private double MinBalance = 100;
    static private double Fee = 10;
    public CheckingAccount(String fname,String lname,double cb) {
    	super(fname,lname, cb);
    }
    public double DebitTransaction(double debitAmount) {
    	super.DebitTransaction(debitAmount);
    	ChargeFee();
    	return CurBalance;
    }
    public double CreditTransaction(double creditAmount) {
    	super.CreditTransaction(creditAmount);
    	ChargeFee();
    	return CurBalance;
    }
    private void ChargeFee() {
    	if(CurBalance<MinBalance) {
    		CurBalance-=Fee;
    	}
    }
}
