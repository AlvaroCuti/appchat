package umu.tds.appchat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.AbstractListModel;
import javax.swing.BoxLayout;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Contactos {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contactos window = new Contactos();
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
	public Contactos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

		JList<String> list = new JList<String>();
		frame.getContentPane().add(list);
		list.setSelectedIndex(0);

		list.setModel(new AbstractListModel<String>() {
			String[] items = new String[] { "Contacto1", "Contacto2", "Contacto3" };

			public int getSize() {
				return items.length;
			}

			public String getElementAt(int index) {
				return items[index];
			}
		});

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JButton btnNewButton = new JButton(">>");
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("<<");
		panel.add(btnNewButton_1);

		JList<String> list1 = new JList<String>();
		frame.getContentPane().add(list1);
		list1.setSelectedIndex(0);

		list1.setModel(new AbstractListModel<String>() {
			String[] items = new String[] { "Contacto4", "Contacto5", "Contacto6" };

			public int getSize() {
				return items.length;
			}

			public String getElementAt(int index) {
				return items[index];
			}
		});
	}

}
