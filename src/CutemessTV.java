import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutemessTV implements ActionListener{
	JFrame frame=new JFrame();
	JButton button = new JButton("DUCK");
	JButton button1 = new JButton("FROG");
	JButton button2 = new JButton("UNICORN");
	JPanel panel= new JPanel();

public static void main(String[] args) {
	CutemessTV s= new CutemessTV();
	s.createUI();
}
void createUI(){
	frame.setVisible(true);
frame.add(panel);
panel.add(button);
panel.add(button1);
panel.add(button2);
frame.pack();
button.addActionListener(this);
button1.addActionListener(this);
button2.addActionListener(this);
}







void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent e) {
if (e.getSource()==button) {
	showDucks();
}
if (e.getSource()==button1) {
	showFrog();
}
if (e.getSource()==button2) {
	showFluffyUnicorns();
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}