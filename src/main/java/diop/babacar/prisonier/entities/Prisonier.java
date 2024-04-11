package diop.babacar.prisonier.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PRISONNIER")
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class Prisonier {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String nomPrisons;
    private int numeroCellule;
    private Boolean condannation;

}
