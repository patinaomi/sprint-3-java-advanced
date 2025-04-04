package br.com.fiap.challenge.service;

import br.com.fiap.challenge.domains.FormularioDetalhado;

import java.util.List;

public interface FormularioDetalhadoService {

    FormularioDetalhado criar(FormularioDetalhado formulario);
    FormularioDetalhado buscarPorId(Integer id);
    List<FormularioDetalhado> buscarTodos();
    FormularioDetalhado atualizar(Integer id, FormularioDetalhado formulario);
    boolean deletar(Integer id);

}
