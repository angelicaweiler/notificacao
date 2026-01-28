package com.javanauta.notificacao.infrastructure.message.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String FILA_EMAIL = "fila.email";
    public static final String EXCHANGE_EMAIL = "email.exchange";
    public static final String ROUTING_KEY = "email.enviar";

    @Bean
    public Queue filaEmail() {
        return new Queue(FILA_EMAIL);
    }

    @Bean
    public DirectExchange exchange() {
        return new DirectExchange(EXCHANGE_EMAIL);
    }

    @Bean
    public Binding binding() {
       return BindingBuilder.bind(filaEmail())
                .to(exchange())
                .with(ROUTING_KEY);
    }

    @Bean
    public Jackson2JsonMessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();

}


}
