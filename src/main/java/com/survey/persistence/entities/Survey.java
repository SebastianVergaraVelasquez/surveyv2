package com.survey.persistence.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "surveys")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Embedded
    Audit audit = new Audit();

    private String description;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "survey")
    private Set<Chapter> chapters;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "survey")
    private Set<Response> responses;

    public Survey() {
        this.chapters = new HashSet<>();
        this.responses = new HashSet<>();
    }

    public Survey(String nama, String description) {
        this();
        this.name = nama;
        this.description = description;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nama) {
        this.name = nama;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(Set<Chapter> chapters) {
        this.chapters = chapters;
    }

    public Survey addChapter(Chapter chapter){
        chapters.add(chapter);
        chapter.setSurvey(this);
        return this;
    }
    public Survey addResponses(Response response){
        responses.add(response);
        response.setSurvey(this);
        return this;
    }

    public Audit getAudit() {
        return audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public Set<Response> getResponses() {
        return responses;
    }

    public void setResponses(Set<Response> responses) {
        this.responses = responses;
    }

    @Override
    public String toString() {
        return "Survey [id=" + id + ", name=" + name + ", audit=" + audit + ", description=" + description
                + ", chapters=" + chapters + ", responses=" + responses + "]";
    }

}
