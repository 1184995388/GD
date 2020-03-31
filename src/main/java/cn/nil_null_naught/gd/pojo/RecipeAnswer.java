package cn.nil_null_naught.gd.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

/**
 * 相应菜谱的答疑信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "recipe_answer")
public class RecipeAnswer {
    private Integer id;
    private Integer recipe_id;
    private String questioner;
    private String responder;
    private String question;
    private String answer;
}
