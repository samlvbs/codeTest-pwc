import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.awt.event.ActionEvent;

public class Desafio2 {

	private JFrame frmCodeTest;
	private JTextField fieldFrase;
	private JTextField fieldRemovidos;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desafio2 window = new Desafio2();
					window.frmCodeTest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Desafio2() {
		initialize();
	}

	private void initialize() {
		frmCodeTest = new JFrame();
		frmCodeTest.setTitle("Code Test - Samuel Vilas Boas - Desafio 2");
		frmCodeTest.setBounds(100, 100, 450, 300);
		frmCodeTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCodeTest.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Remover caracteres duplicados");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(70, 21, 309, 25);
		frmCodeTest.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insira a frase: ");
		lblNewLabel_1.setBounds(25, 73, 103, 14);
		frmCodeTest.getContentPane().add(lblNewLabel_1);
		
		fieldFrase = new JTextField();
		fieldFrase.setText("Hello, World!");
		fieldFrase.setBounds(161, 70, 218, 20);
		frmCodeTest.getContentPane().add(fieldFrase);
		fieldFrase.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Frase formatada: ");
		lblNewLabel_1_1.setBounds(25, 101, 126, 14);
		frmCodeTest.getContentPane().add(lblNewLabel_1_1);
		
		fieldRemovidos = new JTextField();
		fieldRemovidos.setEditable(false);
		fieldRemovidos.setColumns(10);
		fieldRemovidos.setBounds(161, 98, 218, 20);
		frmCodeTest.getContentPane().add(fieldRemovidos);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String frase = fieldFrase.getText();
				String[] palavras = frase.split("");
				ArrayList<String> palavrasFormatadas = new ArrayList();
				palavrasFormatadas = removerCaracteres(palavras);
				String saidaFormatada = String.join("", palavrasFormatadas);
				fieldRemovidos.setText(saidaFormatada);
			}
		});
		btnRemover.setBounds(161, 147, 93, 23);
		frmCodeTest.getContentPane().add(btnRemover);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home window = new Home();
				window.getFrame().setVisible(true);
				frmCodeTest.dispose();
			}
		});
		btnVoltar.setBounds(25, 207, 93, 23);
		frmCodeTest.getContentPane().add(btnVoltar);
	}
	
	public static ArrayList<String> removerCaracteres(String[] palavras){
		ArrayList<String> listaPalavras = new ArrayList<>();
        HashSet<String> caracteres = new HashSet<>();
        
        for (String palavra : palavras) {
            if (!caracteres.contains(palavra)) {
                listaPalavras.add(palavra);
                caracteres.add(palavra);
            }
        }
        return listaPalavras;
	}
	public JFrame getFrame() {
		return frmCodeTest;
	}

	public void setFrame(JFrame frame) {
		this.frmCodeTest = frame;
	}
}
