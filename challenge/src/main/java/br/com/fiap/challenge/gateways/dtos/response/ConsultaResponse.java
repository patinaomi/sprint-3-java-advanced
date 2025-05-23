package br.com.fiap.challenge.gateways.dtos.response;

import br.com.fiap.challenge.domains.Cliente;
import br.com.fiap.challenge.domains.Clinica;
import br.com.fiap.challenge.domains.Dentista;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class ConsultaResponse {

    Cliente cliente;
    Clinica clinica;
    Dentista dentista;
    String tipoServico;
    LocalDate dataConsulta;
    char statusConsulta;
    String observacoes;
    String sintomas;
    String tratamentoRecomendado;
    Double custo;
    String prescricao;
    LocalDate dataRetorno;
}
