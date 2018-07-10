package wellcode.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerPesanProsesLaporan {

    @RequestMapping({"pesan-proses-laporan"})
    public  String getPage()
    {
        return "pesan-proses-laporan";
    }
}
