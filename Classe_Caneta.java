package aula01caneta;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("A caneta 'can1' tem as seguintes características:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor );
        System.out.println("Tamanho da ponta: " + this.ponta);
        System.out.println("Carga atual: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }
    
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("DESTAMPE A CANETA PARA RABISCAR");
        } else {
            System.out.println("Estou rabsiscando!");
        }            
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
}
