public class Instructions
{
   private Rule[] rules;
   
   public Instructions()
   {
      rules = new Rule[6];
      
      for(int i = 0; i < 6; i++)
      {
        if(i == 0)
         rules[i] = new Rule("The name an Immigrant gives you must match the name on their passport.");
        
        if(i == 1)
         rules[i] = new Rule("The gender of an Immigrant must match the gender on their passport.");
        
        if(i == 2)
         rules[i] = new Rule("The date of birth of an Immigrant must say they are over 18.");
        
        if(i == 3)
         rules[i] = new Rule("The Immigrant can not be a foreigner (they must be from a country in the continent).");
        
        if(i == 4)
         rules[i] = new Rule("The Immigrant's passport must be from a valid country (A country on the \"Allies\" list).");
        
        if(i == 5)
         rules[i] = new Rule("The Immigrant's passport must not be expired");
      }
   }
   
   public String getInstructions()
   {
      String s = "";
      for(int i = 0; i < rules.length; i++)
      {
         s += (i + 1) + "." + " " + rules[i].getInstruction();
         s += "\n";
      }
      
      return s;
     
   }
}