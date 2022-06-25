package record;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecordItemScreen extends JPanel{
    private Record record;
    JButton playButton = new JButton("Play");
    ButtonLitener btnListener = new ButtonLitener();
    public RecordItemScreen(Record record) {
    	this.record = record;
    	this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    	
    	JLabel title = new JLabel("Record " + this.record.getRecordID());
    	title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(Box.createVerticalGlue());
		this.add(playButton);
		playButton.addActionListener(btnListener);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
    }
	private class ButtonLitener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String button = e.getActionCommand();
			if(button.equals("Play")) {
				record.play();
			}
		}
	}
	
}

