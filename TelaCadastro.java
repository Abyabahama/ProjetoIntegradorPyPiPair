import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro extends JFrame implements ActionListener{
    
    // declarando os componentes das página como variáveis globais
    private JLabel logo;
    private ImageIcon imgLogo;
    JButton buttonCadastrar;
    JTextField textUsuario;
    JTextField textNome;
    JTextField textEmail;
    JTextField confirmarEmail;

    //criando a página TelaCadatro
    TelaCadastro(){
        
        //criando o painel principal da tela
        JPanel painelTelaCadastro = new JPanel(new BorderLayout());
        painelTelaCadastro.setBackground(new Color(217, 255, 180));

        // criando e adicionando o logo no painel
        imgLogo = new ImageIcon("CobraLogo.png");
        logo = new JLabel(imgLogo);
        logo.setPreferredSize(new Dimension(202, 202));
        painelTelaCadastro.add(logo, BorderLayout.NORTH);
        
        //criando o painel da caixaCadastro
        JPanel painelCadastro = new JPanel();
        BoxLayout caixaCadastro = new BoxLayout(painelCadastro, BoxLayout.Y_AXIS);
        painelCadastro.setLayout(caixaCadastro);
        painelCadastro.setBackground(new Color(217, 255, 180));
        painelTelaCadastro.add(painelCadastro, BorderLayout.CENTER);

        //criando os componentes do painelCadastro

        // Campos de Input(texto)
        JLabel textCadastro = new JLabel(){{
            setSize(new Dimension(500, 50));
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setText("Criar Conta");
            setFont(new Font("Poppins", Font.BOLD, 60));
        }};


        
        textUsuario = new JTextField(){{
            setSize(new Dimension(500, 50));
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setFont(new Font("Inter", Font.PLAIN, 20));
            setText("usuário(RA)");

        }};
    
        textNome = new JTextField(){{
            setSize(new Dimension(500, 50));
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setFont(new Font("Inter", Font.PLAIN, 20));
            setText("Nome");
            
        }};
        
        textEmail = new JTextField(){{
            
            setSize(new Dimension(500, 50));
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setFont(new Font("Inter", Font.PLAIN, 20));
            setText("e-mail");

            
        }};
        
        confirmarEmail = new JTextField(){{
            setSize(new Dimension(500, 50));
            setMaximumSize(getSize());
            setAlignmentY(CENTER_ALIGNMENT);
            setText("confirmar e-mail");
            setFont(new Font("Inter", Font.PLAIN, 20));
            
        }};

        // botão cadastrar

        buttonCadastrar = new  JButton("Cadastrar"){{
            setSize(500,75);
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setBackground(new Color(127,187,243));
            setFont(new Font("Poppins", Font.BOLD, 30));
            setForeground(Color.white);
            setFocusPainted(false);
            setBorderPainted(false);
        }};
        buttonCadastrar.addActionListener(this);

        //Adiconando os componentes ao painelCadatro
        
        painelCadastro.add(Box.createRigidArea(new Dimension(1, 50)));
        painelCadastro.add(textCadastro);
        painelCadastro.add(Box.createRigidArea(new Dimension(1, 30)));
        painelCadastro.add(textUsuario);
        painelCadastro.add(Box.createRigidArea(new Dimension(1, 20)));
        painelCadastro.add(textNome);
        painelCadastro.add(Box.createRigidArea(new Dimension(1, 20)));
        painelCadastro.add(textEmail);
        painelCadastro.add(Box.createRigidArea(new Dimension(1, 20)));
        painelCadastro.add(confirmarEmail);
        painelCadastro.add(Box.createRigidArea(new Dimension(1, 50)));
        painelCadastro.add(buttonCadastrar);
        
        //Adicionando o painelCadastro ao painel principal painelTelaCadastro
        painelTelaCadastro.add(painelCadastro, BorderLayout.CENTER);

        //criando o container para todos os componentes da TelaCadastro que retornará o painelTelaCadastro
        Container caixa = getContentPane();

        //adiconando o painel principal ao container
        caixa.add(painelTelaCadastro);

         //Finalizando
        setSize(1366, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }
     
    @Override
    public void actionPerformed(ActionEvent e) {

    if (e.getSource() == buttonCadastrar){

        JOptionPane.showMessageDialog(this, "Conta Criada com Sucesso","Status Cadastro", JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
}
