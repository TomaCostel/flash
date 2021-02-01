package first.project.restproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import first.project.restproject.entity.Persoana;
import first.project.restproject.entity.Salariu;

@Repository
public interface PersoanaRepository extends JpaRepository<Persoana, Long>{
	
}
