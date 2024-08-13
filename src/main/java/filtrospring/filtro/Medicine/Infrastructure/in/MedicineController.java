package filtrospring.filtro.Medicine.Infrastructure.in;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import filtrospring.filtro.Medicine.Domain.Medicine;
import filtrospring.filtro.Medicine.Service.MedicineService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/medicine")
public class MedicineController {

    @Autowired
    public MedicineService  medicineService;
    
    @GetMapping("/getAll")
    public List<Medicine> getAllMedicines() {
        return medicineService.getAllMedicines();
    }
    @GetMapping("/getMedicine")
    public Optional<Medicine> getMedicine(@PathVariable Long id) {
        return medicineService.getMedicine(id);
    }
    
    @PostMapping("/saveMedicine")
    public Medicine saveMedicine(@RequestBody Medicine medicine) {
        return medicineService.saveMedicine(medicine);
    }

    @GetMapping("/delete")
    public ResponseEntity<Medicine> deleteMedicine(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }
    
    

    
}
