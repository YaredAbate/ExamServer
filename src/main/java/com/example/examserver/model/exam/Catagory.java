package com.example.examserver.model.exam;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "catagory")
public class Catagory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cId;
    @NotNull
    private String title;
    private String description;
    @OneToMany(mappedBy = "catagory", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Quiz> quizzes = new LinkedHashSet<>();

    public Catagory() {

    }

    public Catagory(String title, String description) {
        this.title = title;
        this.description = description;
    }


}
