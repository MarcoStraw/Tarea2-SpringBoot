package marco.miranda.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import marco.miranda.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer> {

}
