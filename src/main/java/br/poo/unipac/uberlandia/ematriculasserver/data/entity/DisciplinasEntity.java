package br.poo.unipac.uberlandia.ematriculasserver.data.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.*;

@ApiModel(description = "TABELA DISCIPLINAS.")
@Data
@Entity
@Table(name = "DISCIPLINAS", schema = "PUBLIC")
public class DisciplinasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OID_DISCIPLINAS")
    private Long oidDisciplinas;

    @Column(name = "NOME", length = 100)
    private String nome;

    @Column(name = "CODIGO", length = 10)
    private String codigo;

}
