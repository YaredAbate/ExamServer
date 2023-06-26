package com.example.examserver.model.exam;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long quesId;
    @Column(length=5000)
    private String content;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;
    @Transient
    private String givenAnswer;
    @ManyToOne(fetch = FetchType.EAGER)
    private Quiz quiz;

    public Question() {
    }
    @JsonIgnore
    public String getAnswer() {
        return answer;
    }
    @JsonProperty("answer")
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
