import javax.swing.JFrame;
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
			
			
		}
}
