/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classesobjetos.exercicios.funcionario;

/**
 *
 * @author Klaus Boeing
 */
public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario carlos = new Funcionario();
        
        carlos.nome = "Carlos";
        carlos.salario = 1000.0;
        carlos.rg = "22339992-0";
        
        Departamento departamento = new Departamento();
        
        departamento.nome = "A";
        departamento.percentualInsalubridade = 10.0;
        departamento.valorBonus = 100.0;

        carlos.departamento = departamento;
        
        Data dataEntrada = new Data();
        
        dataEntrada.dia = 12;
        dataEntrada.mes = 6;
        dataEntrada.ano = 2013;
        
        carlos.dataEntrada = dataEntrada;
        
        carlos.mostra();
        
        System.out.println("---------------------");
        
        carlos.recebeAumento(200.0);
        
        carlos.mostra();
    }
    
}
