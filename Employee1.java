
public class Employee1
{
	String name;
	int year;
	String address;
	
	public Employee1(String k,int m,String l)
	{
		name=k;
		year=m;
		address=l;
	}
	public void display()
	{
		System.out.println(name+" "+year+" "+" "+address);
	}
}