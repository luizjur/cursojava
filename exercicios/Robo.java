package exercicios;

public class Robo { // nome de classe 1 maiusculo

    private int x, y;

    public Robo() { // só é feito uma unica vez

        x = 0;
        y = 0;
    }

    public int getX (){
        return x;
    }

    public int getY (){
        return y;
    }

    public void andar(char posicao, char movimento) {
        if (posicao == 'h' && movimento == '+') {
            andadireita(); //chama andadireita
        } else {
            if (posicao == 'h' && movimento == '-') {
                andaesquerda();//chama andaesquerda
            } else {
                if (posicao == 'v' && movimento == '+') {
                   andacima(); //chama andacima
                } else {
                   andabaixo(); //chama andabaixo
                }
            }
        }
    }

    void andadireita() { // anda horizontal
        x ++;
    }

    void andaesquerda() { // anda horizontal
        x --;
    }

    void andacima() { // anda vertical
        y ++;
    }

    void andabaixo() { // anda vertical
        y --;
    }
}

