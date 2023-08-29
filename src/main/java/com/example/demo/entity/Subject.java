package com.example.demo.entity;
import lombok.*;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    public class Subject {
        private String id;

        private String title;
        private int credit;
    }

