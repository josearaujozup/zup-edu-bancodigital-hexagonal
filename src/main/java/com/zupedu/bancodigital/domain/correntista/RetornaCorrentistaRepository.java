package com.zupedu.bancodigital.domain.correntista;

import java.util.Optional;

public interface RetornaCorrentistaRepository {

    Optional<Correntista> retorna(Long id);

}
