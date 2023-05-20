package com.mybatis.dml.mode.query;

import com.mybatis.dml.mode.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserQuery extends User {
    private Integer age2;
}
