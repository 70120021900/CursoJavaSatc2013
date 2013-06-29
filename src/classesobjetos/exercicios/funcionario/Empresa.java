/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classesobjetos.exercicios.funcionario;

/**
 *
 * @author EDUTEC
 */
public class Empresa   
{   
    private String nome;   
    private String cnpj;   
    Funcionario[] funcionarios;   
       
    public Empresa(String nome, String cnpj, Funcionario[] funcionarios)   
    {   
        this.nome = nome;   
        this.cnpj = cnpj;   
        this.funcionarios = funcionarios;   
    }
    
    public void adicionaFuncionariosNaEmpresa(Funcionario funcionarios)   
    {   
        int i;   
           
        Funcionario[] f = new Funcionario[10];   
        this.funcionarios[f.length] = funcionarios;   
           
        for(i = 0; i <= f.length; i++);   
        {   
            System.out.println(f[i]);   
        }   
    }   
       
    public String imprimiEmpresaComFuncionarios()   
    {   
        StringBuffer sb = new StringBuffer();   
        sb.append("Empresa      : " + this.nome + "\n");   
        sb.append("CNPJ         : " + this.cnpj + "\n");   
        sb.append("Funcionarios : " + this.funcionarios  + "\n");   
           
        return sb.toString();   
    }

    String imprimiEmpresaComFuncionarios(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}