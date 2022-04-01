// Solitha Vorng
// lawn maintenance company VorngS_J3B

import javax.swing.JOptionPane;
public class VorngS_J3B

{  
    public static void main(String[] args)
    { 
        // declare and intit. varibles
        
     int numEmp;
     double totGross = 0; 
     double stTax = 0;
     double fedTax= 0;
     double ficaWith = 0;
     double netPay = 0;
     double gross = 0, tax =0 ,fed = 0, fic = 0; // reads scanner input
    
    // ask for employee number create string
    
    String empLoy, grOss, tAx, fEd, fIc, emplOy, mesS;
    
     empLoy =
      JOptionPane.showInputDialog(null,"Please enter your employee number.");
      numEmp = Integer.parseInt(empLoy);

    // use while loop 
    
    while (numEmp != 0) // does not equal 0
  {
       grOss =
            JOptionPane.showInputDialog(null,"Please enter your gross amount.");
            gross = Double.parseDouble(grOss);  // use double bc of decim.
      
       tAx =
            JOptionPane.showInputDialog(null, "Please enter the state tax amount without the percent symbol.");
            tax = Double.parseDouble(tAx);
   
       fEd =
            JOptionPane.showInputDialog(null, "Please enter the federal tax amount without the percent symbol.");
            fed = Double.parseDouble(fEd);

       fIc =
            JOptionPane.showInputDialog(null, "Please enter the FICA withholding amount." );
            fic = Double.parseDouble(fIc);
       
       emplOy =
            JOptionPane.showInputDialog(null,"Key in 0 to get your results or enter another employee number.");
            numEmp = Integer.parseInt(emplOy);

 // use or while will continue and not terminate

   }
       // calculations for totals and net pay
       
      totGross = totGross + gross;
      stTax = stTax + tax;
      fedTax = fedTax + fed;
      ficaWith = ficaWith + fic; 
      netPay = totGross - stTax - fedTax - ficaWith;
      
      // display output to user form input
      // use string format instead of printf method
      // can't use System.out.printf or will not display
      
      mesS=
         String.format("Here is your report:" + "\n" + "Gross total: $ %.2f\n", totGross) + 
         String.format("State Tax Percentage:  %.2f\n", stTax) + 
         String.format("Federal Tax Percenatage:  %.2f\n", fedTax) +
         String.format("FICA Witholding: $ %.2f\n", ficaWith) +
         String.format("Your total net pay is: $ %.2f\n",netPay);
         JOptionPane.showMessageDialog(null, mesS); 
     
   }
 }
