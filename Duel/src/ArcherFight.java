package duel.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ArcherFight extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnLightattack;
	private JButton btnHeavyattack;
	private JButton btnHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArcherFight frame = new ArcherFight();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ArcherFight() 
	{
		
		initComponents();
		createEvents();
		
	
	}



	private void initComponents()
	{
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(ArcherFight.class.getResource("/duel/resources/swords.png")));
		setResizable(false);
		setTitle("ArcherFight");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1036, 669);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblArcher = new JLabel("Archer");
		
		btnLightattack = new JButton("LightAttack");
	
		
		btnHeavyattack = new JButton("HeavyAttack");
		btnHeavyattack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblHp = new JLabel("HP:");
		
		JLabel lblBoss = new JLabel("Boss");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblhp = new JLabel(":HP");
		
		btnHome = new JButton("");
		
		btnHome.setIcon(new ImageIcon(ArcherFight.class.getResource("/duel/resources/home.png")));
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(802, Short.MAX_VALUE)
					.addComponent(lblBoss)
					.addGap(186))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblArcher)
							.addGap(61)
							.addComponent(btnLightattack)
							.addGap(48)
							.addComponent(btnHeavyattack))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblHp)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblhp))
							.addComponent(textField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 959, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(29, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addComponent(btnHome)
					.addContainerGap(905, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(btnHome)
					.addGap(7)
					.addComponent(lblBoss)
					.addPreferredGap(ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnLightattack)
							.addComponent(btnHeavyattack))
						.addComponent(lblArcher))
					.addGap(45)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHp)
						.addComponent(lblhp))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addGap(22))
		);
		contentPane.setLayout(gl_contentPane);
		
	}
	
	
	private void createEvents() {
		btnHome.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				///takes you back to character select frame
			}
		});
		
		btnLightattack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//does light attack
			}
		});
		
		btnHeavyattack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//does heavy attack
			}
		});
		
		
	}
}
