/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paciente;

import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author Helio Franca
 */

public class Paciente_Get_Set {
    //Atributos.
    private  int Cod=0; 
    private  int i = 1000;// Código Randomico.
    private  String Nome;
    private  int CPF;
    private  Data Data_Nasc;
    private  String Endereco;
    private  int Telefone;
    private  String Email;
    

    //Contrutores
public Paciente_Get_Set(){}
    
public Paciente_Get_Set(int cod, String nome, Data data_nasc, String endereco, int telefone, String email){
    
    this.Cod=cod;
    this.Nome=nome; 
    this.Data_Nasc=data_nasc;
    this.Endereco=endereco;
    this.Telefone=telefone;
    this.Email=email;
}    
    
    //=====================================================================
    // Metodos GET e SET.

public int getCod(){
    return this.Cod;               }
public void setCod(int cod){
    this.Cod=cod;
}

public String getNome(){
return this.Nome;                  } 
public void setNome(String nome){
this.Nome=nome;                    }

public int getCPF(){
return this.CPF;                  } 
public void setCPF(int cpf){
this.Telefone = CPF;                    }

public Data getDate_Nasc(){
return this.Data_Nasc;                  } 
public void setDate_Nasc(Data data_nasc){
this.Data_Nasc = data_nasc;                    }


public String getEndereco(){
return this.Endereco;                  } 
public void setEndereco(String endereco){
this.Endereco=endereco;                    }


public int getTelefone(){
return this.Telefone;                  } 
public void setTelefone(int telefone){
this.Telefone = telefone;                    }


public String getEmail(){
return this.Email;                  } 
public void setEmail(String email){
this.Email=email;                    }

 



//=============================================================================



//Método de impressão. 
 //3. Definir um método para imprimir os dados do contato.
    public String imprimirDados(){
       
           
     String Dados = "\n"+"\nCódigo:  "+this.getCod()
        + "\nNome:  "+this.getNome()
        +"\n  CPF:  "+this.getCPF()
        +"\n  Data de Nascimento:  "+this.getDate_Nasc()
        +"\n  Endereço:  "+this.getEndereco()
        +"\n  Telefone:  "+this.getTelefone()
        +"\n  E-Mail:  "+this.getEmail();
         
        return Dados;                                             }

    
}