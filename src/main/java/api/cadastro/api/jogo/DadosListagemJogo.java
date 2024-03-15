package api.cadastro.api.jogo;

import api.cadastro.api.console.Console;
import api.cadastro.api.desenvolvedor.Desenvolvedor;

public record DadosListagemJogo(

    Long id,
    String nome,
    String descricao,
    String dataLancamento,
    String website,
    String genero, 
    String urlCapa,
    Desenvolvedor desenvolvedor,
    Console console

){

    public DadosListagemJogo(Jogo jogo){
        this(jogo.getId(), jogo.getNome(), jogo.getDescricao(), jogo.getDataLancamento(), jogo.getWebsite(), jogo.getGenero(), jogo.getUrlCapa(), jogo.getDesenvolvedor(), jogo.getConsole());
    }

}
