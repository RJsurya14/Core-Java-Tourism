import java.util.Scanner;

public class Tourism{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
    BOOKING_details b = new BOOKING_details();
    Travel t =new Travel();
    
    
    System.out.println("*****Weclome to JS TOURISM*****");
    System.out.println(" We will give a plan to spend time in happy ");
    System.out.println("********************************************");

    System.out.println("*****Package details*****");
    System.out.println("1.GOLD");
    System.out.println("2.SILVER");
    System.out.println("1.GOLD --- 10 days tour with Hotel and Travel" );
    System.out.println("2.SILVER --- 5 days tour with Hotel and Travel");
    System.out.println("********************************************");
Customer c = new Customer();
    c.cus();
    System.out.println("!!!***** CHECK THE DETAILS *****!!!");
    c.display();

Package p = new Package();
    System.out.println("------- PACKAGE INFORMATION -------");
    System.out.println("Enter the choice (GOLD/SILVER) : ");
    String choice=sc.nextLine();

switch(choice){

        case "GOLD" :
        System.out.println(" TAJ COROMANDEL 5*****HOTEL");
        System.out.println("Fee");
        System.out.println(" Package of Tour  = Rs. 15,000");
        System.out.println(" Gold package = Rs. 6,164 / person");
        
    p.gold();
    System.out.println("Enter the Transport (GBUS/GTRAIN):");
        String choice1 = sc.nextLine();

    if ( choice == "GBUS"){
    t.GBUS();
    }else {
        t.GTRAIN();
    }
        break;

      case "SILVER" :
        System.out.println("HOTEL PARK PLAZZA 3***HOTEL");
        System.out.println("Fee");
        System.out.println(" Package of Tour  = Rs.10,000");
        System.out.println(" Silver package = Rs. 2,783 / person"); 
       
     p.silver();
     System.out.println("Enter the Transport (SBUS/STRAIN):");
         String choice2 = sc.nextLine();
        
    if ( choice == "SBUS"){
    t.SBUS();
    }else {
        t.STRAIN();
    }
        break;
}

    }
}
