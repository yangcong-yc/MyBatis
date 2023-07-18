package com.yangcong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName People
 * @Description TODO
 * @date 2023/7/17 11:39
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class People {

    private Integer id;
    private String name;
    private Double money;
    private Integer age;


}
