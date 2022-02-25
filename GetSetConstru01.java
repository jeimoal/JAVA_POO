package aula03_getsetconst;

public class Aula03_GetSetConst {

    public static void main(String[] args) {
        Caneta can1 = new Caneta("Rica", 0.5f); //Instância a classe Caneta, já definindo os valores de modelo e ponta, respectivamente.
        can1.setPonta(0.1f);
        can1.setModelo("Pobre");
        can1.status(); //Método para mostrar os dados da Caneta
    }
    
}
