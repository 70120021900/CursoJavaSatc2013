/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classesobjetos.exemplos;

/**
 *
 * @author Klaus Boeing
 */
public class DeterminarClasse {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        
        System.out.println(gerente.getClass().getName());
        System.out.println(gerente instanceof Gerente);
        
        Funcionario funcionario = new Secretaria();
        
        System.out.println(gerente instanceof Gerente);
        System.out.println(funcionario instanceof Gerente);
    }
    
}

