public class DetermineOS{
  public static void main(String[]args){
    String strOSName = System.getProperty("os.name");
    
    System.out.print("Get OS name example.. OS is");
    
    if(strOSName != null)
    {
      if(strOSName.toLowerCase().indexOf("windows")!=-1)
        System.out.println("Windows");
      else
        System.out.print("now windows, but ");
        System.out.print(strOSName);
        System.out.print(" ");
    } 
  }
}
