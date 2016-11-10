import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseAccess
{
  public static void main(String[]args)
  {
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      Connection
con=DriverManager.getConnection("jdbc:mysql://<host/IP>/<database>","<username>","<password>");
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("select * from emp_table");
      System.out.println(""+"Emp ID\t"+"Emp Name"+"Emp Salary\n");
      while(rs.next())
      {
        System.out.println(""+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
      }
    }
    catch(Exception e)
    {e.printStackTrace();}
  }
}
