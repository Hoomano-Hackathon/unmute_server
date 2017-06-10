package io.unmutepeper.api.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Joke {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String lang;
    private Boolean isAnswer;
    private String content;
    private String answer;
    private Date created_at;

    @OneToMany(mappedBy = "joke")
    private List<Reaction> reactions;

    @ManyToOne
    private Agent agent;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Boolean getAnswer() {
        return isAnswer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public List<Reaction> getReactions() {
        return reactions;
    }

    public void setReactions(List<Reaction> reactions) {
        this.reactions = reactions;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public void setAnswer(Boolean answer) {
        isAnswer = answer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}


