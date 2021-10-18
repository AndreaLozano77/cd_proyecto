
package Domingo_Reto3.Reto3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Andrea
 */
@Repository
public class RepositorioReservas {
    @Autowired
    private InterfaceReservas crud4;
    
    public List<Reservas> getAll(){
        return (List<Reservas>) crud4.findAll();
    }
    
    public Optional<Reservas> getReservas(int id){
        return crud4.findById(id);
    }
    
    public Reservas save(Reservas reservation){
        return crud4.save(reservation);
    }
    
    public void delete(Reservas reservation){
        crud4.delete(reservation);
    }
}
