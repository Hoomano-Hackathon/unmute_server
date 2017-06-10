package io.unmutepeper.api.entities;

import javax.persistence.*;

/**
 * Created by Guyl Bastien on 10/06/2017.
 */

@Entity
public class Reaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private User user;
    @ManyToOne
    private Joke joke;
    private float smile;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Joke getJoke() {
        return joke;
    }

    public void setJoke(Joke joke) {
        this.joke = joke;
    }

    public float getSmile() {
        return smile;
    }

    public void setSmile(float smile) {
        this.smile = smile;
    }
}
