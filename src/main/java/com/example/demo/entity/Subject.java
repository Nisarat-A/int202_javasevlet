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

        public String getName() {
            return title;
        }

        public String getSubjectId() {
            return id;
        }

        public String getSubjectName() {
            return title;
        }

        public String getSubjectCredit() {
            return String.valueOf(credit);
        }
    }

