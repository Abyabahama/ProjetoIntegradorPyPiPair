package TrabalhoIntegrador;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;




public class NIVELQUATROMEDIO extends JFrame {
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
    JButton NEXT;
    JButton VOLTAR;


 NIVELQUATROMEDIO() {
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
 Dificuldade = new JLabel("Dificuldade : Médio"){};
Dificuldade.setPreferredSize(new Dimension(300, 20));
Dificuldade.setMaximumSize(Dificuldade.getPreferredSize());
Dificuldade.setFont(new Font("PerguntaText", Font.BOLD, 16));
Dificuldade.setAlignmentX(CENTER_ALIGNMENT);
painel.add(Dificuldade);



            Pergunta = new JLabel("Digite a quarta pergunta :") {};

Pergunta.setPreferredSize(new Dimension(300, 20));
Pergunta.setMaximumSize(Pergunta.getPreferredSize());
Pergunta.setFont(new Font("PerguntaText", Font.BOLD, 16));
Pergunta.setAlignmentX(CENTER_ALIGNMENT);
            
        
 painel.add(Box.createRigidArea(new Dimension(1, 20)));
 painel.add(Pergunta);
               
            
PerguntaUM = new JTextField() {};

PerguntaUM.setPreferredSize(new Dimension(300, 20));
PerguntaUM.setMaximumSize(PerguntaUM.getPreferredSize());
PerguntaUM.setFont(new Font("Pergunta", Font.BOLD, 16));
PerguntaUM.setAlignmentX(CENTER_ALIGNMENT);










//override textbox PerguntaUM

PerguntaUM.addFocusListener(new FocusAdapter() {
            @Override
public void focusGained(FocusEvent e) {
if (PerguntaUM.getText().equals("Pergunta : ")) {
 PerguntaUM.setText("");
 PerguntaUM.setForeground(Color.BLACK);
}
}

            @Override
public void focusLost(FocusEvent e) {
if (PerguntaUM.getText().isEmpty()) {
 PerguntaUM.setText("Pergunta : ");
 PerguntaUM.setForeground(Color.GRAY);
 }
}
});


painel.add(PerguntaUM);
painel.add(Box.createRigidArea(new Dimension(1, 20)));
                
  

    

SEISRESPOSTAS = new JLabel("Digite 6 pares de respostas : "){};

SEISRESPOSTAS.setPreferredSize(new Dimension(300, 20));
SEISRESPOSTAS.setMaximumSize(Pergunta.getPreferredSize());
SEISRESPOSTAS.setFont(new Font("PerguntaText", Font.BOLD, 16));
SEISRESPOSTAS.setAlignmentX(CENTER_ALIGNMENT);
painel.add(SEISRESPOSTAS);

painel.add(Box.createRigidArea(new Dimension(1, 40)));  
RESPOSTAA = new JLabel("Digite o primeiro par de resposta : "){};
RESPOSTAA.setPreferredSize(new Dimension(300, 20));
RESPOSTAA.setMaximumSize(Pergunta.getPreferredSize());
RESPOSTAA.setFont(new Font("PerguntaText", Font.BOLD, 16));
RESPOSTAA.setAlignmentX(CENTER_ALIGNMENT);
painel.add(RESPOSTAA);


RESPOSTAUM = new JTextField() {};
                
RESPOSTAUM.setPreferredSize(new Dimension(300, 20));
RESPOSTAUM.setMaximumSize(PerguntaUM.getPreferredSize());
RESPOSTAUM.setFont(new Font("Pergunta", Font.BOLD, 16));
RESPOSTAUM.setAlignmentX(CENTER_ALIGNMENT);





//override JtextField RESPOSTAUM

RESPOSTAUM.addFocusListener(new FocusAdapter() {
            @Override
public void focusGained(FocusEvent e) {
if (RESPOSTAUM.getText().equals("Digite o par de resposta desejado : ")) {
 RESPOSTAUM.setText("");
 RESPOSTAUM.setForeground(Color.BLACK);
}
}

            @Override
public void focusLost(FocusEvent e) {
if (RESPOSTAUM.getText().isEmpty()) {
 RESPOSTAUM.setText("Digite o par de resposta desejado : ");
 RESPOSTAUM.setForeground(Color.GRAY);
 }
}
});



painel.add(RESPOSTAUM);

painel.add(Box.createRigidArea(new Dimension(1, 10)));  
RESPOSTAB = new JLabel("Digite o segundo par de resposta : "){};
RESPOSTAB.setPreferredSize(new Dimension(300, 20));
RESPOSTAB.setMaximumSize(Pergunta.getPreferredSize());
RESPOSTAB.setFont(new Font("PerguntaText", Font.BOLD, 16));
RESPOSTAB.setAlignmentX(CENTER_ALIGNMENT);
painel.add(RESPOSTAB);


RESPOSTADOIS = new JTextField() {};
                
RESPOSTADOIS.setPreferredSize(new Dimension(300, 20));
RESPOSTADOIS.setMaximumSize(PerguntaUM.getPreferredSize());
RESPOSTADOIS.setFont(new Font("Pergunta", Font.BOLD, 16));
RESPOSTADOIS.setAlignmentX(CENTER_ALIGNMENT);








//override RESPOSTADOIS

RESPOSTADOIS.addFocusListener(new FocusAdapter() {
            @Override
public void focusGained(FocusEvent e) {
if (RESPOSTADOIS.getText().equals("Digite o par de resposta desejado : ")) {
 RESPOSTADOIS.setText("");
 RESPOSTADOIS.setForeground(Color.BLACK);
}
}

            @Override
public void focusLost(FocusEvent e) {
if (RESPOSTADOIS.getText().isEmpty()) {
 RESPOSTADOIS.setText("Digite o par de resposta desejado : ");
 RESPOSTADOIS.setForeground(Color.GRAY);
 }
}
});


painel.add(Box.createRigidArea(new Dimension(1, 5)));
painel.add(RESPOSTADOIS);


painel.add(Box.createRigidArea(new Dimension(1, 10)));  
RESPOSTAC = new JLabel("Digite o terceiro par de resposta : "){};
RESPOSTAC.setPreferredSize(new Dimension(300, 20));
RESPOSTAC.setMaximumSize(Pergunta.getPreferredSize());
RESPOSTAC.setFont(new Font("PerguntaText", Font.BOLD, 16));
RESPOSTAC.setAlignmentX(CENTER_ALIGNMENT);
painel.add(RESPOSTAC);


RESPOSTATRES = new JTextField() {};
                
RESPOSTATRES.setPreferredSize(new Dimension(300, 20));
RESPOSTATRES.setMaximumSize(PerguntaUM.getPreferredSize());
RESPOSTATRES.setFont(new Font("Pergunta", Font.BOLD, 16));
RESPOSTATRES.setAlignmentX(CENTER_ALIGNMENT);









//override RESPOSTATRES

RESPOSTATRES.addFocusListener(new FocusAdapter() {
            @Override
public void focusGained(FocusEvent e) {
if (RESPOSTATRES.getText().equals("Digite o par de resposta desejado : ")) {
 RESPOSTATRES.setText("");
 RESPOSTATRES.setForeground(Color.BLACK);
}
}

            @Override
public void focusLost(FocusEvent e) {
if (RESPOSTATRES.getText().isEmpty()) {
 RESPOSTATRES.setText("Digite o par de resposta desejado : ");
 RESPOSTATRES.setForeground(Color.GRAY);
 }
}
});



painel.add(Box.createRigidArea(new Dimension(1, 5)));
painel.add(RESPOSTATRES);


painel.add(Box.createRigidArea(new Dimension(1, 10)));  
RESPOSTAD = new JLabel("Digite o quarto par de resposta : "){};
RESPOSTAD.setPreferredSize(new Dimension(300, 20));
RESPOSTAD.setMaximumSize(Pergunta.getPreferredSize());
RESPOSTAD.setFont(new Font("PerguntaText", Font.BOLD, 16));
RESPOSTAD.setAlignmentX(CENTER_ALIGNMENT);
painel.add(RESPOSTAD);


RESPOSTAQUATRO = new JTextField() {};               
RESPOSTAQUATRO.setPreferredSize(new Dimension(300, 20));
RESPOSTAQUATRO.setMaximumSize(PerguntaUM.getPreferredSize());
RESPOSTAQUATRO.setFont(new Font("Pergunta", Font.BOLD, 16));
RESPOSTAQUATRO.setAlignmentX(CENTER_ALIGNMENT);









//override RESPOSTAQUATRO

RESPOSTAQUATRO.addFocusListener(new FocusAdapter() {
            @Override
public void focusGained(FocusEvent e) {
if (RESPOSTAQUATRO.getText().equals("Digite o par de resposta desejado : ")) {
 RESPOSTAQUATRO.setText("");
 RESPOSTAQUATRO.setForeground(Color.BLACK);
}
}

            @Override
public void focusLost(FocusEvent e) {
if (RESPOSTAQUATRO.getText().isEmpty()) {
 RESPOSTAQUATRO.setText("Digite o par de resposta desejado : ");
 RESPOSTAQUATRO.setForeground(Color.GRAY);
 }
}
});




painel.add(Box.createRigidArea(new Dimension(1, 5)));
painel.add(RESPOSTAQUATRO);


RESPOSTAE = new JLabel("Digite o quinto par de resposta : "){};
RESPOSTAE.setPreferredSize(new Dimension(300, 20));
RESPOSTAE.setMaximumSize(Pergunta.getPreferredSize());
RESPOSTAE.setFont(new Font("PerguntaText", Font.BOLD, 16));
RESPOSTAE.setAlignmentX(CENTER_ALIGNMENT);
painel.add(RESPOSTAE);


RESPOSTACINCO = new JTextField() {};               
RESPOSTACINCO.setPreferredSize(new Dimension(300, 20));
RESPOSTACINCO.setMaximumSize(PerguntaUM.getPreferredSize());
RESPOSTACINCO.setFont(new Font("Pergunta", Font.BOLD, 16));
RESPOSTACINCO.setAlignmentX(CENTER_ALIGNMENT);

//override RESPOSTACINCO

RESPOSTACINCO.addFocusListener(new FocusAdapter() {
            @Override
public void focusGained(FocusEvent e) {
if (RESPOSTACINCO.getText().equals("Digite o par de resposta desejado : ")) {
 RESPOSTACINCO.setText("");
 RESPOSTACINCO.setForeground(Color.BLACK);
}
}

            @Override
public void focusLost(FocusEvent e) {
if (RESPOSTACINCO.getText().isEmpty()) {
 RESPOSTACINCO.setText("Digite o par de resposta desejado : ");
 RESPOSTACINCO.setForeground(Color.GRAY);
 }
}
});


painel.add(Box.createRigidArea(new Dimension(1, 5)));
painel.add(RESPOSTACINCO);

RESPOSTAF = new JLabel("Digite o sexto par de resposta : "){};
RESPOSTAF.setPreferredSize(new Dimension(300, 20));
RESPOSTAF.setMaximumSize(Pergunta.getPreferredSize());
RESPOSTAF.setFont(new Font("PerguntaText", Font.BOLD, 16));
RESPOSTAF.setAlignmentX(CENTER_ALIGNMENT);
painel.add(RESPOSTAF);


RESPOSTASEIS = new JTextField() {};               
RESPOSTASEIS.setPreferredSize(new Dimension(300, 20));
RESPOSTASEIS.setMaximumSize(PerguntaUM.getPreferredSize());
RESPOSTASEIS.setFont(new Font("Pergunta", Font.BOLD, 16));
RESPOSTASEIS.setAlignmentX(CENTER_ALIGNMENT);

//override RESPOSTASEIS

RESPOSTASEIS.addFocusListener(new FocusAdapter() {
            @Override
public void focusGained(FocusEvent e) {
if (RESPOSTASEIS.getText().equals("Digite o par de resposta desejado : ")) {
 RESPOSTASEIS.setText("");
 RESPOSTASEIS.setForeground(Color.BLACK);
}
}

            @Override
public void focusLost(FocusEvent e) {
if (RESPOSTASEIS.getText().isEmpty()) {
 RESPOSTASEIS.setText("Digite o par de resposta desejado : ");
 RESPOSTASEIS.setForeground(Color.GRAY);
 }
}
});

painel.add(Box.createRigidArea(new Dimension(1, 5)));
painel.add(RESPOSTASEIS);






RESPOSTACERTA = new JLabel("Digite o par que seja a resposta certa : ") {};
RESPOSTACERTA.setPreferredSize(new Dimension(300, 20));
RESPOSTACERTA.setMaximumSize(Pergunta.getPreferredSize());
RESPOSTACERTA.setFont(new Font("PerguntaText", Font.BOLD, 16));
RESPOSTACERTA.setAlignmentX(CENTER_ALIGNMENT);
painel.add(Box.createRigidArea(new Dimension(1, 20)));
painel.add(RESPOSTACERTA);


RESPOSTACORRETA = new JTextField() {};
RESPOSTACORRETA.setPreferredSize(new Dimension(300, 20));
RESPOSTACORRETA.setMaximumSize(PerguntaUM.getPreferredSize());
RESPOSTACORRETA.setFont(new Font("Pergunta", Font.BOLD, 16));
RESPOSTACORRETA.setAlignmentX(CENTER_ALIGNMENT);









//override RESPOSTACORRETA

RESPOSTACORRETA.addFocusListener(new FocusAdapter() {
            @Override
public void focusGained(FocusEvent e) {
if (RESPOSTACORRETA.getText().equals("Par de resposta correto desejado : ")) {
 RESPOSTACORRETA.setText("");
 RESPOSTACORRETA.setForeground(Color.BLACK);
}
}

            @Override
public void focusLost(FocusEvent e) {
if (RESPOSTACORRETA.getText().isEmpty()) {
 RESPOSTACORRETA.setText("Par de resposta correto desejado : ");
 RESPOSTACORRETA.setForeground(Color.GRAY);
 }
}
});

painel.add(RESPOSTACORRETA);














//JButtons
painel.add(Box.createRigidArea(new Dimension(1, 40)));
NEXT = new JButton("avancar"){{

setBounds(1240,700,300,50);
setMaximumSize(getSize());
setFont(new Font("Avanco", Font.BOLD, 20));
setVisible(true);
setAlignmentX(CENTER_ALIGNMENT);
setBackground(new Color(52, 235, 143));
setForeground(new Color(255, 255, 255));

}};


painel.add(Box.createRigidArea(new Dimension(1, 40)));

VOLTAR = new JButton("retornar"){{
setBounds(1,700,300,50);
setMaximumSize(getSize());
setFont(new Font("Retorno", Font.BOLD, 20));
setAlignmentX(CENTER_ALIGNMENT);
setBackground(new Color(255, 0, 0));
setForeground(new Color(255, 255, 255));


}};


painel.add(NEXT);
painel.add(Box.createRigidArea(new Dimension(1, 40)));
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
    NIVELQUATROMEDIO p1 = new NIVELQUATROMEDIO();
    }
    

    }