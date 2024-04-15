package com.example.sprint_1.dto.request;


import jakarta.validation.constraints.NotNull;

public class ProdutoRequest {
    @NotNull(message = "Precisamos do Id para prosseguir")
    Long id;
    @NotNull(message = "Precisamos do nome do produto para prosseguir")
    String nome;
    @NotNull(message = "Precisamos do preço para prosseguir")
    Double preco;
}
