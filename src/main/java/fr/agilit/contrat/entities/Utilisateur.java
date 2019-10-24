package fr.agilit.contrat.entities;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "UTILISATEUR")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Utilisateur extends BaseEntityClass {

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "PASSWORD")
    private String password;
}
