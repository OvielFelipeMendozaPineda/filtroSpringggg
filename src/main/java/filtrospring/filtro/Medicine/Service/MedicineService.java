package filtrospring.filtro.Medicine.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import filtrospring.filtro.Medicine.Domain.Medicine;
import filtrospring.filtro.Medicine.Infrastructure.out.MedicineRepository;

@Service
public class MedicineService {
    
    @Autowired
    private MedicineRepository medicineRepository;

    public List<Medicine> getAllMedicines() {
        return medicineRepository.findAll();
    }

    public Optional<Medicine> getMedicine(Long id) {
        return medicineRepository.findById(id);
    }
    public Medicine saveMedicine( Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    public void deleteMedicine (Long id) {
        Optional<Medicine> medicineToDelete = medicineRepository.findById(id);
        medicineRepository.delete(medicineToDelete.get());
    }
}
