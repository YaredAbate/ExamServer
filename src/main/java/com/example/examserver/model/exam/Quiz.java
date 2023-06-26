package com.example.examserver.model.exam;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long qId;
    private String title;
    private String description;
    private String maxMarks;
    private String numberOfQuestions;
    private Boolean active=false;
    @ManyToOne(fetch =FetchType.EAGER)
    private Catagory catagory;
    @OneToMany(mappedBy="quiz",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JsonIgnore
    private Set<Question> questions=new HashSet<>();
    public Quiz() {
    }
}
