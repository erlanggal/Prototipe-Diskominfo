package wellcode.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerAdminDetailLaporan {

    @RequestMapping({"adminDetailLaporan"})
    public String getPage()
    {
        return "adminDetailLaporan";
    }
}
