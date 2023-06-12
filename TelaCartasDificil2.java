import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import java.util.List;
import java.util.Arrays;

public class TelaCartasDificil2 extends JFrame implements ActionListener{

    ImageIcon imgLogo;
    JLabel logo;
    JButton menu;
    JLabel nivel, pontos, tempo;
    Carta carta1, carta2, carta3, carta4, carta5, carta6, carta7, carta8, carta9, carta10, carta11, carta12, carta13, carta14, carta15, carta16;
    Carta cartaSelecionada1;
    Carta cartaSelecionada2; 
    List<String> respostas;
    JLabel pergunta;
    private int paresEncontrados = 0;




    TelaCartasDificil2() {
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
        nivel = new JLabel("Dificuldade: Difícil");
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

        //Criação do painel de pontos e pergunta
        JPanel painelInfo = new JPanel(new BorderLayout());

        //Posicionamento dos Labels de pontação, tempo, e dificuldade 
        painelPontos.add(nivel, new Float(1));
        painelPontos.add(pontos, new Float(1));
        painelPontos.add(tempo, new Float(1));

         //Criação da área pergunta do jogo
        JPanel painelPergunta = new JPanel(new FlowLayout());
        painelPergunta.setBackground((new Color(217, 255, 180)));
        JLabel pergunta = new JLabel("Como podemos acessar o último elemento de uma lista em Python?");
        pergunta.setFont(new Font("Roboto", Font.BOLD, 25));
        
        painelPergunta.add(pergunta);

        //Criação da área de cartas do jogo
        JPanel painelCartas = new JPanel(new GridLayout(5, 8, 25, 25));
        painelCartas.setBackground(new Color(217, 255, 180));

        //Criação da lista de respostas
        List<String> respostas = Arrays.asList("argumentos", "classes", "objetos", "classes", "argumentos", "repetições", "laços", "laços", "objetos", "instâncias", "chaves", "relações", "chaves", "repetições", "relações", "instâncias");

        //Criação, posicionamento e preenchimento das cartas do jogo
        this.respostas = respostas;
        carta1 = new Carta(respostas.get(0));
        carta2 = new Carta(respostas.get(1));
        carta3 = new Carta(respostas.get(2));
        carta4 = new Carta(respostas.get(3));
        carta5 = new Carta(respostas.get(4));
        carta6 = new Carta(respostas.get(5));
        carta7 = new Carta(respostas.get(6));
        carta8 = new Carta(respostas.get(7));
        carta9 = new Carta(respostas.get(8));
        carta10 = new Carta(respostas.get(9));
        carta11 = new Carta(respostas.get(10));
        carta12 = new Carta(respostas.get(11));
        carta13 = new Carta(respostas.get(12));
        carta14 = new Carta(respostas.get(13));
        carta15 = new Carta(respostas.get(14));
        carta16 = new Carta(respostas.get(15));
       

        

        //Aplicando actionListener às cartas e botões 
        carta1.addActionListener(this);
        carta2.addActionListener(this);
        carta3.addActionListener(this);
        carta4.addActionListener(this);
        carta5.addActionListener(this);
        carta6.addActionListener(this);
        carta7.addActionListener(this);
        carta8.addActionListener(this);
        carta9.addActionListener(this);
        carta10.addActionListener(this);
        carta11.addActionListener(this);
        carta12.addActionListener(this);
        carta13.addActionListener(this);
        carta14.addActionListener(this);
        carta15.addActionListener(this);
        carta16.addActionListener(this);
       


        menu.addActionListener(this);


        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
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
        painelCartas.add(carta5);
        painelCartas.add(carta6);
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(carta7);
        painelCartas.add(carta8);
        painelCartas.add(carta9);
        painelCartas.add(carta10);
        painelCartas.add(carta11);
        painelCartas.add(carta12);
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(carta13);
        painelCartas.add(carta14);
        painelCartas.add(carta15);
        painelCartas.add(carta16);
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        painelCartas.add(Box.createRigidArea(getPreferredSize()));
        

        
              




       painelInfo.add(painelPergunta, BorderLayout.SOUTH);
        painelInfo.add(painelPontos, BorderLayout.NORTH);
        painelJogo.add(painelInfo, BorderLayout.NORTH);
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
    ClickedButtonDificil2 clickedButton = new ClickedButtonDificil2();
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menu) {
            this.dispose();
            new TelaInicial();
        }
        Carta cartaSelecionada = (Carta) e.getSource();
    
        if (cartaSelecionada.isVirada()) {
            cartaSelecionada.virarCarta();
    
            if (clickedButton.getCarta1() == null) {
                clickedButton.setCarta1(cartaSelecionada);
            } else if (clickedButton.getCarta2() == null) {
                clickedButton.setCarta2(cartaSelecionada);
    
                if (clickedButton.verificarPar()) {
                    // Par correto
                    JOptionPane.showMessageDialog(this, "Você venceu!");
                    TelaCartasDificil3 novaTelaDificil3 = new TelaCartasDificil3();
                    novaTelaDificil3.setVisible(true);
                    dispose(); // Fechar a tela atual
                    
    
                    // Reinicie as cartas, se necessário
                    clickedButton.desvirarCartas();
                } else {
                    // Par incorreto
                    Timer timer = new Timer(1000, new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            clickedButton.desvirarCartas();
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                }
            }
        }
    }
    
}




