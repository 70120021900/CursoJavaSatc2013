/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionarios;

/**
 *
 * @author EDUTEC
 */
public class Funcionario_manutencao {
        public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        
        funcionario1.nome = "Claudemir";
        funcionario1.cpf = "701.701.701-00";
        funcionario1.rg = "2.741.999";
        funcionario1.admissao = "14/11/2008";
        funcionario1.departamento = "Recursos Humanos";
        funcionario1.sexo = "M";
        funcionario1.situacao = "Ativo";
        funcionario1.salario = 1000.0;       
        double aumento = 100.0;
        funcionario1.recebeAumento(aumento);
        funcionario1.nome = "Lucas";
        funcionario1.cpf = "722.701.701-00";
        funcionario1.rg = "2.555.999";
        funcionario1.admissao = "14/12/2010";
        funcionario1.departamento = "Teste drive brasil";
        funcionario1.sexo = "M";
        funcionario1.situacao = "Ativo";
        funcionario1.salario = 2000.0;       
        funcionario1.recebeAumento(aumento);      
        
        funcionario1.mostra();                
    }
        
}
