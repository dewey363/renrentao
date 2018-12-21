package com.xinbitiangao.renrentao.admin.service;

import com.xinbitiangao.renrentao.common.utils.PageLayuiTableVO;
import com.xinbitiangao.renrentao.common.entity.ProductEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * 商品服务层
 * Created by 黄大胖子
 * 2018/5/6 20:22
 * @author hay17
 */
public interface AdminProductService {
    /**
     * 分页查询
     *
     * @return
     */
    PageLayuiTableVO<ProductEntity> findPageList(Integer page, Integer limit);

    /**
     * 一件导入
     *
     * @param file
     */
    void productImport(MultipartFile file) throws Exception;
}
