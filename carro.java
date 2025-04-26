// CLASSE CARRO
package javaproject;
public class carro implements carroAcao{
    // ATRIBUTOS
    public String modelo;
    public int ano;
    public String cor;
    private String placa;
    private int velocidade;
    private boolean ligado;
    private boolean desligado;

    // METODOS ESPECIAIS
    public carro(){
        this.velocidade = 0;
        this.ligado = false;
        this.desligado = false;
    }
    // VELOCIDADE
    public int getVelocidade(){ 
        return this.velocidade;
    }
    public void setVelocidade(int velocidade){ 
        this.velocidade = velocidade;
    }

    // CARRO LIGADO
    public boolean  getLigado(){ 
        return this.ligado;
    }
    public  void setLigado(boolean ligado){ 
        this.ligado = ligado;
    }
    
    // CARRO DESLIGADO
    public boolean  getDesligado(){ 
        return this.desligado;
    }
    public void setDesligado(boolean desligado){ 
        this.desligado = desligado;
    }
    
    // METODOS ABSTRATOS
    @Override
    public void ligar(){
        this.ligado = true;
    }
    @Override
    public void desligar(){
        this.desligado = false;
    }
    @Override
    public void statusAcao(){
        System.out.println("Ligado? : " + this.getLigado());
        System.out.println("Desligado? : " + this.getDesligado());
        System.out.print("Velocidade : " + this.getVelocidade());
        for (int i = 0; i <= this.getVelocidade(); i+=1){
            System.out.print("| ");
        }
    }
    @Override
    public void acelerar(){
        if (this.getLigado()) {
            this.setVelocidade( 20);
        } else{
            System.out.println("Não foi possivel acelerar");
        }
    }
    @Override
    public void desacelerar(){
        if (this.getLigado()) {
            this.setVelocidade(this.getVelocidade()-1);
        }else{
            System.out.println("Não foi possivel desacelerar");
        }
    }

    // METODO CONSTRUTOR COM PARAMETROS (mais escalavel)
    public carro(String m, int a, String c, String p){
        this.modelo = m; // ou this.setModelo(m);
        this.ano = a; // ou this.setAno(a);
        this.cor = c; // ou this.setCor(c);
        this.placa = p; // ou this.setPlaca(p);
    }

    // ATRIBUTO MODELO
    public String getModelo(){ // metodo de retornar o valor do atributo
        return this.modelo;
    }
    public void setModelo(String m){ // metodo de atribuir valor ao atributo
        this.modelo = m;
    }
    
    // ATRIBUTO ANO
    public int getAno(){
        return this.ano;
    }
    public void setAno(int a){
        this.ano = a;
    }

    // ATRIBUTO COR
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }

    // ATRIBUTO PLACA
    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String p){
        this.placa = p;
    }


    public void status(){
        System.out.println("CARRO");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
        System.out.println("Placa: "+ this.placa);


         // METODO CONSTRUTOR SIMPLES CARRO
        /*
        public carro(){
            this.modelo = "Palio";
            this.ano = 2010;
            this.cor = "Verde";
            this.placa = "abc-1236";
        }
        */
    }
}