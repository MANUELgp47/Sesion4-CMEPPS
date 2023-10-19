package Sesion4.db_driven_adapter.jparepository;
import org.springframework.data.jpa.repository.JpaRepository;

import Sesion4.db_driven_adapter.domain.*;

public interface HAAJpaRepository extends JpaRepository<BookEntity, Long>{

}
