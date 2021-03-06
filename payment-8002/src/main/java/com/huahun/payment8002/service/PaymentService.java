package com.huahun.payment8002.service;

import com.huahun.payment8002.entity.dto.PaymentDTO;
import org.apache.ibatis.annotations.Param;

/**
 * @InterfaceName PaymentService
 * @Description TODO
 * @Author zzh
 * @Date 2021/7/22 9:53
 * @Version 1.0
 */
public interface PaymentService {
    public int insert(PaymentDTO paymentDTO);
    public PaymentDTO getPaymentById(@Param("id") Long id);
}
