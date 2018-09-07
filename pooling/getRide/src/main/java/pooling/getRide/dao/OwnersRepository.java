package pooling.getRide.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pooling.getRide.entity.Owner;

import java.util.List;


@Repository
public interface OwnersRepository extends JpaRepository<Owner, Integer> {

    List<Owner> findAll();

}

