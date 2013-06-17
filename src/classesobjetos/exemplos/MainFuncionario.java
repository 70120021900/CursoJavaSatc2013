/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classesobjetos.exemplos;

/**
 *
 * @author Klaus Boeing
 */
public class MainFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.nome ="klaus";
        
        validar(gerente);
        
        Secretaria secretaria  = new Secretaria();
        
        secretaria.nome = "Maria";
        validar(secretaria);
        
    }
    
    public static void validar(Funcionario funcionario){
        Gerente gerente = (Gerente)funcionario;
        System.out.println(gerente.nome);
    }
    
}
