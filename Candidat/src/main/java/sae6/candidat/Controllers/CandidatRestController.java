package sae6.candidat.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sae6.candidat.Entities.Candidat;
import sae6.candidat.Repositories.CandidatRepository;
import sae6.candidat.Services.CandidatService;
import sae6.candidat.Services.ICandidat;

import java.util.List;

@RestController
@RequestMapping("/candidats")
@AllArgsConstructor
//@Tag(name = "Candidat", description = "Candidat API")
public class CandidatRestController {
//     private  String title="hello from candidat";
   private    CandidatService candidatService;
   private CandidatRepository candidatRepository;
   ICandidat iCandidat;
    @PostMapping( MediaType.APPLICATION_JSON_VALUE) @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Candidat> createCandidat(@RequestBody Candidat candidat) { return new ResponseEntity<>(candidatService.addCandidat(candidat), HttpStatus.OK);
    }

    @GetMapping("/GetCandidat")
    public Candidat getCandidat(@RequestParam int id){
        return candidatService.getCandidat(id);
    }
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE) @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteCandidat(@PathVariable(value = "id") int id){ return new ResponseEntity<>(candidatService.deleteCandidat(id), HttpStatus.OK);
    }

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE) @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Candidat> updateCandidat(@PathVariable(value = "id") int id, @RequestBody Candidat candidat){
        return new ResponseEntity<> (candidatService.updateCandidat(id, candidat), HttpStatus.OK);
    }
//    @Operation(summary = "Get all candidats")
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Candidat> getAllCandidats(){
        return candidatService.getAllCandidats();
    }
    @GetMapping(value = "/candidat/{nom}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Candidat getCandidatByNom(@PathVariable(value = "nom") String nom){
        return  candidatService.getCandidatByNom(nom);
    }
//     @RequestMapping("/hello")
//        public String sayHello(){
//         System.out.println(title);
//            return title;
//        }

}
