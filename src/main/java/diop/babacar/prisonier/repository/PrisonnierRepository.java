package diop.babacar.prisonier.repository;

import diop.babacar.prisonier.entities.Prisonier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrisonnierRepository extends JpaRepository<Prisonier, Long> {
}
