package br.poo.unipac.uberlandia.ematriculasserver.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessagePeriodoDTO {
    private Number oidMessage;
    private String message;
}
