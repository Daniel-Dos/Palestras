package br.org.soujava.mvc.model;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;

import org.bson.types.ObjectId;

import lombok.Data;

@Entity
@Data
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 7043328248240571345L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @FormParam("_id")
    private ObjectId id;

    @FormParam("nome")
    private String nome;

    @FormParam("idade")
    private int idade;

    @BeanParam
    @Embedded
    private Endereco endereco;

    @FormParam("jugs")
    private String jugs;

    @FormParam("descricao")
    private String descricao;
}
