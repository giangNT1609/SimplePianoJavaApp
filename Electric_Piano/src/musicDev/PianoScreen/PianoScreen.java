package musicDev.PianoScreen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

import org.jfugue.player.Player;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import java.awt.CardLayout;
import javax.swing.JRadioButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;

public class PianoScreen {
	
	private final String c5 = "60";
	private final String c5sharp = "61";
	private final String d5 = "62";
	private final String d5sharp = "63";
	private final String e5 = "64";
	private final String f5 = "65";
	private final String f5sharp = "66";
	private final String g5 = "67";
	private final String g5sharp = "68";
	private final String a5 = "69";
	private final String a5sharp = "70";
	private final String b5 = "71";
	private final String c6 = "72";
	private final String c6sharp = "73";
	private final String d6 = "74";
	private final String d6sharp = "75";
	private final String e6 = "76";
	private final String f6 = "77";
	private final String f6sharp = "78";
	private final String g6 = "79";
	private final String g6sharp = "80";
	private final String a6 = "81";
	private final String a6sharp = "82";
	private final String b6 = "83";
	private final String c7 = "84";

	private JFrame frame;
	
	private Player player = new Player();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PianoScreen window = new PianoScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PianoScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 947, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 0));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("E-PIANO");
		lblNewLabel.setBackground(new Color(0, 0, 204));
		lblNewLabel.setForeground(new Color(255, 51, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel.add(lblNewLabel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);
		layeredPane.setLayout(null);
		
		
		//Button list and listen event
		JButton btnNewButton_1 = new JButton("C5");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(c5);
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1.setBounds(0, 45, 59, 308);
		layeredPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("D5");
		btnNewButton_1_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(d5);
			}
		});
		btnNewButton_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(62, 45, 59, 308);
		layeredPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("E5");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(e5);
			}
		});
		btnNewButton_1_2.setBackground(new Color(255, 255, 255));
		btnNewButton_1_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_2.setBounds(125, 45, 59, 308);
		layeredPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("F5");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(f5);
			}
		});
		btnNewButton_1_3.setBackground(new Color(255, 255, 255));
		btnNewButton_1_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_3.setBounds(188, 45, 59, 308);
		layeredPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("G5");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(g5);
			}
		});
		btnNewButton_1_4.setBackground(new Color(255, 255, 255));
		btnNewButton_1_4.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_4.setBounds(250, 45, 59, 308);
		layeredPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("A5");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(a5);
			}
		});
		btnNewButton_1_5.setBackground(new Color(255, 255, 255));
		btnNewButton_1_5.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_5.setBounds(313, 45, 59, 308);
		layeredPane.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("B5");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(b5);
			}
		});
		btnNewButton_1_6.setBackground(new Color(255, 255, 255));
		btnNewButton_1_6.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_6.setBounds(375, 45, 59, 308);
		layeredPane.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("C6");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(c6);
			}
		});
		btnNewButton_1_7.setBackground(new Color(255, 255, 255));
		btnNewButton_1_7.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_7.setBounds(438, 45, 59, 308);
		layeredPane.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("D6");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(d6);
			}
		});
		btnNewButton_1_8.setBackground(new Color(255, 255, 255));
		btnNewButton_1_8.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_8.setBounds(500, 45, 59, 308);
		layeredPane.add(btnNewButton_1_8);
		
		JButton btnNewButton_1_9 = new JButton("E6");
		btnNewButton_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(e6);
			}
		});
		btnNewButton_1_9.setBackground(new Color(255, 255, 255));
		btnNewButton_1_9.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_9.setBounds(563, 45, 59, 308);
		layeredPane.add(btnNewButton_1_9);
		
		JButton btnNewButton_1_10 = new JButton("F6");
		btnNewButton_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(f6);
			}
		});
		btnNewButton_1_10.setBackground(new Color(255, 255, 255));
		btnNewButton_1_10.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_10.setBounds(626, 45, 59, 308);
		layeredPane.add(btnNewButton_1_10);
		
		JButton btnNewButton_1_11 = new JButton("G6");
		btnNewButton_1_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(g6);
			}
		});
		btnNewButton_1_11.setBackground(new Color(255, 255, 255));
		btnNewButton_1_11.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_11.setBounds(688, 45, 59, 308);
		layeredPane.add(btnNewButton_1_11);
		
		JButton btnNewButton_1_11_1 = new JButton("A6");
		btnNewButton_1_11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(a6);
			}
		});
		btnNewButton_1_11_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1_11_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_11_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_11_1.setBounds(750, 45, 59, 308);
		layeredPane.add(btnNewButton_1_11_1);
		
		JButton btnNewButton_1_11_2 = new JButton("B6");
		btnNewButton_1_11_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(b6);
			}
		});
		btnNewButton_1_11_2.setBackground(new Color(255, 255, 255));
		btnNewButton_1_11_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_11_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_11_2.setBounds(812, 45, 59, 308);
		layeredPane.add(btnNewButton_1_11_2);
		
		JButton btnNewButton_1_11_3 = new JButton("C7");
		btnNewButton_1_11_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(c7);
			}
		});
		btnNewButton_1_11_3.setBackground(new Color(255, 255, 255));
		btnNewButton_1_11_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_11_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_11_3.setBounds(874, 45, 59, 308);
		layeredPane.add(btnNewButton_1_11_3);
		
		JButton btnNewButton_2 = new JButton("C5#");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(c5sharp);
			}
		});
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		layeredPane.setLayer(btnNewButton_2, 1);
		btnNewButton_2.setBounds(32, 45, 50, 212);
		layeredPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("D5#");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(d5sharp);
			}
		});
		layeredPane.setLayer(btnNewButton_2_1, 1);
		btnNewButton_2_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_2_1.setBackground(Color.BLACK);
		btnNewButton_2_1.setBounds(99, 45, 50, 212);
		layeredPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("F5#");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(f5sharp);
			}
		});
		layeredPane.setLayer(btnNewButton_2_1_1, 1);
		btnNewButton_2_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_2_1_1.setForeground(Color.WHITE);
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_2_1_1.setBackground(Color.BLACK);
		btnNewButton_2_1_1.setBounds(225, 45, 50, 212);
		layeredPane.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1_2 = new JButton("G5#");
		btnNewButton_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(g5sharp);
			}
		});
		layeredPane.setLayer(btnNewButton_2_1_2, 1);
		btnNewButton_2_1_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_2_1_2.setForeground(Color.WHITE);
		btnNewButton_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_2_1_2.setBackground(Color.BLACK);
		btnNewButton_2_1_2.setBounds(285, 45, 50, 212);
		layeredPane.add(btnNewButton_2_1_2);
		
		JButton btnNewButton_2_1_3 = new JButton("A5#");
		btnNewButton_2_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(a5sharp);
			}
		});
		layeredPane.setLayer(btnNewButton_2_1_3, 1);
		btnNewButton_2_1_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_2_1_3.setForeground(Color.WHITE);
		btnNewButton_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_2_1_3.setBackground(Color.BLACK);
		btnNewButton_2_1_3.setBounds(351, 45, 50, 212);
		layeredPane.add(btnNewButton_2_1_3);
		
		JButton btnNewButton_2_1_4 = new JButton("C6#");
		btnNewButton_2_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(c6sharp);
			}
		});
		layeredPane.setLayer(btnNewButton_2_1_4, 1);
		btnNewButton_2_1_4.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_2_1_4.setForeground(Color.WHITE);
		btnNewButton_2_1_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_2_1_4.setBackground(Color.BLACK);
		btnNewButton_2_1_4.setBounds(474, 45, 50, 212);
		layeredPane.add(btnNewButton_2_1_4);
		
		JButton btnNewButton_2_1_4_1 = new JButton("D6#");
		btnNewButton_2_1_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(d6sharp);
			}
		});
		layeredPane.setLayer(btnNewButton_2_1_4_1, 1);
		btnNewButton_2_1_4_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_2_1_4_1.setForeground(Color.WHITE);
		btnNewButton_2_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_2_1_4_1.setBackground(Color.BLACK);
		btnNewButton_2_1_4_1.setBounds(534, 45, 50, 212);
		layeredPane.add(btnNewButton_2_1_4_1);
		
		JButton btnNewButton_2_1_4_2 = new JButton("F6#");
		btnNewButton_2_1_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(f6sharp);
			}
		});
		layeredPane.setLayer(btnNewButton_2_1_4_2, 1);
		btnNewButton_2_1_4_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_2_1_4_2.setForeground(Color.WHITE);
		btnNewButton_2_1_4_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_2_1_4_2.setBackground(Color.BLACK);
		btnNewButton_2_1_4_2.setBounds(662, 45, 50, 212);
		layeredPane.add(btnNewButton_2_1_4_2);
		
		JButton btnNewButton_2_1_4_3 = new JButton("G6#");
		btnNewButton_2_1_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(g6sharp);
			}
		});
		layeredPane.setLayer(btnNewButton_2_1_4_3, 1);
		btnNewButton_2_1_4_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_2_1_4_3.setForeground(Color.WHITE);
		btnNewButton_2_1_4_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_2_1_4_3.setBackground(Color.BLACK);
		btnNewButton_2_1_4_3.setBounds(723, 45, 50, 212);
		layeredPane.add(btnNewButton_2_1_4_3);
		
		JButton btnNewButton_2_1_4_4 = new JButton("A6#");
		btnNewButton_2_1_4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play(a6sharp);
			}
		});
		layeredPane.setLayer(btnNewButton_2_1_4_4, 1);
		btnNewButton_2_1_4_4.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_2_1_4_4.setForeground(Color.WHITE);
		btnNewButton_2_1_4_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_2_1_4_4.setBackground(Color.BLACK);
		btnNewButton_2_1_4_4.setBounds(785, 45, 50, 212);
		layeredPane.add(btnNewButton_2_1_4_4);
		
		JMenuBar menuBar = new JMenuBar();
		layeredPane.setLayer(menuBar, 3);
		menuBar.setBounds(0, 0, 933, 48);
		layeredPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Style");
		mnNewMenu.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(mnNewMenu);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("Piano");
		rdbtnmntmNewRadioItem.setSelected(true);
		mnNewMenu.add(rdbtnmntmNewRadioItem);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem("Violin");
		mnNewMenu.add(rdbtnmntmNewRadioItem_1);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_2 = new JRadioButtonMenuItem("Flute");
		mnNewMenu.add(rdbtnmntmNewRadioItem_2);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_3 = new JRadioButtonMenuItem("Guitar");
		mnNewMenu.add(rdbtnmntmNewRadioItem_3);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_4 = new JRadioButtonMenuItem("Trumpet");
		mnNewMenu.add(rdbtnmntmNewRadioItem_4);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnmntmNewRadioItem);
		bg.add(rdbtnmntmNewRadioItem_1);
		bg.add(rdbtnmntmNewRadioItem_2);
		bg.add(rdbtnmntmNewRadioItem_3);
		bg.add(rdbtnmntmNewRadioItem_4);
		
		JButton btnNewButton = new JButton("Vol+");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(btnNewButton);
		
		JButton btnVol = new JButton("Vol-");
		btnVol.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(btnVol);
		
		JButton btnRecon = new JButton("Records");
		btnRecon.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(btnRecon);
		
		JButton btnHelps = new JButton("Helps");
		btnHelps.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(btnHelps);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Start Record");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Stop Record");
		rdbtnNewRadioButton_1.setSelected(true);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(rdbtnNewRadioButton_1);
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(rdbtnNewRadioButton_1);
		bg1.add(rdbtnNewRadioButton);
		
		JButton btnNewButton_3 = new JButton("EXIT");
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(btnNewButton_3);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
