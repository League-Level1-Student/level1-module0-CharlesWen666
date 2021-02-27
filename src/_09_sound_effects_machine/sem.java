package _09_sound_effects_machine;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class sem implements ActionListener {
	JButton a = new JButton();
	 JButton b = new JButton();
	 JButton c = new JButton();
	 JButton d = new JButton();
	 public void showButton() {
		
		 Frame gg = new JFrame();
	       gg.setSize(200, 50);
	       gg.setVisible(true);
	       JPanel jj = new JPanel();
	       
	       a.setText("Do");
	      
	       b.setText("Re");
	       
	       c.setText("Mi");
	      
	       d.setText("Fa");
	       
	       
	       
	       jj.add(a);
	       jj.add(b);
	       jj.add(c);
	       jj.add(d);
	       gg.add(jj);
	       gg.pack();
	       a.addActionListener(this);
	       b.addActionListener(this);
	       c.addActionListener(this);
	       d.addActionListener(this);
	}
	 private void playSound(String soundFile) {
			String path = "src/_09_sound_effects_machine/";
				File sound = new File(path+soundFile);
				if (sound.exists()) {
					new Thread(() -> {
					try {
						Clip clip = AudioSystem.getClip();
						clip.open(AudioSystem.getAudioInputStream(sound));
						clip.start();
						Thread.sleep(clip.getMicrosecondLength()/1000);
					}
					catch (Exception e) {
						System.out.println("Could not play this sound");
					}}).start();
		 		}
				else {
					System.out.println("File does not exist");
				}
			
		}
	    
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==a) {
			playSound("Do.wav");
		}
		else if(e.getSource()==b) {
			playSound("Re.wav");
		}
		else if(e.getSource()==c) {
			playSound("Mi.wav");
		}
		else  {
			playSound("Fa.wav");
		}
	}
}
