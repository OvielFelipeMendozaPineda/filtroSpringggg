package filtrospring.filtro.Labatory.Infrastructure.out;

import org.springframework.data.jpa.repository.JpaRepository;

import filtrospring.filtro.Labatory.Domain.Labatory;

public interface LabatoryRepository extends JpaRepository<Labatory, Long>{
    
}
