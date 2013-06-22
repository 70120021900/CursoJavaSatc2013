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
        Funcionario funcionario = new Funcionario();
        
        funcionario.nome = "Claudemir";
        funcionario.cpf = "701.701.701-00";
        funcionario.rg = "2.741.999";
        funcionario.admissao = "14/11/2008";
        funcionario.departamento = "Recursos Humanos";
        funcionario.sexo = "F";
        funcionario.situacao = "Ativo";
        funcionario.salario = 1000.0;       
        double aumento = 100.0;
        funcionario.recebeAumento(aumento);
        funcionario.calculaGanhoAnual(100.0);
        
        System.out.println(funcionario.nome);
        System.out.println(funcionario.cpf);
        System.out.println(funcionario.rg);
        System.out.println(funcionario.admissao);
        System.out.println(funcionario.departamento);
        System.out.println(funcionario.sexo);
        System.out.println(funcionario.situacao);        
        System.out.println("Salario Atual: "+funcionario.salario);        
        System.out.println("Ganho anual: "+funcionario.calculaGanhoAnual());
    }
}
