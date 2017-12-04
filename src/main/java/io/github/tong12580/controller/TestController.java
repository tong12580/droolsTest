package io.github.tong12580.controller;

import io.github.tong12580.service.DroolsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yuton
 * @version 1.0
 * @description io.github.tong12580.controller
 * @since 上午10:42 2017/12/4
 */
@RestController
public class TestController {
    @Resource
    private DroolsService droolsService;

    @GetMapping("/test")
    public String test() {
        return droolsService.fireRule();
    }
}
