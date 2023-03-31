package br.edu.ifpb.locadora.utils;

public enum Console {
    PS5("PlayStation 5"),
    XBOX_SERIES_S("Xbox Series S"),
    NINTENDO_SWITCH("Nintendo Switch");

    private final String name;

    Console(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
