package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;

public class TelaLoginOlheiro {

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
					TelaLoginOlheiro window = new TelaLoginOlheiro();
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
	public TelaLoginOlheiro() {
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
		lblUsuario.setBounds(52, 109, 46, 14);
		frame.getContentPane().add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(52, 146, 46, 14);
		frame.getContentPane().add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(126, 106, 181, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(168, 176, 89, 23);
		frame.getContentPane().add(btnEntrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(168, 210, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
		JLabel lblOlheiro = new JLabel("Olheiro");
		lblOlheiro.setFont(new Font("Impact", Font.PLAIN, 17));
		lblOlheiro.setBounds(168, 50, 104, 23);
		frame.getContentPane().add(lblOlheiro);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(126, 143, 181, 20);
		frame.getContentPane().add(passwordField);
	}
}
