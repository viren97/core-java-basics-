/*
if 
if else
else if ladder 
switch case 
for loop
 while loop
do while loop
  same as c language
  
VARIABLE CAN BE DECLARED ANYWHERE
	
DEMONSTRATION OF STATEMENTS
*/


class test 
{  public static void main(String...args)
	{
		
		int a,b,c,age,i;
		a=10;
		b=20;
		c=30;
		age=16;
		//if statement
		if (age>=18)
		System.out.println("Elligible for voting ");
	if(age<18)
		System.out.println("not-Elligible for voting ");

     //else statement
		if (age>=18)
		System.out.println("Elligible for voting ");
	else
	System.out.println("not -Elligible for voting ");
	
	//else if ladder
	if (a>b)
		System.out.println("a is largest");
	else if (b>a)
		System.out.println("b is largest");
    else 
		System.out.println("no. is equal");
	//for loop
	for (i=0; i<=5; i++)
		System.out.println("Java programming ");
	//while loop
	i=1;
	while (i<=5)
	{
		System.out.println("JAva programming");
		i++;
	}
	//do while loop
	i=1;
	do{
		System.out.println("Java programming");
		i++;
	}while(i<=5);
	
	//switch case from jdk 1.7 rest of the form is valid inn also java as c
	String company ="Apple";
	switch(company)
	{
		case "Microsoft":
		System.out.println("Bill gates");
		break;
		case "Apple":
		System.out.println("steve jobs");
		break;
		case "java":
		System.out.println("James A Gosling ");
		break;
		default:
		System.out.println("nvalid entry");
		
	}
	}
	
}
