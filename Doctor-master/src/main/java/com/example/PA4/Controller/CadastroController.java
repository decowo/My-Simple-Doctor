package com.example.PA4.Controller;

import com.example.PA4.Entidade.Usuario;
import com.example.PA4.Service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CadastroController {
    
    @Autowired
    private UsuarioService servico;


    @GetMapping("/cadastro")
    public ModelAndView getUsuarios()
    {
        ModelAndView mv = new ModelAndView("cadastro");
        mv.addObject("usuarios", servico.getUsuarios());
        return mv;
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Usuario usuario)
    {
        servico.salvar(usuario);
        return "redirect:/cadastro";
    }
}
