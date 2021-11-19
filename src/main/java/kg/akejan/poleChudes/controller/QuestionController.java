package kg.akejan.poleChudes.controller;

import kg.akejan.poleChudes.services.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/question")
public class QuestionController {

    private QuestionService questionService;
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/newQuestion")
    public String createNewQuestion(Model model)  {
        model.addAttribute("name", "Hy Akejan!");
        return "newQuestion";
    }

    @GetMapping("/getAllQuestions")
    public String getAllQuestion(Model model) {
        model.addAttribute("allQuestions", questionService.findAll());
        return "question";
    }



}
