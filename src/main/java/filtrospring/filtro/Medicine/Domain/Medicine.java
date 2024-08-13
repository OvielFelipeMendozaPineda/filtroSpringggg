package filtrospring.filtro.Medicine.Domain;


import filtrospring.filtro.Labatory.Domain.Labatory;
import filtrospring.filtro.ModeAdministrator.Domain.ModeAdministrator;
import filtrospring.filtro.UnitMesurement.Domain.UnitMesurement;
import filtrospring.filtro.activePrinciple.Domain.ActivePrinciple;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String proceedings ;
    private String nameMedicine ;
    private String healthRegister ;
    private String description ;
    private String descriptionShort ;
    @ManyToOne
    private ModeAdministrator codeModeAdmin;
    @ManyToOne
    private ActivePrinciple codeAp ;
    @ManyToOne
    private UnitMesurement codeUm ;
    private String nameRol ;
    @ManyToOne
    private Labatory codeLab ;
}
