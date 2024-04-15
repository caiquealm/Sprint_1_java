package com.example.sprint_1.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public class TelefoneRequest {
    @NotNull(message = "Precisamos do Id para prosseguir")
    Long id;

    @NotNull(message = "Precisamos do ddi para prosseguir")
    String ddi;

    @NotNull(message = "Precisamos do ddd para prosseguir")
    String ddd;

    @NotNull(message = "Precisamos do Id para prosseguir")
    String  numero;

    ClienteRequest cliente;

    EmpresaRequest empresa;
}


