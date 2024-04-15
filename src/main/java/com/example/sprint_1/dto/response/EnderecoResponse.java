package com.example.sprint_1.dto.response;

import lombok.Builder;

@Builder
public class EnderecoResponse {
    Long id;

    String cep;

    String numero;

    String complemento;

    ClienteResponse cliente;

    EmpresaResponse empresa;
}
