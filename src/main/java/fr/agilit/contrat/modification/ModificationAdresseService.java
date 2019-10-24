package fr.agilit.contrat.modification;

import fr.agilit.contrat.entities.Adresse;

import java.util.List;

public interface ModificationAdresseService {

    public List<Adresse> retreiveAdresses();

    public Adresse getAdresse(Long id);

    public void saveAdresse(Adresse adresse);

    public void updateAdresse(Adresse adresse);
}
