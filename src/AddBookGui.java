import java.awt.*;
import javax.swing.*;
import java.util.*;

 //TEST COMIT
public class AddBookGui extends JFrame{// implements ActionListener {

	/**
	 * @param args
	 */
	private int x = 0;
	private JButton clicked ;//= new JButton("");
	private JPanel panel;
	JTextField field = new JTextField();
	
	AddBookGui()
	{		
		createFrame();
		//button_desc();
	}
	
	public void button_desc()
	{
		  panel = new JPanel();
		  clicked = new JButton("Click this button to update the ");
		  this.setSize(400,400);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  this.setLocation(200,200);
		  this.setTitle("Button");
		  panel.add(clicked);
		  this.add(panel);
		  this.pack();
		  this.setVisible(true);
	}
	public void createFrame()
	{
		
		JFrame frame = new JFrame("Address Book v0.1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Menubar
        JMenuBar greenMenuBar = new JMenuBar();
        greenMenuBar.setBackground(new Color(154, 165, 127));
        //Add item
        greenMenuBar.add(MenuItem("Next Item"));
        //Text frame
        
        //Frame set
        frame.setJMenuBar(greenMenuBar);
        frame.add(field);
        frame.setSize(400,300);
        frame.setVisible(true);
	}
	public void setText(String s)
	{
		field.setText(s);
	}
	private JMenuItem MenuItem(String name) {
        JMenuItem m = new JMenuItem(name);
        //m.addActionListener(this);
        return m;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddBookGui G = new AddBookGui();
		AddressBook adbook = new AddressBook();
		adbook.test();
		G.setText(adbook.getName(0));
		
		

	}

}
