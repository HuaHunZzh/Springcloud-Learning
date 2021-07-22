package com.huahun.payment.mapper;

import com.huahun.payment.entity.po.PaymentPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @InterfaceName PaymentMapper
 * @Description TODO
 * @Author zzh
 * @Date 2021/7/22 9:31
 * @Version 1.0
 */
@Mapper
public interface PaymentMapper {
    public int insert(PaymentPO paymentPO);
    public PaymentPO getPaymentById(@Param("id") Long id);
}
