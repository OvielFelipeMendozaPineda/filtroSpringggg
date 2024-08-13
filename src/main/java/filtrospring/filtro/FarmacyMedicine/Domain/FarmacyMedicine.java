package filtrospring.filtro.FarmacyMedicine.Domain;

import filtrospring.filtro.Farmacy.Domain.Farmacy;
import filtrospring.filtro.Medicine.Domain.Medicine;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FarmacyMedicine
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FarmacyMedicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne
    private Farmacy farmacy;
    @OneToOne   
    private Medicine medicine;
    private Double price;
}