package programmers.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    private Date created_at;
    private Date updated_at;

    public Customer() {

    }

    @PrePersist
    protected void onCreate(){
        this.created_at = new Date();

    }
    @PreUpdate
    protected void onUpdate(){
        this.updated_at = new Date();

    }

    public Customer(Long id, String name, int age, Date created_at, Date updated_at) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}