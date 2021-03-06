package kg.akejan.poleChudes.controller;
import kg.akejan.poleChudes.models.dtos.UsersDto;
import kg.akejan.poleChudes.services.GameHistoryService;
import kg.akejan.poleChudes.services.QuestionService;
import kg.akejan.poleChudes.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AdminController {

    private final UserService userService;
    private final QuestionService questionService;
    private final GameHistoryService gameHistoryService;
    public AdminController(UserService userService, QuestionService questionService,
                           GameHistoryService gameHistoryService) {
        this.userService = userService;
        this.questionService = questionService;
        this.gameHistoryService = gameHistoryService;
    }

    @GetMapping("/index")
    public String signIn(Model model) {
        model.addAttribute("admin", new UsersDto());
        return "authorization";
    }

    @PostMapping("/author")
    public String authorization(@ModelAttribute("admin") UsersDto usersDto, Model model) {
        if (!userService.checkingTheUser(usersDto).equals("NTF")) {
            if (userService.checkingTheUser(usersDto).equals("ADMIN")) {
                return adminPage(model, usersDto);
            } else if (userService.checkingTheUser(usersDto).equals("USER")) {
                return userPage(model, usersDto);
            }
        }else {
            model.addAttribute("err", "Пользовател не найден");
            return signIn(model);
        }
        return "redirect:/index";
    }

    @GetMapping("/adminPage")
    public String adminPage(Model model, UsersDto usersDto) {
        model.addAttribute("adminName", userService.findUserByLogin(usersDto.getLogin()));
        return "adminPage";
    }

    @GetMapping("/userPage")
    public String userPage(Model model, UsersDto usersDto) {
        model.addAttribute("userName", userService.findUserByLogin(usersDto.getLogin()));
        model.addAttribute("randomQuestion", questionService.getRandomQuestion());
        model.addAttribute("gameHistory",
                gameHistoryService.findGameHistoryByUserId(userService.findUserIdByLogin(usersDto.getLogin())));
        return "userPage";
    }


}
