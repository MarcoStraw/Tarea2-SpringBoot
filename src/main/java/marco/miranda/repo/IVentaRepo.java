package marco.miranda.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import marco.miranda.model.Venta;

public interface IVentaRepo extends JpaRepository<Venta, Integer> {

}
