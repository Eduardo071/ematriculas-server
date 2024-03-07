package br.poo.unipac.uberlandia.ematriculasserver.data.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@ApiModel(description = "TABELA PERIODOS.")
@Data
@Entity
@Table(name = "PERIODOS", schema = "PUBLIC")
public class PeriodosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OID_PERIODOS")
    private Long oidPeriodos;

    @Column(name = "NOME", length = 100)
    private String nome;

    @OneToMany(mappedBy = "periodo")
    private List<DisciplinasEntity> disciplinas;

}