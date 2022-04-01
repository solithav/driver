//Solitha Vorng
//arithmetic calculator

import javax.swing.JOptionPane;
public class VorngS_J3A

{  
    public static void main(String[] args)
    { 
         //declare and intialize variables
         // limit number to 100 
    
    int num, numTwo, selection, anSwer, right = 0;
    int sum;
    int limit = 100;
    int lowLim = 0;
    int seL, answer=0, nuMtwo=0;
    // make a menu of options and make scanner and random class
    
    String enteR, nuM, numB;
    
    enteR =
      JOptionPane.showInputDialog(null,"Please enter in a number from the list.\n1. Addition\n2. Subtraction\n3. Multiplication\n4. End Program");
      selection = Integer.parseInt(enteR);
    
     // use do while loop 
    
   do
   {
    
     // create random numbers after selection
     
     num = (int)(Math.random()* (limit - 12 + 5 ));
     numTwo = (int)(Math.random()* (lowLim + limit + 5));

     
     // results with if-else statements
     
     if (selection == 1)
   { 
      JOptionPane.showMessageDialog(null,"Add these two numbers. Press OK to continue.");
    right = num + numTwo; 
      }
   
     else if (selection == 2)
   {
      JOptionPane.showMessageDialog(null,"Subtract these two numbers. Press OK to continue.");
    right = num - numTwo; 
   }
   
     else if (selection == 3)
   { 
      JOptionPane.showMessageDialog(null,"Multiply these two numbers. Press OK to continue.");  
    right = num * numTwo; 
   }
    
    else if (selection == 4)
    { break;}
    
     else 
   { JOptionPane.showMessageDialog(null,"Please key in 1-4 only! Run the program again.");
   break; }

   // show the randomated numbers
   numB=
         JOptionPane.showInputDialog(null,"Number 1 = " + num + " Number 2 = " + numTwo + "\n" + 
      "Enter your answer: "); 
   
    anSwer = Integer.parseInt(numB); // reads user input
   
   // check if the answer is correct and display message if not correct
  
   if(right == anSwer)
   {  
      JOptionPane.showMessageDialog(null,"Congrats you got the correct answer!" + "\n" + "Run the program again for a new function!");
   break; // ends program with break
   }
   
   else 
   { 
      JOptionPane.showMessageDialog(null,"That's the wrong answer. The correct answer is: " + right + ".\n" +
       "Run the program again for a new function!"); 
   break;
   }
   
  
      }while(selection!=4);
 
 }
}

     
     