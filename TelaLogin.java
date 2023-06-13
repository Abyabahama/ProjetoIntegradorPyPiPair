import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TelaLogin extends JFrame implements ActionListener{

    private ImageIcon imgLogo;
    private JLabel logo, titulo;
    private JTextField emailJTextField, nomeJTextField;
    private JButton entrar, criarConta;
    private TextPrompt emailTextPrompt, nomeTextPrompt;
    public String nomeProfessor;


    TelaLogin() {
        this("");
    }
    TelaLogin(String nomeProfessor){ 
        
        super("PyPIPair");
        //Montando o painel do logo
        JPanel painelTelaLogin = new JPanel(new BorderLayout());
        painelTelaLogin.setBackground(new Color(217, 255, 180));

        //Atributos do logo
        imgLogo = new ImageIcon("CobraLogo.png");
        logo = new JLabel(imgLogo);
        logo.setSize(302, 200);
        painelTelaLogin.add(logo, BorderLayout.NORTH);
        
        //Montando o painel para os botões
        JPanel painelLogin = new JPanel();
        BoxLayout caixaLogin = new BoxLayout(painelLogin, BoxLayout.Y_AXIS);
        painelLogin.setLayout(caixaLogin);
        painelLogin.setBackground(new Color(217, 255, 180));
        
        titulo = new JLabel("Login"){{
            setFont(new Font("Roboto", Font.BOLD, 30));
            setAlignmentX(CENTER_ALIGNMENT);
        }};

        emailJTextField = new JTextField(){{
            setSize(500, 50);
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setFont(new Font("Roboto", Font.PLAIN, 25));
            
        }};
        emailTextPrompt = new TextPrompt("E-mail", emailJTextField);
        
        nomeJTextField = new JTextField(){{
            setSize(500, 50);
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setFont(new Font("Roboto", Font.PLAIN, 25));
        }};
        nomeTextPrompt = new TextPrompt("Nome", nomeJTextField);

        entrar = new JButton("ENTRAR"){{
            setSize(500, 50);
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setBackground(new Color(52, 235, 143));
            setForeground(new Color(255, 255, 255));
            setFont(new Font("Roboto", Font.BOLD, 25));
            setFocusPainted(false);
            setBorderPainted(false);
            }
        };

        criarConta = new JButton("CRIAR CONTA"){{
            setSize(500, 50);
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setBackground(new Color(127, 187, 243));
            setForeground(new Color(255, 255, 255));
            setFont(new Font("Roboto", Font.BOLD, 25));
            setFocusPainted(false);
            setBorderPainted(false);
            }
        };
        
        entrar.addActionListener(this);
        criarConta.addActionListener(this);





        painelLogin.add(titulo);
        painelLogin.add(Box.createRigidArea(new Dimension(1, 20)));
        painelLogin.add(nomeJTextField);
        painelLogin.add(Box.createRigidArea(new Dimension(1, 20)));
        painelLogin.add(emailJTextField);
        painelLogin.add(Box.createRigidArea(new Dimension(1, 20)));
        painelLogin.add(entrar);
        painelLogin.add(Box.createRigidArea(new Dimension(1, 20)));
        painelLogin.add(criarConta);
        painelTelaLogin.add(painelLogin, BorderLayout.CENTER);
        //Adicionar os paineis à tela
        Container caixa = getContentPane(); 

        caixa.add(painelTelaLogin);

        //Finalizando
        setSize(1366, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == criarConta) {
        this.dispose();
        new TelaCadastro().setVisible(true);
    } else if (e.getSource() == entrar) {
        if (nomeJTextField.getText().isEmpty() || emailJTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campos não preenchidos. \nTente novamente", "PyPIPair", JOptionPane.PLAIN_MESSAGE);
        } else {
            String nome = nomeJTextField.getText();
            String email = emailJTextField.getText();

            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nome é obrigatório", "PyPIPair", JOptionPane.PLAIN_MESSAGE);
            } else if (nome.equalsIgnoreCase(nomeProfessor) && email.equalsIgnoreCase(TelaCadastro.getNomeProfessor())) {
                JOptionPane.showMessageDialog(this, "Bem vindo ao PyPIPair, Professor " + nome, "PyPIPair", JOptionPane.PLAIN_MESSAGE);
                // Redirecionar para a tela NIVELFACILUM
                new NIVELUMFACIL().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Bem vindo ao PyPIPair, " + nome, "PyPIPair", JOptionPane.PLAIN_MESSAGE);
                // Faça o que for necessário para o login do aluno
                new TelaInicial().setVisible(true);
                this.dispose();
            }
        }
    }
}

}
