package fr.agilit.contrat.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@Table(name = "CONTRAT")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Contrat extends BaseEntityClass {

    @Column(name = "TYPE_ADRESSE")
    private String objet;

    @Column(name = "DATE_DEBUT")
    private Date dateDebut;

    @Column(name = "DATE_FIN")
    private Date dateFin;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "DOCUMENT")
    private byte[] document;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_ABONNE")
    private Abonne abonne;


    public Adresse getAdresse() {
        return abonne.getAdressePrincipale().orElseThrow( () -> new IllegalStateException("Acune addresse principale n'est trouvé pour le client"));
    }
}
