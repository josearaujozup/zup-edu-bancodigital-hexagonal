package com.zupedu.bancodigital.domain;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Proposta {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String nome;

    private String CPF;

    private String email;

    private String CEP;

    private String logradouro;

    private String numero;

    private String complemento;

    /**
     * @deprecated para uso dos frameworks
     */
    @Deprecated
    public Proposta() {

    }

    public Proposta(String nome, String CPF, String email, String CEP, String logradouro, String numero, String complemento) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.CEP = CEP;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEmail() {
        return email;
    }

    public String getCEP() {
        return CEP;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }
}
