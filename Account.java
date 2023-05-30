import java.util.Scanner;

public class Account {

	public static void main(String[] args) {

		Account1[] a = new Account1[4];
		a[0]=new Account1();
		a[1]=new Account1();
		a[2]=new Account1();
		a[3]=new Account1();
		
		
		a[0].setAttr("Krishna",10000);
		a[1].setAttr("Varshil",5000);
		a[2].setAttr("Jinil",150000);
		a[3].setAttr("Rushikesh",30000);
		
		
		System.out.println(a[0].getName());
		System.out.println(a[0].getBalance());
		
		System.out.println(a[1].getName());
		System.out.println(a[1].getBalance());
		
		System.out.println(a[2].getName());
		System.out.println(a[2].getBalance());
		
		System.out.println(a[3].getName());
		System.out.println(a[3].getBalance());
		
		Scanner sc = new Scanner(System.in);
	      
		 
	      System.out.print("Do you want to withdraw money -> 1=yes");
	      System.out.print("Do you want to deposit -> 2=yes");
	      int w = sc.nextInt();
	      System.out.print("Amount ton be withdraw or deposit");
	      int amount=sc.nextInt();
	      
	      if(w==1)
	      {
	    	  a[0].withdraw(amount);
	      }
	      if(w==2)
	      {
	    	  a[0].deposit(amount);
	      }
	      else
	      {
	    	System.out.println("Thank you");	    
	      }
	      
	}

}
