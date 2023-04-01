package com.example.enumdemo;

import lombok.Data;
import lombok.ToString;

public class EnumDto {
    private String key;
    private String value;

    private String engval;

    public EnumDto(EnumEntity enumModel){
        key = enumModel.getKey();
        value = enumModel.getValue();
        engval = enumModel.getEngval();
    }

    public String getKey(){
        return key;
    }

    public String getValue(){
        return value;
    }

    public String getEngval(){
        return engval;
    }
}
