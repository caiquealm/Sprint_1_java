package com.example.sprint_1.dto.request;


import jakarta.validation.constraints.NotNull;

public class EmpresaRequest {
    @NotNull(message = "Precisamos do Id para prosseguir")
    Long id;

    @NotNull(message = "Precisamos do nome da empresa para prosseguir")
    String nome;

    @NotNull(message = "Precisamos do cnpj da empresa para prosseguir")
    String cnpj;

}
