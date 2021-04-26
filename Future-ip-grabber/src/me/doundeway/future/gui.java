package me.doundeway.future;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class gui extends JFrame{
	
	public final JPanel p = new JPanel();
	public final ImageIcon img  = new ImageIcon("logo.png");
	public final ImageIcon img2  = new ImageIcon("logo2.png");
	
	public final JLabel l = new JLabel("", img, JLabel.CENTER);
	public final JButton b = new JButton(img2);
		gui(){	
			//gui settings
			this.setTitle("Future installer");
			Color c = new Color(128, 0, 0);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.add(p);
			ImageIcon logo = new ImageIcon("download.png");
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
			this.setIconImage(logo.getImage());
			this.add(b);
			
			
			
		}
      
}
