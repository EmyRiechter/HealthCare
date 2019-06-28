package br.edu.uniopet.healthcare.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity //identificar classe como entidade
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gerar valor do id automaticamente
    private Integer id;
    private String firstName;
    private String lastName;
    private Date dataNasc;
    private int idade;
    private int telefone;
    private String endereco;
    private String convenio;

    public Paciente() {
    }

    public Paciente(Integer id, int idade, int telefone, String firstName, String lastName, Date dataNasc, String endereco, String convenio) {
        this.id = id;
        this.idade = idade;
        this.telefone = telefone;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.convenio = convenio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereço(String endereco) {
        this.endereco = endereco;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    @Override
    public String toString() {
        return  "Paciente{" +
                "id=" + id +
                ", idade=" + idade +
                ", telefone=" + telefone +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dataNasc=" + dataNasc +
                ", endereço='" + endereco + '\'' +
                ", convenio='" + convenio + '\'' +
                '}';
    }
}
