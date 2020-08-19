package com.springbatchproject.springbatchusage.model;

import javax.persistence.*;

@Entity
public class Funcionarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cd_profissao")
    private Integer codigoProfissao;

    @Column(name = "ds_profissao")
    private String descricaoProfissao;

    public Funcionarios(){}

    public Funcionarios(Long id, String nome, Integer codigoProfissao, String descricaoProfissao) {
        this.id = id;
        this.nome = nome;
        this.codigoProfissao = codigoProfissao;
        this.descricaoProfissao = descricaoProfissao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoProfissao() {
        return codigoProfissao;
    }

    public void setCodigoProfissao(Integer codigoProfissao) {
        this.codigoProfissao = codigoProfissao;
    }

    public String getDescricaoProfissao() {
        return descricaoProfissao;
    }

    public void setDescricaoProfissao(String descricaoProfissao) {
        this.descricaoProfissao = descricaoProfissao;
    }

//    @Override
//    public String toString() {
//        return "Funcionarios{" +
//                "id=" + id +
//                ", nome='" + nome + '\'' +
//                ", codigoProfissao='" + codigoProfissao + '\'' +
//                ", dsDpt='" + descricaoProfissao + '\'' +
//                '}';
//    }
}
