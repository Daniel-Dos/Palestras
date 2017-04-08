package br.org.soujava.mvc.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.org.soujava.mvc.controller.PessoaController;

/**
 * @author daniel 
 * github:Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
@ApplicationPath("soujava")
public class MVCApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
	Set<Class<?>> classes = new HashSet<Class<?>>();
	classes.add(PessoaController.class);
	return classes;
    }
}
