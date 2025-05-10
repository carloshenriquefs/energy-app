package br.com.fiap.energy.entities;

public enum AlertType {

    SURPASSED_LIMIT("SURPASSED_LIMIT"),
    NO_CONSUMPTION("NO_CONSUMPTION"),;

    private String description;

    AlertType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
