package com.example.annoitru;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "Accounts", uniqueConstraints = {
        @UniqueConstraint(name = "UQ__Accounts__F3DBC5723A4D6368", columnNames = {"username"})
})
public class Account {
    @Id
    @Nationalized
    @Column(name = "id", nullable = false, length = 10)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;

    @Nationalized
    @Column(name = "username", length = 50)
    private String username;

    @Nationalized
    @Column(name = "password_hash", length = 225)
    private String passwordHash;

    @Nationalized
    @Column(name = "role", length = 225)
    private String role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kitchen_employee_id")
    private KitchenEmployee kitchenEmployee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @Column(name = "status")
    private Boolean status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public KitchenEmployee getKitchenEmployee() {
        return kitchenEmployee;
    }

    public void setKitchenEmployee(KitchenEmployee kitchenEmployee) {
        this.kitchenEmployee = kitchenEmployee;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}