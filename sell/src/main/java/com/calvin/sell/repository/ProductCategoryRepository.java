package com.calvin.sell.repository;

import com.calvin.sell.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author calvin
 * @Title ProductCategoryRepository
 * @Description ${DESCRIPTION}
 * @date: 2018/4/11 下午11:49
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
