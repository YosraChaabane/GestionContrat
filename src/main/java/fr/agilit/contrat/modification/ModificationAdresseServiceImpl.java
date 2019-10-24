package fr.agilit.contrat.modification;

import fr.agilit.contrat.entities.Adresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModificationAdresseServiceImpl implements ModificationAdresseService {

    @Autowired
    private AdresseRepository adresseRepository;

    public void setAdresseRepository(AdresseRepository adresseRepository) {
        this.adresseRepository = adresseRepository;
    }

    public Adresse getAdresse(Long id) {
        Optional<Adresse> optAdresse = adresseRepository.findById(id);
        return optAdresse.get();
    }

    public List<Adresse> retreiveAdresses() {
        List<Adresse> adresses = adresseRepository.findAll();
        return adresses;
    }


    public void saveAdresse(Adresse adresse) {
        adresseRepository.save(adresse);
    }


    public void updateAdresse(Adresse adresse) {
        adresseRepository.save(adresse);
    }
}
