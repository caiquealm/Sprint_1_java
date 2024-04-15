package com.example.sprint_1.dto.request;

import jakarta.validation.constraints.NotNull;



public class DevolucaoRequest {
    @NotNull(message = "Precisamos do Id para prosseguir")
    Long id;

    @NotNull(message = "Precisamos do motivo da devolução para prosseguir")
    String motivo;

    @NotNull(message = "Precisamos do nome do produto para prosseguir")
    ProdutoRequest produto;
}
