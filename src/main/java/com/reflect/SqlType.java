package com.reflect;

public enum SqlType {
    UPDATE("update"),WHERE("where");

    SqlType(String name){
        this.name = name;
    }

    private String name;
}
