package cn.nil_null_naught.gd.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

/**
 * 记录菜单中包含的菜谱项
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "menu_recipe")
public class MenuRecipe {
    private Integer id;
    private Integer recipe_id;
    private Integer menu_id;
}
