package com.example.sprint_1.dto.response;

import lombok.Builder;

@Builder
public class DevolucaoResponse {
    Long id;

    String motivo;

    ProdutoResponse produto;
}
