package kg.akejan.poleChudes.controller;
import kg.akejan.poleChudes.models.dtos.QuestionsDto;
import kg.akejan.poleChudes.services.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private final QuestionService questionService;
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/newQuestion")
    public String createNewQuestion(Model model)  {
        model.addAttribute("name", "Hy Akejan!");
        return "newQuestion";
    }

    @GetMapping("/getAllQuestions")
    public List<QuestionsDto> getAll() {
        return questionService.findAll();
    }



}
