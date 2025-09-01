package com.ryans.basics.homework.day10.yml;

import java.util.Arrays;

public class Country {
    private String name;
    private Province[] provinces;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Province[] getProvinces() {
        return provinces;
    }

    public void setProvinces(Province[] provinces) {
        this.provinces = provinces;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", provinces=" + Arrays.toString(provinces) +
                '}';
    }
}
