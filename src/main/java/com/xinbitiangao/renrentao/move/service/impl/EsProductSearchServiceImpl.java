package com.xinbitiangao.renrentao.move.service.impl;

import com.alibaba.fastjson.JSON;
import com.xinbitiangao.renrentao.common.entity.ESProductEntity;
import com.xinbitiangao.renrentao.common.repository.ESProductRepository;
import com.xinbitiangao.renrentao.move.service.EsProductSearchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * elasticsearch 搜索引擎 service实现
 * @author zhoudong
 * @version 0.1
 * @date 2018/12/13 15:33
 */
@Service
@Slf4j
public class EsProductSearchServiceImpl extends BaseSearchServiceImpl<ESProductEntity> implements EsProductSearchService {
    @Resource
    private ElasticsearchTemplate elasticsearchTemplate;
    @Resource
    private ESProductRepository esProductRepository;

    @Override
    public void save(ESProductEntity... esProductEntities) {
        elasticsearchTemplate.putMapping(ESProductEntity.class);
        if(esProductEntities.length > 0){
            log.info("【保存索引】：{}", esProductRepository.saveAll(Arrays.asList(esProductEntities)));
        }
    }

    @Override
    public void delete(String id) {
        esProductRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        esProductRepository.deleteAll();
    }

    @Override
    public ESProductEntity getById(String id) {
        return esProductRepository.findById(id).get();
    }

    @Override
    public List<ESProductEntity> getAll() {
        List<ESProductEntity> list = new ArrayList<>();
        esProductRepository.findAll().forEach(list::add);
        return list;
    }

}
