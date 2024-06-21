package ncba.portal.ncbaassessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class NcbaAssessmentApplication {
    public static void main(String[] args) {
        SpringApplication.run(NcbaAssessmentApplication.class, args);
    }

}
