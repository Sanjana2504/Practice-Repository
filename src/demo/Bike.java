package demo;

class Bike  
{
	String brand;
	int cost;
	String colour;
	
	Bike(String b,int c,String cl)
	{
		brand =b;
		cost =c;
		colour=cl;
	}
	
	public static void main(String[] args) 
	{
		Bike b = new Bike("royal enfeild",3057000,"Oranga");
		
		Bike b1 = new Bike("royal enfeild",3100000,"Black");
		
		System.out.println(b.brand+" "+b.colour+" "+b.cost);
		System.out.println(b1.brand+" "+b1.colour+" "+b1.cost);
	}
}
