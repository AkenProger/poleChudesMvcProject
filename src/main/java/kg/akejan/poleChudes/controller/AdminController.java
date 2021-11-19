package kg.akejan.poleChudes.controller;

import kg.akejan.poleChudes.models.dtos.UsersDto;
import kg.akejan.poleChudes.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    private UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/index")
    public String signIn(Model model) {
        model.addAttribute("admin", new UsersDto());
        return "authorization";
    }

    @PostMapping("/author")
    public String authorization(@ModelAttribute("admin") UsersDto usersDto, Model model) {
        System.out.println(usersDto.getLogin());
         userService.checkingTheUser(usersDto);
            return "adminPage";
    }
}
