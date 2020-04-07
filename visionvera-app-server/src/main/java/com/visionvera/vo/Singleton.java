package com.visionvera.vo;

import java.util.Objects;

public class Singleton {
    private static Singleton singleton;
    private int id;
    private String name;

    private Singleton(){}

    public static synchronized Singleton getSingleton(){
    if(singleton==null){
      singleton =  new Singleton();
    }
        return singleton;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Singleton singleton = (Singleton) o;
        return id == singleton.id &&
                Objects.equals(name, singleton.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
