package com.huahun.payment8002.controller;

import com.huahun.common.api.CommonResult;
import com.huahun.common.utils.BeanConvertUtils;
import com.huahun.payment8002.entity.dto.PaymentDTO;
import com.huahun.payment8002.entity.vo.PaymentVO;
import com.huahun.payment8002.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author zzh
 * @Date 2021/7/22 10:03
 * @Version 1.0
 */
@RestController
@Slf4j
@RequestMapping("/payment/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value="/insert")
    public CommonResult create(@RequestBody  PaymentVO paymentVO)
    {
        int result = paymentService.insert(BeanConvertUtils.convertTo(paymentVO, PaymentDTO::new));
        if(result > 0)
        {
            return new CommonResult(200, "插入数据成功, serverPort:" + serverPort, result);
        }else{
            return new CommonResult(444, "插入数据失败, serverPort:" + serverPort, null);
        }
    }

    @GetMapping(value="/get")
    public CommonResult getPaymentById(
            @Valid @RequestParam @NotNull(message = "id不能为空") @Pattern(regexp = "^[0-9]*$", message = "id只能是整数") Long id)
    {
        PaymentDTO paymentDTO = paymentService.getPaymentById(id);
        if(paymentDTO != null)
        {
            return new CommonResult(200, "查询成功, serverPort:" + serverPort, BeanConvertUtils.convertTo(paymentDTO, PaymentVO::new));
        }else{
            return new CommonResult(444, "没有对应记录，查询ID:" + id + "servePort:" + serverPort, null);
        }
    }

}
