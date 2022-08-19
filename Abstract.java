/*Author:Faridha Nisha 
Title:abstract
Question:Write the program display staff and student details using abstract & inheritance.
*/
abstract class person // parent class
{
	abstract void test1();
	abstract void test2();
	abstract int getsalary();
	
    void test() {	// method for parent class test	
			System.out.println("Staff and Student details ");
	}
	}
abstract class staff extends person{// child class staff  is extended from person
	
	void test1() {		// parent class method of test1 is override in child class
			System.out.println("Staff Name Sarala");
	}
	void test2() {		// parent class method of test2 is override in child class
            System.out.println("Staff Address");
			System.out.println("No:35 123  st,redhills ch-52.");
	}
	 public int getsalary() { // parent class method of test2 is override in child class                  otyy
		return 30000;
	}
}
class student extends staff{
	void test4() {
		System.out.println("Student Address");
		System.out.println("Student  Name Pazhani");
	}
	void test5() {		
			System.out.println("No:145/2 grandline, redhills chennai -52. ");
	}
	void test6() {		
			System.out.println("Student Fees Structure");
	}
	void test7( int a , int b,int c ,int d,int e) 
	{		
	System.out.println("Registration  Fees = "+a);
	System.out.println("Admisstion Fees  = "+b);
	System.out.println("Tution Fees  = "+c);
	System.out.println("Transportation = "+d);
	System.out.println("Mess fees  = "+e);
    System.out.println("Total Amount = "+(a+b+c+d+e));
	}
}
public class Abstract{
	public static void main(String[] args) 
	{
			
		student objstudent = new student();		
		objstudent.test();
		objstudent.test1();
		objstudent.test2();	
		System.out.println("Salary = " +objstudent.getsalary());
		objstudent.test4();
		objstudent.test5();
		objstudent.test6();
		objstudent.test7(500,2000,40000,10000,10000);
    
	}

}






























   /*abstract class person 
{
	abstract void test1();
	abstract void test2();
	abstract int getsalary();
	
	
    void test() {		
			System.out.println("Staff and Student details ");
	}
}
	abstract class staff extends person{
	
	void test1() {		
   			 
	}
	 public int getsalary() {
		return 15000;
	}
	
	void test2() {		
			System.out.println("No:35 123  st,redhills ch-52.");
	}
	

}
class student extends staff{
	
	void test4() {
		
		System.out.println("Student  Name Pazhani");
	}
	void test5() {		
			System.out.println("No:145/2 grantline vadakarai Or redhills chennai -52. ");
	}
	void test6() {		
			System.out.println("Student Fees Structure");
	}
	void test7( int a , int b,int c ,int d,int e) 
	{		
	System.out.println("Registration  Fees = "+a);
	System.out.println("Admisstion Fees  = "+b);
	System.out.println("Tution Fees  = "+c);
	System.out.println("Transportation = "+d);
	System.out.println("Mess fees  = "+e);
    System.out.println("Total Fees  Amount = "+(a+b+c+d+e));
	}
}
public class Abstract{
	public static void main(String[] args) 
	{
			
		student objstudent = new student();		
		objstudent.test();
		objstudent.test1();
		objstudent.test2();	
		System.out.println("Salary = " +objstudent.getsalary());
		objstudent.test4();
		objstudent.test5();
		objstudent.test6();
		objstudent.test7(500,2000,40000,10000,10000);
    
	}

}
*/