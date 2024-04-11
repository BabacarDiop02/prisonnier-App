package diop.babacar.prisonier.web;

import diop.babacar.prisonier.entities.Prisonier;
import diop.babacar.prisonier.repository.PrisonnierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PrisonnierControler {
    @Autowired
    private PrisonnierRepository prisonnierRepository;

    @GetMapping("/index")
    public String index(Model model) {
        List<Prisonier> prisoniers = prisonnierRepository.findAll();
        model.addAttribute("listPrisoniers", prisoniers);
        return "prisonniers";
    }

    @GetMapping("/deletePrisonnier")
    public String deletePrisonnier(@RequestParam(name = "id") Long id) {
        prisonnierRepository.deleteById(id);
        return "redirect:/index";
    }
}
