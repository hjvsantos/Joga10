package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroJogador {

	private static JFrame frame;
	private JTextField textField;
	private JLabel lblDataDeNascimento;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblEmail;
	private JTextField textField_4;
	private JLabel lblRg;
	private JTextField textField_5;
	private JLabel lblTelefone;
	private JTextField textField_6;
	private JButton btnVoltar;
	private JButton btnPrximo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroJogador window = new TelaCadastroJogador();
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
	public TelaCadastroJogador() {
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
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(53, 74, 47, 26);
		frame.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(90, 74, 294, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setBounds(53, 102, 100, 50);
		frame.getContentPane().add(lblDataDeNascimento);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 114, 39, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(215, 114, 39, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(268, 114, 39, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		lblEmail = new JLabel("CPF:");
		lblEmail.setBounds(53, 143, 28, 36);
		frame.getContentPane().add(lblEmail);
		
		textField_4 = new JTextField();
		textField_4.setBounds(90, 148, 131, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		lblRg = new JLabel("RG:");
		lblRg.setBounds(242, 140, 18, 43);
		frame.getContentPane().add(lblRg);
		
		textField_5 = new JTextField();
		textField_5.setBounds(268, 144, 117, 26);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(53, 185, 47, 36);
		frame.getContentPane().add(lblTelefone);
		
		textField_6 = new JTextField();
		textField_6.setBounds(107, 190, 200, 26);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		btnVoltar = new JButton(" Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			TelaCadastroJogador.setVisible(false);
			new TelaCadastro().setVisible(true);
			}
		});
		btnVoltar.setBounds(92, 232, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
		btnPrximo = new JButton("Pr\u00F3ximo");
		btnPrximo.setBounds(218, 232, 89, 23);
		frame.getContentPane().add(btnPrximo);
		
		
		
	}

	public static void setVisible(boolean b) {
		if(b == true)
			frame.setVisible(b);
		else
			frame.setVisible(b);
	}
}
