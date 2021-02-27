package _07_fortune_cookie;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortunecookie implements ActionListener {
	public void showButton() {
       Frame gg = new JFrame();
       gg.setSize(50, 50);
       gg.setVisible(true);
       JButton button = new JButton();
       button.setText("Click Me!");
       gg.add(button);
       gg.pack();
       button.addActionListener(this);
      
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 
		System.out.println("Button clicked");
		int rand = new Random().nextInt(5);
		if(rand==0) {
			JOptionPane.showMessageDialog(null, "things you desire will appears on your eyes");
		}
		else if(rand==1) {
			JOptionPane.showMessageDialog(null, "things you don't like will happen");
		}
		else if(rand==2) {
			JOptionPane.showMessageDialog(null, "nothing will happend today");
		}
		else if(rand==3) {
			JOptionPane.showMessageDialog(null, "it will be your best luck in this week");
		}
		else{
			JOptionPane.showMessageDialog(null, "you will lose something you like");
		}
		}
	}

