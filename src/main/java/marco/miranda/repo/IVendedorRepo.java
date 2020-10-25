package marco.miranda.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import marco.miranda.model.Vendedor;

public interface IVendedorRepo extends JpaRepository<Vendedor, Integer> {

}
