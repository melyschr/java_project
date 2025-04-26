package javaproject;
public class gerarCarros {
    public static void main(String[] args) {
        carro  c1 = new carro("Palio", 2010, "Verde", "ABC-1235" ); // com parametro definidos no construtor
        c1.status();
        c1.ligar();
        c1.statusAcao();
    }
}
