package com.example.PA4.Controller;

import java.util.List;

import com.example.PA4.Entidade.Farmacia;
import com.example.PA4.Service.FarmService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FarmController {
    
    @Autowired
    private FarmService servico;
    

    @GetMapping("/farmacias")
    public ModelAndView getFarm() {
        ModelAndView mv = new ModelAndView("farmacias");
        mv.addObject("farmacias", servico.getFarm());
        return mv;
    }
    @GetMapping("/farmacias/{Estado}")
    public ModelAndView getbyEstado(@PathVariable(name = "Estado") String Estado) {
        ModelAndView mv = new ModelAndView("farmacias");
        List<Farmacia> far = servico.buscarPorEstado(Estado);
        mv.addObject("farmacias", far);
        return mv;
    }

}
