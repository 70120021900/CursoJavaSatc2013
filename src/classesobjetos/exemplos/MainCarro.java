/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classesobjetos.exemplos;

/**
 *
 * @author Klaus Boeing
 */
public class MainCarro {
    
    public static void main(String[] args) {
        
        Carro lancer = new Carro();
        
        lancer.nome = "Lancer";
        lancer.numeroDaPlaca = "ABC 1112";
        lancer.cor = "Azul";
        lancer.fabricante = "Mitsubishi";
        lancer.velocidade = "50 Km/h";
        
//        lancer.acelerar();
//        lancer.frear();
//        lancer.girar();
        
//        int numeroPorta = 1;
//        lancer.abrirPorta(numeroPorta);
//        System.out.println(numeroPorta);
//        
//        String[] passageiros = {"mario","luigi","toad"};
//        
//        lancer.embarcar(passageiros);
//        System.out.println(passageiros[1]);
        
        
        Carro filder = new Carro();
        
        filder.nome = "Filder";
        
        filder.numeroDaPlaca = "EFG 2344";
        filder.cor = "Preto";
        filder.fabricante = "Toyota";
        filder.velocidade = "100 Km/h";
        
//        filder.acelerar();
//        filder.frear();
//        filder.girar();
        
        
//        System.out.println(filder.velocidade);
//        lancer.bater(filder);
//        System.out.println(filder.velocidade);
        
        System.out.println(String.format("Teste %s", "OLA"));
        
        Carro.lavar(lancer);
        Carro.lavar(filder);
        
    }
    
}
