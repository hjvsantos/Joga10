package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class TelaInicio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicio window = new TelaInicio();
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
	public TelaInicio() {
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
		
		JLabel lblJoga = new JLabel("Joga10!");
		lblJoga.setFont(new Font("Motorwerk", Font.PLAIN, 25));
		lblJoga.setBounds(152, 24, 108, 43);
		frame.getContentPane().add(lblJoga);
		
		JButton btnOlheiro = new JButton("Olheiro");
		btnOlheiro.setBounds(84, 115, 89, 23);
		frame.getContentPane().add(btnOlheiro);
		
		JButton btnJogador = new JButton("Jogador");
		btnJogador.setBounds(220, 115, 89, 23);
		frame.getContentPane().add(btnJogador);
		
		JLabel lblJSouCadastrado = new JLabel("J\u00E1 sou cadastrado como:");
		lblJSouCadastrado.setBounds(133, 91, 127, 14);
		frame.getContentPane().add(lblJSouCadastrado);
		
		JButton btnTime = new JButton("Time");
		btnTime.setBounds(152, 155, 89, 23);
		frame.getContentPane().add(btnTime);
		
		JLabel lblSair = new JLabel("Sair");
		lblSair.setBounds(10, 236, 46, 14);
		frame.getContentPane().add(lblSair);
		
		JLabel lblRegistreseAgora = new JLabel("Registre-se agora!");
		lblRegistreseAgora.setBounds(152, 201, 108, 14);
		frame.getContentPane().add(lblRegistreseAgora);
	}
}
