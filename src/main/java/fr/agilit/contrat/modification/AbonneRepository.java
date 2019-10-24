package fr.agilit.contrat.modification;

import fr.agilit.contrat.entities.Abonne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface AbonneRepository extends JpaRepository<Abonne, Long> {

}
