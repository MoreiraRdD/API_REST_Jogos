package api.cadastro.api.console;

import jakarta.persistence.Embeddable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Console {

   private String nome_console;
   private String data_lancamento_console;
   private String empresa_console;

public Console(DadosConsole dados){
   this.nome_console = dados.nome_console();
   this.data_lancamento_console = dados.data_lancamento_console();
   this.empresa_console = dados.empresa_console();
}

public void atualizarInformacoes(@NotNull @Valid DadosConsole dados) {
   if(dados.nome_console() != null){
      this.nome_console = dados.nome_console();
}
   if(dados.data_lancamento_console() != null){
   this.data_lancamento_console = dados.data_lancamento_console();
}
   if(dados.empresa_console() != null){
   this.empresa_console = dados.empresa_console();
}
}
}