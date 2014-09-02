import java.awt.*;
import java.swing.*;

public class HelloApplet extends JApplet
{
  public void init()
  {
    Container contentPane = getContentPane();
    contentPane.setLayout(newFlowLayout());
    JLabel friendlyLabel = new JLabel("Hello out there!");
    contentPane.add(friendlyLabel);
  }
}
