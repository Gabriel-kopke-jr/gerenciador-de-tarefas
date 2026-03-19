package org.example.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.entity.TarefaEntity;
import org.example.repository.TarefaRepository;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class TarefaDTO {

  public  String nome;
   public  Date dataInicio;
   public Date dataFim;
    public String descricao;
   public String responsavel;

    }
