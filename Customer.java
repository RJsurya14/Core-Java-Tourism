import java.util.Scanner;

public class Customer {

  Scanner sc= new Scanner(System.in);
  BOOKING_details b = new BOOKING_details();

 
    
void cus(){
  
  System.out.println("Name :");
  String cusname = sc.nextLine();
  b.setCusname(cusname);

  System.out.println("Email :");
  String cusemail = sc.nextLine();
  b.setCusemail(cusemail);


  System.out.println("Address :");
  String cusaddress = sc.nextLine();
  b.setCusaddress(cusaddress);

  System.out.println(" Govt ID Proof:" );
  String cusid = sc.nextLine();
  b.setCusid(cusid);

  System.out.println("ID number : (" +b.getCusid()+ "):");
  int idnumber = sc.nextInt();
  b.setIdnumber(idnumber);

  
  System.out.println("Phone NO :");
  int cusphone = sc.nextInt();
  b.setCusphone(cusphone);

  System.out.println("How many person :");
  int person = sc.nextInt();
  b.setPerson(person);



}

void display(){
  
  System.out.println("Name: " +b.getCusname());
  System.out.println("email: " +b.getCusemail());
  System.out.println("phone: " +b.getCusphone());
  System.out.println("address: " +b.getCusaddress());
  System.out.println("id: " +b.getCusid());
  System.out.println("id number: "+b.getIdnumber());
  System.out.println("total person:" +b.getPerson());
}


}



    