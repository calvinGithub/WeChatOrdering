package com.calvin.sell.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author calvin
 * @Title ProductCategory
 * @Description 类目表
 * @date: 2018/4/11 下午11:45
 */

@Entity
@DynamicUpdate
@Data  // 生成set，get方法
@NoArgsConstructor  // 生成无参构造
@AllArgsConstructor  // 生成所有参数的构造
@Accessors(chain = true)
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer categoryId;

    private String categoryName;

    private Integer categoryType;

}
