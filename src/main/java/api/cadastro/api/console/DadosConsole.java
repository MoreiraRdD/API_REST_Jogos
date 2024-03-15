package api.cadastro.api.console;

import jakarta.validation.constraints.NotBlank;

public record DadosConsole(

    @NotBlank
    String nome_console,

    @NotBlank
    String data_lancamento_console,

    @NotBlank
    String empresa_console
    
) {

}
