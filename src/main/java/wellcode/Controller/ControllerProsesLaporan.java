package wellcode.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerProsesLaporan {

    @RequestMapping({"proses-laporan"})
    public  String getPage()
    {
        return "proses-laporan";
    }
}
