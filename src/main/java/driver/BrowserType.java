package driver;

public enum BrowserType {
   CHROME,
   FIREFOX,
   IE;

   public String getName(){
      return this.name().toLowerCase();
   }

}
