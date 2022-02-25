package aula03_getsetconst;
public class Caneta {
    public String modelo;
    private float ponta;
    
    public void status () {
        System.out.println("Dados da caneta: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
    }

    public Caneta(String modelo, float ponta) { //Este é o Construtor para instanciamento de objetos
        this.modelo = modelo; //'this' se refere ao atributo da Classe em questão, no caso, 'Caneta'
        this.ponta = ponta;
    }

    public String getModelo() { //Método Get: Retorna um valor String, com nome do modelo da Caneta
        return modelo;
    }

    public void setModelo(String m) {//Método Set: Recebe uma cadeia de caracteres (String), que serão a marca(modelo) da Caneta
        this.modelo = m;
    }

    public float getPonta() {//Método Get: Retorna um valor float, com o número da ponta da Caneta
        return ponta;
    }

    public void setPonta(float p) {//Método Set: Recebe o valor da ponta da Caneta
        this.ponta = p;
    }
    
    
}
