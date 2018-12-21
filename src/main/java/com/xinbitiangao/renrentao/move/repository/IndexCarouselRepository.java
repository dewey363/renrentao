package com.xinbitiangao.renrentao.move.repository;

import com.xinbitiangao.renrentao.common.entity.ProductEntity;
import com.xinbitiangao.renrentao.move.entity.IndexCarouselEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 首页轮播图 数据库操作类
 * Created by 黄大胖子
 * 2018/5/22 10:57
 * @author hay17
 */
public interface IndexCarouselRepository extends JpaRepository<IndexCarouselEntity, Integer> {
    /**
     * 按照 状态来批量查询 轮播图实例
     * @param sort
     * @return
     */
    List<IndexCarouselEntity> findByStateEquals(Integer sort);
}
