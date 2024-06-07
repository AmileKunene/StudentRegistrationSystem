
package com.mycompany.studentregistrationsystem;


public class InternationalStudent extends Student {
    public String countryOfOrigin;
    public int passportNumber;
    
   public InternationalStudent(String countryOfOrigin, int passportNumber,
           String firstName, int studentID, String lastName){
        super(firstName,studentID,lastName);
        
        this.countryOfOrigin = countryOfOrigin;
        this.passportNumber = passportNumber;
    }
   
   public void display(){
       System.out.println("Student name: " + firstName + " Surname: " + lastName + " Student ID: " + studentID);
       System.out.println("Coutry of origin: " + countryOfOrigin);
       System.out.println("Passport number: " + passportNumber);
   }
    
}
