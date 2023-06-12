import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;



import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

public class Rank extends JFrame implements ActionListener{

    private JButton menu;
    private JLabel logo;
    private ImageIcon imgLogo;
    private JTable tabelaRank;



    public Rank(){
        super("PyPIPair");
        // Painel
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
        
        //Atributos do botão menu
        menu = new JButton("MENU"){{
            setBackground(new Color(245, 156, 2));
            setSize(2000, 50);
            setFont(new Font("Roboto", Font.BOLD, 30));
            setMaximumSize(getSize());
            setMinimumSize(getSize());
            setFocusPainted(false);
            setBorderPainted(true);
        }};
        menu.addActionListener(this);


        painelTopo.add(logo);
        painelTopo.add(Box.createHorizontalGlue());
        painelTopo.add(menu);
        painelTopo.add(Box.createRigidArea(new Dimension(20, 0)));
        
        JPanel painelRank = new JPanel();
        BoxLayout caixaRank = new BoxLayout(painelRank,BoxLayout.Y_AXIS);
        painelRank.setLayout(caixaRank);
        painelRank.add(Box.createRigidArea(new Dimension(0, 30)));
        painelRank.add(new JLabel("Ranking"){{
            setFont(new Font("Roboto", Font.BOLD, 60));
            setAlignmentX(CENTER_ALIGNMENT);
        }});
        painelRank.add(Box.createRigidArea(new Dimension(0, 30)));

        //Trocar por loop que obtém dados do banco de dados para montar a tabela
        String[][] dados = {
            {"1", "1","Juninho", "10000"},
            {"1", "2", "Jaiminho", "9000"}
        };

        String[] colunas = {"Nivel", "Ranking", "Nome", "Pontuação"};
        tabelaRank = new JTable(dados, colunas);
        tabelaRank.setRowHeight(50);
        tabelaRank.setFont(new Font("Roboto", Font.BOLD, 30));
        tabelaRank.setBackground(new Color(183,215,240,255));
        painelRank.add(new JScrollPane(tabelaRank));
        painelRank.setBackground(new Color(217, 255, 180));




        tabelaRank.getTableHeader().setBackground(new Color(178,234,194,255));
        //Centralizar o texto da tabela
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        tabelaRank.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tabelaRank.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tabelaRank.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tabelaRank.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);

        


        //Finalizando
        painel.add(painelTopo, BorderLayout.NORTH);
        painel.add(Box.createRigidArea(new Dimension(133, 0)), BorderLayout.EAST);
        painel.add(Box.createRigidArea(new Dimension(133, 0)), BorderLayout.WEST);
        painel.add(Box.createRigidArea(new Dimension(0, 80)), BorderLayout.SOUTH);
        painel.add(painelRank, BorderLayout.CENTER);
        Container caixa = getContentPane(); 
        caixa.add(painel);
        setSize(1366, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }






    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menu) {
            this.setVisible(false);
            new TelaInicial();
        }
    }
}