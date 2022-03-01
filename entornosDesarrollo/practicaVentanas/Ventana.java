package practicaVentanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnNewButton_1;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JComboBox comboBox;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNewLabel = new JLabel("Abrir JDialog");
		lblNewLabel.setBounds(56, 74, 80, 14);
		contentPane.add(lblNewLabel);

		btnNewButton = new JButton("Abrir Dialog");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Dialog dialog = new Dialog();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		buttonGroup.add(btnNewButton);
		btnNewButton.setBounds(169, 70, 89, 23);
		contentPane.add(btnNewButton);

		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setBounds(114, 149, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(76, 181, 281, 69);
		contentPane.add(scrollPane);

		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);

		btnNewButton_1 = new JButton("Ver datos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textArea.append(textField.getText());
				textArea.append("\n" + comboBox.getSelectedItem().toString());

				textArea.append("\n");

				ButtonModel hola = rdbtnNewRadioButton.getModel();
				ButtonModel adios = rdbtnNewRadioButton_1.getModel();

				if (buttonGroup_2.getSelection() != null) {
					if (buttonGroup_2.getSelection().equals(hola)) {
						textArea.append("Se ha pulsado: " + rdbtnNewRadioButton.getText());
					}
					if (buttonGroup_2.getSelection().equals(adios)) {
						textArea.append("Se ha pulsado: " + rdbtnNewRadioButton_1.getText());
					}
				}

			}
		});
		buttonGroup_1.add(btnNewButton_1);
		btnNewButton_1.setBounds(268, 120, 89, 23);
		contentPane.add(btnNewButton_1);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "España", "Italia", "Francia" }));
		comboBox.setBounds(56, 120, 80, 22);
		contentPane.add(comboBox);

		rdbtnNewRadioButton = new JRadioButton("Adios");
		buttonGroup_2.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(260, 17, 109, 23);
		contentPane.add(rdbtnNewRadioButton);

		rdbtnNewRadioButton_1 = new JRadioButton("Hola");
		buttonGroup_2.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(260, 43, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
	}
}
