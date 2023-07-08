import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Desafio4 {

	private JFrame frame;
	private JTextField fieldFrase;
	private JTextField fieldFormatada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desafio4 window = new Desafio4();
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
	public Desafio4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Colocar a primeira letra da frase em maiusculo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(30, 23, 379, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insira a frase: ");
		lblNewLabel_1.setBounds(10, 87, 50, -17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Insira a frase");
		lblNewLabel_2.setBounds(30, 81, 26, -7);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Insira a frase:");
		lblNewLabel_3.setBounds(40, 75, 100, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		fieldFrase = new JTextField();
		fieldFrase.setText("hello. how are you? i'm fine, tank you.");
		fieldFrase.setBounds(143, 72, 266, 20);
		frame.getContentPane().add(fieldFrase);
		fieldFrase.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Frase formatada:");
		lblNewLabel_3_1.setBounds(40, 103, 100, 14);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		fieldFormatada = new JTextField();
		fieldFormatada.setEditable(false);
		fieldFormatada.setColumns(10);
		fieldFormatada.setBounds(143, 100, 266, 20);
		frame.getContentPane().add(fieldFormatada);
		
		JButton btnFormatar = new JButton("Formatar");
		btnFormatar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String frase = fieldFrase.getText();
				String[] palavras = frase.split("");
				ArrayList<String> listaPalavras = new ArrayList<>();
				listaPalavras = formatarFrase(palavras);
				String saidaFormatada = String.join("", listaPalavras);
				fieldFormatada.setText(saidaFormatada);
			}
		});
		btnFormatar.setBounds(172, 154, 89, 23);
		frame.getContentPane().add(btnFormatar);
		
		JButton bntVoltar = new JButton("Voltar");
		bntVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home window = new Home();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		bntVoltar.setBounds(23, 203, 89, 23);
		frame.getContentPane().add(bntVoltar);
	}
	
	public static ArrayList<String> formatarFrase(String[] palavras) {
        ArrayList<String> listaPalavras = new ArrayList<>();
        
        for (int i = 0; i < palavras.length; i++) {
        	if(i==0) {
        		palavras[i] = palavras[i].substring(i).toUpperCase();
        	}
            if (palavras[i].equals(".") || palavras[i].equals("?")) {
                if (i + 1 < palavras.length) {
                    palavras[i + 2] = palavras[i + 2].substring(0, 1).toUpperCase() + palavras[i + 2].substring(1);
                }
            }
        }
        for (String palavra : palavras) {
            listaPalavras.add(palavra);
        }
        return listaPalavras;
    }
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
