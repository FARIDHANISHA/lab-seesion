
import java.util.Scanner;

// Get details about Personaldetail .. 


public class Personaldetail {
	public String name;
	public int houserent;
	public int currentbill;
	private int watercharge;
    private int Servicecharge;



	//Constructor Declared

	public Personaldetail (String name, int houserent,int currentbill, int watercharge,int Servicecharge ) {
		this.name=name;
		this.houserent=houserent;
		this.currentbill=currentbill;
		this.watercharge=watercharge;
		this.Servicecharge=Servicecharge;
	}
	// getter setter Method
	public String getName(){
		return name;
	}
	public int gethouserent() {
		return houserent;
	}

	public int getcurrentbill() {
		return currentbill;
	}
	public int getwatercharge() {
		return watercharge;
	}
	public int getServicecharge() {
		return Servicecharge;
	}
	//@Override
	public String toString(){
	 return("Name "+" "+ this.getName()+"\nThey houserent,currentbill and watercharge are:"+this.gethouserent()+","+this.getcurrentbill()+","+this.getwatercharge()+","+this.getServicecharge()+".");
     
	}
	public String toString1(){
		return("The Total Amount is "+" ="+" " +(this.gethouserent()+this.getcurrentbill()+this.getwatercharge()+this.getServicecharge()));

	}



	// scanner class
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter your Name");
		String name = sc.next();
		System.out.println("Enter your houserent");
		int houserent = sc.nextInt();
		System.out.println("Enter your currentbill");
		int currentbill = sc.nextInt();
		System.out.println("Enter your watercharge");
		int watercharge = sc.nextInt();
		System.out.println("Enter your Servicecharge");
		int Servicecharge = sc.nextInt();
		Personaldetail obj = new Personaldetail(name, houserent, currentbill, watercharge,Servicecharge);
		System.out.println(obj.toString());
		Personaldetail obj1 = new Personaldetail(name, houserent, currentbill, watercharge,Servicecharge);
		System.out.println(obj1.toString1());
	
		
	}

} 
