package cn.nil_null_naught.gd.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

/**
 * 相应菜谱的步骤项
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "recipe_material")
public class RecipeStep {
    private Integer id;
    private Integer recipe_id;
    private Integer index;
    private String step_image;
    private String detail;
}
