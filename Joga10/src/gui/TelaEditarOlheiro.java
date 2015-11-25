package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;

public class TelaEditarOlheiro {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEditarOlheiro window = new TelaEditarOlheiro();
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
	public TelaEditarOlheiro() {
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
	
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(48, 55, 47, 36);
		frame.getContentPane().add(lblTelefone);
		
		JTextField textField_6 = new JTextField();
		textField_6.setBounds(105, 60, 244, 26);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setBounds(48, 133, 39, 23);
		frame.getContentPane().add(lblPreo);
		
		JTextField textField_7 = new JTextField();
		textField_7.setBounds(105, 133, 58, 23);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblEmail_1 = new JLabel("Email:");
		lblEmail_1.setBounds(48, 90, 39, 32);
		frame.getContentPane().add(lblEmail_1);
		
		JTextField textField_8 = new JTextField();
		textField_8.setBounds(105, 95, 244, 23);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(168, 180, 89, 23);
		frame.getContentPane().add(btnSalvar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(168, 214, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
		JLabel lblMeusDados = new JLabel("Meus Dados");
		lblMeusDados.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblMeusDados.setBounds(149, 11, 144, 26);
		frame.getContentPane().add(lblMeusDados);
		
	}
	

}
