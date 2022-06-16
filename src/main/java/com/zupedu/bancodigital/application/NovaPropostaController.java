package com.zupedu.bancodigital.application;

import com.zupedu.bancodigital.domain.CriaNovaProposta;
import com.zupedu.bancodigital.domain.Proposta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/propostas")
public class NovaPropostaController {

    private final CriaNovaProposta service;

    public NovaPropostaController(CriaNovaProposta service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> cria(@RequestBody @Valid NovaPropostaRequest request, UriComponentsBuilder uri){

        Proposta proposta = service.cria(request);

        URI location = uri.path("/propostas/{id}")
                .buildAndExpand(proposta.getId())
                .toUri();

        return ResponseEntity.created(location).build();

    }

}
