
package Domingo_Reto3.Reto3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Andrea Lozano Cataño
 */
@Entity
@Table(name = "computer")
/**
 * Esta clase es la entidad Computer
 */
public class Computer implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * id es la variable de código de computer
     */
    private String name;
    /**
     * nombre de computer
     */
    private String brand;
    /**
     * marca de computer
     */
    private Integer year;
    /**
     * año de computer
     */
    private String description;
    /**
     * descripción de computer
     */
    
    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("computers")
    private Categoria category;
    /**
     * variable de tipo Categoria
     */
    
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "computer")
    @JsonIgnoreProperties({"computer","client"})
    private List<Mensaje> messages;
    /**
     * variable de tipo Lista
     */
    
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "computer")
    @JsonIgnoreProperties({"computer","client"})
    private List<Reservas> reservations;

    /**
     * método para consultar Id
     * @return 
     */
    public Integer getId() {
        return id;
    }

    /**
     * método para configurar Id
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * método para consultar nombre
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * método para configurar nombre
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * método para consultar marca
     * @return 
     */
    public String getBrand() {
        return brand;
    }

    /**
     * método para configurar marca
     * @param brand 
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * método para consultar año
     * @return 
     */
    public Integer getYear() {
        return year;
    }

    /**
     * método para configurar año
     * @param year 
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * método para consultar descripción
     * @return 
     */
    public String getDescription() {
        return description;
    }

    /**
     * método para configurar descripción
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * método para consultar categoria
     * @return 
     */
    public Categoria getCategory() {
        return category;
    }

    /**
     * método para configurar categoria
     * @param category 
     */
    public void setCategory(Categoria category) {
        this.category = category;
    }

    /**
     * método para consultar mensajes
     * @return 
     */
    public List<Mensaje> getMessages() {
        return messages;
    }

    /**
     * método para configurar mensajes
     * @param messages 
     */
    public void setMessages(List<Mensaje> messages) {
        this.messages = messages;
    }

    /**
     * método para consultar reservaciones
     * @return 
     */
    public List<Reservas> getReservations() {
        return reservations;
    }

    /**
     * método para configurar reservaciones
     * @param reservations 
     */
    public void setReservations(List<Reservas> reservations) {
        this.reservations = reservations;
    }
    
}
