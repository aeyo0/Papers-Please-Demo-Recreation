import java.util.ArrayList;

public class ImmigrantList
{
   private ArrayList<Immigrant> immigrants = new ArrayList<Immigrant>();
   private ArrayList<PassPort> passports = new ArrayList<PassPort>();
   
   public ImmigrantList()
   {
      immigrants.add(new Immigrant("Wolfgang Faber", "M"));
      passports.add(new PassPort("Wolfgang Faber", "M", 1988, "Latveria", "Eastasia", 2025));
      
      immigrants.add(new Immigrant("Florian Glockner", "M"));
      passports.add(new PassPort("Florian Glockner", "F", 2001, "Ambrosia", "Wakanda", 2025));
      
      immigrants.add(new Immigrant("Krista Nocht", "F"));
      passports.add(new PassPort("Krista Nocht", "F", 2013, "Neverland", "Grestlslovakia", 2025));
      
      immigrants.add(new Immigrant("Steffen Schreiber", "M"));
      passports.add(new PassPort("Steffen Schreiber", "M", 1969, "Vulgaria", "Freedonia", 2025));
      
      immigrants.add(new Immigrant("Anastasia Schreiber", "F"));
      passports.add(new PassPort("Steffen Schreiber", "M", 1969, "Vulgaria", "Freedonia", 2025));
      
      immigrants.add(new Immigrant("Max Verstappen", "M"));
      passports.add(new PassPort("Max Verstappen", "M", 1991, "Eastasia", "Eastasia", 2025));
   }
   
   public String getImmigrant(int i)
   {
      String s = "";
      if(i >= 0 && i<= immigrants.size())
      {
         s += "Hello my name is " + immigrants.get(i).getName() + ". Cant wait to go back home!";
         s += "\n" + "\n" + "PassPort Information: " + "\n" + "-----------------------------" + "\n" + "Name: " + passports.get(i).getName() + "\n" + "Gender: " + passports.get(i).getGender() + "\n" + "Birth Day: " + passports.get(i).getBirthDate() + "\n" + "Birth Location: " + passports.get(i).getBirthPlace() + "\n" + "PassPort City: " + passports.get(i).getPassPortCity() + "\n" + "PassPort Expiration Date: " + passports.get(i).getExpDate() + "\n" + "-----------------------------" + "\n";
      }
      
      return s;
   }
   
   public Immigrant getImmigrantReference(int i)
   {
      return immigrants.get(i);
   }
   
   public PassPort getPassPortReference(int i)
   {
      return passports.get(i);
   }
   
   public int getListSize()
   {
      return immigrants.size();
   }
}