package ujian.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ujian.model.TravelModel;

public interface TravelRepo extends JpaRepository<TravelModel, Integer> {
    
}
