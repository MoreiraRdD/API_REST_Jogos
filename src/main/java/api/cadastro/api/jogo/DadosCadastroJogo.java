package api.cadastro.api.jogo;

import api.cadastro.api.console.DadosConsole;
import api.cadastro.api.desenvolvedor.DadosDesenvolvedor;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroJogo(

    Long id,

    @NotBlank
    String nome, 

    @NotBlank
    String descricao, 

    @NotBlank
    String dataLancamento, 

    String website,  

    @NotBlank
    String genero,

    @NotBlank
    String urlCapa,

    @NotNull
    @Valid
    DadosConsole console,

    @NotNull
    @Valid
    DadosDesenvolvedor desenvolvedor
    
    ) {

}
