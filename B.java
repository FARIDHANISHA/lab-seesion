import java.util.*;
class B
{
   static int balance=1000;
    public static void main (String[]args)
    {
        Scanner sc1 = new Scanner(System.in); 
        System.out.println("Enter the Banking Option:");
        System.out.println("Balance enquery for 1");
        System.out.println("Credit amount for 2");
        System.out.println("debiting amount for 3");
        int Bank=sc1.nextInt();
        int Credit=balance;
        int Debit=balance;
        switch(Bank)
        {
         case 1:
            System.out.println("Current Balance :" + balance);
         break;
        
        case 2:
            System.out.println("Enter your amount :");
            int i = sc1.nextInt();
            balance=balance+i;
            System.out.println("Credited : "+balance);
            break;
         case 3:
         System.out.println("Enter your amount :");
               int deb = sc1.nextInt();
            balance=balance-deb;
            System.out.println("debited : " +balance);
            break;

        }
       
        
    }      
}