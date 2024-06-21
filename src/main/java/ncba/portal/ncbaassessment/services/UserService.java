package ncba.portal.ncbaassessment.services;

import ncba.portal.ncbaassessment.Entities.AppUser;
import java.util.List;

public interface UserService {
    AppUser findById(Long id);

    AppUser createUser(AppUser appUser);

    List<AppUser> getAllUsers();
}
