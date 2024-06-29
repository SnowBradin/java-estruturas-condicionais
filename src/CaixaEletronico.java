public class CaixaEletronico {
    public static void main(String[] args)  {
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if(valorSolicitado <saldo){
        saldo = saldo - valorSolicitado;
        System.out.println("Novo Saldo " + saldo);
        } //se existir mais de uma linha no "if", coloque-o em um bloco {}
        else
        System.out.println("Saldo Insuficiente");

        
    }
}
