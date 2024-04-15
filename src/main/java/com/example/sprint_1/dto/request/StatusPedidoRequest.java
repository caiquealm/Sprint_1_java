package com.example.sprint_1.dto.request;

import jakarta.validation.constraints.NotNull;



public class StatusPedidoRequest {
    @NotNull(message = "Precisamos do Id para prosseguir")
    Long id;

    @NotNull(message = "Precisamos do status do pedido para prosseguir")
    String status;

    String  localizacao;
}
