package nc.univ.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import nc.univ.service.IEmployeService;

/**
 * EmployeController
 */
@Controller
@RequestMapping(value = "/employe")
public class EmployeController {

    @Autowired
        IEmployeService employeService;

    @GetMapping(value="/getAllEmployes", produces="text/html")
    public String getAllEmployes(Model model, HttpServletResponse resp) {
        
        model.addAttribute("employes", employeService.getAllEmployes());
        
        return "employeListDisplay";
    }
}