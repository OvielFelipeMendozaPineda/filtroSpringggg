package filtrospring.filtro.Labatory.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import filtrospring.filtro.Labatory.Domain.Labatory;
import filtrospring.filtro.Labatory.Domain.LabatoryDTO;
import filtrospring.filtro.Labatory.Infrastructure.out.LabatoryRepository;

@Service
public class LabatoryService {
    
    @Autowired
    private LabatoryRepository labatoryRepository;

    public LabatoryDTO getLabatory(Long id) {
        Labatory labatory = labatoryRepository.findById(id).get();
        LabatoryDTO labatoryDTO = new LabatoryDTO();
        labatoryDTO.setLabatoryName(labatory.getNamelab());
        return labatoryDTO;
    }
} 
