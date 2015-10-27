package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class TelaCadastroOlheiro {

	private static JFrame frame;
	private JTextField textField;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroOlheiro window = new TelaCadastroOlheiro();
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
	public TelaCadastroOlheiro() {
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
		lblJoga.setBounds(152, 11, 108, 43);
		frame.getContentPane().add(lblJoga);
		
		JButton btnPrximo = new JButton("Pr\u00F3ximo");
		btnPrximo.setBounds(241, 227, 89, 23);
		frame.getContentPane().add(btnPrximo);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastroOlheiro.setVisible(false);
				new TelaCadastro().setVisible(true);
			}
		});
		btnVoltar.setBounds(91, 227, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(22, 65, 46, 14);
		frame.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(61, 62, 313, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setBounds(22, 90, 100, 32);
		frame.getContentPane().add(lblDataDeNascimento);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(132, 93, 39, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(181, 93, 39, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JTextField textField_3 = new JTextField();
		textField_3.setBounds(230, 93, 39, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEmail = new JLabel("CPF:");
		lblEmail.setBounds(22, 119, 28, 36);
		frame.getContentPane().add(lblEmail);
		
		JTextField textField_4 = new JTextField();
		textField_4.setBounds(53, 124, 131, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(202, 116, 18, 43);
		frame.getContentPane().add(lblRg);
		
		JTextField textField_5 = new JTextField();
		textField_5.setBounds(230, 124, 117, 26);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(21, 150, 47, 36);
		frame.getContentPane().add(lblTelefone);
		
		JTextField textField_6 = new JTextField();
		textField_6.setBounds(69, 155, 200, 26);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setBounds(279, 157, 39, 23);
		frame.getContentPane().add(lblPreo);
		
		textField_7 = new JTextField();
		textField_7.setBounds(316, 157, 58, 23);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblEmail_1 = new JLabel("Email:");
		lblEmail_1.setBounds(22, 184, 200, 32);
		frame.getContentPane().add(lblEmail_1);
		
		textField_8 = new JTextField();
		textField_8.setBounds(60, 187, 314, 23);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
	}

	public static void setVisible(boolean b) {
		if(b == true)
			frame.setVisible(b);
		else
			frame.setVisible(b);		
	}

}
