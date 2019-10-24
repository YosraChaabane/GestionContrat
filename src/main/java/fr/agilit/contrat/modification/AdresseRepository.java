package fr.agilit.contrat.modification;

import fr.agilit.contrat.entities.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;


@RepositoryRestResource
public interface AdresseRepository extends JpaRepository<Adresse, Long> {

}
