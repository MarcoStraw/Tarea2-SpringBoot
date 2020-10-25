package marco.miranda.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import marco.miranda.model.Marca;

public interface IMarcaRepo extends JpaRepository<Marca, Integer > {

}
