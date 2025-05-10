package br.com.fiap.energy.entities;

public enum StatusEquipment {

    ATIVO("ATIVO"),
    INATIVO("INATIVO");

    private String description;

    StatusEquipment(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
