package api.cadastro.api.jogo;

import api.cadastro.api.console.Console;
import api.cadastro.api.desenvolvedor.Desenvolvedor;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "jogo")
@Entity(name = "jogo")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Jogo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao; 
    private String dataLancamento; 
    private String website; 
    private String genero;
    private String urlCapa;

    @Embedded
    private Desenvolvedor desenvolvedor;
    private Console console;

    public Jogo(DadosCadastroJogo dados){
        this.nome = dados.nome();
        this.descricao = dados.descricao();
        this.dataLancamento = dados.dataLancamento();
        this.website = dados.website();
        this.genero = dados.genero();
        this.urlCapa = dados.urlCapa();
        this.desenvolvedor = new Desenvolvedor(dados.desenvolvedor());
        this.console = new Console(dados.console());
    }

    public void atualizarInformacoes(@Valid DadosCadastroJogo dados) {
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.descricao() != null){
            this.descricao = dados.descricao();
        }
        if(dados.dataLancamento() != null){
            this.dataLancamento = dados.dataLancamento();
        }
        if(dados.website() != null){
            this.website = dados.website();
        }
        if(dados.genero() != null){
            this.genero = dados.genero();
        }
        if(dados.urlCapa() != null){
            this.urlCapa = dados.urlCapa();
        }
        if(dados.desenvolvedor() != null){
            this.desenvolvedor.atualizarInformacoes(dados.desenvolvedor());
        }
        if(dados.console() != null){
            this.console.atualizarInformacoes(dados.console());
        }
    }

}
