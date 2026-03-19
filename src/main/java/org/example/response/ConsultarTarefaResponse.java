package org.example.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;
@Getter
@Setter
public class ConsultarTarefaResponse {
    public UUID id;
    public  String nome;
    public Date dataInicio;
    public Date dataFim;
    public String descricao;
    public String responsavel;

}
