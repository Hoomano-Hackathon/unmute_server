package io.unmutepeper.api.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Guyl Bastien on 10/06/2017.
 */

@Entity
public class Joke {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String lang;
    private String title;
    private String joke;
    private String category;
    private String rank;

    @OneToMany(mappedBy = "joke")
    private List<Reaction> reactions;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}


