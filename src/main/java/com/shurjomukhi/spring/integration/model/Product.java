package com.shurjomukhi.spring.integration.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@Accessors(chain = true)
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Double price;
}
