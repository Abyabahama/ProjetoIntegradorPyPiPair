import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro extends JFrame implements ActionListener {
    
    private JLabel logo;
    private ImageIcon imgLogo;
    JButton buttonCadastrar;
    JTextField textUsuario;
    JTextField textNome;
    JTextField textEmail;
    JTextField confirmarEmail;

    TelaCadastro() {
        JPanel painelTelaCadastro = new JPanel(new BorderLayout());
        painelTelaCadastro.setBackground(new Color(217, 255, 180));
        
        imgLogo = new ImageIcon("CobraLogo.png");
        logo = new JLabel(imgLogo);
        logo.setPreferredSize(new Dimension(202, 202));
        painelTelaCadastro.add(logo, BorderLayout.NORTH);
        
        JPanel painelCadastro = new JPanel();
        BoxLayout caixaCadastro = new BoxLayout(painelCadastro, BoxLayout.Y_AXIS);
        painelCadastro.setLayout(caixaCadastro);
        painelCadastro.setBackground(new Color(217, 255, 180));
        painelTelaCadastro.add(painelCadastro, BorderLayout.CENTER);

        JLabel textCadastro = new JLabel() {{
            setSize(new Dimension(500, 50));
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setText("Criar Conta");
            setFont(new Font("Poppins", Font.BOLD, 60));
        }};

        textUsuario = new JTextField("Usuário(RA)") {{
            setSize(new Dimension(500, 50));
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setFont(new Font("Inter", Font.PLAIN, 20));
            addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusGained(java.awt.event.FocusEvent evt) {
                    if (getText().equals("Usuário(RA)")) {
                        setText("");
                    }
                }
                public void focusLost(java.awt.event.FocusEvent evt) {
                    if (getText().isEmpty()) {
                        setText("Usuário(RA)");
                    }
                }
            });
        }};
    
        textNome = new JTextField("Nome") {{
            setSize(new Dimension(500, 50));
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setFont(new Font("Inter", Font.PLAIN, 20));
            addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusGained(java.awt.event.FocusEvent evt) {
                    if (getText().equals("Nome")) {
                        setText("");
                    }
                }
                public void focusLost(java.awt.event.FocusEvent evt) {
                    if (getText().isEmpty()) {
                        setText("Nome");
                    }
                }
            });
        }};
        
        textEmail = new JTextField("E-mail") {{
            setSize(new Dimension(500, 50));
            setMaximumSize(getSize());
            setAlignmentX(CENTER_ALIGNMENT);
            setFont(new Font("Inter", Font.PLAIN, 20));
            addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusGained(java.awt.event.FocusEvent evt) {
                    if (getText().equals("E-mail")) {
                        setText("");
                    }
                }
                public void focusLost(java.awt.event.FocusEvent evt) {
                    if (getText().isEmpty()) {
                        setText("E-mail");
                    }
                }
            });
        }};
        
        confirmarEmail = new JTextField("Confirmar e-mail") {{
            setSize(new Dimension(500, 50));
            setMaximumSize(getSize());
            setAlignmentY(CENTER_ALIGNMENT);
            setFont(new Font("Inter", Font.PLAIN, 20));
            addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusGained(java.awt.event.FocusEvent evt) {
                    if (getText().equals("Confirmar e-mail")) {
                        setText("");
                    }
                }
                public void focusLost(java.awt.event.FocusEvent evt) {
                    if (getText().isEmpty()) {
                        setText("Confirmar e-mail");
                    }
                }
            });
        }};

        buttonCadastrar = new JButton("Cadastrar");
        buttonCadastrar.setPreferredSize(new Dimension(500, 75));
        buttonCadastrar.setMaximumSize(buttonCadastrar.getPreferredSize());
        buttonCadastrar.setAlignmentX(CENTER_ALIGNMENT);
        buttonCadastrar.setBackground(new Color(127, 187, 243));
        buttonCadastrar.setFont(new Font("Poppins", Font.BOLD, 30));
        buttonCadastrar.setForeground(Color.white);
        buttonCadastrar.setFocusPainted(false);
        buttonCadastrar.setBorderPainted(false);
        buttonCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = textUsuario.getText().trim();
                String nome = textNome.getText().trim();
                String email = textEmail.getText().trim();
                String confirmarEmailText = confirmarEmail.getText().trim();
        
                if (usuario.isEmpty() || nome.isEmpty() || email.isEmpty() || confirmarEmailText.isEmpty()) {
                    JOptionPane.showMessageDialog(TelaCadastro.this,
                            "Por favor, preencha todos os campos.",
                            "Campos obrigatórios vazios",
                            JOptionPane.WARNING_MESSAGE);
                } else if (!email.equals(confirmarEmailText)) {
                    JOptionPane.showMessageDialog(TelaCadastro.this,
                            "Os campos de e-mail não coincidem.",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(TelaCadastro.this,
                            "Conta criada com sucesso!",
                            "Status do Cadastro",
                            JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        

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

        painelTelaCadastro.add(painelCadastro, BorderLayout.CENTER);

        Container caixa = getContentPane();
        caixa.add(painelTelaCadastro);

        setSize(1366, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonCadastrar) {
            JOptionPane.showMessageDialog(this, "Conta Criada com Sucesso", "Status Cadastro", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
