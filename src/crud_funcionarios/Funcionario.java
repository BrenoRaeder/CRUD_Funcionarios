
package crud_funcionarios;

import java.util.ArrayList;


public class Funcionario {
    private String nome;
    private String endereco;
    private String cpf;
    private String dataNascimento;
    //ArrayList<Funcionario> listaFuncionario;
    
    public Funcionario(){
        
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome + " | endereço: " + endereco + " | cpf: " + cpf + " | dataNascimento: " + dataNascimento;
    }

    /*public ArrayList<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }

    public void setListaFuncionario(ArrayList<Funcionario> listaFuncionario) {
        this.listaFuncionario = listaFuncionario;
    }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}
