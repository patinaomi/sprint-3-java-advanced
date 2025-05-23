package br.com.fiap.challenge.gateways.dtos.request;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class FeedbackRequest {

    @NotNull(message = "Cliente não pode ser nulo")
    private Integer cliente;

    @NotNull(message = "Dentista não pode ser nulo")
    private Integer dentista;

    @NotNull(message = "Clínica não pode ser nula")
    private Integer clinica;

    @NotNull(message = "Avaliação não pode ser nula")
    private Float avaliacao;

    @Size(max = 250, message = "O comentário deve ter no máximo 250 caracteres")
    private String comentario;
}
