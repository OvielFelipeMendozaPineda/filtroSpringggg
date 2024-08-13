package filtrospring.filtro.Medicine.Domain;

import filtrospring.filtro.ModeAdministrator.Domain.ModeAdministrator;
import filtrospring.filtro.UnitMesurement.Domain.UnitMesurement;
import filtrospring.filtro.activePrinciple.Domain.ActivePrinciple;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MedicineDTO {

    private Long id;
    private String proceedings ;
    private String nameMedicine ;
    private String healthRegister ;
    private String description ;
    private String descriptionShort ;
    private ModeAdministrator codeModeAdmin;
    private ActivePrinciple codeAp ;
    private UnitMesurement codeUm ;
    private String nameRol ;
    private String laboratory ;
}

