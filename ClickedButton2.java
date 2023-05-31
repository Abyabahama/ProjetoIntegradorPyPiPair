public class ClickedButton2 {
    private Carta carta1;
    private Carta carta2;

    public void setCarta1(Carta carta1) {
        this.carta1 = carta1;
    }

    public void setCarta2(Carta carta2) {
        this.carta2 = carta2;
    }

    public Carta getCarta1() {
        return carta1;
    }

    public Carta getCarta2() {
        return carta2;
    }

    public boolean verificarPar() {
        if (carta1 != null && carta2 != null) {
            if (carta1.getResposta().equals("float") && carta2.getResposta().equals("float")) {
                // Par correto com a resposta "for"
                return true;
            } else {
                // Par incorreto
                return false;
            }
        
        }
        return false;
    }

    public void desvirarCartas() {
        if (carta1 != null && carta2 != null) {
            carta1.virarCarta();
            carta2.virarCarta();
            carta1 = null;
            carta2 = null;
        }
    }
}


