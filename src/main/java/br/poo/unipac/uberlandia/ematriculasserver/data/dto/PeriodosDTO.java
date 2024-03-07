package br.poo.unipac.uberlandia.ematriculasserver.data.dto;

import br.poo.unipac.uberlandia.ematriculasserver.data.entity.DisciplinasEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeriodosDTO {
    private Long oidPeriodos;
    private String nome;
    private List<DisciplinasEntity> disciplinas;
}
