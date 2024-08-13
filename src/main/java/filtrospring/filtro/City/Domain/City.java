package filtrospring.filtro.City.Domain;

import java.util.List;


import filtrospring.filtro.Labatory.Domain.Labatory;
import filtrospring.filtro.Region.Domain.Region;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameCity;
    @ManyToOne
    private Region codeReg;

    @OneToMany
    private List<Labatory> labatories;

}
