package com.hamza.to_do_list.to_do_list;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "to_do_Table")

public class ToDo {


    @Id
    @GeneratedValue
    private  Integer id;
    @Column(nullable = false)
    private String title;

    private String priority;
    private Boolean status;
    @Column(nullable = false)
    private String description;

    private LocalDate startDate;
    @Column(nullable = false)
    private LocalDate expireDate;


    public ToDo() {
    }

    public ToDo(Integer id, String title, String priority, Boolean status, String description, LocalDate startDate, LocalDate expireDate) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.status = status;
        this.description = description;
        this.startDate = startDate;
        this.expireDate = expireDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }


    @Override
    public String toString() {
        return "ToDoList{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", priority='" + priority + '\'' +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", expireDate=" + expireDate +
                '}';
    }
}
