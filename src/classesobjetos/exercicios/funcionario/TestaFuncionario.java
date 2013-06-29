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
        Empresa emp = new Empresa();        
        Funcionario[] func = new Funcionario[10];
        funcionario.funcionario = func;
        Funcionario funcionario = new Funcionario();
        empresa.adicionaFuncionariosNaEmpresa(funcionario);
        System.out.println("Nome do funcionário solicitado: " + empresa.imprimiEmpresaComFuncionarios(funcionario));
    }
}
         
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

class TestaEmpresa {
    public static void main(String[] args) {
        Empresa emp = new Empresa();
        Funcionario[] func = new Funcionario[10];
        emp.funcionarios = func;
        Funcionario funcionario = new Funcionario();
        emp.adicionaFuncionariosNaEmpresa(funcionario);
        System.out.println("Nome do funcionário solicitado: " + emp.imprimiEmpresaComFuncionarios(funcionario));
    }
}