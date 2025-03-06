package sae6.candidat.Entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "CANDIDAT")
public class Candidat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
     String nom;
     String prenom;
     String email;


//    public Candidat(String mariem, String ch, String mail) {
//        this.nom=mariem;
//        this.email=mail;
//        this.prenom=ch;
//    }
}
