package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class TelaPrincipalTime {

	private JFrame frame;
	private JTextField txtBuscarOlheiroPelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipalTime window = new TelaPrincipalTime();
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
	public TelaPrincipalTime() {
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
		btnSair.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(btnSair);
		
		txtBuscarOlheiroPelo = new JTextField();
		txtBuscarOlheiroPelo.setText("Buscar olheiro pelo pre\u00E7o");
		txtBuscarOlheiroPelo.setBounds(10, 10, 312, 28);
		frame.getContentPane().add(txtBuscarOlheiroPelo);
		txtBuscarOlheiroPelo.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(335, 15, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		JButton btnMeusOlheiros = new JButton("Meus Olheiros");
		btnMeusOlheiros.setBounds(37, 58, 111, 23);
		frame.getContentPane().add(btnMeusOlheiros);
		
		JButton btnMeusJogadores = new JButton("Meus Jogadores");
		btnMeusJogadores.setBounds(37, 92, 111, 23);
		frame.getContentPane().add(btnMeusJogadores);
		
		JButton btnEdittar = new JButton("Editar");
		btnEdittar.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnEdittar);
		
		JLabel lblDinheiroDisponvel = new JLabel("Dinheiro dispon\u00EDvel:");
		lblDinheiroDisponvel.setBounds(37, 126, 104, 36);
		frame.getContentPane().add(lblDinheiroDisponvel);
		
		JLabel lblNewLabel = new JLabel("Dinheiro");
		lblNewLabel.setBounds(137, 130, 53, 28);
		frame.getContentPane().add(lblNewLabel);
	}

}
