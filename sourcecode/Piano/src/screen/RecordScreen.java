package screen;

import record.Record;
import record.RecordList;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RecordScreen {

	private JFrame frame;
	public RecordScreen() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 771, 390);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel = new JLabel("RECORDS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new GridLayout(3, 3, 2, 2));
		ArrayList<Record> list = RecordList.getListRecord();
		for(int i = 0; i < list.size(); i++) {
			RecordItemScreen item = new RecordItemScreen(list.get(i));
			panel_1.add(item);
		}
		frame.getContentPane().add(panel_1);
		frame.setVisible(true);
	}
}
