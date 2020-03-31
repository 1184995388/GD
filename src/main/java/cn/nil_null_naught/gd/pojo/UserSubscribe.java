package cn.nil_null_naught.gd.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

/**
 * 用户收藏的菜单表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_subscribe")
public class UserSubscribe {
    private Integer id;
    private Integer user_id;
    private String subscribe_name;
}
