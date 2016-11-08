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
public void init()
}
