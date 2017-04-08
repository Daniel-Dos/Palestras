package br.org.soujava.mvc.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.bson.types.ObjectId;

import br.org.soujava.mvc.model.Pessoa;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class PessoaDaoImpl implements PessoaDAO {
    
    
        EntityManager em;
        
	public PessoaDaoImpl(EntityManager em) {
	    this.em = em;
	}

    @Override
    public void adicionar(Pessoa objeto) {
	em.persist(objeto);
    }

    @Override
    public void atualizar(Pessoa objeto) {
	Pessoa query = getPorId(objeto.getId());

	Pessoa id = query;
	objeto.setId(id.getId());
	em.merge(objeto);
    }

    @Override
    public void excluir(ObjectId id) {
	em.remove(getPorId(id));
    }

    
    @Override
    public Pessoa getPorId(ObjectId objeto) {
	return em
		.createQuery("select e from Pessoa e where e.id =:id",Pessoa.class)
		.setParameter("id",objeto)
		.getSingleResult();
    }

    @Override
    public List<Pessoa> getPessoas() {
	return em
		.createQuery("FROM Pessoa",Pessoa.class)
		.getResultList();
    }
}