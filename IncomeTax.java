package p1;
import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
	try (Scanner in = new Scanner(System.in)) {
    double tax;
			
 System.out.println("Enter Your Salary");
			
  int Salary = in.nextInt(); 
  
  
 int HRA = 0;
 int TA = 0;
 int DA = 0;
 double  AnualSalary =( Salary * 12 + HRA + DA + TA);
 
 HRA = (int) (AnualSalary * 0.2);
 DA =(int) (AnualSalary * 0.4 + HRA);
 TA = 0;
 
 if (TA > 500000) {
		 tax=AnualSalary*0.10;
		 System.out.println(tax);
 }
 
 
 
  if (AnualSalary < 500000)
  {
		  System.out.println("Anual Salary: " +AnualSalary + "  No Tax");
  }
  else if (AnualSalary > 500000 && AnualSalary < 1000000)
  {
		  tax=AnualSalary*0.10;
		  System.out.println("Anual Salary: " +AnualSalary + "  you have to pay tax = "+ tax);

  }
  else if (AnualSalary > 1000000 && AnualSalary < 2000000)
  {
		  tax=AnualSalary*0.20;
		  System.out.println("Anual Salary: " +AnualSalary + "  you have to pay tax:  "+ tax);

  }else {
		  tax=AnualSalary*0.30;
		  System.out.println("Anual Salary: " +AnualSalary + "  you have to pay tax:  "+ tax);
  }
	}
  
  
		

	}

}
 
