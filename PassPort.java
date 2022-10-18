public class PassPort
{
   private String name;
   private String sex;
   private int dateOfBirth;
   private String birthPlace;
   private String passPortCity;
   private int passPortExp;
   private boolean validPassPort;
   public static final String[] validCountries = {"Ambrosia", "Eastasia", "Freedonia", "Latveria", "Neverland", "Vulgaria", "Wakanda"};
   public static final String[] alliedCountries = {"Ambrosia", "Eastasia", "Freedonia", "Latveria", "Neverland", "Vulgaria", "Wakanda"};
   
   public PassPort(String name, String sex, int dateOfBirth, String birthPlace, String passPortCity, int passPortExp)
   {
      this.name = name;
      this.sex = sex;
      this.dateOfBirth = dateOfBirth;
      this.birthPlace = birthPlace;
      this.passPortCity = passPortCity;
      this.passPortExp = passPortExp;
   }
   
   public String getName()
   {
      return name;
   }
   
   public String getGender()
   {
      return sex;
   }
   
   public int getBirthDate()
   {
      return dateOfBirth;
   }
   
   public String getBirthPlace()
   {
      return birthPlace;
   }
   
   public String getPassPortCity()
   {
      return passPortCity;
   }
   
   public int getExpDate()
   {
      return passPortExp;
   }
   
   public static String getValidCountriesAndAllies()
   {
      String s = "Valid Birth Places: ";
      for(String country : validCountries)
         s += country + ", ";
         
      s += "\n" + "Allied Countries: ";
      for(String ally : alliedCountries)
         s += ally + ", ";
         
      return s;
      
   }
   
   public boolean isValid(Immigrant i)
   {
      boolean b = false;
      if(i.getName().equals(name) && i.getGender().equals(sex) && dateOfBirth < 2003 && passPortExp > 2022)
      {
         for(String country : validCountries)
         {
            if(birthPlace.equals(country))
            {
               for(String ally : alliedCountries)
               {
                  if(passPortCity.equals(ally))
                  {
                        b = true;
                  }
                     
               }
            }
         }
      }
      
      return b;
   }
}