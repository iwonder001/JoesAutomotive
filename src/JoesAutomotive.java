import java.awt.FlowLayout;

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
			oilChange.addItemListener(new CheckboxListener());
			panel.add(lubeJob);
			lubeJob.addItemListener(new CheckboxListener());
			panel.add(radiatorFlush);
			radiatorFlush.addItemListener(new CheckboxListener());
			panel.add(transmissionFlush);
			transmissionFlush.addItemListener(new CheckboxListener());
			panel.add(inspection);
			inspection.addItemListener(new CheckboxListener());
			panel.add(mufflerReplacement);
			mufflerReplacement.addItemListener(new CheckboxListener());
			panel.add(tireRotation);
			add(panel);// add panel to frame
			setVisible(true);
			
			/**Private inner class that handles the event when the user 
			 * clicks one of the check boxes
			 */
			
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
