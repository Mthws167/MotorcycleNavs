package com.backend.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PontoInteresseDTO {

    private Long id;

    private String nome;

    private String endereco;

    private String tipo;

}