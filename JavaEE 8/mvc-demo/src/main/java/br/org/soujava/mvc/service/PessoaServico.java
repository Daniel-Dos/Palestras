package br.org.soujava.mvc.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.bson.types.ObjectId;

import br.org.soujava.mvc.model.Pessoa;
import br.org.soujava.mvc.repository.PessoaDAO;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
@Transactional
public class PessoaServico {

    @Inject
    private PessoaDAO pessoaDao;

    public void adicionaPessoa(Pessoa pessoa) {
	pessoaDao.adicionar(pessoa);
    }

    public void atualizaPessoa(Pessoa pessoa) {
	pessoaDao.atualizar(pessoa);
    }

    public Pessoa getPessoaPorId(ObjectId id) {
	return pessoaDao.getPorId(id);
    }

    public void excluirPessoa(ObjectId id) {
	pessoaDao.excluir(id);
    }

    public List<Pessoa> listarPessoa() {
	return pessoaDao.getPessoas();
    }
}