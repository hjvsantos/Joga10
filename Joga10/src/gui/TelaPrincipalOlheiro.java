package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class TelaPrincipalOlheiro {

	private JFrame frame;
	private JTextField txtPesquisarJogadorPor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipalOlheiro window = new TelaPrincipalOlheiro();
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
	public TelaPrincipalOlheiro() {
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
		
		txtPesquisarJogadorPor = new JTextField();
		txtPesquisarJogadorPor.setText("Pesquisar jogador por palavra chave, nome ou idade");
		txtPesquisarJogadorPor.setBounds(10, 10, 322, 26);
		frame.getContentPane().add(txtPesquisarJogadorPor);
		txtPesquisarJogadorPor.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(342, 12, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(btnSair);
		
		JButton btnTimes = new JButton("Times");
		btnTimes.setBounds(266, 65, 89, 23);
		frame.getContentPane().add(btnTimes);
		
		JButton btnJogadores = new JButton("Jogadores");
		btnJogadores.setBounds(94, 65, 89, 23);
		frame.getContentPane().add(btnJogadores);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(342, 227, 89, 23);
		frame.getContentPane().add(btnEditar);
		
		JLabel lblVocEstObservando = new JLabel("Voc\u00EA est\u00E1 observando ");
		lblVocEstObservando.setBounds(10, 107, 110, 26);
		frame.getContentPane().add(lblVocEstObservando);
		
		JLabel lblNDeJogadores = new JLabel("N\u00BA de jogadores no array");
		lblNDeJogadores.setBounds(130, 107, 60, 26);
		frame.getContentPane().add(lblNDeJogadores);
		
		JLabel lblJogadores = new JLabel("Jogadores");
		lblJogadores.setBounds(199, 105, 60, 31);
		frame.getContentPane().add(lblJogadores);
	}
}
