package com.xinbitiangao.renrentao.move.service;

import com.xinbitiangao.renrentao.common.entity.ESProductEntity;

import java.util.List;

/**
 * @author zhoudong
 * @version 0.1
 * @date 2018/12/13 15:32
 */
public interface EsProductSearchService extends BaseSearchService<ESProductEntity> {
    /**
     * 保存
     * @auther: zhoudong
     * @date: 2018/12/13 16:02
     */
    void save(ESProductEntity... productDocuments);

    /**
     * 删除
     * @param id
     */
    void delete(String id);

    /**
     * 清空索引
     */
    void deleteAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    ESProductEntity getById(String id);

    /**
     * 查询全部
     * @return
     */
    List<ESProductEntity> getAll();
}
