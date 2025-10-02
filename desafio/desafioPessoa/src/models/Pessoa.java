package models;

import java.util.Date;

public abstract class Pessoa {
    private String cpf;
    private String nome;
    private String rg;
    private Date dataNascimento;
    private Endereco endereco;
  
    public Pessoa(String cpf, String nome, String rg, Date dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }
   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return super.toString();
   }
   public String getCpf() {
    return cpf;
   }
   public void setCpf(String cpf) {
    this.cpf = cpf;
   }
   public String getNome() {
    return nome;
   }
   public void setNome(String nome) {
    this.nome = nome;
   }
   public String getRg() {
    return rg;
   }
   public void setRg(String rg) {
    this.rg = rg;
   }
   public Date getDataNascimento() {
    return dataNascimento;
   }
   public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
   }

    
}
