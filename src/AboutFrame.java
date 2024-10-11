import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

/**  
 * Program: AboutFrame.java <br>  
 * Date   : 01/18/2019 <br>  
 * Description: <br>  
 * 				GUI that present the author's information. <br>  
 * <br>  
 * History:<br>  
 * 				01/22/2019 - File created. IDLM, JRO, GMR<br>  
 * 				02/01/2019 - Project completed. IDLM, JRO, GMR <br>  
 * 
 * @author Isaas De Len  Milln de_91747@stundents.pupr.edu <br>  
 * @author Julio G. Rivera Oriz rivara_95136@students.pupr.edu <br>
 * @author Gustavo A. Maldonado Rosado maldonado_9130@students.pupr.edu <br>
 */ 
public class AboutFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public AboutFrame() {
		
		//Set the content pane's attributes.
		setIconImage(new ImageIcon(getClass().getResource("AboutFrameIcon.png")).getImage());
		setTitle("About");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 645, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 0));
		contentPane.setForeground(new Color(127, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		//Initialize Emmanuel's name label.
		JLabel julioNameLabel = new JLabel("Emmanuel Simon Musavili");
		julioNameLabel.setBounds(21, 48, 129, 17);
		julioNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		

	
		
		//Initialize Emmanuel's student number label.
		JLabel julioStudentNumber = new JLabel("#95136");
		julioStudentNumber.setBounds(223, 46, 48, 19);
		julioStudentNumber.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		
		//Initialize name header.
		JLabel nameHeader = new JLabel("Name");
		nameHeader.setBounds(21, 16, 35, 17);
		nameHeader.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		//Initialize student number header.
		JLabel studentNumberHeader = new JLabel("Students #");
		studentNumberHeader.setBounds(223, 16, 68, 17);
		studentNumberHeader.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		//Initialize concentration header.
		JLabel concentrationHeader = new JLabel("Concentration");
		concentrationHeader.setBounds(297, 16, 88, 17);
		concentrationHeader.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		//Initialize Julio's Concentration.
		JLabel julioConsentration = new JLabel("CS");
		julioConsentration.setBounds(327, 48, 29, 17);
		julioConsentration.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		//Initialize email header.
		JLabel emailHeader = new JLabel("Email");
		emailHeader.setBounds(391, 16, 88, 17);
		emailHeader.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		//Initialize Emmanuel's email.
		JLabel julioEmail = new JLabel("musavili_95136@students.pupr.edu");
		julioEmail.setBounds(391, 48, 231, 17);
		julioEmail.setFont(new Font("Times New Roman", Font.BOLD, 14));
		;
		
		//Add all the components to the frame.
		contentPane.setLayout(null);
		contentPane.add(nameHeader);
		contentPane.add(julioNameLabel);
		contentPane.add(studentNumberHeader);
		contentPane.add(julioStudentNumber);
		contentPane.add(concentrationHeader);
		contentPane.add(julioConsentration);
		contentPane.add(emailHeader);
		contentPane.add(julioEmail);
	
	}

}
