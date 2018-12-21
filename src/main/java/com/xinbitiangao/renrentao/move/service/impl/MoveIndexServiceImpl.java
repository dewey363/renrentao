package com.xinbitiangao.renrentao.move.service.impl;

import com.xinbitiangao.renrentao.common.entity.ProductEntity;
import com.xinbitiangao.renrentao.common.entity.SearchKeywordEntity;
import com.xinbitiangao.renrentao.common.repository.ProductRepository;
import com.xinbitiangao.renrentao.common.repository.SearchKeywordRepository;
import com.xinbitiangao.renrentao.move.entity.IndexCarouselEntity;
import com.xinbitiangao.renrentao.move.repository.IndexCarouselRepository;
import com.xinbitiangao.renrentao.move.service.MoveIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author 1.0
 * @Description: 首页服务层实现层
 * @Auther:
 * @Date: 2018/11/21 22:13
 */
@Service
public class MoveIndexServiceImpl implements MoveIndexService {
    /**
     * 搜索候选词
     */
    @Autowired
    private SearchKeywordRepository skr;
    /**
     * 首页轮播图 Repository
     */
    @Autowired
    private IndexCarouselRepository icr;

    /**
     * 商品Repository
     */
    @Autowired
    private ProductRepository pr;

    /**
     * 首页初始化显示商品目录
     */
    @Value("${index.productCout}")
    private Integer indexproductCout;

    /**
     * 首页类
     *
     * @param modelMap
     */
    @Override
    public void index(ModelMap modelMap) {
//        轮播图
        List<IndexCarouselEntity> ices = icr.findByStateEquals(1);
//        商品
        Pageable pageable = new PageRequest(1, indexproductCout);
        List<ProductEntity> pes = pr.findAll(pageable).getContent();
        List<List<ProductEntity>> llpe = new ArrayList<>();
        for (int i = 0; i < pes.size(); i++) {
            List<ProductEntity> lpe = new ArrayList<ProductEntity>();
            lpe.add(pes.get(i));
            i++;
            lpe.add(pes.get(i));
            llpe.add(lpe);
        }
//        搜索框关键词
        List<SearchKeywordEntity> skrAll = skr.findAll();
        String sk = skrAll.get(new Random().nextInt(skrAll.size())).getSearchKeyword();
        modelMap.put("searchKeyword", sk);
        modelMap.put("IndexCarousels", ices);
        modelMap.put("ProductEntitys", llpe);
    }
}
