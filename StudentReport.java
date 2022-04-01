//Solitha Vorng
// array for grades

import java.util.Scanner;

class StudentReport
    {
      public static void main(String[] args)
       {       
        // array to store names
        
        String[] studentName = new String[5];
        
        // array to store scores
        
        int[] grade = new int[5];
        
        // instantiate scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter names and marks of 5 students");
        // loop through to collect 5 student's names and marks
        for(int i=0; i<5; i++) {
            // input name of the student
            System.out.print("\nName: ");
            studentName[i] = sc.nextLine();
            do {
                // input marks of the student
                System.out.print("Marks: ");
                grade[i] = sc.nextInt();
                // if the marks is negative
                if(grade[i] < 0)
                    // display an error message
                    System.out.println("Marks cannot be negative!");
            }while(grade[i] < 0); // keep looping till the marks entered is negative
            sc.nextLine();
        }
        System.out.println();
        
        System.out.println("Student Report:");
        System.out.printf("%20s%20s\n","Student","Marks Obtained");
        // loop through each student in the array
        for(int i=0; i<5; i++) {
            // display a report similar to the given format
            System.out.printf("%20s%20d\n",studentName[i], grade[i]);
        }

    }
}