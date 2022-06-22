package com.zupedu.bancodigital.application.conta;

import com.zupedu.bancodigital.domain.conta.Conta;
import com.zupedu.bancodigital.domain.conta.DadosNovaConta;
import com.zupedu.bancodigital.domain.correntista.Correntista;
import com.zupedu.bancodigital.domain.conta.Tipo;
import com.zupedu.bancodigital.adapters.persistence.correntista.CorrentistaRepository;
import com.zupedu.bancodigital.domain.correntista.RetornaCorrentistaRepository;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class NovaContaRequest implements DadosNovaConta {

    @NotNull
    private Tipo tipo;

    @Positive
    @NotNull
    private Long correntistaId;

    public Tipo getTipo() {
        return tipo;
    }

    public Long getCorrentistaId() {
        return correntistaId;
    }

    public Conta toModel(RetornaCorrentistaRepository correntistaRepository) {
        Correntista correntista = correntistaRepository.retorna(correntistaId)
                                                       .orElseThrow(() -> new IllegalStateException("Correntista nao cadastrado"));
        return new Conta(tipo, correntista);
    }
}
