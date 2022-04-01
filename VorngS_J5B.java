// Solitha Vorng
// Menu VorngS_J5B

import java.util.Scanner; 
public class VorngS_J5B 
   {
       public static void main(String[] args) 
        {
         // declare variables
         
         double total = 0;
         char ch; 
         
         // create scanner to read user input
         
          Scanner s = new Scanner(System.in);
           
          String order=""; 
         
         // show options for burgers
         
          System.out.println(" What burger would you like?");
          System.out.println(" Your options are:" + "\n" +
          " Hamburger (H)= $4.00" + "\n" + " Cheeseburger (C)= $5.00" + "\n"
           +  " Veggieburger (V)= $6.00");

          
          while(true)
          { 
          System.out.print("\nPlease enter the code. ");
          
          // reads charinput
          
          ch = s.next().charAt(0);
          
          // use if statement for hamburger selection
          
           if(ch== 'H' ||ch=='h' || ch== 'C' || ch== 'c' || ch== 'V' || ch== 'v') 
           {
           break; 
           }
           
           System.out.println("Please enter the correct code.");
           
           }
            
            switch(ch)
             { 
               case 'h':
               case 'H':
               order+="1. Hamburger\n"; 
               total+=4.0;
               {
               break;
               }
               case 'c':
               case 'C':
               order+="1. Cheeseburger\n";
               total+=5.0; 
               {
               break;
               }
               case 'v': 
               case 'V':
               order+="1.Veggieburger\n";
               total+=6.0;
               {  
               break;
               }
               
              }
              
              //show options for drinks
              
                System.out.println(" What size drink would you like?");
                System.out.println(" Small drink = $1.50 (S)" + "\n" + " Medium drink = $2.00 (M)" + "\n" +
                " Large drink = $2.50 (L)" + "\n" + " Water = $0.00 (W)");
                System.out.println(" Please type the code in the parentheses:");
 
                
                while(true)
                { 
                  System.out.print("\nPlease enter the code. "); 
                  
                  ch = s.next().charAt(0);
                  
                 if(ch=='S' || ch=='s' ||ch=='M' ||ch=='m' || ch=='L'||ch=='l' ||ch=='W'|| ch=='w') // condition for both lower and upper case
                 
                  break; 
                 
                 System.out.println("Wrong input, please enter the correct code"); 
                 
                }
                 
                  switch(ch)
                  { 
                     case 's':
                     case 'S':
                     order+="2. Small Drink\n";
                     
                     total+=1.5;
                     {
                     break; 
                     }
                     case 'm':
                     case 'M':
                     order+="2. Medium Drink\n";
                     
                     total+=2.0;
                     { 
                     break; 
                     }
                     case 'l': 
                     case 'L':
                     order+="2. Large Drink\n";
                     
                     total+=2.5;
                     {
                     break; 
                     }
                     case 'w':
                     case 'W':
                     order+="2. Water\n";
                     {
                     break;
                     }
                   } 
                   
                   // show options for dessert
                   
                   System.out.println(" What dessert would you like?");
                   System.out.println(" Your options are: " + "\n" +
                   " Vanilla (V)= $1.50" +"\n" + " Chocolate (C)= $1.50" + "\n" +
                          " Yogurt (Y)= $1.75" + "\n" + " No Dessert (N)= $0.00");
                   System.out.println(" Please type the code in the parentheses:");
                    
                    while(true)
                    { 
                       System.out.print("\nEnter Code: "); 
                       
                       ch = s.next().charAt(0);
                       
                       if(ch=='V' || ch=='c' || ch=='C' ||ch=='c' || ch=='Y'||ch=='y' || ch=='V' ||ch=='N' ||ch=='n') 
                       {
                       break; 
                       }
                        System.out.println("Invalid Code! Try Again!!"); 
                     } 
                     
                     switch(ch)
                     { 
                       case 'v':
                       case 'V':
                       order+="3. Vanilla\n"; 
                       total+=1.5;
                       {
                       break;
                       }
                       case 'c':
                       case 'C':
                       order+="3. Chocolate\n";
                       total+=1.5;
                       {
                       break;
                       }
                       case 'y':
                       case 'Y':
                       order+="3. Yogurt\n";
                       total+=1.75;
                       {
                       break;
                       }
                       case 'n':
                       case 'N':
                       {
                       break;
                       }
                     } 
                     
                     // show user output of selection and cost
                     
                       System.out.println("Here are your selected items"); 
                       System.out.println(order); 
                       System.out.println(" Total: $" + total);
                       
                      }
                 }