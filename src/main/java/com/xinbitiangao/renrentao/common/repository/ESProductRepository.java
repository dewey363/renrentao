package com.xinbitiangao.renrentao.common.repository;

import com.xinbitiangao.renrentao.common.entity.ESProductEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * es搜索库中商品数据
 * 商品
 * Created by 黄大胖子
 * @author hay17
 */
@Component
public interface ESProductRepository extends ElasticsearchRepository<ESProductEntity,String> {
}
