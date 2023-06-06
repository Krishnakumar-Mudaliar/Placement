
public class Inheritancedemo3 extends Inheritancedemo2{
	private String name;
	private String age;
	
	public String getName()
	{
		return name;
	}
	public String getAge()
	{
		return age;
	}
	public void setName(String n)
	{
		this.name=n;
	}
	public void setAge(String k)
	{
		this.age=k;
	}
	@Override
	   public String toString() {
		   return  ("Name= "+ getName() + "Age=" + getAge()+ "Result="+ getResult() + "Enrollment=" + getEnrollment());
	   }
	
}
