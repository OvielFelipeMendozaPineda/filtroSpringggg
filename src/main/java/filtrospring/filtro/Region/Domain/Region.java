package filtrospring.filtro.Region.Domain;

import java.util.List;

import filtrospring.filtro.City.Domain.City;
import filtrospring.filtro.Country.Domain.Country;
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
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameReg;
    @ManyToOne
    private Country country;
    
    @OneToMany(mappedBy = "codeReg")
    private List<City> cities;


}
