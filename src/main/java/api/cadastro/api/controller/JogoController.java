package api.cadastro.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.cadastro.api.jogo.DadosCadastroJogo;
import api.cadastro.api.jogo.DadosListagemJogo;
import api.cadastro.api.jogo.Jogo;
import api.cadastro.api.repository.JogoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.var;

@RestController
@RequestMapping("jogo")
public class JogoController {

    @Autowired
    private JogoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroJogo dados){
        repository.save(new Jogo(dados));
    }

    @GetMapping
    public Page<DadosListagemJogo> listar(@PageableDefault(sort = {"id"})Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemJogo::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosCadastroJogo dados){
        var jogo = repository.getReferenceById(dados.id());
        jogo.atualizarInformacoes(dados);
    }

    @DeleteMapping("{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }
}
