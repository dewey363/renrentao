package com.xinbitiangao.renrentao.admin.controller;

import com.xinbitiangao.renrentao.admin.service.AdminProductService;
import com.xinbitiangao.renrentao.common.utils.PageLayuiTableVO;
import com.xinbitiangao.renrentao.common.entity.ProductEntity;
import com.xinbitiangao.renrentao.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 商品层
 * Created by 黄大胖子
 * 2018/6/21 14:33
 * @author hay17
 */
@RestController
@RequestMapping("/admin/product")
@Slf4j
public class AdminProductController {

    @Autowired
    private AdminProductService productService;

    /**
     * 分页查询
     *
     * @return
     */
    @RequestMapping("/findPageList")
    public PageLayuiTableVO<ProductEntity> findPageList(Integer limit, Integer page) {
        return productService.findPageList(page - 1, limit);
    }



    /**
     * 一键导入功能
     *
     * @return
     */
    @RequestMapping("/import")
    public R productImport(@RequestParam("file") MultipartFile file) {
        try {
            productService.productImport(file);
        } catch (Exception e) {
            return R.error();
        }
        return R.ok();
    }

}
