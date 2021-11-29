package kg.akejan.poleChudes.models.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kg.akejan.poleChudes.enums.RoleType;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class UsersDto {
    private Long id;

    @NotEmpty
    @Pattern(regexp = "[а-яА-Я]*", message = "Введите на кириллице")
    private String name;

    @Size(min = 6)
    @NotEmpty
    private String login;

    @Size(min = 5)
    @NotEmpty
    @Pattern(regexp = "[a-zA-Z0-9]*")
    private String password;

    private boolean active;
    private RoleType roleType;
}
