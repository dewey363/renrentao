package com.xinbitiangao.renrentao.move.service.impl;

import com.xinbitiangao.renrentao.common.entity.ProductCategoryEntity;
import com.xinbitiangao.renrentao.common.entity.ProductEntity;
import com.xinbitiangao.renrentao.common.repository.ProductCategoryRepository;
import com.xinbitiangao.renrentao.common.repository.ProductRepository;
import com.xinbitiangao.renrentao.common.repository.SearchKeywordRepository;
import com.xinbitiangao.renrentao.move.entity.IndexCarouselEntity;
import com.xinbitiangao.renrentao.move.repository.IndexCarouselRepository;
import com.xinbitiangao.renrentao.move.service.MoveClassService;
import com.xinbitiangao.renrentao.move.service.MoveIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.*;

/**
 * @author 1.0
 * @Description: 搜索服务层实现层
 * @Auther: huangyong
 * @Date: 2018/11/21 22:13
 */
@Service
public class MoveClassServiceImpl implements MoveClassService {

    /**
     * 搜索候选词
     */
    @Autowired
    private SearchKeywordRepository skr;
    /**
     * 商品类目
     */
    @Autowired
    private ProductCategoryRepository pcr;


    /**
     * 搜索页数据准备
     *
     * @param modelMap
     */
    @Override
    public void classm(ModelMap modelMap) {
//        获取所有数据
        List<ProductCategoryEntity> pceAll = pcr.findAll();

//        获取一级类目
        Set<String> CategoryInitials = new HashSet<>();
        pceAll.forEach(pce -> CategoryInitials.add(pce.getCategoryInitial()));
//        分类
        Map<String, List<String>> categoryMap = new HashMap();
        for (ProductCategoryEntity pce : pceAll) {
            List<String> strings = categoryMap.get(pce.getCategoryInitial());
            if (strings == null) {
                strings = new ArrayList<>();
                categoryMap.put(pce.getCategoryInitial(), strings);
            }
            strings.add(pce.getCategoryName());
        }


        modelMap.put("CategoryMap", categoryMap);
        modelMap.put("CategoryInitials", CategoryInitials);
    }
}
