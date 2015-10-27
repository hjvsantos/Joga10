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

	private JFrame frame;
	private JTextField textField;

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
	}

}
