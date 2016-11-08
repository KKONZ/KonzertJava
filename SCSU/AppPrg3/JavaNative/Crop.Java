import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Crop extends JApplet implements ActionListener
{
private JTextField n1Text = new JTextField();
private JTextField n2Text = new JTextField();
private JTextField n3Text = new JTextField();
private JLabel Instructions = new JLabel("Enter number of acres desired for each crop then press cost or revenue");
private JLabel n1Label = new JLabel("Enter acres of soybeans here");
private JLabel n2Label = new JLabel("Enter acres of corn here");
private JLabel n3Label = new JLabel("Enter acres of potatoes here");
private JLabel answerLabel = new JLabel("Total cost or revenue");
private JLabel revenueButton = new JLabel("revenue");
double sum;
double n1;
double n2;
double n3;
public void init() // Starts executable
{
ansText.setEditable(false);
JPanel content = new JPanel(new GridLayout(4,2,1,1));
content.add(Instructions);
content.add(n1Text);
content.add(n2Label);
content.add(n2Text);
content.add(ansText);
JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
buttonPanel.add(costButton);
buttonPanel.add(revenueButton);

add(content, BorderLayout.NORTH);
add(buttonPanel, BorderLayout.SOUTH);
revenueButton.addActionListener(this);
costButton.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getActionCommand().equals("cost"))
{
n1 = stringToDouble(n1Text.getText());
n2 = stringToDouble(n2Text.getText());
n3 = stringToDouble(n3Text.getText());
sum = (n1 * 900) + (n2 * 100) + (n3 * 750);
ansText.setText(Double.toString(sum));
}
else if(e.getActionCommand().equals("revenue"))
{ 
n1 = stringToDouble(n1Text.getText());
n2 = stringToDouble(n2Text.getText());
n3 = stringToDouble(n2Text.getText());
sum = (n1 * 1300) + (n2 * 1650) + (n3 * 1200);
ansText.setText(Double.toString(sum));
}
else
{
ansText.setText("Error");
}}
private static double stringToDouble(String stringObject)
{
return Double.parseDouble(stringObject.trim());
}}
