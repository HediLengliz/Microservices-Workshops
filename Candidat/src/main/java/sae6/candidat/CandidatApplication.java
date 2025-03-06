package sae6.candidat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import sae6.candidat.Entities.Candidat;
import sae6.candidat.Repositories.CandidatRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class CandidatApplication {

    public static void main(String[] args) {
        SpringApplication.run(CandidatApplication.class, args);
        System.out.println("RANI NEKHDM");
    }

//    @Autowired
//    private CandidatRepository repository;
//
//    @Bean
//    ApplicationRunner init() {
//        return (args) -> {
//          // save
//            repository.save(new Candidat("Mariem", "Ch", "ma@esprit.tn"));
//            repository.save(new Candidat("Sarra", "ab", "sa@esprit.tn"));
//            repository.save(new Candidat("Mohamed", "ba", "mo@esprit.tn"));
//            repository.save(new Candidat("Maroua", "dh", "maroua@esprit.tn"));
//
//           // fetch
//            repository.findAll().forEach(System.out::println);
//
//        };
//
//
//    }
}
