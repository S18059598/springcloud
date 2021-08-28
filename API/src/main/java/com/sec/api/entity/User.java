package com.sec.api.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2021-08-24 15:49:10
 */
@Data
@Accessors(chain = true)
public class User implements Serializable {
    private static final long serialVersionUID = -73883498918825685L;

    private Integer uid;

    private String uname;

    private String upwd;


}
