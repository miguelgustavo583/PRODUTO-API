package com.fatec.produtoapi.service;

import com.fatec.produtoapi.model.Produto;
import com.fatec.produtoapi.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(String id) {
        return produtoRepository.findById(id);
    }

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto atualizar(String id, Produto produtoAtualizado) {
        produtoAtualizado.setId(id);
        return produtoRepository.save(produtoAtualizado);
    }

    public void deletar(String id) {
        produtoRepository.deleteById(id);
    }
}