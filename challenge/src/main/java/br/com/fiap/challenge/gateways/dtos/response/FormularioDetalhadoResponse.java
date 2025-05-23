package br.com.fiap.challenge.gateways.dtos.response;

import br.com.fiap.challenge.domains.Cliente;
import br.com.fiap.challenge.domains.EstadoCivil;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class FormularioDetalhadoResponse {

    Cliente cliente;
    EstadoCivil estadoCivil;
    String historicoFamiliar;
    String profissao;
    Double rendaMensal;
    String historicoMedico;
    String alergia;
    String condicaoPreexistente;
    String usoMedicamento;
    String familiarComDoencasDentarias;
    char participacaoEmProgramasPreventivos;
    String contatoEmergencial;
    char pesquisaSatisfacao;
    LocalDate dataUltimaAtualizacao;
    char frequenciaConsultaPeriodica;
    String sinalizacaoDeRisco;
    String historicoDeViagem;
    String historicoDeMudancasDeEndereco;
    String preferenciaDeContato;

}
