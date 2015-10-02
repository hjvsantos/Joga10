package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class TelaLoginTime {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLoginTime window = new TelaLoginTime();
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
	public TelaLoginTime() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(169, 169, 169));
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setBounds(54, 92, 46, 14);
		frame.getContentPane().add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(54, 132, 46, 14);
		frame.getContentPane().add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(110, 129, 176, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText(" ");
		textField_1.setBounds(110, 89, 176, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(154, 183, 89, 23);
		frame.getContentPane().add(btnEntrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(154, 217, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Impact", Font.PLAIN, 18));
		lblTime.setBounds(173, 45, 51, 23);
		frame.getContentPane().add(lblTime);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
