package com.example.sprint_1.entity;

import com.example.sprint_1.dto.response.ClienteResponse;
import com.example.sprint_1.dto.response.EmpresaResponse;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "TB_TELEFONE")
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TELEFONE")
    @SequenceGenerator(name = "SQ_TELEFONE", sequenceName = "SQ_TELEFONE", allocationSize = 1)
    @Column(name = "ID_TELEFONE")
    private Long id;

    private String ddi;

    private String ddd;

    private String  numero;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "CLIENTE",
            referencedColumnName = "ID_CLIENTE",
            foreignKey = @ForeignKey(
                    name = "FK_CLIENTE_TELEFONE"
            )
    )
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "EMPRESA",
            referencedColumnName = "ID_EMPRESA",
            foreignKey = @ForeignKey(
                    name = "FK_EMPRESA_TELEFONE"
            )
    )
    private Empresa empresa;
}


