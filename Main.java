
import java.util.*;

class Main {
  public static void main(String[] args) {
Scanner input = new Scanner(System.in);

    System.out.println("Please enter the following information: ");
    
    System.out.println("First name: ");
      String firstName = input.next();
    
    System.out.println("Last name: ");
    String lastName =input.next();
    
    System.out.println("Age: ");
    int age = input.nextInt();

    System.out.println("SSN: ");
    long SSN= input.nextLong();

    System.out.println("Phone number: ");
    long phoneNo = input.nextLong();
    
    System.out.println("Yearly income: ");
    int yearlyIncome = input.nextInt();

    System.out.println("Married: ");
    boolean married = input.nextBoolean();
    
    System.out.println("Address: ");
    input.nextLine();
    String address = input.nextLine();

    System.out.println("");
    System.out.println(" Thanks, here's the info that you entered:");
    System.out.println("First Name: " + firstName);
    System.out.println("Last Name: " + lastName);
    System.out.println("Age: " + age);
    System.out.println("SSN: " + SSN);
    System.out.println("Phone Number: " + phoneNo);
    System.out.println("Yearly Income: " + yearlyIncome);
    System.out.println("Married: " + married);
    System.out.println("Address: " + address);
  }
}