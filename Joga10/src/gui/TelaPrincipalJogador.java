package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;

public class TelaPrincipalJogador {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipalJogador window = new TelaPrincipalJogador();
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
	public TelaPrincipalJogador() {
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
		
		
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(158, 140, 89, 23);
		frame.getContentPane().add(btnSair);
		
		JButton btnEditarMeusDados = new JButton("Editar meus dados");
		btnEditarMeusDados.setBounds(145, 95, 121, 23);
		frame.getContentPane().add(btnEditarMeusDados);
		
		JLabel lblNewLabel = new JLabel("Joga 10");
		lblNewLabel.setFont(new Font("Motorwerk", Font.PLAIN, 29));
		lblNewLabel.setBounds(158, 0, 127, 51);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
}
