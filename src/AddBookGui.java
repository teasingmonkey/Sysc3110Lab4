import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.*;

public class AddBookGui extends JPanel{// implements ActionListener {

	private JList list;
    private DefaultListModel listModel;
 
    private static final String addStr = "Add";
    private static final String removeStr = "Remove";
    private static final String editStr = "Edit";
    private JButton AddButton;
    private JButton RemoveButton;
    private JButton EditButton;
    private JTextField Buddystring;
    
	 public AddBookGui()
	 {
		 super(new BorderLayout());
		 
	     listModel = new DefaultListModel();
	     
	     //Create the list and put it in a scroll pane.
	        list = new JList(listModel);
	        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	        list.setSelectedIndex(0);
	        list.setVisibleRowCount(5);
	        JScrollPane listScrollPane = new JScrollPane(list);
	        
	    //Creating buttons  
	        AddButton = new JButton(addStr);
	        RemoveButton = new JButton(removeStr);
	        EditButton = new JButton(editStr);
	        
	    //Creating text fields
	        Buddystring = new JTextField(10);
	        
	    //Create a panel that uses BoxLayout.
	        
	        JPanel buttonPane = new JPanel();
	        buttonPane.setLayout(new BoxLayout(buttonPane,
	                                           BoxLayout.LINE_AXIS));
	        buttonPane.add(AddButton);
	        buttonPane.add(Box.createHorizontalStrut(5));
	        buttonPane.add(new JSeparator(SwingConstants.VERTICAL));
	        buttonPane.add(Box.createHorizontalStrut(5));
	        buttonPane.add(RemoveButton);
	        buttonPane.add(EditButton);
	        buttonPane.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
	 
	        add(listScrollPane, BorderLayout.CENTER);
	        add(buttonPane, BorderLayout.PAGE_END);
	        
		 
	 }
	 
	    private static void createAndShowGUI() {
	        //Create and set up the window.
	        JFrame frame = new JFrame("ListDemo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        //Create and set up the content pane.
	        JComponent newContentPane = new AddBookGui();
	        newContentPane.setOpaque(true); //content panes must be opaque
	        frame.setContentPane(newContentPane);
	 
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	    }
	    
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			AddBookGui g = new AddBookGui();
			//g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This is to exit when you click on close button
			//g.pack(); // This is going to display everything without cutting anything off.
		    //g.setVisible(true); // This is to make it visible 
			//g.setTitle("AddressBook V1.3"); // Title of the gui - Since we will be converting it into and addressbook hence V1.0

			javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
		}

	 

}
