package com.javanauta.notificacao.infrastructure.messages.rabbitmq.consumer;

import com.javanauta.notificacao.business.EmailService;
import com.javanauta.notificacao.business.dto.TarefasDTO;
import com.javanauta.notificacao.infrastructure.messages.rabbitmq.config.RabbitMqConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailConsumer {

    private final EmailService emailService;

    @RabbitListener(queues = RabbitMqConfig.FILA_EMAIL)
    public void enviarEmail(TarefasDTO dto){

        emailService.enviaEmail(dto);
    }
}
