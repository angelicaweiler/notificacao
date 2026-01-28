package com.javanauta.notificacao.infrastructure.message.consumer;

import com.javanauta.notificacao.business.EmailService;
import com.javanauta.notificacao.business.dto.TarefasDTO;
import com.javanauta.notificacao.infrastructure.message.config.RabbitMQConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailConsumer {

    private final EmailService emailService;

    @RabbitListener(queues = RabbitMQConfig.FILA_EMAIL)
    public void enviarEmail(TarefasDTO tarefasDTO){
        emailService.enviaEmail(tarefasDTO);
    }
}
