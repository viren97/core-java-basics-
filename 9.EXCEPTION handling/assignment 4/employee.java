import java.io.*;
class employee
{
	public static void main(String...args) throws IOException
	{
		
		Gross g=new Gross();
		g.input();
		g.pay();
		
	}
}
/*
Dearness Allowance = 25% of Basic Pay
House Rent Allowance = 15% of Basic Pay
Provident Fund = 8.33% of Basic Pay
Net Pay = Basic Pay + Dearness Allowance + House Rent Allowance
Gross Pay = Net Pay – Provident Fund*/
class Gross
{
	
	double basic;
	Gross()
	{
	}
	void input() throws IOException
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the basic pay salary");
		basic = Double.parseDouble(b.readLine());
		
	}
	void pay()
	{
		double dear_All= basic*(.25);
		double rent=basic*(.15);
		double fund=basic*(.833);
		double net_pay=basic+dear_All+rent;
		double gross_pay=net_pay-fund;
		System.out.println("Net pay  ="+net_pay);
		System.out.println("Gross pay  ="+gross_pay);
	}
}