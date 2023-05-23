import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Carta extends JButton{
    private String resposta;
    private boolean virada;

    
    Carta(String resposta) {
        super("Verso");
        this.resposta = resposta;
        setBackground(new Color(207, 54, 196));
        setForeground(new Color(222, 203, 35));
        virada = true;

        setFocusPainted(false);
        setFont(new Font("Roboto", Font.BOLD, 30));
        setBorder(BorderFactory.createLineBorder(new Color(222, 203, 35), 3, true));
    }

    public boolean isVirada() {
        return virada;
    }

    public void setVirada(boolean virada) {
        this.virada = virada;
    }
    
    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    

    public void virarCarta() {
    if (virada == true) {
        setText(resposta);
        setVirada(false);
    }
    else {
        setText("Verso");
        setVirada(true);
    }
    }


}