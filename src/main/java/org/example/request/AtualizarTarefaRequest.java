package org.example.request;

import lombok.Getter;
import lombok.Setter;
import org.example.dto.TarefaDTO;

import java.util.Date;
@Getter
@Setter
public class AtualizarTarefaRequest {
    public  String nome;
    public Date dataInicio;
    public Date dataFim;
    public String descricao;
    public String responsavel;

public TarefaDTO toDto() {
    TarefaDTO tarefaDTO = new TarefaDTO();
    tarefaDTO.descricao = descricao;
    tarefaDTO.dataFim = dataFim;
    tarefaDTO.dataInicio = dataInicio;
    tarefaDTO.nome = nome;
    tarefaDTO.responsavel = responsavel;
    return tarefaDTO;
}
}
