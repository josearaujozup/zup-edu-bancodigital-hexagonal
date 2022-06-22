package com.zupedu.bancodigital.domain.conta;

import com.zupedu.bancodigital.domain.correntista.RetornaCorrentistaRepository;

public interface DadosNovaConta {

    Conta toModel(RetornaCorrentistaRepository correntistaRepository);

}
