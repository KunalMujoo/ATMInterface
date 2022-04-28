

public class ATMCaseStudy
{
   public static void main(String[] args)
   {
	  
      ATM theATM = ATM.getinstance();   //static method for singleton class
      //so that only 1 user can use an ATM machine object at a time.
      
      theATM.run();
   }
}
