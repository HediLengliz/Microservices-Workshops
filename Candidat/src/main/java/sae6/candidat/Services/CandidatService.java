package sae6.candidat.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sae6.candidat.Entities.Candidat;
import sae6.candidat.Repositories.CandidatRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CandidatService  implements ICandidat{
    private  CandidatRepository candidatRepository;


    @Override
    public List<Candidat> getAllCandidats() {
        return candidatRepository.findAll();
    }

    @Override
    public Candidat addCandidat(Candidat candidat) {
        return candidatRepository.save(candidat);
    }

    public String deleteCandidat(int id) {
        if (candidatRepository.findById(id).isPresent()) { candidatRepository.deleteById(id);
            return "candidat supprimé";
        } else
            return "candidat non supprimé";
    }



    @Override
    public Candidat getCandidat(int id) {
        return candidatRepository.findById(id).get();
    }

    @Override
    public Candidat updateCandidat(int id, Candidat newCandidat) {
        if (candidatRepository.findById(id).isPresent()) {

            Candidat existingCandidat = candidatRepository.findById(id).get(); existingCandidat.setNom(newCandidat.getNom()); existingCandidat.setPrenom(newCandidat.getPrenom()); existingCandidat.setEmail(newCandidat.getEmail());

            return candidatRepository.save(existingCandidat);
        } else
            return null;
    }

    @Override
    public Candidat getCandidatByNom(String nom) {
        return candidatRepository.findByNom(nom);
    }


}

