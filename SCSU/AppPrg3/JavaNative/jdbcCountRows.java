import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CountRows
{
  public static void main(String[]args)
  {
    try
    {
      int count=0;
      Class.forName("com.mysql.jdbc.Driver");
      Connection
      con=DriverManager.getConnection("jdbc:mysql://<host/IP>/<database>","<username>","<password>");
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("select * from emp_table");
      System.out.println(""+"Emp ID\t"+"Emp Name"+"Emp Salary\n");
      while(rs.next())
      {
        count++;
      }
      System.out.println("Number of records "+count);
    }
    catch(Exception e)
    {e.printStackTrace();}
  }
}
