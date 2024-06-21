package ncba.portal.ncbaassessment.Controllers;

import ncba.portal.ncbaassessment.Entities.AppUser;
import ncba.portal.ncbaassessment.response.CustomResponse;
import ncba.portal.ncbaassessment.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/api/user")
public class UserControllers {
    Logger logger = LoggerFactory.getLogger(UserControllers.class);

    @Autowired
    UserService userService;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ResponseEntity<CustomResponse> addUser(@RequestBody AppUser appUser){
        CustomResponse customResponse = new CustomResponse("","");
        try {
            AppUser userCreated = userService.createUser(appUser);
            customResponse.setResponseMessage("User Added Successfully");
            customResponse.setResponseObject(userCreated);
            logger.info("The custom response is :: " + customResponse);
        } catch (Exception exception){
            logger.error("User creation error :: " + exception.getMessage());
            customResponse.setResponseMessage(exception.getMessage());
        }
        return new ResponseEntity<CustomResponse>(customResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/getusers",method = RequestMethod.GET)
    public ResponseEntity<CustomResponse> getAllUsers(){
        CustomResponse customResponse = new CustomResponse("","");
        try {
            List<AppUser> allUsers = userService.getAllUsers();
            customResponse.setResponseMessage("All users gotten");
            customResponse.setResponseObject(allUsers);
            logger.info("The custom response is :: " + customResponse);
        } catch (Exception exception){
            logger.error("Error occurred during execution :: " + exception.getMessage());
            customResponse.setResponseMessage(exception.getMessage());
        }
        return new ResponseEntity<CustomResponse>(customResponse, HttpStatus.OK);
    }


}
