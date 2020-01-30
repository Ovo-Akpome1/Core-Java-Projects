import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("WELCOME TO COMPLEX MANAGEMENT SYSTEM");
        System.out.println("------------------------------------");
        System.out.print("Please Enter the number of tenants that you would like to rent to:");
        Scanner userInput = new Scanner(System.in);
        int numberOfTenants = userInput.nextInt();
        Tenant myTen[] = new Tenant[numberOfTenants];

        int i;
        if (numberOfTenants != 0) {
            for (i = 0; i < numberOfTenants; i++) {
                System.out.println("NEW TENANT CREATED!");
                System.out.println("-------------------------------");
                System.out.print("Tenant's FirstName: ");
                String firstName = userInput.next();
                System.out.print("Tenant's LastName: ");
                String lastName = userInput.next();
                System.out.print("Tenant's Apartment Number: ");
                String apartment = userInput.next();
                System.out.print("Enter the yearly amount the user will pay for this apartment:R");
                int yearlyRent = userInput.nextInt();
                Tenant myTenant = new Tenant(firstName, lastName, apartment, yearlyRent);
                myTenant.getFirstName();
                myTenant.getLastName();
                myTenant.getApartment();
                myTenant.getYearlyRent();
                myTen[i] = new Tenant(firstName, lastName, apartment, yearlyRent);
            }

            System.out.println();
            System.out.println("----------------------------------");
            System.out.println("INFO SUMMARY OF TENANTS");
            showTenants(myTen);

        } else {
            System.out.println("error : YOU DID NOT INPUT THE AMOUNT OF TENANTS YOU WANTED TO RENT TO!!!");
        }

    }


    public static void showTenants(Tenant[] myTen) {
        for (int i = 0; i < myTen.length; i++) {
            System.out.println("----------------------------------");
            System.out.println("Tenant's Full Name: " + myTen[i].getFirstName() + " " + myTen[i].getLastName());
            System.out.println("Tenant's Apartment Number: " + myTen[i].getApartment());
            System.out.println("Yearly Rent:R "+myTen[i].getYearlyRent());
            int deposit = (myTen[i].getYearlyRent()/100) * 20;
            System.out.println("First deposit(20% of "+ myTen[i].getYearlyRent()+") is:R"+deposit+".00");
            int remainder = myTen[i].getYearlyRent() - deposit;
            int monthlyRent = remainder / 12;
            System.out.println("Monthly Rent:R" +monthlyRent+".00");
        }
        System.out.println("**************************************");
        System.out.println("PROCESS COMPLETED!!");


    }
}