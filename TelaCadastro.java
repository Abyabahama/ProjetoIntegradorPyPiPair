import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TelaCadastro extends JFrame implements ActionListener{
    private JLabel titulo, logo;
    private JTextField nome, ra, email, confEmail;
    private ImageIcon imgLogo;
    private TextPrompt nomeTP, raTP, emailTP, confEmailTP;
    private JButton cadastrar;

    TelaCadastro(){
        super("PyPIPair");
        //Montando o painel do logo
        JPanel painelTelaCadastro = new JPanel(new BorderLayout());
        painelTelaCadastro.setBackground(new Color(217, 255, 180));

        //Atributos do logo
        imgLogo = new ImageIcon("CobraLogo.png");
        logo = new JLabel(imgLogo);
        logo.setSize(302, 200);
        painelTelaCadastro.add(logo, BorderLayout.NORTH);
        
        //Montando o painel para os botões
        JPanel painelCadastro = new JPanel();
        BoxLayout caixaCadastro = new BoxLayout(painelCadastro, BoxLayout.Y_AXIS);
        painelCadastro.setLayout(caixaCadastro);
        painelCadastro.setBackground(new Color(217, 255, 180));
            
        titulo = new JLabel("Login"){{
            setFont(new Font("Roboto", Font.BOLD, 30));
            setAlignmentX(CENTER_ALIGNMENT);
        }};
        
        nome = new JTextField(){{
            setSize(500, 50);
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setFont(new Font("Roboto", Font.PLAIN, 25));
        }};
        nomeTP = new TextPrompt("Nome", nome);

        ra = new JTextField(){{
            setSize(500, 50);
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setFont(new Font("Roboto", Font.PLAIN, 25));
        }};
        raTP = new TextPrompt("R.A", ra);

        email = new JTextField(){{
            setSize(500, 50);
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setFont(new Font("Roboto", Font.PLAIN, 25));
        }};
        emailTP = new TextPrompt("E-mail", email);

        confEmail = new JTextField(){{
            setSize(500, 50);
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setFont(new Font("Roboto", Font.PLAIN, 25));
        }};
        confEmailTP = new TextPrompt("Confirmar E-mail", confEmail);

        cadastrar = new JButton("CRIAR CONTA"){{
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
        cadastrar.addActionListener(this);



        painelCadastro.add(titulo);
        painelCadastro.add(Box.createRigidArea(new Dimension(1, 20)));
        painelCadastro.add(nome);
        painelCadastro.add(Box.createRigidArea(new Dimension(1, 20)));
        painelCadastro.add(ra);
        painelCadastro.add(Box.createRigidArea(new Dimension(1, 20)));
        painelCadastro.add(email);
        painelCadastro.add(Box.createRigidArea(new Dimension(1, 20)));
        painelCadastro.add(confEmail);
        painelCadastro.add(Box.createRigidArea(new Dimension(1, 30)));
        painelCadastro.add(cadastrar);

        painelTelaCadastro.add(painelCadastro,BorderLayout.CENTER);

        Container caixa = getContentPane(); 

        caixa.add(painelTelaCadastro);

        //Finalizando
        setSize(1366, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==cadastrar){
            if (nome.getText().isEmpty() || ra.getText().isEmpty() || email.getText().isEmpty() || confEmail.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Um ou mais campos não preenchidos. \nTente novamente", "PyPIPair", JOptionPane.PLAIN_MESSAGE);
            }
            else {
                if (email.getText().equals(confEmail.getText())){
                    JOptionPane.showMessageDialog(this, "Cadastro efetuado com sucesso", "PyPIPair", JOptionPane.PLAIN_MESSAGE);
                    new TelaInicial().setVisible(true);
                    this.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(this, "Confirmação de Email falhou. \n Tente novamente", "PyPIPair", JOptionPane.PLAIN_MESSAGE);
                }
            }
        }
    }
}