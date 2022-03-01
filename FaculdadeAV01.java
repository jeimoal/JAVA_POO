package atvctxav01;
public class AtvCtxAv01 {
    public static void main(String[] args) {
        Metodos solucao = new Metodos();
        solucao.status();
    }
}

package atvctxav01;
public class Metodos {
    private int par1 = 10;
    private int par2 = 20;
        
    public void status () {        
        System.out.println("O resultado do método 04 é " + met04());
    }
    
    public int met01() {
        int sum1 = par1; //Primeiro parâmetro = 10        
        int sum2 = par2; //Segundo parâmetro = 20        
        int sol1 = par1 + par2;
        return(sol1);
    }
    
    public int met02() {
        int sub1 = met01();
        int sub2 = par2;
        int sol2 = sub1 - sub2;
        return(sol2);
    }
    
    public int met03() {
        int mult1 = met02();
        int mult2 = par2;
        int sol3 = mult1 * mult2;
        return(sol3);
    }
    
    public int met04() {
        int div1 = met03();
        int div2 = par2;
        int sol4 = div1 / div2;
        return(sol4);
    }
}
