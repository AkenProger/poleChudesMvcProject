package kg.akejan.poleChudes.controller;

import kg.akejan.poleChudes.models.dtos.UsersDto;
import kg.akejan.poleChudes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {

    private final UserService service;
    public UserController(UserService service) {
        this.service = service;
    }




}
