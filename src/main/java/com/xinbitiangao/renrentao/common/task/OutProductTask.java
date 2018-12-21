package com.xinbitiangao.renrentao.common.task;

import com.xinbitiangao.renrentao.common.entity.ProductEntity;
import com.xinbitiangao.renrentao.common.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author 1.0
 * @Description: 淘汰失效商品
 * @Auther: hay17
 * @Date: 2018/11/25 20:24
 */
@Slf4j
@Component
public class OutProductTask {
    @Autowired
    private ProductRepository pr;


    @Scheduled(cron = "0 1 0 * * ? ")  //      每天凌晨零点执行
//    @Scheduled(cron = "0/5 * * * * ?") //    每五秒执行一次
    public void outProductTask() {
        log.info("【自动删除失效商品】开始执行！");
        List<ProductEntity> pes = pr.findAll();
        for (ProductEntity pe : pes) {
            if (pe.getDiscountCouponOverTime().getTime() + (1000 * 60 * 60 * 24) <= System.currentTimeMillis()) {
                pr.deleteById(pe.getProductId());
                log.info("【自动删除失效商品】product={}", pe);
            }
        }
        log.info("【自动删除失效商品】执行完毕！");
    }
}
