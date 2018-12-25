package com.xinbitiangao.renrentao.move.service.impl;

import com.xinbitiangao.renrentao.common.entity.ESProductEntity;
import com.xinbitiangao.renrentao.move.service.EsProductSearchService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class EsProductSearchServiceImplTest {

    @Autowired
    private EsProductSearchService esProductSearchService;

    @Test
    @Transactional
    public void save() {
        ESProductEntity esProductEntity = new ESProductEntity();
        esProductEntity.setProductId("123");
        esProductEntity.setProductCategory("demo");
        esProductSearchService.save(esProductEntity);
    }

    @Test
    public void delete() {
    }

    @Transactional
    @Test
    public void deleteAll() {
        esProductSearchService.deleteAll();
        getAll();
    }

    @Test
    public void getById() {
    }

    @Test
    public void getAll() {
        List<ESProductEntity> all = esProductSearchService.getAll();
        log.info("打印：{}",all);
    }
}