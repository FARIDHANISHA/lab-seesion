/*@author :Faridha Nisha 
Title : House Rent
Qns: Using the Constructer and this.keyword & find the total Amount of house Rent ?
*/
import java.util.Scanner;
class House_rent
{
	String name;
	int house_rent;
	int current_bill;
	int water_charge;
	int Service_charge;
	
	//Constructor Declared
	      public House_rent(String name,int house_rent,int current_bill,int water_charge,int Service_charge)
	    {
		    this.name=name;
		    this.house_rent=house_rent;// you can set the object value in non_static variable using the this keyword for ex.house_ren.
	        this.current_bill=current_bill;// you can set the object value in non_static variable using the this keyword for ex.current_bill
	        this.water_charge=water_charge;// you can set the object value in non_static variable using the this keyword for ex.water_charge..
	        this.Service_charge=Service_charge;//you can set the object value in non_static variable using the this keyword for ex.Service_charge.
		    System.out.println("House rent amount is = "+ house_rent);
		    System.out.println("The current_bill  amount is = "+ current_bill);
		    System.out.println("The water_charge  amount is = "+ water_charge);
		    System.out.println("The Service_charge  amount is = "+ Service_charge);
		    System.out.println(this.name+" "+"your total house_rent??// Amount is "+ "="+" " +(house_rent+current_bill+water_charge+Service_charge));
	    }
		
   public static void main(String[] args)
    {
     // scanner class
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your Name");
     String name = sc.next();
	 House_rent obj1 = new House_rent(name,5500,1000,500,500);
		
	}
}











































