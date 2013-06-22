/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionarios;

/**
 *
 * @author EDUTEC
 */
public class Funcionario {
    String nome, departamento, admissao, rg,cpf, sexo, situacao;
    Double salario, ganhoAnual;
    
     boolean recebeAumento(Double aumento){
        if(sexo.contentEquals("F")){
            salario += aumento;
            return true;
        }else{
            return false;
            }
        }
     void calculaGanhoAnual(Double ganhoAnual){
         if(situacao.contentEquals("Ativo")){
             ganhoAnual = (salario*12);
           //  return true;
         //}else{
             //return false;
             
         }
     }
}
