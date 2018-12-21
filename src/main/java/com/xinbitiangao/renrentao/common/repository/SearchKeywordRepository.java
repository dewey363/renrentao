package com.xinbitiangao.renrentao.common.repository;

import com.xinbitiangao.renrentao.common.entity.AdminEntity;
import com.xinbitiangao.renrentao.common.entity.SearchKeywordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 搜索关键词
 * Created by 黄大胖子
 * 2018/5/22 10:57
 */
public interface SearchKeywordRepository extends JpaRepository<SearchKeywordEntity, Long> {
}
