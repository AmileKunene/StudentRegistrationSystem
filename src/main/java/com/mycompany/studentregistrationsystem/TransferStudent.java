
package com.mycompany.studentregistrationsystem;


public class TransferStudent extends Student {
   public String previousInstitution;
   
  public TransferStudent(String previousInstitution, String firstName, int studentID, String lastName){
   super(firstName,studentID,lastName);
   
   this.previousInstitution = previousInstitution;
   }
   
  public void display(){
      System.out.println("Student name: " + firstName + " Surname: " + lastName + " Student ID: " + studentID);
      System.out.println("Previous Institute: " + previousInstitution);
  }
}
