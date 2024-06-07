
package com.mycompany.studentregistrationsystem;


public class Student {
    
    public int studentID;
    public String firstName;
    public String lastName;
    
    
    
    public Student(String firstName, int studentID, String lastName){
    this.firstName = firstName;
    this.studentID = studentID;
    this.lastName = lastName;
    
    }
    public void displayStudent(){
       System.out.println("Student name: " + firstName + " Surname: " + lastName + " Student ID: " + studentID);
    }
    
}
