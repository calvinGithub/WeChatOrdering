package com.calvin.sell.repository;

import com.calvin.sell.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Title ProductCategoryRepository
 * @Description ${DESCRIPTION}
 * @author calvin
 * @date: 2018/4/11 下午11:49 
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

}
