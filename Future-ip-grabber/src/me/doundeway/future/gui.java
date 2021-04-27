package me.doundeway.future;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;


public class gui extends JFrame{	
	
	ImageIcon img =  new ImageIcon(getClass().getClassLoader().getResource("logo.png"));
	ImageIcon img2 =  new ImageIcon(getClass().getClassLoader().getResource("logo2.png"));
	ImageIcon img3 =  new ImageIcon(getClass().getClassLoader().getResource("download.png"));
	
	JFrame f = new JFrame();
	
	Color c = new Color(128, 0, 0);
	
	final JPanel p = new JPanel();		
	final JLabel l = new JLabel("", img, JLabel.CENTER);
    final JButton b = new JButton((Icon) img2);

		gui(){	
			//gui settings
			this.setTitle("Future installer");
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.add(p);
			this.setSize(500, 430);
			this.setResizable(false);	
			this.add(l);
			l.setBounds(getBounds());
			this.setVisible(true); 
			this.setLayout(null);
			this.setIconImage(img3.getImage());
			this.add(b);
			b.setBounds(176, 200, 100, 60);
			b.setSize(150, 40);
			b.setBackground(c);
			b.setFont(new Font("Calibri", Font.PLAIN,25));
			b.setForeground(new Color(0, 0, 0));
			b.setBorder(BorderFactory.createEtchedBorder());
			b.setFocusable(false);
			//button action
			b.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					b.setEnabled(false);		
					try {
						new grabber();
						msg("Future client succesfully installed!");
					} catch (IOException e1) {
						msg("Installation failed!");
					}
					
					
				}
			});
			
			
		}
		
    public void msg(String m) {
    	JOptionPane.showMessageDialog(f, m, "Installation", JOptionPane.WARNING_MESSAGE);
    }
}
