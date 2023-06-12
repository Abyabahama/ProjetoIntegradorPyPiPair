import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument.Content;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.*;
import java.awt.event.*;




public class NIVELTRESFACIL extends JFrame {
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
    JTextField RESPOSTACORRETA;
    JLabel Dificuldade;
    JLabel Pergunta;
    JLabel QUATRORESPOSTAS;
    JLabel RESPOSTACERTA;
    JLabel RESPOSTAA;
    JLabel RESPOSTAB;
    JLabel RESPOSTAC;
    JLabel RESPOSTAD;
    JButton NEXT;
    JButton VOLTAR;
    String respostaUM;
    String respostaDOIS;
    String resposta3;
    String respostaQUATRO;
    String respostaCERTA;
    String pergunta;


 NIVELTRESFACIL() {
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
 Dificuldade = new JLabel("Dificuldade : Fácil"){};
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
                
  

    

QUATRORESPOSTAS = new JLabel("Digite apenas um elemento do par: "){};

QUATRORESPOSTAS.setPreferredSize(new Dimension(1000, 20));
QUATRORESPOSTAS.setMaximumSize(Pergunta.getPreferredSize());
QUATRORESPOSTAS.setFont(new Font("PerguntaText", Font.BOLD, 16));
QUATRORESPOSTAS.setAlignmentX(CENTER_ALIGNMENT);
painel.add(QUATRORESPOSTAS);

painel.add(Box.createRigidArea(new Dimension(1, 40)));  
RESPOSTAA = new JLabel("Digite a primeira resposta : "){};
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
RESPOSTAB = new JLabel("Digite a segunda resposta : "){};
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
RESPOSTAC = new JLabel("Digite a terceira resposta: "){};
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


RESPOSTACERTA = new JLabel("Digite o elemento que será o correto: ") {};
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









//override RESPOSTACORRETA

RESPOSTACORRETA.addFocusListener(new FocusAdapter() {
            @Override
public void focusGained(FocusEvent e) {
if (RESPOSTACORRETA.getText().equals("Digite um elemento da resposta:")) {
 RESPOSTACORRETA.setText("");
 RESPOSTACORRETA.setForeground(Color.BLACK);
}
}

            @Override
public void focusLost(FocusEvent e) {
if (RESPOSTACORRETA.getText().isEmpty()) {
 RESPOSTACORRETA.setText("Digite um elemento da resposta:");
 RESPOSTACORRETA.setForeground(Color.GRAY);
 }
}
});



painel.add(Box.createRigidArea(new Dimension(1, 5)));
painel.add(RESPOSTACORRETA);






//JButtons
painel.add(Box.createRigidArea(new Dimension(1, 40)));
NEXT = new JButton("Avançar"){{

setBounds(1240,700,300,50);
setMaximumSize(getSize());
setFont(new Font("Avanco", Font.BOLD, 20));
setVisible(true);
setAlignmentX(CENTER_ALIGNMENT);
setBackground(new Color(52, 235, 143));
setForeground(new Color(255, 255, 255));

NIVELUMMEDIO nivelummedio = new NIVELUMMEDIO();
                    nivelummedio.setVisible(true);
                    dispose();

}};






NEXT.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
         pergunta = PerguntaUM.getText();
         respostaUM = RESPOSTAUM.getText();
         respostaDOIS = RESPOSTADOIS.getText();
         resposta3 = RESPOSTATRES.getText();
         respostaQUATRO = RESPOSTAQUATRO.getText();
         respostaCERTA = RESPOSTACERTA.getText();

        

        // Conexão com o banco de dados
        Connection conexao = Conexao.getConexao();

        try {
            // Inserir a pergunta no banco de dados
            String sql = "INSERT INTO questoes (enunciado) VALUES (?)";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, pergunta);
            statement.executeUpdate();
            statement.close();

            // Realizar outras ações após a inserção da pergunta

        } catch (SQLException ex) {
            ex.printStackTrace();
            // Tratar a exceção adequadamente
        } finally {
            // Fechar a conexão com o banco de dados
            Conexao.fecharConexao(conexao);
        }
    }
});


painel.add(Box.createRigidArea(new Dimension(1, 20)));

VOLTAR = new JButton("Retornar"){{
setBounds(1,700,300,50);
setMaximumSize(getSize());
setFont(new Font("Retorno", Font.BOLD, 20));
setAlignmentX(CENTER_ALIGNMENT);
setBackground(new Color(255, 0, 0));
setForeground(new Color(255, 255, 255));


}};


painel.add(NEXT);
painel.add(Box.createRigidArea(new Dimension(1, 10)));
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
    NIVELTRESFACIL p1 = new NIVELTRESFACIL();
    }
    

    }