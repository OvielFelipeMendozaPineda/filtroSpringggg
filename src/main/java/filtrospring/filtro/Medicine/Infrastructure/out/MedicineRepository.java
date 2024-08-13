package filtrospring.filtro.Medicine.Infrastructure.out;

import org.springframework.data.jpa.repository.JpaRepository;

import filtrospring.filtro.Medicine.Domain.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Long>{
    
}
