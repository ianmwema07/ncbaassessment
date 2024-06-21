package ncba.portal.ncbaassessment.repos;

import ncba.portal.ncbaassessment.Entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {
}
