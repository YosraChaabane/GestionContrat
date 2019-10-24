package fr.agilit.contrat.entities;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "ADRESSE")
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Adresse extends BaseEntityClass {

    @Column(name = "NUMERO")
    private String numero;

    @Column(name = "RUE")
    private String rue;

    @Column(name = "CODE_POSTAL")
    private String codePostal;

    @Column(name = "VILLE")
    private String ville;

    @Column(name = "PAYS")
    private String pays;

    @Column(name = "DATE_EFFET")
    private Date dateEffet;

    @Column(name = "TYPE_ADRESSE")
    @Enumerated(EnumType.STRING)
    private TypeAdresse typeAdresse;

    @Column(name = "ETAT_ADRESSE")
    @Enumerated(EnumType.STRING)
    private EtatAdresse etatAdresse;

}
