
import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;

import java.awt.*;
import java.awt.event.*;

public class TelaInicial extends JFrame implements ActionListener{
    private JLabel logo;
    private ImageIcon imgLogo;



    //Criando os botões
    JButton jogar;
    JButton ranking;
    JButton biblioteca;
    JButton sair;


    TelaInicial() {
        super("PyPiPair");
        //Montando o painel do logo
        JPanel painelTelaInicial = new JPanel(new BorderLayout());
        painelTelaInicial.setBackground(new Color(217, 255, 180));

        //Atributos do logo
        imgLogo = new ImageIcon("CobraLogo.png");
        logo = new JLabel(imgLogo);
        logo.setSize(302, 200);
        painelTelaInicial.add(logo, BorderLayout.NORTH);
        
        //Montando o painel para os botões
        JPanel painelBotoes = new JPanel();
        BoxLayout caixaBotoes = new BoxLayout(painelBotoes, BoxLayout.Y_AXIS);
        painelBotoes.setLayout(caixaBotoes);
        painelBotoes.setBackground(new Color(217, 255, 180));



        jogar = new JButton("JOGAR"){{
            setSize(500, 75);
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setBackground(new Color(52, 235, 143));
            setForeground(new Color(255, 255, 255));
            setFont(new Font("Roboto", Font.BOLD, 30));
            setFocusPainted(false);
            setBorderPainted(false);
            }
        };
        
        ranking = new JButton("RANKING"){{
            setSize(500, 75);
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setBackground(new Color(52, 235, 143));
            setForeground(new Color(255, 255, 255));
            setFont(new Font("Roboto", Font.BOLD, 30));
            setFocusPainted(false);
            setBorderPainted(false);
            }
        };
        biblioteca = new JButton("BIBLIOTECA"){{
            setSize(500, 75);
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setBackground(new Color(52, 235, 143));
            setForeground(new Color(255, 255, 255));
            setFont(new Font("Roboto", Font.BOLD, 30));
            setFocusPainted(false);
            setBorderPainted(false);
            }
        };
        sair = new JButton("SAIR"){{
            setSize(500, 75);
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setBackground(new Color(52, 235, 143));
            setForeground(new Color(255, 255, 255));
            setFont(new Font("Roboto", Font.BOLD, 30));
            setFocusPainted(false);
            setBorderPainted(false);
            }
        };

        jogar.addActionListener(this);
        biblioteca.addActionListener(this);
        ranking.addActionListener(this);
        sair.addActionListener(this);
            

        //Adicionando os botões ao painel
        painelBotoes.add(Box.createRigidArea(new Dimension(1, 50)));
        painelBotoes.add(jogar);
        painelBotoes.add(Box.createRigidArea(new Dimension(1, 20)));
        painelBotoes.add(ranking);
        painelBotoes.add(Box.createRigidArea(new Dimension(1, 20)));
        painelBotoes.add(biblioteca);
        painelBotoes.add(Box.createRigidArea(new Dimension(1, 20)));
        painelBotoes.add(sair);

        painelTelaInicial.add(painelBotoes, BorderLayout.CENTER);

        //Adicionar os paineis à tela
        Container caixa = getContentPane(); 

        caixa.add(painelTelaInicial);

        //Finalizando
        setSize(1366, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jogar){
            new TelaCartasFacil().setVisible(true);
            this.dispose();
        }
        else if (e.getSource() == ranking) {
            new Rank().setVisible(true);
            this.dispose();
        }
        else if(e.getSource()==biblioteca){
            new TelaBiblioteca().setVisible(true);
        }
        else if (e.getSource() == sair) {
            this.dispose();
        }
    }
}
