package wellcode.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerProfil {

    @RequestMapping({"profil"})
    public String getPage()
    {
        return "profil";
    }
}
