import java.util.Scanner;

public class Package{
  Scanner sc =new Scanner(System.in);
  int GTourfee = 15000;
  int STourfee = 10000;
  int Goldfee = 6164;
  int Silverfee = 2783;
  int Totalgold;
  int Totalsilver;


  void gold(){
    System.out.println("How many Seat:");
    int seat = sc.nextInt();
    Totalgold = GTourfee +  (seat * Goldfee );
    System.out.println("Total amount = " +Totalgold);

  }
  
  
  void silver(){
    System.out.println("How many Seat:");
    int seat = sc.nextInt();
    Totalsilver = STourfee +  (seat * Silverfee  );
    System.out.println("Total amount = " +Totalsilver);
  }

}
  

