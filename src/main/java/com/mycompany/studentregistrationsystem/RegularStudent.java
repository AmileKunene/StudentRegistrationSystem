
package com.mycompany.studentregistrationsystem;


public class RegularStudent extends Student {
   public int yearLevel;
   public String specialization;
   
 public RegularStudent(int yearLevel, String specialization, String firstName, int studentID, String lastName){
 super(firstName,studentID,lastName);
 this.yearLevel = yearLevel;
 this.specialization = specialization;
 }
    
 public void display(){
     System.out.println("Student name: " + firstName + " Surname: " + lastName + " Student ID: " + studentID);
     System.out.println("Year: " + yearLevel);
     System.out.println("Major: " + specialization);
 }
    
}
