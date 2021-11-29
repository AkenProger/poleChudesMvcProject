package kg.akejan.poleChudes.controller;

import kg.akejan.poleChudes.models.dtos.UsersDto;
import kg.akejan.poleChudes.services.QuestionService;
import kg.akejan.poleChudes.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final QuestionService questionService;

    public UserController(UserService userService, QuestionService questionService) {
        this.userService = userService;
        this.questionService = questionService;
    }

    @GetMapping("/get")
    public String getName() {
        return "Hello, I am from Java Spring!";
    }


}
