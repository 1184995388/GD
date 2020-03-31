package cn.nil_null_naught.gd.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

/**
 * 相应菜谱的原料项
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "recipe_material")
public class RecipeMaterial {
    private Integer id;
    private Integer recipe_id;
    private String material_name;
    private String material_amount;
}
