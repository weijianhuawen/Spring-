package com.mybatis.dql.mode.query;

import com.mybatis.dql.mode.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserQuery extends User {
    private Integer age2;
}
