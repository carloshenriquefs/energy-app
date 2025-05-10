package br.com.fiap.energy.entities;

public enum UserRole {

    ADMIN("ADMIN"),
    USER("USER");

    private String role;

    private UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
