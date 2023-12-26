package domain;

import TypeEnums.RoleType;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.Locale;

public class Customer {
    private Integer sequence=0;
    {
        sequence++;
    }
    private Integer id=sequence;
    private String name;
    private String password;
    private LocalDateTime localDateTime=LocalDateTime.now();
    private RoleType role=RoleType.CUSTOMER;

    public Customer(String name,String password) {
        this.name = name;
        this.password=password;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public RoleType getRole() {
        return role;
    }

    public void setRole(RoleType role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "sequence=" + sequence +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", localDateTime=" + localDateTime +
                ", role=" + role +
                '}';
    }
}

