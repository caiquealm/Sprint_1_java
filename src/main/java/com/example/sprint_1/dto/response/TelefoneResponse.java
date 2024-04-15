package com.example.sprint_1.dto.response;

import lombok.Builder;

@Builder
public class TelefoneResponse {
    Long id;

    String ddi;

    String ddd;

    String  numero;

    ClienteResponse cliente;

    EmpresaResponse empresa;
}


