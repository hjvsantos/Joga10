package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastro {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro window = new TelaCadastro();
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
	public TelaCadastro() {
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
		
		JButton btnJogador = new JButton("Jogador");
		btnJogador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastro.setVisible(false); 
				new TelaCadastroJogador().setVisible(true);
			}
		});
		btnJogador.setBounds(156, 116, 89, 23);
		frame.getContentPane().add(btnJogador);
		
		JButton btnOlheiro = new JButton("Olheiro");
		btnOlheiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastro.setVisible(false); 
				new TelaCadastroOlheiro().setVisible(true);
			}
		});
		
		btnOlheiro.setBounds(156, 150, 89, 23);
		frame.getContentPane().add(btnOlheiro);
		
		JButton btnTime = new JButton("Time");
		btnTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastro.setVisible(false); 
				new TelaCadastroTime().setVisible(true);
			}
		});
		btnTime.setBounds(156, 184, 89, 23);
		frame.getContentPane().add(btnTime);
		
		JLabel lblVocVaiSe = new JLabel("Voc\u00EA vai se cadastra como:");
		lblVocVaiSe.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblVocVaiSe.setBounds(72, 28, 275, 50);
		frame.getContentPane().add(lblVocVaiSe);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastro.setVisible(false); 
				new TelaInicio().setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(btnVoltar);
	}

	public static void setVisible(boolean b) {
		if(b == true)
			frame.setVisible(b);
		else
			frame.setVisible(b);
	}
}
