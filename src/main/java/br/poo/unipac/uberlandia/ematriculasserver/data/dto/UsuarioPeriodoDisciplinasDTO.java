package br.poo.unipac.uberlandia.ematriculasserver.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioPeriodoDisciplinasDTO {
    private Long oidUsuario;
    private String nmUsuario;
    private String cpfUsuario;
    private Date dtNascimento;
    private String nmResponsavel;
    private Double notaVestibular;
    private String dsStatus;
    private Long oidPeriodo;
    private Double vrBolsa;
    private String dsPeriodo;
    private ArrayList<Object> disciplinas;
    private String dsSenha;
}
