package com.ua.homework23;

import java.util.Objects;

public class SurName {
    private String surName;

    public SurName(String surName) {
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SurName surName1 = (SurName) o;
        return Objects.equals(surName, surName1.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surName);
    }

    @Override
    public String toString() {
        return "SurName {" +
                "surName='" + surName + '\'' +
                '}';
    }
}
