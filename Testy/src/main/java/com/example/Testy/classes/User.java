package com.example.Testy.classes;

import lombok.AccessLevel;
import lombok.Setter;
import lombok.Data;
import lombok.ToString;
@Data public class User {
    @Setter(AccessLevel.PACKAGE)  private String name;
    @Setter(AccessLevel.PACKAGE) private int age;
    private double score;
    private String[] tags;

    public User(String name) {

        this.name = name;
    }

    @ToString(includeFieldNames=true)
    @Data(staticConstructor="of")
    public static class Exercise<T> {
        private final String name;
        private final T value;
    }
}
