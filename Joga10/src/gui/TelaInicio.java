package gui;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

import gui.TelaLoginJogador;
import gui.TelaLoginOlheiro;
import gui.TelaLoginTime;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicio {

	private static JFrame frame;

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
		
			
			try { //aparencia do SO
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch(Exception e) {
				e.getStackTrace();
			}
			
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
		btnOlheiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
 				TelaInicio.setVisible(false); 
				new TelaLoginOlheiro().setVisible(true);  
			}
		});
		btnOlheiro.setBounds(84, 115, 89, 23);
		frame.getContentPane().add(btnOlheiro);
		
		JButton btnJogador = new JButton("Jogador");
		btnJogador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicio.setVisible(false); 
				new TelaLoginJogador().setVisible(true); 
			}
		});
		btnJogador.setBounds(220, 115, 89, 23);
		frame.getContentPane().add(btnJogador);
		
		JLabel lblJSouCadastrado = new JLabel("J\u00E1 sou cadastrado como:");
		lblJSouCadastrado.setBounds(133, 91, 127, 14);
		frame.getContentPane().add(lblJSouCadastrado);
		
		JButton btnTime = new JButton("Time");
		btnTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicio.setVisible(false); 
				new TelaLoginTime().setVisible(true); 
			}
		});
		btnTime.setBounds(152, 155, 89, 23);
		frame.getContentPane().add(btnTime);
		
		JButton btnNovoCadastro = new JButton("Novo Cadastro");
		btnNovoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicio.setVisible(false); 
				new TelaCadastro().setVisible(true);
			}
		});
		btnNovoCadastro.setBounds(316, 227, 108, 23);
		frame.getContentPane().add(btnNovoCadastro);
		
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(btnSair);
		


	}

	protected static void setVisible(boolean b) {
		if(b == true)
			frame.setVisible(b);
		else
			frame.setVisible(b);		
	}
}
