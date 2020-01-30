import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public  class Tenant {
    //fields
    private String firstName;
    private String lastName;
    private String apartment;

    private int yearlyRent;

    //constructor
    public Tenant(String fN, String lN, String apt, int yR) {
        this.firstName = fN;
        this.lastName = lN;
        this.apartment = apt;
        this.yearlyRent = yR;
    }

    //methods
  public String getFirstName(){
        return firstName;
  }

  public String getLastName() {
      return lastName;
  }


  public String getApartment(){
        return apartment;
  }

  public int getYearlyRent(){
        return yearlyRent;
  }
}

