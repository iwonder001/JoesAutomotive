import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class JoesAutomotive extends JFrame {

	
		private JLabel messageTop;
		private JLabel messageButtom;
		private JCheckBox oilChange;
		private JCheckBox lubeJob;
		private JCheckBox radiatorFlush;
		private JCheckBox transmissionFlush;
		private JCheckBox inspection;
		private JCheckBox mufflerReplacement;
		private JCheckBox tireRotation;
		private JPanel panel;
		private JPanel panel1;
		private JPanel panel2;
		
		public JoesAutomotive(){
			//Create text for the title bar
			setTitle("Joe's Automotive");
			setSize(500, 500);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//Create a label
			messageTop = new JLabel("Routine Services");
			//Create check boxes
			oilChange = new JCheckBox("Oil Change ($26.00");
			lubeJob = new JCheckBox("Lub Job ($18.00");
			radiatorFlush = new JCheckBox("Radiator Flush ($30.00");
			transmissionFlush = new JCheckBox("Transmission Flush ($80.00");
			inspection = new JCheckBox("Inspection ($15.00");
			mufflerReplacement = new JCheckBox("Muffler Replacement ($100.00");
			tireRotation = new JCheckBox("Tire Rotation ($20.00");
			//add first panel
			panel = new JPanel();
			panel.setLayout(new FlowLayout(FlowLayout.LEFT));
			panel.add(messageTop);
			panel.add(oilChange);
			panel.add(lubeJob);
			panel.add(radiatorFlush);
			panel.add(transmissionFlush);
			panel.add(inspection);
			panel.add(mufflerReplacement);
			panel.add(tireRotation);
			add(panel);// add panel to frame
			setVisible(true);
			
			/**Private inner class that handles the event when the user 
			 * clicks one of the check boxes
			 */
				// if x is selected then total = total + 26 
				// if x is selected then total = total + 18
			
			//event handling code.  What happens when the user clicks on the button.  This is the method
			public void actionPerformed(ActionEvent e){
				double total = 0;
				
				if(oilChange.isSelected()){
					total = total + 26.00;
				}
				if(lubeJob.isSelected()){
					total = total + 18.00;
				}
				if(radiatorFlush.isSelected()){
					total = total + 30.00;
				}
				if(transmissionFlush.isSelected()){
					total = total + 80.00;
				}
				if(inspection.isSelected()){
					total = total + 15.00;
				}
				if(mufflerReplacement.isSelected()){
					total = total + 100.00;
				}
				if(tireRotation.isSelected()){
					total = total + 20.00;
				}
				//calculating miles
				double miles;
				double kilos;
				final double CONV = 0.6214;
				kilos = Double.parseDouble(kiloTextField.getText());
				//line 58 is the same as lines 60 & 61.  It is just a shorter version.
				//String input = kiloTextField.getText();
				//kilos = Double.parseDouble(input);
			     miles = kilos * CONV;
				mileTextField.setText("" + String.format("%.2f", miles)); 
				//quickest way to convert from integer to a string by using the "", with the space in between
				
				/*different ways to show text
				JOptionPane.showMessageDialog(null, "Kilometers: " + kilos+ "\nMiles: " + String.format("%.2f", miles)); 
				can also sysout(miles); */
			}
			//Add an item listener to the check boxes
//			oilChange.addItemListener(new CheckboxListener());
//			lubeJob.addItemListener(new CheckboxListener());
//			radiatorFlush.addItemListener(new CheckboxListener());
//			transmissionFlush.addItemListener(new CheckboxListener());
//			inspection.addItemListener(new CheckboxListener());
//			mufflerReplacement.addItemListener(new CheckboxListener());
//			tireRotation.addItemListener(new CheckboxListener());
			
			//add a FlowLayout manager to the content pane
//			setLayout(new FlowLayout());
		
			
		}
}
