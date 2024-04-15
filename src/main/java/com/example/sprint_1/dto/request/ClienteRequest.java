package com.example.sprint_1.dto.request;

import lombok.Builder;
import jakarta.validation.constraints.NotNull;


public class ClienteRequest {
    @NotNull(message = "Precisamos do Id para prosseguir")
    Long id;

    @NotNull(message = "Precisamos do nome para prosseguir")
    String nome;

    @NotNull(message = "Precisamos do email para prosseguir")
    String email;

}
