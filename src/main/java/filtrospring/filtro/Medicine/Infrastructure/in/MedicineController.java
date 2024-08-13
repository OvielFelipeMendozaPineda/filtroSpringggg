package filtrospring.filtro.Medicine.Infrastructure.in;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import filtrospring.filtro.Medicine.Domain.Medicine;
import filtrospring.filtro.Medicine.Domain.MedicineDTO;
import filtrospring.filtro.Medicine.Service.MedicineService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/medicine")
public class MedicineController {

    @Autowired
    public MedicineService  medicineService;
    
    @GetMapping("/getAll")
    public List<MedicineDTO> getAllMedicines() {
        return medicineService.getAllMedicines();
    }
    @GetMapping("/getMedicine")
    public MedicineDTO getMedicine(@RequestParam Long id) {
        return medicineService.getMedicine(id);
    }
    
    @PostMapping("/saveMedicine")
    public Medicine saveMedicine(@RequestBody Medicine medicine) {
        return medicineService.saveMedicine(medicine);
    }

    @DeleteMapping("/deleteMedicine")
    public String deleteMedicine(@RequestParam Long id) {
        medicineService.deleteMedicine(id);
        return "eliminado";
    }
    
    

    
}
