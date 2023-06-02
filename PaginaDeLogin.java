import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaginaDeLogin extends JFrame implements ActionListener {
    private ImageIcon Logo;
    private JLabel logo;
    JButton Entrar;
    JButton Criar_Conta;
    JTextField Email;
    JLabel SemConta;

    PaginaDeLogin() {
        JPanel TelaDeLogin = new JPanel(new BorderLayout());
        TelaDeLogin.setBackground(new Color(217, 255, 180));
        ImageIcon Logo = new ImageIcon(getClass().getResource("image.png"));
        Image image = Logo.getImage().getScaledInstance(500, 350, Image.SCALE_SMOOTH);
        Logo = new ImageIcon(image);
        JLabel logo = new JLabel(Logo);
        logo.setSize(242, 160);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        TelaDeLogin.add(logo);

        JPanel painel = new JPanel();
        BoxLayout design = new BoxLayout(painel, BoxLayout.Y_AXIS);
        painel.setLayout(design);
        painel.setBackground(new Color(217, 255, 180));

        // Espaço vertical rígido no topo do painel
        painel.add(Box.createRigidArea(new Dimension(1, 50)));

        Email = new JTextField() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (getText().isEmpty() && !hasFocus()) {
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setColor(Color.GRAY);
                    g2d.setFont(new Font("Felicidade", Font.BOLD, 30));
                    g2d.drawString("Email:", 10, 30);
                }
            }
        };

        Email.setPreferredSize(new Dimension(505, 50));
        Email.setMaximumSize(Email.getPreferredSize());
        Email.setFont(new Font("Felicidade", Font.BOLD, 30));
        Email.setAlignmentX(CENTER_ALIGNMENT);

        Email.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (Email.getText().equals("Email:")) {
                    Email.setText("");
                    Email.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (Email.getText().isEmpty()) {
                    Email.setText("Email:");
                    Email.setForeground(Color.GRAY);
                }
            }
        });

        // Espaço vertical rígido antes do campo de email
        painel.add(Box.createRigidArea(new Dimension(1, 20)));
        painel.add(Email);
        painel.add(Box.createRigidArea(new Dimension(1, 20)));

        Entrar = new JButton("Entrar") {{
            setSize(500, 75);
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setBackground(new Color(52, 235, 143));
            setForeground(new Color(255, 255, 255));
            setFont(new Font("Felicidade", Font.BOLD, 30));
            setFocusPainted(false);
            setBorderPainted(false);
            addActionListener(PaginaDeLogin.this); // Adiciona o ouvinte de ação ao botão
        }};

        // Espaço vertical rígido antes do botão "Entrar"
        painel.add(Box.createRigidArea(new Dimension(1, 20)));
        painel.add(Entrar);
        painel.add(Box.createRigidArea(new Dimension(1, 20)));

        SemConta = new JLabel("Esqueceu o usuário ?") {{
            setSize(320, 1);
            setMaximumSize(getSize());
            setFont(new Font("Felicidade", Font.BOLD, 24)); // Alterar o tamanho da fonte para 24
            setAlignmentX(CENTER_ALIGNMENT);
        }};

        // Espaço vertical rígido antes do rótulo "esqueceu o usuário ?"
        painel.add(Box.createRigidArea(new Dimension(1, 20)));
        painel.add(Box.createVerticalGlue());
        painel.add(SemConta);
        painel.add(Box.createVerticalGlue());
        painel.add(Box.createRigidArea(new Dimension(1, 20)));

        Criar_Conta = new JButton("Criar conta") {{
            setSize(500, 75);
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setBackground(new Color(121, 229, 255));
            setForeground(new Color(255, 255, 255));
            setFont(new Font("Felicidade", Font.BOLD, 30));
            setFocusPainted(false);
            setBorderPainted(false);
            addActionListener(PaginaDeLogin.this); // Adiciona o ouvinte de ação ao botão
        }};

        // Espaço vertical rígido antes do botão "Criar conta"
        painel.add(Box.createRigidArea(new Dimension(1, 20)));
        painel.add(Criar_Conta);

        TelaDeLogin.add(painel, BorderLayout.SOUTH);
        Container lindo = getContentPane();
        lindo.add(TelaDeLogin);
        setSize(1366, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Entrar) {
            if (Email.getText().isEmpty() || Email.getText().equals("Email:")) {
                JOptionPane.showMessageDialog(this, "Por favor, insira seu e-mail.", "Login", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Login Efetuado com Sucesso", "Login", JOptionPane.PLAIN_MESSAGE);
            }
        }
    
        if (e.getSource() == Criar_Conta) {
            JOptionPane.showMessageDialog(this, "Crie sua conta abaixo", "Cadastro", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    
    

    public static void main(String[] args) {
        new PaginaDeLogin();
    }
}
