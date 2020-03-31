package cn.nil_null_naught.gd.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

/**
 * 管理员表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "administrator")
public class Administrator {
    private Integer administrator_id;
    private String  administrator_name;
    private String  password;
}
