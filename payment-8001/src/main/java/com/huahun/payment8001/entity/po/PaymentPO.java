package com.huahun.payment8001.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName PaymentPO
 * @Description TODO
 * @Author zzh
 * @Date 2021/7/22 8:57
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentPO implements Serializable {
    private Long id;
    private String serial;
}
