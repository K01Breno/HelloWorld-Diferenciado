package helloDiferenciado;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class App implements ActionListener {
	
	private String text ;
	private JTextField i1;
	
	public JTextField Input() {
		
		JTextField textInput = new JTextField(15);
		textInput.addActionListener(this);
		return textInput;
		
	}
	
	public JButton Button() {
		
		  JButton bt = new JButton("Enviar");
		  bt.addActionListener(this);
		  
		  return bt;
		  
	}
	public void openJPane() {
		
		String mensagem = ("Oi " + text);
		
		JOptionPane jOptionPane = new JOptionPane();
		jOptionPane.showMessageDialog(null, mensagem);
		
	}
	
	public App() {
		
		JFrame frame = new JFrame();
		
		i1 = Input();
		frame.add(new JLabel("digite seu nome:"));
		frame.add(i1);
		frame.add(Button());
		
		frame.setLayout(new FlowLayout());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,200);
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		text = i1.getText();
		openJPane();
	}
	
	public static void main(String[] args) {
		
		App app = new App();
		
	}

	
}
