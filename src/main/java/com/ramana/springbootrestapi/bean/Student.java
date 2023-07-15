package com.ramana.springbootrestapi.bean;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class Student {
    private int id;
    private String firstName;
    private String lastName;

}
