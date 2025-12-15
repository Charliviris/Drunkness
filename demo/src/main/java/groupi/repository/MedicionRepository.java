package GroupI.repository;


import GroupI.model.Medicion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MedicionRepository extends JpaRepository<Medicion, Long> {
}