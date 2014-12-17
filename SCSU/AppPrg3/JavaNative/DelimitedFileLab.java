import java.io.*;
import java.util.*;

class DelimitedFileLab{

  public static void main(String[]args){
   TokenTest t_t = newTokenTest();
   t_t.dbTest();
  }

  void dbTest(){

   DataInputStream dis = null;
   String csvRecord = null;
   
   try{
    File f = new File("sales.info.csv");
    FileInputStream fis = new FileInputStream(f);
    BufferedInputStream bis = new BufferedInputStream(fis);
    dis = new DataInputStream(bis);
    
    //read the first record of the database
    while((csvRecord = dis.readLine())!=null){
    
    String Tokenizer st = new StringTokenizer(csvRecord, ",");
    String salsmanid = st.nextToken(); 
    String grossSales = st.nextToken();
    String netProfit = st.nextToken();
    
    System.out.println("Sales person id:" + salsmanid);
    System.out.println("Sales persons gross sales: " + grossSales);
    System.out.println("Net profit: " + netProfit");
    }
    
    } catch(IOException e){
      //catch io errors from FileInputStream or readLine()
      System.out.println("Uh oh, got an IOException error:" + e.getMessage());
      }finally{
   // if file opened okay, make sure we close it
   if(dis!=null){
    try{
    dis.close();
    }catch(IOException ioe){
    }
    }
   }
  }
}
