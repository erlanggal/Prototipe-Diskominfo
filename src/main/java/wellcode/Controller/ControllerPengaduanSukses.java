package wellcode.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerPengaduanSukses {

    @RequestMapping({"pengaduan-sukses"})
    public  String getPage()
    {
        return "pengaduan-sukses";
    }
}
