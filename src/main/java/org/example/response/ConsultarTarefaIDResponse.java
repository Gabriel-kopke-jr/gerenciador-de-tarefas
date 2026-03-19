package org.example.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class ConsultarTarefaIDResponse {
    public  String nome;
    public Date dataInicio;
    public Date dataFim;
    public String descricao;
    public String responsavel;

}
