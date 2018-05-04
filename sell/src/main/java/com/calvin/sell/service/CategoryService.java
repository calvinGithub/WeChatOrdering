package com.calvin.sell.service;

import com.calvin.sell.domain.ProductCategory;

import java.util.List;

/**
 * @author calvin
 * @Title CategoryService
 * @Description ${DESCRIPTION}
 * @date: 2018/5/4 下午11:24
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
