package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;

public class TelaLoginJogador {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLoginJogador window = new TelaLoginJogador();
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
	public TelaLoginJogador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(169, 169, 169));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(59, 100, 46, 14);
		frame.getContentPane().add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(59, 144, 46, 14);
		frame.getContentPane().add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(135, 97, 161, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(170, 189, 89, 23);
		frame.getContentPane().add(btnEntrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(170, 223, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
		JLabel lblJogador = new JLabel("Jogador");
		lblJogador.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 16));
		lblJogador.setBounds(181, 37, 89, 30);
		frame.getContentPane().add(lblJogador);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(138, 141, 158, 20);
		frame.getContentPane().add(passwordField);
	}
}
