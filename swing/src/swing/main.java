package swing;

import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.*;

public class main {
	
		public static void main(String[] args) {
			 JFrame jframe = new JFrame("Je suis le titre");
		        try {
		            UIManager.setLookAndFeel(new MetalLookAndFeel());
		        } catch (UnsupportedLookAndFeelException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }

		        jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		        // permet de voir ma frame
		        jframe.setVisible(true);

		        // permet de définir la taille de ma frame
		        jframe.setSize(500,500);

		        // permet de centrer la frame
		        jframe.setLocationRelativeTo(null);

		        JPanel jpanel = new JPanel();
		        //jpanel.setBackground(Color.red);
		        jpanel.setBackground(ColorUIResource.green);

		        JButton btnButton= new JButton("Je suis le boutton");
		        JLabel jlabel = new JLabel("Je suis le label");

		        jframe.add(jpanel);

		        jpanel.add(jlabel);


		        jpanel.add(btnButton);

		}

}
