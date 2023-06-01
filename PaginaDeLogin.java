package TrabalhoIntegrador;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





public class PaginaDeLogin extends JFrame implements ActionListener{
private ImageIcon Logo;
private JLabel logo;
//botoes e text field
JButton Entrar;
JButton Criar_Conta;
JTextField Email;
JLabel SemConta;




PaginaDeLogin(){
    
    //fundo da tela
    JPanel TelaDeLogin = new JPanel(new BorderLayout());
    TelaDeLogin.setBackground(new Color(227,248,231));  
    
    //construindo o Logo
    ImageIcon Logo = new ImageIcon(getClass().getResource("image.png"));
    JLabel logo = new JLabel(Logo);
    logo.setSize(302,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    TelaDeLogin.add(logo);
    
    //painel
    JPanel painel = new JPanel();
    BoxLayout design = new BoxLayout(painel, BoxLayout.Y_AXIS);
    painel.setLayout(design);
    painel.setBackground(new Color(227,248,231));


    Email = new JTextField(){{
        setSize(500, 75);
        setMaximumSize(getSize());
        setFont(new Font("Felicidade", Font.BOLD, 30));
        setAlignmentX(CENTER_ALIGNMENT);
        setText("Email:");
        getText();


}};

    SemConta = new JLabel("esqueceu o usuário ?"){{
        setSize(320, 1);
        setMaximumSize(getSize());
        setFont(new Font("Felicidade", Font.BOLD, 30));
        setAlignmentX(CENTER_ALIGNMENT);
    }};

    Entrar = new JButton("Entrar"){{

        

        setSize(500, 75);
        setMaximumSize(getSize());
        setAlignmentX(CENTER_ALIGNMENT);
        setBackground(new Color(52, 235, 143));
        setForeground(new Color(255, 255, 255));
        setFont(new Font("Felicidade", Font.BOLD, 30));
        setFocusPainted(false);
        setBorderPainted(false);
        
    }};
  

    Criar_Conta = new JButton("Criar conta"){{
        setSize(500, 75);
        setMaximumSize(getSize());
        setAlignmentX(CENTER_ALIGNMENT);
        setBackground(new Color(121, 229, 255));
        setForeground(new Color(255, 255, 255));
        setFont(new Font("Felicidade", Font.BOLD, 30));
        setFocusPainted(false);
        setBorderPainted(false);


    }};

    Entrar.addActionListener(this);
    Criar_Conta.addActionListener(this);


    painel.add(Box.createRigidArea(new Dimension(1,20)));
    painel.add(Email);
    painel.add(Box.createRigidArea(new Dimension(1,20)));
    painel.add(Entrar);
    painel.add(Box.createRigidArea(new Dimension(1,20)));
    painel.add(SemConta);
    painel.add(Box.createRigidArea(new Dimension(1, 20)));
    painel.add(Criar_Conta);
    TelaDeLogin.add(painel, BorderLayout.SOUTH);
    Container lindo = getContentPane();
    lindo.add(TelaDeLogin);
    setSize(1366, 768);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);

}


public void actionPerformed(ActionEvent e) {
   
   
    if (e.getSource() == Entrar){
        JOptionPane.showMessageDialog(this, "logado com Sucesso","login", JOptionPane.PLAIN_MESSAGE);
   }

   if (e.getSource() == Criar_Conta){
    JOptionPane.showMessageDialog(this, "Crie sua conta abaixo","cadastro", JOptionPane.PLAIN_MESSAGE);
}



}


}