package ujian.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ujian.model.TiketModel;

public interface TiketRepo extends JpaRepository<TiketModel, Integer> {
    
}
