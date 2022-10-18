import java.util.*;

public class Play
{
   public static void main(String[] args)
   {
      // entry ticket
    
      Scanner s = new Scanner(System.in);
      System.out.println("Welcome to Broder Control! Please drag the terminal window all the way up and enter E to begin...");
      
      String begin = s.nextLine();
      while(!(begin.equalsIgnoreCase("e")))
      {
         System.out.println("Invalid input. Please fullscreen and enter E to begin!");
         begin = s.nextLine();
      }
      
      // Introduction and main menu
      System.out.println("\n" + "\n");
      // Introduction and main menu
      
      System.out.println( 
                           "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" + "\n" +
                           "  ####   ##       ####   #####   ##  ##          ######   ####           ##  ##  ######  #####   ######   ####    ####   ##       ####   ##  ##   ####   ##  ##  ######   ####  " + "\n" +
                           " ##      ##      ##  ##  ##  ##   ####             ##    ##  ##          ##  ##  ##      ##  ##     ##   ##  ##  ##      ##      ##  ##  ##  ##  ##  ##  ## ##     ##    ##  ## " + "\n" +
                           " ## ###  ##      ##  ##  #####     ##              ##    ##  ##          ######  ####    #####     ##    ##  ##   ####   ##      ##  ##  ##  ##  ######  ####      ##    ###### " + "\n" +
                           " ##  ##  ##      ##  ##  ##  ##    ##              ##    ##  ##          ##  ##  ##      ##  ##   ##     ##  ##      ##  ##      ##  ##   ####   ##  ##  ## ##     ##    ##  ## " + "\n" +
                           "  ####   ######   ####   ##  ##    ##              ##     ####           ##  ##  ######  ##  ##  ######   ####    ####   ######   ####     ##    ##  ##  ##  ##  ######  ##  ## " + "\n" +
                           "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" + "\n");
                           
      System.out.println("Congratulation on your new job as a border agent, your job is to allow people in who fit the criteria stated. (Press E to continue...)");
      begin = s.nextLine();
      while(!(begin.equalsIgnoreCase("e")))
      {
         System.out.println("Invalid input. Enter E to continue!");
         begin = s.nextLine();
      }
      System.out.println("Everytime you allow somone in who's not suppossed to be allowed in, you get an ticket. (Press E to continue...)");
      begin = s.nextLine();
      while(!(begin.equalsIgnoreCase("e")))
      {
         System.out.println("Invalid input. Enter E to continue!");
         begin = s.nextLine();
      }
      System.out.println("If you get 3 or more tickets, you will be fired and deported from Herzoslovakia! (Press E to continue...)");
      begin = s.nextLine();
      while(!(begin.equalsIgnoreCase("e")))
      {
         System.out.println("Invalid input. Enter E to continue!");
         begin = s.nextLine();
      }
      System.out.println("Walk into your station to begin your new Job! Glory to Herzoslovakia! (Press E to walk into your station...)");
      begin = s.nextLine();
      while(!(begin.equalsIgnoreCase("e")))
      {
         System.out.println("Invalid input. Enter E to continue!");
         begin = s.nextLine();
      }
      
      ImmigrantList immigrantList = new ImmigrantList();
      Instructions instructions = new Instructions();
      
      int fails = 0;
      
      for(int i = 0; i < immigrantList.getListSize(); i++)
      {
         if(fails < 2)
         {
            ImagePerson image = new ImagePerson(immigrantList.getImmigrantReference(i));
            System.out.println(image.getFace());
            System.out.println(immigrantList.getImmigrant(i));
            
            System.out.println("Rules: " + "\n" + instructions.getInstructions());
            System.out.println(PassPort.getValidCountriesAndAllies());
            System.out.print("\n");
            
            if(fails > 0)
               System.out.println("Warnings: " + fails);
               
            System.out.print("Accept or Reject Immigrant? (type \"accpet\" to accpet and \"reject\" to reject): ");
            String answer = s.nextLine();
            
            while(!(answer.equalsIgnoreCase("accept") || answer.equalsIgnoreCase("reject")))
            {
               System.out.print("Invalid input. please type \"accpet\" to accpet and \"reject\" to reject: ");
               answer = s.nextLine();
            }
             
            boolean answer2 = false;
            if(answer.equalsIgnoreCase("accept"))
               answer2 = true;
               
            String answer3 = ((Boolean)answer2).toString();     
            String realAnswer = ((Boolean)(immigrantList.getPassPortReference(i).isValid(immigrantList.getImmigrantReference(i)))).toString();
            
            if(!(answer3.equalsIgnoreCase(realAnswer)))
            {
               fails++;
               if(fails > 1)
               {
                  System.out.println("UH OH! You just let in an illegal immigrant!! You have " + fails + " warnings. " + (2 - fails) + " more and you will be FIRED!");
                  System.out.print("\n");
               }
               else
               {
                  System.out.println("UH OH! You just let in an illegal immigrant!! You have " + fails + " warning. " + (2 - fails) + " more and you will be FIRED!");
                  System.out.print("\n");
               }
            }
            
         }
      }
      
      if(fails >= 2)
      {
         System.out.print("\n" + "\n" + "\n"); 
         System.out.println("OOPS! Looks like you have let in too many illegal immigrant. Please hand in you badge and uniform right away. The Cops will be here to take you to the deport station...");
         System.out.println("Inner Dialogue: \"There's a backdoor open to my right. If i run at just the right time I might be able to escape...\"");
         System.out.println("Enter E to attempt an escape or N to accept your deportation! (You have a 40% chance)");
         
         String takeChance = s.nextLine();
         while(!(takeChance.equalsIgnoreCase("e") || takeChance.equalsIgnoreCase("n") ))
         {
            System.out.println("Invalid input. Enter E to attempt an escape or N to accept your deportation!!");
            takeChance = s.nextLine();
         }
         
         if(takeChance.equalsIgnoreCase("e"))
         {
            int chance = (int)(Math.random() * 11);
            
            if(chance <= 6)
               System.out.println("Congratulations! You succesfully escaped Herzoslovakia and are now a refuge in the United States! Good Luck!");
            else
               System.out.println("Oh No. You were caught trying to escape communist rule. You will know be publicly executed. Goodbye!");
         }
       }
       
       else
         System.out.println("Congratulations! Your succesfully completed your first day of work. You earned $0.05 for working 13 hours straight! See you Tommorrow!");
   }
}