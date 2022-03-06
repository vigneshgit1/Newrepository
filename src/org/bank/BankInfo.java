//Project   :BankDetails
//Package   :org.bank
// Class     :BankInfo
//Methods   :saving(),fixed(),deposit()
// Class     :AxisBank
//Methods   :deposit()
package org.bank;

public class BankInfo extends AxisBank
{
	public void saving()
	{
		System.out.println("This is saving account");
	}
	public void fixed()
	{
		System.out.println("This is saving account");
	}
	public void deposit(int x)
	{
		System.out.println("Deposit =="+x);
		super.deposit(x);
		
	}
	

public static void main(String[] args) {
	BankInfo bi=new BankInfo();
	bi.saving();
	bi.fixed();
	bi.deposit(101);
			
}
}
