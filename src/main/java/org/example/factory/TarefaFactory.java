package org.example.factory;
import org.springframework.stereotype.Service;


@Component
public class TarefaFactory{

public TarefaEntity  create(TarefaDTO dto){
            TarefaEntity tarefaEntity = new TarefaEntity();
        tarefaEntity.id = UUID.randomUUID();
        tarefaEntity.criadoEm = Date.from(Instant.now());
        tarefaEntity.atualizadoEm = Date.from(Instant.now());
        tarefaEntity.nome = dto.nome;
        tarefaEntity.descricao = dto.descricao;
        tarefaEntity.dataInicio = dto.dataInicio;
        tarefaEntity.dataFim = dto.dataFim;
        tarefaEntity.responsavel = dto.responsavel;
        return tarefaEntity;
}

public ConsultarTarefaResponse  create(TarefaEntity tarefaEntity){
        ConsultarTarefaResponse consultarTarefaResponse = new ConsultarTarefaResponse();
        consultarTarefaResponse.dataFim = tarefaEntity.dataFim;
        consultarTarefaResponse.descricao = tarefaEntity.descricao;
        consultarTarefaResponse.id = tarefaEntity.id;
        consultarTarefaResponse.responsavel = tarefaEntity.responsavel;
        consultarTarefaResponse.dataInicio = tarefaEntity.dataInicio;
        consultarTarefaResponse.nome = tarefaEntity.nome;
        return consultarTarefaResponse;
}

public ConsultarTarefaIDResponse create(TarefaEntity tarefaEntity){
         ConsultarTarefaIDResponse consultarTarefaIDResponse = new ConsultarTarefaIDResponse();
        consultarTarefaIDResponse.responsavel = tarefaEntity.responsavel;
        consultarTarefaIDResponse.dataFim = tarefaEntity.dataFim;
        consultarTarefaIDResponse.dataInicio = tarefaEntity.dataInicio;
        consultarTarefaIDResponse.descricao = tarefaEntity.descricao;
        consultarTarefaIDResponse.nome = tarefaEntity.nome;
        return consultarTarefaIDResponse;   
}


}