package com.ankush.spring.webflux.springreactivewebflux;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ankushnakaskar
 */
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {

    private Integer id;

    private String name;


    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }
}
