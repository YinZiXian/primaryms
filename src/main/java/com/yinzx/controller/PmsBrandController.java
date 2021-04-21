package com.yinzx.controller;

import com.yinzx.model.PmsBrand;
import com.yinzx.service.PmsBrandService;
import com.yinzx.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "PmsBrandController", description = "商品品牌管理")
@RestController
@RequestMapping("/brand")
public class PmsBrandController {
    @Resource
    private PmsBrandService pmsBrand;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

    @ApiOperation("获取所有品牌")
    @RequestMapping(value = "listAll", method = RequestMethod.GET)
    public Result<List<PmsBrand>> getBrandList(){
        System.err.println(System.currentTimeMillis() + ": getBrandList");
        LOGGER.info(System.currentTimeMillis() + ": getBrandList");
        return Result.success(pmsBrand.listAllBrand());
    }


}

