package com.mybatis.mapper.mode.query;

import com.mybatis.mapper.mode.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserQuery extends User {
    private Integer age2;
}
