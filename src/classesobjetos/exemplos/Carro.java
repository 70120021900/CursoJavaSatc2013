/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classesobjetos.exemplos;

/**
 *
 * @author Klaus Boeing
 */
class Carro {

    String nome;
    String numeroDaPlaca;
    String cor;
    String fabricante;
    String velocidade;
            
    void acelerar(){
        nome = "ola";
        {
            System.out.println(nome);
            String nome = "bye";
            System.out.println(nome);
            System.out.println(this.nome);
        }
    }
    
    public static void main(String[] args) {
        Carro carro = new Carro();
        
        carro.acelerar();
    }
    
    void girar(){
        System.out.println("Girando " + nome);
    }
    
    void frear(){
        System.out.println("Freando " + nome);
    }

    void abrirPorta(int numeroPorta){
        numeroPorta = 2;
        System.out.println("Abrindo porta " + numeroPorta + "...");
    }

    void embarcar(String[] passageiros){
        
        passageiros = new String[]{"Panthro","Lion"};
//        for (int i = 0; i < passageiros.length; i++) {
//            System.out.println(passageiros[i]);
//        }
        passageiros[1] = "klaus";
        System.out.println(passageiros[1]);
    }
    
    void bater(Carro carro){
        System.out.println(nome);
        carro.velocidade = "10 km";
        System.out.println("Carro " + nome + " bateu no " + carro.nome);
    }
    static void teste(){
        String valor = String.valueOf(10);
        valor = String.valueOf(true);
        
        System.out.println(valor);
    }
    
    static void lavar(Carro carro){
        System.out.println("Lavando o carro " + carro.nome);
    }
}
