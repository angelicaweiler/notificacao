package com.javanauta.notificacao.business.dto;

import com.javanauta.notificacao.business.enums.StatusNotificacaoEnum;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StatusTarefaDTO {
    private String id;
    private StatusNotificacaoEnum statusNotificacaoEnum;

}
