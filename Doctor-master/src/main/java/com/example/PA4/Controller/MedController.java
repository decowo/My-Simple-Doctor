package com.example.PA4.Controller;

import java.util.List;

import com.example.PA4.Entidade.Medicamento;
import com.example.PA4.Service.MedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MedController {

    @Autowired
    private MedService servico;

    @GetMapping("/medicamentos")
    public ModelAndView getMeds() {
        ModelAndView mv = new ModelAndView("medicamentosTemplate");
        mv.addObject("medicamentos", servico.getMeds());
        return mv;
    }
    /** @GetMapping("/medicamentos/{idmed}")
    // public ModelAndView getbyid(@PathVariable(name = "idmed") Integer idmed) {
    // Medicamento med = servico.getmedbyid(idmed);
    // ModelAndView mv = new ModelAndView("medicamentosTemplate");
    // mv.addObject("medicamentos", servico.getmedbyid(idmed));
    // return mv;
    // } **/

    @GetMapping("/medicamentos/{indicacao}")
    public ModelAndView getbyindicacao(@PathVariable(name = "indicacao") String indicacao) {
        ModelAndView mv = new ModelAndView("medicamentosTemplate");
        List<Medicamento> med = servico.buscarPorindicacao(indicacao);
        mv.addObject("medicamentos", med);
        return mv;
    }
}
