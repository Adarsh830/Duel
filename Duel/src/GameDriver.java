import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameDriver {
	
	public static void main(String[] args) {
		 
		Tank t1 = new Tank("Tank",100,10,15,10);
		Hunter h1 = new Hunter("Hunter",100,10,15,5);
		Mage m1 = new Mage("Mage",100,10,15,5);
		
		Character[] C = {t1,h1,m1};	
		
		
		TwoButtons tb = new TwoButtons("Class Selection");
		tb.setVisible(true);
		
	}
	
}

class TwoButtons extends JFrame implements ActionListener{
	// constructor
	JButton hunter,tank,mage;
	JLabel l;
	TwoButtons(String title){
		super (title);
		setLayout (new FlowLayout());
		setBounds (50,50, 400, 400);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		l = new JLabel ("Selec a Class");
		add(l);
		hunter = new JButton("Hunter");
		add(hunter);
		tank = new JButton("Tank");
		add(tank);
		mage = new JButton("Mage");
		add(mage);
		// Who is going to listen when you click the button? 
		tank.addActionListener( this );
		mage.addActionListener( this );
		hunter.addActionListener( this);
	}
	public void actionPerformed(ActionEvent evt) {
		//extra credit make left button affect right button text, vice versa
		if (evt.getSource()==mage) {
			
			mage.setText("@@@@@@@@");
			getContentPane().setBackground( Color.white ); 
		}
		else {
			getContentPane().setBackground( Color.blue ); 
			tank.setText("!!!!!!!");
		}
	}
}
