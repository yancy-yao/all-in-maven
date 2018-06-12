package com.yancy.springboot.redis.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * T
 *
 * @author:yaoxin
 * @date:Created in 2018/6/12 14:23
 * @description:
 */
@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = 8655851615465363473L;
    private Long id;
    private String username;
    private String password;
    // TODO  省略get set
}
