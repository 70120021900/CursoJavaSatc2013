/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classesobjetos.exercicios.funcionario;

/**
 *
 * @author Klaus Boeing
 */
class Data {

    int dia;
    
    int mes;
    
    int ano;
    
    String formatada(){
        return String.format("%s/%s/%s", dia, mes, ano);
    }
}
