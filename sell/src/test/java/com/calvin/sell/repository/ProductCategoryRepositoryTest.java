package com.calvin.sell.repository;

import com.calvin.sell.domain.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    private final static Logger logger = LoggerFactory
            .getLogger(ProductCategoryRepositoryTest.class);

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.getOne(1);
        logger.info("类别表信息是:{}", productCategory.toString());
    }

}