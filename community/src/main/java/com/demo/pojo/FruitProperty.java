package com.demo.pojo;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
@ConfigurationProperties("fruit") //application.yml의 프로퍼티값들은 아래 FruitProperty클래스의 list 필드로 바인딩 됨
public class FruitProperty {
    private List<Map> list;
//    private List<Fruit> list;

}
