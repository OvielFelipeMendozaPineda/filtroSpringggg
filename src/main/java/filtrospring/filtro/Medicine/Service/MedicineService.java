package filtrospring.filtro.Medicine.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import filtrospring.filtro.Labatory.Service.LabatoryService;
import filtrospring.filtro.Medicine.Domain.Medicine;
import filtrospring.filtro.Medicine.Domain.MedicineDTO;
import filtrospring.filtro.Medicine.Infrastructure.out.MedicineRepository;

@Service
public class MedicineService {

    @Autowired
    private MedicineRepository medicineRepository;

    @Autowired
    private LabatoryService labatoryService;

    public List<MedicineDTO> getAllMedicines() {
        List<Medicine> medicines = medicineRepository.findAll();

        List<MedicineDTO> medicineDTOs = new ArrayList<>();

        medicines.forEach(medicine -> {
            MedicineDTO medicineDTO = new MedicineDTO();
            medicineDTO.setId(medicine.getId());
            medicineDTO.setProceedings(medicine.getProceedings());
            medicineDTO.setNameMedicine(medicine.getNameMedicine());
            medicineDTO.setHealthRegister(medicine.getHealthRegister());
            medicineDTO.setDescription(medicine.getDescription());
            medicineDTO.setDescriptionShort(medicine.getDescriptionShort());
            medicineDTO.setCodeModeAdmin(medicine.getCodeModeAdmin());
            medicineDTO.setCodeAp(medicine.getCodeAp());
            medicineDTO.setCodeUm(medicine.getCodeUm());
            medicineDTO.setNameRol(medicine.getNameRol());
            medicineDTO.setLaboratory(labatoryService.getLabatory(medicine.getCodeLab().getId()).getLabatoryName());
            medicineDTOs.add(medicineDTO);
        });
        return medicineDTOs;
    }

    public MedicineDTO getMedicine(Long id) {
        Optional<Medicine> medicine = medicineRepository.findById(id);
        if (medicine.isEmpty()) {
            System.out.println("Esta presente----------------------------------------");
        }
        MedicineDTO medicineDTO = new MedicineDTO();
        medicineDTO.setId(medicine.get().getId());
        medicineDTO.setProceedings(medicine.get().getProceedings());
        medicineDTO.setNameMedicine(medicine.get().getNameMedicine());
        medicineDTO.setHealthRegister(medicine.get().getHealthRegister());
        medicineDTO.setDescription(medicine.get().getDescription());
        medicineDTO.setDescriptionShort(medicine.get().getDescriptionShort());
        medicineDTO.setCodeModeAdmin(medicine.get().getCodeModeAdmin());
        medicineDTO.setCodeAp(medicine.get().getCodeAp());
        medicineDTO.setCodeUm(medicine.get().getCodeUm());
        medicineDTO.setNameRol(medicine.get().getNameRol());
        medicineDTO.setLaboratory(labatoryService.getLabatory(medicine.get().getCodeLab().getId()).getLabatoryName());

        return medicineDTO;
    }

    public Medicine saveMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    public void deleteMedicine(Long id) {
        Optional<Medicine> medicineToDelete = medicineRepository.findById(id);
        medicineRepository.delete(medicineToDelete.get());
    }
}
