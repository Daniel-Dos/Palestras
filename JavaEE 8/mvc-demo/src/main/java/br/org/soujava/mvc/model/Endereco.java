package br.org.soujava.mvc.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.ws.rs.FormParam;

import lombok.Data;

@Embeddable
@Data
public class Endereco implements Serializable {

    private static final long serialVersionUID = -8645229400491747212L;

    @FormParam("estado")
    private String estado;

    @FormParam("pais")
    private String pais;
}