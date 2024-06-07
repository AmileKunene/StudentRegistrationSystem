

package com.mycompany.studentregistrationsystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRegistrationSystem {
     
        public List<Student> students;
    
        public StudentRegistrationSystem(){
        this.students = new ArrayList<>();
        }
    
   
      public void addStudent(Student student){
        students.add(student);
        System.out.println("Student Added!");
      }
      
      public void displayStudents(){
      if (students.isEmpty()){
       System.out.println("No student yet");
      }else{
      System.out.println("List of Students");
      for(Student student : students){
      student.displayStudent();
      
      }
      }
      }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentRegistrationSystem obj = new StudentRegistrationSystem();
        
        while (true){
        System.out.println("1. Add Regular student");
        System.out.println("2. Add Transfer student");
        System.out.println("3. Add International student");
        System.out.println("4. Display registed students");
        System.out.println("5. Exit");
        
        System.out.println("Enter Input: ");
        String userInput = scanner.nextLine();
        
        switch(userInput){
            case "1":
                System.out.println("Enter first name: ");
                String firstname = scanner.nextLine();
                System.out.println("Enter last name:  ");
                String lastName = scanner.nextLine();
                System.out.println("Enter ID: ");
                int studentID = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter year level: ");
                int yearLevel = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter specialization: ");
                String specialization = scanner.nextLine();
                
                obj.addStudent(new RegularStudent(yearLevel,specialization,firstname,studentID,lastName));
                break;
                
            case "2": 
                System.out.println("Enter first name: ");
                String transFirstname = scanner.nextLine();
                System.out.println("Enter last name:  ");
                String transLastName = scanner.nextLine();
                System.out.println("Enter ID: ");
                int transStudentID = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter previous institution: ");
                String previousInstitution = scanner.nextLine();
                
                obj.addStudent(new TransferStudent(previousInstitution,transFirstname,transStudentID,transLastName));
                break;
            case "3":
                 System.out.println("Enter first name: ");
                String interFirstname = scanner.nextLine();
                System.out.println("Enter last name:  ");
                String interLastName = scanner.nextLine();
                System.out.println("Enter ID: ");
                int interStudentID = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter country of origin: ");
                String countryOfOrigin = scanner.nextLine();
                System.out.println("Enter your passport: ");
                int passportNumber = scanner.nextInt();
                scanner.nextLine();
                
                obj.addStudent(new InternationalStudent(countryOfOrigin,passportNumber,interFirstname,interStudentID,interLastName));
                break;
                
            case "4":
                obj.displayStudents();
                break;
            case "5": 
                scanner.close();
                System.exit(0);
            default:
                System.out.println("INVALID INPUT!!!");
                
        }
        
        }
        
        
        
        
    }
}
