package com.yinzx.controller;

import com.yinzx.model.PmsBrand;
import com.yinzx.service.PmsBrandService;
import com.yinzx.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/brand")
public class PmsBrandController {
    @Resource
    private PmsBrandService pmsBrand;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

    @RequestMapping(value = "listAll", method = RequestMethod.GET)
    public Result<List<PmsBrand>> getBrandList(){
        System.err.println(System.currentTimeMillis() + ": getBrandList");
        LOGGER.info(System.currentTimeMillis() + ": getBrandList");
        return Result.success(pmsBrand.listAllBrand());
    }


}

