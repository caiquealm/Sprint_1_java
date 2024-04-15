package com.example.sprint_1.dto.response;

import lombok.Builder;

@Builder
public class StatusPedidoResponse {
    Long id;

    String status;

    String  localizacao;
}
