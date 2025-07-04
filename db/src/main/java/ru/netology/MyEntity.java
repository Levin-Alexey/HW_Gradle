package ru.netology;

import java.util.UUID;

public class MyEntity {
    private UUID id;
    private String name;

    public MyEntity(String name) {
        this.name = name;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "MyEntity{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
