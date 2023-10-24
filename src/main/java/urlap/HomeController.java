package urlap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

        @GetMapping("/")
        public String home() {
            return "index";
        }
        @GetMapping("/kapcsolat")
        public String urlap() {
            return "kapcsolat";
        }
        @GetMapping("/regisztracio")
        public String regisztracio() {
            return "regisztracio";
        }

        @GetMapping("/bejelentkezes")
        public String bejelentkezes() {
            return "bejelentkezes";
        }
         @GetMapping("/üzenetek")
         public String üzenetek() {
            return "üzenetek";
         }
}

