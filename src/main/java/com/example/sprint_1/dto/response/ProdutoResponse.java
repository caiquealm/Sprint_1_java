package com.example.sprint_1.dto.response;

import lombok.Builder;

@Builder
public class ProdutoResponse {
    Long id;

    String nome;

    Double preco;
}
