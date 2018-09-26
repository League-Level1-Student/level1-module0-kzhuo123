import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
	JFrame frame=new JFrame();
	JButton button = new JButton("fortune");
	JPanel panel= new JPanel();

	public static void main(String[] args) {
	FortuneCookie s = new FortuneCookie();
	s.createUI();
	





}
void createUI(){
	frame.setVisible(true);
frame.add(panel);
panel.add(button);
frame.pack();
button.addActionListener(this);


	
	
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	int rand = new Random().nextInt(5);
JOptionPane.showMessageDialog(null, "WooHoo");
if (rand==0) {
	JOptionPane.showMessageDialog(null, "Wealth awaits you very soon.");
}
else if (rand==1) {
	JOptionPane.showMessageDialog(null, "Your ability for accomplishment will follow with success.");
}
else if (rand==2) {
	JOptionPane.showMessageDialog(null,"You will live a long and happy life. ");
}	
else if (rand==3) {
	JOptionPane.showMessageDialog(null,"A feeling is an idea with roots.");
}
else if (rand==4) {
	JOptionPane.showMessageDialog(null, "You will have a pleasant surprise");
}







}


}








































