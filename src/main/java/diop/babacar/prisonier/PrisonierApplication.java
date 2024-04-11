package diop.babacar.prisonier;

import diop.babacar.prisonier.entities.Prisonier;
import diop.babacar.prisonier.repository.PrisonnierRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrisonierApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrisonierApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(PrisonnierRepository prisonnierRepository) {
        return (args1) -> {
            Prisonier prisonier1 = new Prisonier();
            prisonier1.setNom("Seck");
            prisonier1.setPrenom("John");
            prisonier1.setNomPrisons("100 metre");
            prisonier1.setNumeroCellule(10);
            prisonier1.setCondannation(true);

            Prisonier prisonier2 = new Prisonier(null,"Fall", "Ali", "Les Gris", 8,false);

            Prisonier prisonier3 = Prisonier.builder()
                    .nom("Ndiaye")
                    .prenom("Marie")
                    .nomPrisons("100 metre")
                    .numeroCellule(20)
                    .build();

            prisonnierRepository.save(prisonier1);
            prisonnierRepository.save(prisonier2);
            prisonnierRepository.save(prisonier3);

            prisonnierRepository.findAll().forEach(System.out::println);
        };
    }
}
