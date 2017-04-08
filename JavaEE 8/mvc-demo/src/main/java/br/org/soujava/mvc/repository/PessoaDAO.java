package br.org.soujava.mvc.repository;

import java.util.List;

import org.bson.types.ObjectId;

import br.org.soujava.mvc.model.Pessoa;

public interface PessoaDAO {

    void adicionar(Pessoa objeto);
    void atualizar(Pessoa objeto);
    void excluir(ObjectId id);
    Pessoa getPorId(ObjectId objeto);
    List<Pessoa> getPessoas();
}
