package com.example.sprint_1.dto.request;

import jakarta.validation.constraints.NotNull;



public class EnderecoRequest {

    @NotNull(message = "Precisamos do Id para prosseguir")
    Long id;

    @NotNull(message = "Precisamos do cep para prosseguir")
    String cep;

    @NotNull(message = "Precisamos do numero para prosseguir")
    String numero;

    @NotNull(message = "Precisamos do complemento para prosseguir")
    String complemento;


    ClienteRequest cliente;

    EmpresaRequest empresa;
}
