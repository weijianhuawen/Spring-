package com.mybatis.mapper.mode;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class User {
//    @TableField(value = "id")
//    private Long uid;
//    private String name;
//    private Integer age;
//    private String email;
//    @TableField(exist = false)
//    private String password;
//    public User(Long uid) {
//        this.uid = uid;
//    }
//}

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tab_user")
public class User {
    @TableField(value = "id")
    private Long uid;
    private String name;
    private Integer age;
    private String email;
    @TableField(select = false)
    private String password;
    public User(Long uid) {
        this.uid = uid;
    }
}
