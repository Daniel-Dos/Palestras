package br.org.soujava.mvc.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.Viewable;
import javax.mvc.annotation.Controller;
import javax.mvc.annotation.View;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.bson.types.ObjectId;

import br.org.soujava.mvc.model.Pessoa;
import br.org.soujava.mvc.service.PessoaServico;

/**
 * @author daniel 
 * github:Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
@Controller
@Path("pessoas")
public class PessoaController {

    @Inject
    PessoaServico pessoaServico;

    @Inject
    Models models;

    @GET
    @Path("mostrar")
    @View("mostrar.jsp")
    public void listarPessoas() {
	this.models.put("pessoas", pessoaServico.listarPessoa());
    }

    @GET
    @Path("novo")
    public Viewable novaPessoa() {
	List<String> paises = Arrays.stream(Locale.getISOCountries())
		.map(iso -> getCountryName(iso))
		.sorted((a, b) -> a.compareTo(b))
		.collect(Collectors.toList());

	models.put("paises", paises);
	return new Viewable("inserir.jsp");
    }

    @POST
    @Path("add")
    public String adicionarPessoa(@BeanParam Pessoa pessoa) {
	pessoaServico.adicionaPessoa(pessoa);
	return "redirect:pessoas/mostrar";
    }

    @POST
    @Path("update")
    public String atualizarPessoa(@BeanParam Pessoa pessoa) {
	pessoaServico.atualizaPessoa(pessoa);
	return "redirect:pessoas/mostrar";
    }

    @GET
    @Path("atualizar/{_id}")
    public Viewable update(@PathParam("_id") ObjectId id) {
	this.models.put("update", pessoaServico.getPessoaPorId(id));

	List<String> paises = Arrays.stream(Locale.getISOCountries())
		.map(iso -> getCountryName(iso))
		.sorted((a, b) -> a.compareTo(b))
		.collect(Collectors.toList());

	models.put("paises", paises);
	return new Viewable("alterar.jsp");
    }

    @GET
    @Path("remover/{_id}")
    public String excluirPessoa(@PathParam("_id") ObjectId id) {
	pessoaServico.excluirPessoa(id);
	return "redirect:pessoas/mostrar";
    }

    private String getCountryName(String iso) {
	return new Locale(iso, iso).getDisplayCountry(Locale.ENGLISH);
    }
}
