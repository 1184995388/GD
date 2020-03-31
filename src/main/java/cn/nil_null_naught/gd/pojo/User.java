package cn.nil_null_naught.gd.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

/**
 * 用户表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
    private Integer user_id;
    private String user_name;
    private String password;
    private String head;
    private String self_introduction;
    private Integer gender;
    private Integer rights;
    private Integer points;
}
