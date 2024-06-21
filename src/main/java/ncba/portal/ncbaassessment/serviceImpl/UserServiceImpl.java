package ncba.portal.ncbaassessment.serviceImpl;

import ncba.portal.ncbaassessment.Entities.AppUser;
import ncba.portal.ncbaassessment.repos.UserRepository;
import ncba.portal.ncbaassessment.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public AppUser findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public AppUser createUser(AppUser appUser) {
        return userRepository.saveAndFlush(appUser);
    }

    @Override
    public List<AppUser> getAllUsers() {
        return userRepository.findAll();
    }
}
