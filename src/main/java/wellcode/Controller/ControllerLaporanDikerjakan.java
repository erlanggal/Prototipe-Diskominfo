package wellcode.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerLaporanDikerjakan {

    @RequestMapping({"adminLaporanDikerjakan"})
    public String getPage()
    {
        return "adminLaporanDikerjakan";
    }
}
