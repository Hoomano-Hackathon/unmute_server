package io.unmutepeper.api.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String last_IP;
    private Date last_connection;

    @OneToMany(mappedBy = "agent")
    private List<Joke> jokes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLast_IP() {
        return last_IP;
    }

    public void setLast_IP(String last_IP) {
        this.last_IP = last_IP;
    }

    public Date getLast_connection() {
        return last_connection;
    }

    public void setLast_connection(Date last_connection) {
        this.last_connection = last_connection;
    }

    public List<Joke> getJokes() {
        return jokes;
    }

    public void setJokes(List<Joke> jokes) {
        this.jokes = jokes;
    }
}