package br.org.soujava.mvc.repository;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class PessoaDAOFactory {

    @PersistenceContext(unitName = "soujava")
    private EntityManager em;

    @Produces
    public PessoaDAO createDAO() {
	return new PessoaDaoImpl(em);
    }
}