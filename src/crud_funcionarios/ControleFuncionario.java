
package crud_funcionarios;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ControleFuncionario {
    ArrayList<Funcionario> listaFuncionario;
    
    public ControleFuncionario(){
        listaFuncionario = new ArrayList();
    }

    public ArrayList<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }

    public void setListaFuncionario(ArrayList<Funcionario> listaFuncionario) {
        this.listaFuncionario = listaFuncionario;
    }
    
    public String funcionariosToString(){
        String txtFunc = "";
        
        for(Funcionario f : listaFuncionario){
            txtFunc += f.toString();
            txtFunc += "\n";
        }
        
        return txtFunc;
    }
    
    public void adcionaFuncionario(Funcionario f, String cpf){
        
        boolean temCpf = false;
        
        for(Funcionario fun : listaFuncionario){
            if(fun.getCpf().equals(cpf)){
                temCpf = true;
            }
        }
        
        if(!temCpf){
            listaFuncionario.add(f);
        }
        else{
            JOptionPane.showMessageDialog(null, "CPF já cadastrado");
        }
    }
    
    public void deletaFuncionario(String Cpf){
        
        Funcionario fun = new Funcionario();
        
        for(Funcionario f : listaFuncionario){
            if(f.getCpf().equals(Cpf)){
                fun = f;
            }       
        }   
        
        listaFuncionario.remove(fun);
    }
    
    public void atualizaFuncionario(Funcionario func){
    
        for(Funcionario f : listaFuncionario){
            if(f.getCpf().equals(func.getCpf())){
                f.setNome(func.getNome());
                f.setCpf(func.getCpf());
                f.setEndereco(func.getEndereco());
                f.setDataNascimento(func.getDataNascimento());
            }        
        }
    }
    
    public void mostraFuncionario(String cpf){
        for(Funcionario f : listaFuncionario){
            if(f.getCpf().equals(cpf)){
                JOptionPane.showMessageDialog(null, f.toString());
            }
        }
    }
}
