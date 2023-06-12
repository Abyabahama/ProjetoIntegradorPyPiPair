
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;




public class NIVELTRESDIFICIL extends JFrame {
    private ImageIcon Logo;
    private JLabel logo;
    JTextField PerguntaUM;
    JTextField PerguntaDOIS;
    JTextField PerguntaTRES;
    JTextField PerguntaQUATRO;
    JTextField PerguntaCINCO;
    JTextField RESPOSTAUM;
    JTextField RESPOSTADOIS;
    JTextField RESPOSTATRES;
    JTextField RESPOSTAQUATRO;
    JTextField RESPOSTACINCO;
    JTextField RESPOSTASEIS;
    JTextField RESPOSTASETE;
    JTextField RESPOSTAOITO;
    JTextField RESPOSTACORRETA;
    JLabel Dificuldade;
    JLabel Pergunta;
    JLabel SEISRESPOSTAS;
    JLabel RESPOSTACERTA;
    JLabel RESPOSTAA;
    JLabel RESPOSTAB;
    JLabel RESPOSTAC;
    JLabel RESPOSTAD;
    JLabel RESPOSTAE;
    JLabel RESPOSTAF;
    JLabel RESPOSTAG;
    JLabel RESPOSTAH;
    JButton NEXT;
    JButton VOLTAR;


 NIVELTRESDIFICIL() {
JPanel prof = new JPanel(new BorderLayout());
prof.setBackground(new Color(217, 255, 180));

        //painel e logo e escala
ImageIcon Logo = new ImageIcon(getClass().getResource("CobraLogo.png"));
Image image = Logo.getImage().getScaledInstance(100, 50, Image.SCALE_SMOOTH);
Logo = new ImageIcon(image);
JLabel logo = new JLabel(Logo);
logo.setSize(100, 60);
setDefaultCloseOperation(EXIT_ON_CLOSE);
prof.add(logo);

JPanel painel = new JPanel();
BoxLayout design = new BoxLayout(painel, BoxLayout.Y_AXIS);
painel.setLayout(design);
painel.setBackground(new Color(217, 255, 180));









//JTextfields e JLabels 
 Dificuldade = new JLabel("Dificuldade : Dificil"){};
Dificuldade.setPreferredSize(new Dimension(220, 60));
Dificuldade.setMaximumSize(Dificuldade.getPreferredSize());
Dificuldade.setFont(new Font("Poppins", Font.BOLD, 20));
Dificuldade.setAlignmentX(CENTER_ALIGNMENT);
painel.add(Dificuldade);



Pergunta = new JLabel("Digite a primeira pergunta :") {};

Pergunta.setPreferredSize(new Dimension(1200, 45));
Pergunta.setMaximumSize(Pergunta.getPreferredSize());
Pergunta.setFont(new Font("PerguntaText", Font.BOLD, 16));
Pergunta.setAlignmentX(CENTER_ALIGNMENT);
            
        
 painel.add(Box.createRigidArea(new Dimension(1, 20)));
 painel.add(Pergunta);
               
            
PerguntaUM = new JTextField() {};

PerguntaUM.setPreferredSize(new Dimension(600, 20));
PerguntaUM.setMaximumSize(PerguntaUM.getPreferredSize());
PerguntaUM.setFont(new Font("Pergunta", Font.BOLD, 16));
PerguntaUM.setAlignmentX(Component.RIGHT_ALIGNMENT);


painel.add(PerguntaUM);
painel.add(Box.createRigidArea(new Dimension(1, 20)));
                
  

    

SEISRESPOSTAS = new JLabel("Digite apenas um elemento do par: "){};

SEISRESPOSTAS.setPreferredSize(new Dimension(1000, 1));
SEISRESPOSTAS.setMaximumSize(Pergunta.getPreferredSize());
SEISRESPOSTAS.setFont(new Font("PerguntaText", Font.BOLD, 16));
SEISRESPOSTAS.setAlignmentX(CENTER_ALIGNMENT);
painel.add(SEISRESPOSTAS);

  painel.add(Box.createRigidArea(new Dimension(1, 10)));
RESPOSTAA = new JLabel("Digite a primeira resposta: "){};
RESPOSTAA.setPreferredSize(new Dimension(300, 20));
RESPOSTAA.setMaximumSize(Pergunta.getPreferredSize());
RESPOSTAA.setFont(new Font("PerguntaText", Font.BOLD, 16));
RESPOSTAA.setAlignmentX(CENTER_ALIGNMENT);
painel.add(RESPOSTAA);


RESPOSTAUM = new JTextField() {};
                
RESPOSTAUM.setPreferredSize(new Dimension(600, 20));
RESPOSTAUM.setMaximumSize(PerguntaUM.getPreferredSize());
RESPOSTAUM.setFont(new Font("Pergunta", Font.BOLD, 16));
RESPOSTAUM.setAlignmentX(Component.RIGHT_ALIGNMENT);


painel.add(RESPOSTAUM);

painel.add(Box.createRigidArea(new Dimension(1, 10)));  
RESPOSTAB = new JLabel("Digite a segunda resposta:  "){};
RESPOSTAB.setPreferredSize(new Dimension(300, 20));
RESPOSTAB.setMaximumSize(Pergunta.getPreferredSize());
RESPOSTAB.setFont(new Font("PerguntaText", Font.BOLD, 16));
RESPOSTAB.setAlignmentX(CENTER_ALIGNMENT);
painel.add(RESPOSTAB);


RESPOSTADOIS = new JTextField() {};
                
RESPOSTADOIS.setPreferredSize(new Dimension(600, 20));
RESPOSTADOIS.setMaximumSize(PerguntaUM.getPreferredSize());
RESPOSTADOIS.setFont(new Font("Pergunta", Font.BOLD, 16));
RESPOSTADOIS.setAlignmentX(Component.RIGHT_ALIGNMENT);


painel.add(Box.createRigidArea(new Dimension(1, 5)));
painel.add(RESPOSTADOIS);


painel.add(Box.createRigidArea(new Dimension(1, 10)));  
RESPOSTAC = new JLabel("Digite a terceira resposta:  "){};
RESPOSTAC.setPreferredSize(new Dimension(300, 20));
RESPOSTAC.setMaximumSize(Pergunta.getPreferredSize());
RESPOSTAC.setFont(new Font("PerguntaText", Font.BOLD, 16));
RESPOSTAC.setAlignmentX(CENTER_ALIGNMENT);
painel.add(RESPOSTAC);


RESPOSTATRES = new JTextField() {};
                
RESPOSTATRES.setPreferredSize(new Dimension(600, 20));
RESPOSTATRES.setMaximumSize(PerguntaUM.getPreferredSize());
RESPOSTATRES.setFont(new Font("Pergunta", Font.BOLD, 16));
RESPOSTATRES.setAlignmentX(Component.RIGHT_ALIGNMENT);



painel.add(Box.createRigidArea(new Dimension(1, 5)));
painel.add(RESPOSTATRES);


painel.add(Box.createRigidArea(new Dimension(1, 10)));  
RESPOSTAD = new JLabel("Digite a quarta resposta: "){};
RESPOSTAD.setPreferredSize(new Dimension(300, 20));
RESPOSTAD.setMaximumSize(Pergunta.getPreferredSize());
RESPOSTAD.setFont(new Font("PerguntaText", Font.BOLD, 16));
RESPOSTAD.setAlignmentX(CENTER_ALIGNMENT);
painel.add(RESPOSTAD);


RESPOSTAQUATRO = new JTextField() {};               
RESPOSTAQUATRO.setPreferredSize(new Dimension(600, 20));
RESPOSTAQUATRO.setMaximumSize(PerguntaUM.getPreferredSize());
RESPOSTAQUATRO.setFont(new Font("Pergunta", Font.BOLD, 16));
RESPOSTAQUATRO.setAlignmentX(Component.RIGHT_ALIGNMENT);


painel.add(Box.createRigidArea(new Dimension(1, 5)));
painel.add(RESPOSTAQUATRO);


RESPOSTAE = new JLabel("Digite a quinta resposta: "){};
RESPOSTAE.setPreferredSize(new Dimension(300, 20));
RESPOSTAE.setMaximumSize(Pergunta.getPreferredSize());
RESPOSTAE.setFont(new Font("PerguntaText", Font.BOLD, 16));
RESPOSTAE.setAlignmentX(CENTER_ALIGNMENT);
painel.add(RESPOSTAE);


RESPOSTACINCO = new JTextField() {};               
RESPOSTACINCO.setPreferredSize(new Dimension(600, 10));
RESPOSTACINCO.setMaximumSize(PerguntaUM.getPreferredSize());
RESPOSTACINCO.setFont(new Font("Pergunta", Font.BOLD, 16));
RESPOSTACINCO.setAlignmentX(Component.RIGHT_ALIGNMENT);

painel.add(Box.createRigidArea(new Dimension(1, 5)));
painel.add(RESPOSTACINCO);

RESPOSTAF = new JLabel("Digite a sexta resposta: "){};
RESPOSTAF.setPreferredSize(new Dimension(300, 20));
RESPOSTAF.setMaximumSize(Pergunta.getPreferredSize());
RESPOSTAF.setFont(new Font("PerguntaText", Font.BOLD, 16));
RESPOSTAF.setAlignmentX(CENTER_ALIGNMENT);
painel.add(RESPOSTAF);


RESPOSTASEIS = new JTextField() {};               
RESPOSTASEIS.setPreferredSize(new Dimension(600, 20));
RESPOSTASEIS.setMaximumSize(PerguntaUM.getPreferredSize());
RESPOSTASEIS.setFont(new Font("Pergunta", Font.BOLD, 16));
RESPOSTASEIS.setAlignmentX(Component.RIGHT_ALIGNMENT);
painel.add(Box.createRigidArea(new Dimension(1, 5)));
painel.add(RESPOSTASEIS);


RESPOSTAG = new JLabel("Digite a sétima resposta: "){};
RESPOSTAG.setPreferredSize(new Dimension(300, 20));
RESPOSTAG.setMaximumSize(Pergunta.getPreferredSize());
RESPOSTAG.setFont(new Font("PerguntaText", Font.BOLD, 16));
RESPOSTAG.setAlignmentX(CENTER_ALIGNMENT);
painel.add(RESPOSTAG);

RESPOSTASETE = new JTextField() {};               
RESPOSTASETE.setPreferredSize(new Dimension(600, 20));
RESPOSTASETE.setMaximumSize(PerguntaUM.getPreferredSize());
RESPOSTASETE.setFont(new Font("Pergunta", Font.BOLD, 16));
RESPOSTASETE.setAlignmentX(Component.RIGHT_ALIGNMENT);;

painel.add(Box.createRigidArea(new Dimension(1, 5)));
painel.add(RESPOSTASETE);


RESPOSTAH = new JLabel("Digite a oitava resposta: "){};
RESPOSTAH.setPreferredSize(new Dimension(300, 20));
RESPOSTAH.setMaximumSize(Pergunta.getPreferredSize());
RESPOSTAH.setFont(new Font("PerguntaText", Font.BOLD, 16));
RESPOSTAH.setAlignmentX(CENTER_ALIGNMENT);
painel.add(RESPOSTAH);

RESPOSTAOITO = new JTextField() {};               
RESPOSTAOITO.setPreferredSize(new Dimension(600, 20));
RESPOSTAOITO.setMaximumSize(PerguntaUM.getPreferredSize());
RESPOSTAOITO.setFont(new Font("Pergunta", Font.BOLD, 16));
RESPOSTAOITO.setAlignmentX(Component.RIGHT_ALIGNMENT);


painel.add(Box.createRigidArea(new Dimension(1, 5)));
painel.add(RESPOSTAOITO);





RESPOSTACERTA = new JLabel("Digite elemento que será a resposta correta: ") {};
RESPOSTACERTA.setPreferredSize(new Dimension(300, 20));
RESPOSTACERTA.setMaximumSize(Pergunta.getPreferredSize());
RESPOSTACERTA.setFont(new Font("PerguntaText", Font.BOLD, 16));
RESPOSTACERTA.setAlignmentX(CENTER_ALIGNMENT);
painel.add(Box.createRigidArea(new Dimension(1, 20)));
painel.add(RESPOSTACERTA);


RESPOSTACORRETA = new JTextField() {};
RESPOSTACORRETA.setPreferredSize(new Dimension(600, 20));
RESPOSTACORRETA.setMaximumSize(PerguntaUM.getPreferredSize());
RESPOSTACORRETA.setFont(new Font("Pergunta", Font.BOLD, 16));
RESPOSTACORRETA.setAlignmentX(Component.RIGHT_ALIGNMENT);


painel.add(RESPOSTACORRETA);







//JButtons



NEXT = new JButton("Avançar");
        NEXT.setBounds(1240, 700, 300, 50);
        NEXT.setMaximumSize(NEXT.getSize());
        NEXT.setFont(new Font("Avanco", Font.BOLD, 20));
        NEXT.setVisible(true);
        NEXT.setAlignmentX(Component.LEFT_ALIGNMENT);
        NEXT.setBackground(new Color(52, 235, 143));
        NEXT.setForeground(new Color(255, 255, 255));

        JButton VOLTAR = new JButton("Retornar");
        VOLTAR.setBounds(1, 700, 300, 50);
        VOLTAR.setMaximumSize(VOLTAR.getSize());
        VOLTAR.setFont(new Font("Retorno", Font.BOLD, 20));
        VOLTAR.setAlignmentX(Component.LEFT_ALIGNMENT);
        VOLTAR.setBackground(new Color(255, 0, 0));
        VOLTAR.setForeground(new Color(255, 255, 255));

        
        

        painel.add(NEXT);
        painel.add(Box.createRigidArea(new Dimension(10, 0))); // Espaço entre os botões
        painel.add(VOLTAR);

        painel.add(Box.createRigidArea(new Dimension(1, 40))); // Espaço entre o painel e outros componentes
        painel.add(NEXT);
        painel.add(Box.createRigidArea(new Dimension(1, 40))); // Espaço entre NEXT e VOLTAR
        painel.add(VOLTAR);




        prof.add(painel, BorderLayout.CENTER);
        Container lindo = getContentPane();
        lindo.add(prof);
        setSize(1366, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    

}




public static void main(String[] args) {
    NIVELTRESDIFICIL p1 = new NIVELTRESDIFICIL();
    }
    

    }