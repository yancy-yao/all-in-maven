package com.yancy.demo.web;

import com.yancy.springboot.starter.idmarket.BusinessType;
import com.yancy.springboot.starter.idmarket.IdMarkets;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试Controller
 *
 * @author:yaoxin
 * @date:Created in 2018/5/31 16:58
 * @description:
 */
@Slf4j
@RestController
public class TmpController {

    @RequestMapping("/")
    public String getId(){
        try {
            long batchRecordId = IdMarkets.nextId(BusinessType.CREDITS_BATCH_RECORD);
            return String.valueOf(batchRecordId);
        }catch(Exception e){
            log.error("err",e);
            return "false";
        }
    }
}
