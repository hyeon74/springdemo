package com.example.enumdemo;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EnumUtil {

    private Map<String, List<EnumDto>> factory = new HashMap<>();

    public List<EnumDto> getEnumList(Class<? extends EnumEntity> e){
        return Arrays
                .stream(e.getEnumConstants())
                .map(EnumDto::new)
                .collect(Collectors.toList());
    }

    /*
    public void put(String key, Class<? extends EnumEntity> e){
        factory.put(key, getEnumList(e));
    }

    public Map<String, List<EnumDto>> getAll(){
        return factory;
    }

    public Map<String, List<EnumDto>> get(String keys){
        return Arrays
                .stream(keys.split(","))
                .collect(Collectors.toMap(Function.identity(), key -> factory.get(key)));
    }

    public EnumDto findBykey(Class<? extends EnumEntity> e, String key ){
        return getEnumList(e).stream().filter(h -> h.getKey().equals(key)).findFirst().orElseThrow(() -> new IllegalArgumentException());
    }
     */

}
