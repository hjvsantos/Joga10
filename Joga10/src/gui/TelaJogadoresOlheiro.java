package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Color;

public class TelaJogadoresOlheiro {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogadoresOlheiro window = new TelaJogadoresOlheiro();
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
	public TelaJogadoresOlheiro() {
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
		JLabel lblJoga = new JLabel("Joga 10!");
		lblJoga.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblJoga.setBounds(152, 24, 97, 29);
		frame.getContentPane().add(lblJoga);
		
		JLabel lblResultado = new JLabel("Meus Jogadores:");
		lblResultado.setBounds(10, 71, 90, 14);
		frame.getContentPane().add(lblResultado);
		
		JList list = new JList();
		list.setBounds(100, 70, 289, 180);
		frame.getContentPane().add(list);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 227, 80, 23);
		frame.getContentPane().add(btnVoltar);}

}
