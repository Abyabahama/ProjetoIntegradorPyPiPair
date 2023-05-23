import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class TelaCartasFacil extends JFrame implements ActionListener{

    ImageIcon imgLogo;
    JLabel logo;
    JButton menu;
    JLabel nivel, pontos, tempo;
    Carta carta1, carta2, carta3, carta4, carta5, carta6, carta7, carta8;




    TelaCartasFacil() {
        super("PyPiPair");
        
        //Montando o painel do logo
        JPanel painel = new JPanel(new BorderLayout());
        painel.setBackground(new Color(217, 255, 180));
        JPanel painelTopo = new JPanel();
        painelTopo.setBackground((new Color(217, 255, 180)));
        BoxLayout caixaTopo = new BoxLayout(painelTopo, BoxLayout.X_AXIS);

        //Atributos do logo
        imgLogo = new ImageIcon("CobraLogo - Copy.png");
        logo = new JLabel(imgLogo);
        logo.setSize(227, 150);
        painelTopo.setLayout(caixaTopo);
        painelTopo.add(logo);
        painelTopo.add(Box.createHorizontalGlue());

        
        //Atributos do botão menu
        menu = new JButton("MENU") {{
            setBackground(new Color(245, 156, 2));
            setSize(2000, 50);
            setFont(new Font("Roboto", Font.BOLD, 30));
            setMaximumSize(getSize());
            setMinimumSize(getSize());
            setFocusPainted(false);
        }};
        painelTopo.add(menu);
        painelTopo.add(Box.createRigidArea(new Dimension(20, 0)));
        //Definição da área de jogo
        JPanel painelJogo = new JPanel(new BorderLayout());
        painelJogo.setBackground((new Color(217, 255, 180)));
        JPanel painelPontos = new JPanel();
        //Definição do HUD de dados do jogo
        RelativeLayout caixaPontos = new RelativeLayout(RelativeLayout.X_AXIS, 5);
        painelPontos.setBackground((new Color(217, 255, 180)));
        painelPontos.setLayout(caixaPontos);
        painelJogo.add(painelPontos, BorderLayout.NORTH);

        //Instanciamento e definição do texto dos labels de pontuação, tempo, e dificuldade
        nivel = new JLabel("Dificuldade: Fácil");
        nivel.setHorizontalAlignment(SwingConstants.CENTER);
        nivel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2, true));
        nivel.setFont(new Font("Roboto", Font.BOLD, 30));

        pontos = new JLabel("Pontuação: Placeholder");
        pontos.setHorizontalAlignment(SwingConstants.CENTER);
        pontos.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2, true));
        pontos.setFont(new Font("Roboto", Font.BOLD, 30));

        tempo = new JLabel("Tempo: 00:00");
        tempo.setHorizontalAlignment(SwingConstants.CENTER);
        tempo.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2, true));
        tempo.setFont(new Font("Roboto", Font.BOLD, 30));

        //Posicionamento dos Labels de pontação, tempo, e dificuldade 
        painelPontos.add(nivel, new Float(1));
        painelPontos.add(pontos, new Float(1));
        painelPontos.add(tempo, new Float(1));

        //Criação da área de cartas do jogo
        JPanel painelCartas = new JPanel(new GridLayout(4, 6, 25, 25));
        painelCartas.setBackground(new Color(217, 255, 180));


        //Criação e posicionamento das cartas do jogo
        carta1 = new Carta("1");
        carta2 = new Carta("2");
        carta3 = new Carta("3");
        carta4 = new Carta("4");
        carta5 = new Carta("5");
        carta6 = new Carta("6");
        carta7 = new Carta("7");
        carta8 = new Carta("8");

        //Aplicando actionListener às cartas e botões 
        carta1.addActionListener(this);
        carta2.addActionListener(this);
        carta3.addActionListener(this);
        carta4.addActionListener(this);
        carta5.addActionListener(this);
        carta6.addActionListener(this);
        carta7.addActionListener(this);
        carta8.addActionListener(this);


        menu.addActionListener(this);


        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(carta1);
        painelCartas.add(carta2);
        painelCartas.add(carta3);
        painelCartas.add(carta4);
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(carta5);
        painelCartas.add(carta6);
        painelCartas.add(carta7);
        painelCartas.add(carta8);
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        



        




        painelJogo.add(painelCartas, BorderLayout.CENTER);
        painel.add(painelTopo, BorderLayout.NORTH);
        painel.add(painelJogo, BorderLayout.CENTER);
        Container caixa = getContentPane(); 
    
        caixa.add(painel);
    
        //Finalizando
        setSize(1366, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(false);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == carta1){
            carta1.virarCarta();   
        }
        else if (e.getSource() == carta2){
            carta2.virarCarta();
            
        }
        else if (e.getSource() == carta3){
            carta3.virarCarta();
            
        }
        else if (e.getSource() == carta4){
            carta4.virarCarta();
            
        }
        else if (e.getSource() == carta5){
            carta5.virarCarta();
            
        }
        else if (e.getSource() == carta6){
            carta6.virarCarta();
            
        }
        else if (e.getSource() == carta7){
            carta7.virarCarta();
            
        }
        else if (e.getSource() == carta8){
            carta8.virarCarta();
            
        }
            
    }
}

