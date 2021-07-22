package com.huahun.order.controller;

import com.huahun.common.api.CommonResult;
import com.huahun.order.entity.vo.PaymentVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author zzh
 * @Date 2021/7/22 14:26
 * @Version 1.0
 */
@RestController
@Slf4j
@RequestMapping("/order/payment")
@PropertySource("classpath:application.yml")
public class OrderController {
    @Value("${rest-template.urls.payment}")
    public String PAYMENT_URL;
    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value="/insert")
    public CommonResult<PaymentVO> insert(PaymentVO paymentVO){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/payment/insert", paymentVO, CommonResult.class);
    }

    @GetMapping(value="/get")
    public CommonResult<PaymentVO> getPaymentById(@RequestParam("id")  Long id){
        Map<String, Long> map = new HashMap();
        map.put("id", id);
        return restTemplate.getForObject(PAYMENT_URL + "/payment/payment/get?id={id}", CommonResult.class, map);
    }
}
