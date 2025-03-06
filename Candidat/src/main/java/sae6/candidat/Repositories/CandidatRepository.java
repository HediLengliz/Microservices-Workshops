package sae6.candidat.Repositories;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.*;

import sae6.candidat.Entities.Candidat;

public interface CandidatRepository extends JpaRepository<Candidat,Integer> {
    Candidat findByNom(String nom);
}
