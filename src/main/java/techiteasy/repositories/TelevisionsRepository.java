package techiteasy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import techiteasy.models.Television;
import techiteasy.service.TelevisionsService;

import java.awt.*;
import java.util.Optional;

public interface TelevisionRepository extends JpaRepository<Television, Long> {
    List<Television> findAllTelevisionsByBrandEqualsIgnoreCase(String brand);

    Optional<Television> findById(Long id);

    Television save(Television tv);

    void deleteById(Long id);
}