/*
 * To change this template, choose Tools | Templates
 * and open t he template in the editor.
 */
package Funcionarios;

/**
 *
 * @author EDUTEC
 */
public class Funcionario {
    String nome, departamento, admissao, rg,cpf, sexo, situacao;
    Double salario;
    
     boolean recebeAumento(Double aumento){
        if(sexo.contentEquals("M")){
            salario += aumento;
            return true;
        }else{
            return false;
            }
        }
     double calculaGanhoAnual(){
            return salario * 12;
     }         
     public void mostra(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("RG: "+this.rg);
        System.out.println("Admissão: "+this.admissao);
        System.out.println("Departamento:"+this.departamento);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("Situação: "+this.situacao);        
        System.out.println("Salario Atual: "+this.salario);        
        System.out.println("Ganho anual: "+this.calculaGanhoAnual());
     }
}