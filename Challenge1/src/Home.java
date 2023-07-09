import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Home {

	private JFrame frmCodeTest;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frmCodeTest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Home() {
		initialize();
	}


	private void initialize() {
		frmCodeTest = new JFrame();
		frmCodeTest.setTitle("Code Test - Samuel Vilas Boas");
		frmCodeTest.setBounds(100, 100, 524, 361);
		frmCodeTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCodeTest.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Desafio de código - Estágio Pwc");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel.setBounds(112, 11, 315, 24);
		frmCodeTest.getContentPane().add(lblNewLabel);
		
		JButton btnDesafio2 = new JButton("Desafio 2");
		btnDesafio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desafio2 window = new Desafio2();
				window.getFrame().setVisible(true);
				frmCodeTest.dispose();
			}
		});
		btnDesafio2.setBounds(398, 135, 89, 23);
		frmCodeTest.getContentPane().add(btnDesafio2);
		
		JLabel lblNewLabel_1 = new JLabel("Desafio 1 - Inverter a ordem das palvaras na frase: ");
		lblNewLabel_1.setBounds(10, 108, 349, 14);
		frmCodeTest.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Desafio 2 - Remover caracteres duplicados");
		lblNewLabel_1_1.setBounds(10, 139, 349, 14);
		frmCodeTest.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnDesafio1 = new JButton("Desafio 1");
		btnDesafio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desafio1 window = new Desafio1();
				window.getFrame().setVisible(true);
				frmCodeTest.dispose();
				
			}
		});
		btnDesafio1.setBounds(398, 104, 89, 23);
		frmCodeTest.getContentPane().add(btnDesafio1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Desafio 3 - Encontrar substring palindroma mais longa");
		lblNewLabel_1_1_1.setBounds(10, 173, 349, 14);
		frmCodeTest.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton btnDesafio3 = new JButton("Desafio 3");
		btnDesafio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desafio3 window = new Desafio3();
				window.getFrame().setVisible(true);
				frmCodeTest.dispose();
			}
		});
		btnDesafio3.setBounds(398, 169, 89, 23);
		frmCodeTest.getContentPane().add(btnDesafio3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Desafio 4 - Colocar em maisculo a primeira letra de cada frase:");
		lblNewLabel_1_1_2.setBounds(10, 202, 378, 14);
		frmCodeTest.getContentPane().add(lblNewLabel_1_1_2);
		
		JButton btnDesafio4 = new JButton("Desafio 4");
		btnDesafio4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desafio4 window = new Desafio4();
				window.getFrame().setVisible(true);
				frmCodeTest.dispose();
			}
		});
		btnDesafio4.setBounds(398, 198, 89, 23);
		frmCodeTest.getContentPane().add(btnDesafio4);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Desafio 5 - Verifica se é um anagrama de um palindromo:");
		lblNewLabel_1_1_3.setBounds(10, 231, 349, 14);
		frmCodeTest.getContentPane().add(lblNewLabel_1_1_3);
		
		JButton btnDesafio5 = new JButton("Desafio 5");
		btnDesafio5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desafio5 window = new Desafio5();
				window.getFrame().setVisible(true);
				frmCodeTest.dispose();
			}
		});
		btnDesafio5.setBounds(398, 227, 89, 23);
		frmCodeTest.getContentPane().add(btnDesafio5);
		
		JLabel lblNewLabel_2 = new JLabel("Samuel Vilas Boas de Souza");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(134, 39, 293, 14);
		frmCodeTest.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Análise e desenvolvimento de sistemas  - FATEC");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(60, 64, 438, 14);
		frmCodeTest.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Código completo no github:");
		lblNewLabel_3.setBounds(46, 272, 155, 14);
		frmCodeTest.getContentPane().add(lblNewLabel_3);
		
		JLabel lblLinkGithub = new JLabel("https://github.com/samlvbs/codeTest-pwc");
		lblLinkGithub.setForeground(new Color(0, 64, 128));
		lblLinkGithub.setBounds(210, 272, 247, 14);
		frmCodeTest.getContentPane().add(lblLinkGithub);
		
		lblLinkGithub.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				openLink("https://github.com/samlvbs/codeTest-pwc");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
				lblLinkGithub.setCursor(cursor);
			}
		});
		
		frmCodeTest.getContentPane().add(lblLinkGithub);
		
		JLabel lblNewLabel_3_1 = new JLabel("Perfil no LinkedIn:");
		lblNewLabel_3_1.setBounds(89, 290, 112, 14);
		frmCodeTest.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblLinkLinkedin = new JLabel("https://www.linkedin.com/in/samuelvilas/");
		lblLinkLinkedin.setForeground(new Color(0, 64, 128));
		lblLinkLinkedin.setBounds(210, 290, 247, 14);
		frmCodeTest.getContentPane().add(lblLinkLinkedin);
		
		lblLinkLinkedin.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				openLink("https://www.linkedin.com/in/samuelvilas");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
				lblLinkLinkedin.setCursor(cursor);
			}
			
		});
		
		
	}
	private static void openLink(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
	
	public JFrame getFrame() {
		return frmCodeTest;
	}

	public void setFrame(JFrame frame) {
		this.frmCodeTest = frame;
	}
}
