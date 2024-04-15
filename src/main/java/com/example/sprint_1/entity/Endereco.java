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
@Table(name = "TB_ENDERECO")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ENDERECO")
    @SequenceGenerator(name = "SQ_ENDERECO", sequenceName = "SQ_ENDERECO", allocationSize = 1)
    @Column(name = "ID_ENDERECO")
    Long id;

    private String cep;

    private String numero;

    private String complemento;


    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "CLIENTE",
            referencedColumnName = "ID_CLIENTE",
            foreignKey = @ForeignKey(
                    name = "FK_CLIENTE_ENDERECO"
            )
    )
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "EMPRESA",
            referencedColumnName = "ID_EMPRESA",
            foreignKey = @ForeignKey(
                    name = "FK_EMPRESA_ENDERECO"
            )
    )
    private Empresa empresa;
}
