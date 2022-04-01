// Solitha Vorng
// automotive dealership VorngS_J3B

import java.util.Scanner;
public class VorngS_J3C

{  
    public static void main(String[] args)
    { 
        // delcare variables and inti.
        
      int numPay; 
      double amtPay = 0; 
      double amtLoan = 0;            // initialize all to zero
      double intRate= 0; 
      double balAn = 0; 
      double balNew = 0; // new balance
      double prinCe = 0; 
      double inTrest = 0; 
      
       // create scanner class and ask questions
       
       Scanner key = new Scanner(System.in);
       
       System.out.println("Please fill out the information below for your amortization schedule report.");

       System.out.print("Please enter the loan amount. ");
         amtLoan = key.nextDouble();
         balAn = amtLoan; // loan to the balance
                          // if not declared the balance would start off at 0.
       
       System.out.print("Please enter the number of payments.");
         numPay = key.nextInt(); // tot. no. of payments
       
       System.out.print("Please enter the interest rate without converting it to a decimal. ");
         intRate = key.nextDouble()/100; // divide by 100 to turn into decimal  
       
       System.out.print("Please enter the payment amount. ");
         amtPay = key.nextDouble();
          
       /* create columns and format
          format with s for string; it moves spaces desired
         " - " = left where right has no signs
       */
 
       System.out.printf("%-10s%-10s%-14s%-14s%-8s%-12s\n", "year", "balance", "payment", 
       "interest", "principle", "new balance");
      
       // use the for loop and calculations
       
       for (int payNum = 1; payNum <= numPay; payNum++) // ++ increment of 1
       
        { 
               /* 
               the interest rate was already 
               divided by 100 with scanner above
               user does not need to put decimals 
               ex. ( input 12 instead of .12)
               */
               
            inTrest = balAn * intRate; // divided by 100 in scanner
            
            prinCe = amtPay - inTrest; // make sure balance = amtpay or the balance will be 0
            
            balNew = balAn - prinCe; // new balance formula

      
       // shows the output and use printf to format decimals
       
          System.out.printf("%-10d%-12.2f%-12.2f%-12.2f%-12.2f%-12.2f\n", 
          payNum, balAn, amtPay, inTrest, prinCe, balNew); // use d for integer formatting ( year are int type) and f for floats 

          
          /* must transfer new balance to the old balance 
            or it will not compute right and will repititvely
            show the same output for all the columns
          */
          
          // tranfers nb > b placed last or it will start formulating and won't start w loan amt
          balAn = balNew; 
 
        }    
   }
}