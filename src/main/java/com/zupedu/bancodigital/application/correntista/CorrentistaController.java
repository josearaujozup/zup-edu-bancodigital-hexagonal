package com.zupedu.bancodigital.application.correntista;

import com.zupedu.bancodigital.adapters.persistence.correntista.CorrentistaRepository;
import com.zupedu.bancodigital.domain.correntista.CadastraNovoCorrentista;
import com.zupedu.bancodigital.domain.correntista.Correntista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/api/correntista")
public class CorrentistaController {

    @Autowired
    private CadastraNovoCorrentista service;


    @PostMapping
    public ResponseEntity<?> cadastra(NovoCorrentistaRequest request,
                                      UriComponentsBuilder uriBuilder) {


        Correntista correntista = service.salva(request);

        var location = uriBuilder.path("/api/correntista/{id}")
                .buildAndExpand(correntista.getId())
                .toUri();

        return ResponseEntity.created(location).build();

    }

}
