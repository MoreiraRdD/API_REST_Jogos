package api.cadastro.api.desenvolvedor;

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
public class Desenvolvedor {

   private String nome_desenvolvedor;
   private String data_fundacao_desenvolvedor;
   private String website_desenvolvedor;
   private String sede_desenvolvedor;

public Desenvolvedor(DadosDesenvolvedor dados){
   this.nome_desenvolvedor = dados.nome_desenvolvedor();
   this.data_fundacao_desenvolvedor = dados.data_fundacao_desenvolvedor();
   this.website_desenvolvedor = dados.website_desenvolvedor();
   this.sede_desenvolvedor = dados.sede_desenvolvedor();
}

public void atualizarInformacoes(@NotNull @Valid DadosDesenvolvedor dados) {
   if(dados.nome_desenvolvedor() != null){
      this.nome_desenvolvedor = dados.nome_desenvolvedor();
}
   if(dados.data_fundacao_desenvolvedor() != null){
   this.data_fundacao_desenvolvedor = dados.data_fundacao_desenvolvedor();
}
   if(dados.website_desenvolvedor() != null){
   this.website_desenvolvedor = dados.website_desenvolvedor();
}
   if(dados.sede_desenvolvedor() != null){
   this.sede_desenvolvedor = dados.sede_desenvolvedor();
}
}
}