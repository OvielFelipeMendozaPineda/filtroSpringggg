package filtrospring.filtro.Customer.Domain;

import java.time.LocalDateTime;

import filtrospring.filtro.City.Domain.City;
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
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameCustomer;
    private String lastNameCustomer;
    @ManyToOne
    private City city;
    private String emailCustomer;
    private LocalDateTime  birthDate;

}
