package com.example.sprint_1.entity;

import com.example.sprint_1.dto.response.ClienteResponse;
import com.example.sprint_1.dto.response.EmpresaResponse;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "TB_EMPRESA")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_EMPRESA")
    @SequenceGenerator(name = "SQ_EMPRESA", sequenceName = "SQ_EMPRESA", allocationSize = 1)
    @Column(name = "ID_EMPRESA")
    Long id;

    private String nome;

    private String cnpj;

}
