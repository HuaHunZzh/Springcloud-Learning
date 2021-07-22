package com.huahun.payment.service.impl;

import com.huahun.payment.common.utils.BeanConvertUtils;
import com.huahun.payment.entity.dto.PaymentDTO;
import com.huahun.payment.entity.po.PaymentPO;
import com.huahun.payment.mapper.PaymentMapper;
import com.huahun.payment.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @ClassName PaymentServiceImpl
 * @Description TODO
 * @Author zzh
 * @Date 2021/7/22 9:54
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int insert(PaymentDTO paymentDTO) {
        PaymentPO paymentPO =  BeanConvertUtils.convertTo(paymentDTO, PaymentPO::new);
        paymentPO.setSerial(UUID.randomUUID().toString());
        return paymentMapper.insert(paymentPO);
    }

    @Override
    public PaymentDTO getPaymentById(Long id) {
        return BeanConvertUtils.convertTo(paymentMapper.getPaymentById(id), PaymentDTO::new);
    }
}
