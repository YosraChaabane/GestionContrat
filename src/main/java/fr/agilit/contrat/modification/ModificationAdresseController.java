package fr.agilit.contrat.modification;

import fr.agilit.contrat.entities.Adresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ModificationAdresseController {
    //static final String PUT_GET_ADRESSE_URL = "/adresses/{id}";

    @Autowired
    private ModificationAdresseService modificationAdresseService;


    public void setModificationAdresseService(ModificationAdresseService modificationAdresseService) {
        this.modificationAdresseService = modificationAdresseService;
    }

    @GetMapping("/api/adresses/{id}")
    public Adresse getAdresse(@PathVariable(name="id") Long id){
        return modificationAdresseService.getAdresse(id);
    }

    @GetMapping("/api/adresses")
    public List<Adresse> getAdresses(){
        List<Adresse> adresses =  modificationAdresseService.retreiveAdresses();
         return adresses;
    }

    @PostMapping("/api/adresses")
    public void saveAdresse(Adresse adresse){
        modificationAdresseService.saveAdresse(adresse);

    }

    @PutMapping("/api/adresses/{id}")
    public void updateAdresse(@RequestBody Adresse adresse, @PathVariable(name="id") Long id ){
        Adresse ancienneAdresse =  modificationAdresseService.getAdresse(id);
        if(ancienneAdresse != null) {
            modificationAdresseService.updateAdresse(adresse);
        }
    }

}
