class Car 
{
	private String enginetype;
	int get(String type)
	{
		enginetype=type;
		return 0;
	}
	void display()
	{
		System.out.println("IN Car ");
		System.out.println("Engine Type is = " +enginetype);
	}
	
}	
class Racingcar extends Car 
{    
	int CC;
	String color;
	int get(String type,int cc,String colvalue)
	{
	   //enginetype=type;
	   super.get(type);
	   CC=cc;
	   color=colvalue;
	   return 0;
	}
	void show()
	{  System.out.println("in Racingcar" );
		//System.out.println("Engine Type is = " +enginetype);
		super.display();
		System.out.println("CC is = " +CC);
		System.out.println("CAR color is = " +color);
		
	}
	
	public static void main(String...args)
	{
	  Car c =new Car();
	  Racingcar r= new Racingcar();
	  ferrari f=new ferrari();
     final int a=20;
	 final int a=10;
	
	  c.get("Petrol");
	  c.display();
	  
	  r.get("electricity",1600,"black");
	  r.show();
	  f.get("diesel",4000,"red",600,40000000);
	  f.show();
	  System.out.println(a);
	}

	
	
}
class ferrari extends Racingcar
{
	int speed,price;
	int get(String type,int cc ,String colvalue,int sp,int pr)
	{
		super.get(type,cc,colvalue);
		
		speed=sp;
		price=pr;
		return 0;
	}
	void show()
	{	 System.out.println("in ferrari Car");
		super.display();
		super.show();
		System.out.println("Speed  is = " +speed);
		System.out.println("Price  is = " +price);
	}
}
