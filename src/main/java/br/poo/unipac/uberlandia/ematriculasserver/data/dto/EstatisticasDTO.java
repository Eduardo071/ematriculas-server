package br.poo.unipac.uberlandia.ematriculasserver.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstatisticasDTO {
    private Long excelente;
    private Long bom;
    private Long mediano;
    private Long ruim;
}
