import javax.swing.*;
import java.awt.*;


public class Carta extends JButton{

private String resposta;


public Carta(String resposta){

    this.resposta = resposta;

    }


public String getResposta(){
    return resposta;
}

public void setResposta(String resposta){
    this.resposta = resposta;
}

public void VirarCarta(){
 setText(resposta);

}

public void DesvirarCarta(){
    setText("");
}






}
