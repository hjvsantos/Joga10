package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class CadastroTimeConfirma {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroTimeConfirma window = new CadastroTimeConfirma();
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
	public CadastroTimeConfirma() {
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
		lblTime.setBounds(58, 91, 36, 14);
		frame.getContentPane().add(lblTime);
		
		textField = new JTextField();
		textField.setBounds(104, 88, 201, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(47, 125, 46, 14);
		frame.getContentPane().add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(104, 119, 201, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblSenha_1 = new JLabel("Senha:");
		lblSenha_1.setBounds(47, 150, 46, 14);
		frame.getContentPane().add(lblSenha_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(104, 148, 200, 20);
		frame.getContentPane().add(passwordField_1);
		
		JButton btnCadastrar = new JButton("Cadastrar!");
		btnCadastrar.setBounds(152, 179, 89, 23);
		frame.getContentPane().add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(152, 213, 89, 23);
		frame.getContentPane().add(btnVoltar);
	}
}
