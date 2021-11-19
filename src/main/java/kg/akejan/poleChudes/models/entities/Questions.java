package kg.akejan.poleChudes.models.entities;

import lombok.Data;

import javax.persistence.*;


@Entity()
@Table(name = "questions")
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;
    private String answer;
    private boolean active;

}
