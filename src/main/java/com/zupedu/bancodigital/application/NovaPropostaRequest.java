package com.zupedu.bancodigital.application;

import com.zupedu.bancodigital.domain.DadosNovaProposta;
import com.zupedu.bancodigital.domain.Proposta;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public record NovaPropostaRequest(@NotBlank String nome,
                                  @NotBlank @CPF String CPF,
                                  @NotBlank @Email String email,
                                  @NotBlank String CEP,
                                  @NotBlank String logradouro,
                                  @NotBlank String numero,
                                  String complemento) implements DadosNovaProposta {

    @Override
    public Proposta toModel() {
        return new Proposta(nome,CPF,email,CEP,logradouro, numero,complemento);
    }
}
