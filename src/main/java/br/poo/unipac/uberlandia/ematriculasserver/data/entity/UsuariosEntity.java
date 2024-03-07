package br.poo.unipac.uberlandia.ematriculasserver.data.entity;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import jakarta.persistence.*;
import java.util.Date;

@ApiModel(description = "TABELA USUARIOS.")
@Data
@Entity
@Table(name = "USUARIOS", schema = "PUBLIC")
public class UsuariosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OID_USUARIOS")
    private Long oidUsuarios;

    @Column(name = "NOME", length = 100)
    private String nome;

    @Column(name = "NR_CPF", length = 14)
    private String nrCpf;

    @Column(name = "DT_NASCIMENTO")
    @Temporal(TemporalType.DATE)
    private Date dtNascimento;

    @Column(name = "NM_RESPONSAVEL", length = 100)
    private String nmResponsavel;

    @Column(name = "NOTA_VESTIBULAR", precision = 5, scale = 2)
    private Double notaVestibular;

    @Column(name = "DS_STATUS", length = 50)
    private String dsStatus;

    @Column(name = "DS_SENHA")
    private String dsSenha;

    @Column(name = "OID_PERIODO")
    private Long oidPeriodo;

    @Column(name = "VR_BOLSA")
    private Double vrBolsa;
}