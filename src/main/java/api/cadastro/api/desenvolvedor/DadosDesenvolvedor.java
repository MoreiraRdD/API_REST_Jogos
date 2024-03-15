package api.cadastro.api.desenvolvedor;

import jakarta.validation.constraints.NotBlank;

public record DadosDesenvolvedor(

    @NotBlank
    String nome_desenvolvedor,

    @NotBlank
    String data_fundacao_desenvolvedor,

    @NotBlank
    String website_desenvolvedor,

    @NotBlank
    String sede_desenvolvedor

) {

}
