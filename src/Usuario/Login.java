package Usuario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frmLogin;
	private JTextField txtCor;
	private JPasswordField txtCon;
	private JLabel lblCor;
	private JLabel lblCon;
	private JLabel lblImagen;
	private JButton btnIni;

	public static void main(String[] args) {
		Login x=new Login();
		x.frmLogin.setVisible(true);
	}
	private String encriptarCon(String text) {
		
		return null;
	}

	public Login() {
		initialize();
	}

	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Usuario/6073873 (2).png")));
		frmLogin.setBounds(100, 100, 448, 512);
		frmLogin.setLocationRelativeTo(null);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
	
		
		lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon(Login.class.getResource("/Usuario/6073873 (2).png")));
		lblImagen.setBounds(110, 27, 200, 200);
		frmLogin.getContentPane().add(lblImagen);
		
		lblCor = new JLabel("Correo :");
		lblCor.setFont(new Font("Letter Gothic Std", Font.BOLD, 15));
		lblCor.setBounds(22, 250, 118, 29);
		frmLogin.getContentPane().add(lblCor);
		
		lblCon = new JLabel("Contraseña :");
		lblCon.setFont(new Font("Letter Gothic Std", Font.BOLD, 15));
		lblCon.setBounds(22, 301, 118, 29);
		frmLogin.getContentPane().add(lblCon);
		
		txtCor = new JTextField();
		txtCor.setBounds(150, 253, 244, 20);
		frmLogin.getContentPane().add(txtCor);
		txtCor.setColumns(10);
		
		txtCon = new JPasswordField();
		txtCon.setBounds(150, 304, 244, 20);
		frmLogin.getContentPane().add(txtCon);
		
		btnIni = new JButton("Iniciar");
		btnIni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario x=new Usuario();
				x.setCorreo(txtCor.getText());
				x.setContraseña(encriptarCon(txtCon.getText()));
				if(x.Login()) {
					
				}
			}

			
		});
		btnIni.setFont(new Font("Letter Gothic Std", Font.BOLD, 16));
		btnIni.setBounds(146, 365, 137, 44);
		frmLogin.getContentPane().add(btnIni);
	}
}
