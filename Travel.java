import java.util.Scanner;
public class Travel {
    Scanner sc =new Scanner(System.in);
    int GBUS = 4000;
    int GTRAIN = 3000;
    int SBUS = 2000;
    int STRAIN = 1000;
    int TotalGBUS;
    int TotalGTRAIN;
    int TotalSBUS;
    int TotalSTRAIN;
void GBUS(){
        System.out.println("Booking Seat for Bus:");
        int seat = sc.nextInt();
        TotalGBUS = GBUS * seat;
        System.out.println("Total amount = " + TotalGBUS); 
} 

void GTRAIN(){
    System.out.println("Booking Seat for Train:");
    int seat = sc.nextInt();
    TotalGTRAIN = GTRAIN * seat;
    System.out.println("Total amount = " + TotalGTRAIN); 
} 

void SBUS(){
    System.out.println("Booking Seat for Bus:");
    int seat = sc.nextInt();
    TotalSBUS = SBUS * seat;
    System.out.println("Total amount = " + TotalSBUS); 
}

void STRAIN(){
System.out.println("Booking Seat for Train:");
int seat = sc.nextInt();
TotalSTRAIN = STRAIN  * seat;
System.out.println("Total amount = " + TotalSTRAIN);

   }

}
