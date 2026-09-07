package studentinfo;

import java.util.Scanner;

public class StudentInfo
{
    public static void main(String[] args)
    {
        String Name;
        int Marks;
        String RegistrationNo;
        String Course;
        
        System.out.println("Enter student information");
        
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Enter student name");
        Name = Sc.nextLine();
        
        System.out.println("Enter student registration no");
        RegistrationNo = Sc.nextLine(); 
        
        System.out.println("Enter student marks");
        Marks = Sc.nextInt(); 
        
        Sc.nextLine();
        
        System.out.println("Enter student course");
        Course = Sc.nextLine(); 
        
        System.out.println("Student Name: " + Name);
        System.out.println("Registration No: " + RegistrationNo);
        System.out.println("Marks: " + Marks);
        System.out.println("Course Name: " + Course);
       if(Marks>50)
       {
           System.out.println("Result :pass");
       }
           else
           {
               System.out.println("result:fail");
                   
                   }
       }
    }

