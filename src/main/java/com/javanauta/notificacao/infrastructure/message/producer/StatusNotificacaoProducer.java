package com.javanauta.notificacao.infrastructure.message.producer;

import com.javanauta.notificacao.business.dto.TarefasDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StatusNotificacaoProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void enviarStatus(TarefasDTO tarefasDTO){
        kafkaTemplate.send("topico.status", tarefasDTO);
    }
}
