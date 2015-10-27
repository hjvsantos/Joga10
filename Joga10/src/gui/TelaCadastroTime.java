package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class TelaCadastroTime {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroTime window = new TelaCadastroTime();
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
	public TelaCadastroTime() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblJoga = new JLabel("Joga10!");
		lblJoga.setFont(new Font("Motorwerk", Font.PLAIN, 25));
		lblJoga.setBounds(152, 24, 108, 43);
		frame.getContentPane().add(lblJoga);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setBounds(52, 72, 53, 20);
		frame.getContentPane().add(lblTime);
		
		textField = new JTextField();
		textField.setBounds(96, 72, 213, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnCadastrar = new JButton("Pr\u00F3ximo");
		btnCadastrar.setBounds(96, 227, 89, 23);
		frame.getContentPane().add(btnCadastrar);
		
		JButton btnVoltar = new JButton(" Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnVoltar.setBounds(220, 227, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(41, 103, 46, 14);
		frame.getContentPane().add(lblEstado);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(27);
		comboBox.setToolTipText("Acre \r\nAlagoas\t \r\nAmap\u00E1\t \r\nAmazonas\t \r\nBahia\t \r\nCear\u00E1\t \r\nDistrito Federal\t \r\nEsp\u00EDrito Santo\t \r\nGoi\u00E1s\t \r\nMaranh\u00E3o\t \r\nMato Grosso\r\nMato Grosso do Sul \r\nMinas Gerais \r\nPar\u00E1\t\t \r\nPara\u00EDba\t\t \r\nParan\u00E1\t\t \r\nPernambuco \r\nPiau\u00ED \r\nRio de Janeiro\t \r\nRio Grande do Norte\t \r\nRio Grande do Sul\t \r\nRond\u00F4nia\t\t \r\nRoraima\t\t \r\nSanta Catarina\t \r\nS\u00E3o Paulo\t \r\nSergipe\t \r\nTocantins");
		comboBox.setBounds(96, 100, 213, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblVerba = new JLabel(" Verba:");
		lblVerba.setBounds(41, 128, 46, 14);
		frame.getContentPane().add(lblVerba);
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 125, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(47, 153, 40, 14);
		frame.getContentPane().add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(96, 150, 213, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(29, 178, 46, 14);
		frame.getContentPane().add(lblTelefone);
		
		textField_3 = new JTextField();
		textField_3.setBounds(96, 175, 24, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblMilhes = new JLabel("milh\u00F5es");
		lblMilhes.setBounds(184, 128, 46, 14);
		frame.getContentPane().add(lblMilhes);
		
		textField_4 = new JTextField();
		textField_4.setBounds(130, 175, 142, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
	}

	public void setVisible(boolean b) {
		if(b == true)
			frame.setVisible(b);
		else
			frame.setVisible(b);
	}
}
