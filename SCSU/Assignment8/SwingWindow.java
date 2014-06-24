import javax.swing.*;
import java.awt.*;

class SwingWindow extends JFrame
{
	public SwingWindow()
	{
		super("Combo Box");
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Container contentArea = getContentPane();
		
		FlowLayout flowManager = new FlowLayout();
		contentArea.setLayout(flowManager);
		
		JComboBox islands = new JComboBox();
		islands.addItem("Corfu");
		islands.addItem("Kefallinia");
		islands.addItem("Crete");
		islands.addItem("Rhodes");
		islands.addItem("Paxos");
		islands.addItem("Mykonos");
		contentArea.add(islands);
		
		setContentPane(contentArea);
		
	}
}
public class ComboBox
{
	public static void main(String[]args)
	{
	SwingWindow ComboBox = new SwingWindow();
	}
}
