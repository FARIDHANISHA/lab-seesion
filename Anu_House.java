/*@author :Faridha Nisha 
Title : House Rent
Qns: Using the Constructer and this.keyword & find the total Amount of house Rent ?
*/
import java.util.Scanner;
class  House_Manager 
   {
	 public static void  details()  //parent class method
        {
           System.out.println(" House Rent Details ");
        }
   }
class House_1 extends House_Manager //child class House_Manager  is extended from House_1
{
	int house_rent1; // child class fied of house_rent1
	int current_bill1; //  child class fied of current_bill1
	int water_charge1; // child class fied of water_charge1
	int Service_charge1; // child class fied of Service_charge1
	
	//Constructor Declared
     public House_1(int house_rent1,int current_bill1,int water_charge1,int Service_charge1)// child class method
	    {
            this.house_rent1=house_rent1;
            this.current_bill1=current_bill1;
	        this.water_charge1=water_charge1;
	        this.Service_charge1=Service_charge1;		    
	    }
	
        
}
class House_2 extends House_1 
{
	
	int house_rent2;
	int current_bill2;
	int water_charge2;
	int Service_charge2;
	
	//Constructor Declared
	      public House_2(int house_rent1,int current_bill1,int water_charge1,int Service_charge1,int house_rent2,int current_bill2,int water_charge2,int Service_charge2)
		  {
	        super (house_rent1,current_bill1,water_charge1,Service_charge1);
	        this.house_rent2=house_rent2;
	        this.current_bill2=current_bill2;
	        this.water_charge2=water_charge2;
	        this.Service_charge2=Service_charge2;
		    
		  }
}
class Anu_House
    {
       String name1;
       String name2;
          public static void main(String[] args)
                {
                    // scanner class
     
	                House_1  obj = new House_1 (5500,1000,500,500); //create the object in House_1 of chid  class	
	                obj.details();
	                House_2 obj1 = new House_2(5500,1000,500,500,7500,1500,1000,1000); //create the object in House_2 of chid  class	
	                Scanner sc = new Scanner(System.in);
	                System.out.println("Enter your Name");
                    String name1 = sc.next();
	                System.out.println("House rent amount is = "+obj. house_rent1); // print the house_rent1
                    System.out.println("The current_bill  amount is = "+obj. current_bill1); // print the current_bill1
                    System.out.println("The water_charge  amount is = "+obj. water_charge1); // print the water_charge1
	                System.out.println("The Service_charge  amount is = "+obj. Service_charge1); // print the Service_charge1
                    System.out.println("your total house_rent1 Amount is "+ "="+" " +(obj.house_rent1+obj.current_bill1+obj.water_charge1+obj.Service_charge1));// finaly add the all the fieds of House_1
	                Scanner cs = new Scanner(System.in);// cs -user defined.
	                System.out.println("Enter your Name"); 
                    String name2 = sc.next();
	                System.out.println("House rent amount is = "+obj1. house_rent2); // print the house_rent2
                    System.out.println("The current_bill  amount is = "+obj1. current_bill2); // print the current_bill2
                    System.out.println("The water_charge  amount is = "+obj1. water_charge2); // print the water_charge2
	                System.out.println("The Service_charge  amount is = "+obj1. Service_charge2); // print the Service_charge2
                    System.out.println("your total house_rent2 Amount is "+ "="+" " +(obj1.house_rent2+obj1.current_bill2+obj1.water_charge2+obj1.Service_charge2)); // finaly add the all the fieds of House_2
	 
	 
	
	             }
    }












































