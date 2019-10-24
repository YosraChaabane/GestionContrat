package fr.agilit.contrat.entities;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@Table(name = "EVENEMENT")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Evenement extends BaseEntityClass {

    @Column(name = "DATE_MODIFICATION")
    private Date dateModification;

    @OneToOne(optional=false)
    @JoinColumn(name = "ID_NOUVELLE_ADRESSE", nullable=false)
    private Adresse nouvelleAdresse;

    @OneToOne(optional=false)
    @JoinColumn(name = "ID_ANCIENNE_ADRESSE", nullable=false)
    private Adresse ancienneAdresse;

    @OneToOne(optional=false)
    @JoinColumn(name = "ID_UTILISATEUR", nullable=false)
    private Utilisateur utilisateur;

}
