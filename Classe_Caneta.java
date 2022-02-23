package aula01caneta;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void status() {
        System.out.println("A caneta " + this.modelo + " tem as seguintes características:");        
        System.out.println("Cor: " + this.cor );
        System.out.println("Tamanho da ponta: " + this.ponta);
        System.out.println("Carga atual: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }
    
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("DESTAMPE A CANETA PARA RABISCAR");
        } else {
            System.out.println("Estou rabsiscando!");
        }            
    }
    
    protected void tampar() {
        this.tampada = true;
    }
    
    protected void destampar() {
        this.tampada = false;
    }
}
