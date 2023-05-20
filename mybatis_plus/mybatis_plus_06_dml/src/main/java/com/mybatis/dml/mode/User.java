package com.mybatis.dml.mode;

import com.baomidou.mybatisplus.annotation.*;
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
//@TableName(value = "tab_user")
public class User {
    //    @TableId(type = IdType.AUTO)
    //@TableId(type = IdType.NONE)
    //@TableId(type = IdType.INPUT, value = "id")
    //@TableField(value = "id")
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableField(select = true)
    private String password;

    //在实体类中添加deleted属性
    @TableLogic(delval = "1", value = "0")
    private Integer deleted;
    @Version
    private int version;
}
