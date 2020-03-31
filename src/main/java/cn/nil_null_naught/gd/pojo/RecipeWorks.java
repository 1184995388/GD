package cn.nil_null_naught.gd.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * 作品表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "recipe_works")
public class RecipeWorks {
    private Integer id;
    private Integer recipe_id;
    private String creator;
    private String works_image;
    private String works_introduction;
    private Timestamp create_time;
}
