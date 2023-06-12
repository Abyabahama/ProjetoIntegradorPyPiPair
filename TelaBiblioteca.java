import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.management.ManagementFactory;


public class TelaBiblioteca extends JFrame implements ActionListener{

    private JButton menu;
    private JLabel logo;
    private ImageIcon imgLogo;

    public TelaBiblioteca(){

        super("PyPIPair");

        JPanel painel = new JPanel( new BorderLayout());
        painel.setBackground(new Color(217, 255, 180));

        JPanel painelTopo = new JPanel();
        painelTopo.setBackground((new Color(217, 255, 180)));
        BoxLayout caixaTopo = new BoxLayout(painelTopo, BoxLayout.X_AXIS);

        imgLogo = new ImageIcon("CObraLogo - Copy.png");
        logo = new JLabel(imgLogo);
        logo.setSize(227,150);
        painelTopo.setLayout(caixaTopo);
        painelTopo.add(logo);
        painelTopo.add(Box.createHorizontalGlue());


        menu = new JButton("MENU"){{
            setBackground(new Color(245,156,2));
            setSize(2000,50);
            setFont(new Font("Roboto", Font.BOLD, 30));
            setMaximumSize(getSize());
            setMinimumSize(getSize());
            setFocusPainted(false);
        }};

        menu.addActionListener(this);

        painelTopo.add(menu);
        painelTopo.add(Box.createRigidArea(new Dimension(20, 0)));
        painel.add(painelTopo, BorderLayout.NORTH);


        JPanel painelBiblioteca = new JPanel(new BorderLayout());
        painelBiblioteca.setBackground(new Color(217, 255, 180));
        int margem = 50;
        painelBiblioteca.setBorder(new EmptyBorder(margem, margem, margem, margem));

        JLabel tituloBiblioteca = new JLabel("Biblioteca"){{
            setFont(new Font("Roboto", Font.BOLD, 60));
        }};

        JTextArea textBiblioteca = new JTextArea(){{
           setBackground(new Color(217, 255, 180));
            setFont(new Font("Roboto", Font.BOLD, 30));
            setSize(500,500);
            setLineWrap(true);
            setWrapStyleWord(true);
            setEditable(false);

        }};

            String text = "FLUXOGRAMAS:\n"+"\n"+"Existem vários tipos de símbolos usados em fluxogramas, cada um com um significado específico. Alguns dos símbolos comuns incluem:\n" +
            "1. O retângulo: representa uma etapa ou ação no processo.\n" +
            "2. O losango: indica uma decisão a ser tomada, geralmente com uma pergunta sim/não.\n" +
            "3. O círculo: representa o início ou o fim do processo.\n" +
            "4. A seta: mostra a direção do fluxo do processo.\n"+
            "Os fluxogramas são amplamente utilizados em diversas áreas, como engenharia, programação, gestão de projetos, análise de processos, entre outras.";


            textBiblioteca.setText(text);

        painelBiblioteca.add(tituloBiblioteca,BorderLayout.NORTH);
        painelBiblioteca.add(textBiblioteca, BorderLayout.CENTER); 
        painel.add(painelBiblioteca, BorderLayout.CENTER);
    
        Container caixa = getContentPane();
        caixa.add(painel);

        setSize(1366, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == menu){
            this.setVisible(false);
            new TelaInicial();

        }
    }

    
}
