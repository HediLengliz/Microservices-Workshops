package sae6.candidat.Services;

import sae6.candidat.Entities.Candidat;

import java.util.List;

public interface ICandidat {
    List<Candidat> getAllCandidats();
    public Candidat addCandidat(Candidat candidat);
    public String deleteCandidat(int id);
    public Candidat getCandidat(int id);
    public Candidat updateCandidat(int id, Candidat newCandidat );
    public Candidat getCandidatByNom(String nom);
}
