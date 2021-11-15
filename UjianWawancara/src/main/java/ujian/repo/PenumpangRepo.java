package ujian.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ujian.model.PenumpangModel;

public interface PenumpangRepo extends JpaRepository<PenumpangModel, Integer> {
    
}
