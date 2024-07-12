/*
    Task2 :- 
    Student Grade Calculator. 
*/ 

import java.util.Scanner;
public class Task2 
{
    // Calculating the total marks for the overall subjects. 

    public static int calculateTotalMarks(int totalSubjects)
    {
        Scanner sc = new Scanner(System.in); 

        // Reading the Marks from the User :- 

        int[] marks = new int[totalSubjects];
        int total = 0;
        System.out.println("Enter marks : "); 
        for (int i = 0; i < totalSubjects; i++) 
        {
            marks[i] = sc.nextInt();
            System.out.println("Subject " + (i+1) + " is : " + marks[i]); 
        }
        sc.close();

        // Evaluating Grade based on the marks obtained. 
        
        for (int i = 0; i < marks.length; i++) 
        {
            if (marks[i] > 90 && marks[i] <= 100) 
                System.out.println(marks[i] + " : O Grade");
            else if (marks[i] > 80 && marks[i] <= 90) 
                System.out.println(marks[i] + " : A+ Grade");
            else if (marks[i] > 70 && marks[i] <= 80) 
                System.out.println(marks[i] + " : A Grade");
            else if (marks[i] > 60 && marks[i] <= 70)
                System.out.println(marks[i] + " : B+ Grade");
            else if (marks[i] > 50 && marks[i] <= 60)
                System.out.println(marks[i] + " : B Grade");
            else if (marks[i] >= 45 && marks[i] <= 50) 
                System.out.println(marks[i] + " : C Grade");
            else 
               System.out.println(marks[i] + " : U Grade");
        }

        // Calculating the Total from the overall Subjects :- 

        for (int i = 0; i < marks.length; i++)
            total += marks[i];
        return total;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 

        // Reading the Total Number of Subjects :- 

        System.out.println("Enter total subjects : "); 
        int totalNumberOfSubjects = sc.nextInt(); 
        int totalMarks = calculateTotalMarks(totalNumberOfSubjects);
        System.out.println("Total Marks obtained from " + totalNumberOfSubjects + " subjects is : " + totalMarks);

        /*
            Calculating the average from the below formula :- 
            average = total marks obtained / total subjects. 
        */ 

        int average = totalMarks / totalNumberOfSubjects;
        System.out.println("Average of " + totalNumberOfSubjects + " subjects is : " + average + "%");
        sc.close();
    }
}
