package fr.vincedgy.quarkus;


import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Todo extends PanacheEntity {
    @Column(unique = true)
    @NotBlank
    @NotNull
    public String title;
    public String url;
    @Column(name = "ordering")
    public int order;
    public boolean completed;

    public static List<Todo> findNotCompleted() {
        return list("completed", false);
    }

    public static long deleteCompleted() {
        return delete("completed", true);
    }
}
