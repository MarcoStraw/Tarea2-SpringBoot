package marco.miranda.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import marco.miranda.model.Supervisor;

public interface ISupervisorRepo extends JpaRepository<Supervisor, Integer> {

}
