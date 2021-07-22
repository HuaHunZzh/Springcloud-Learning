package com.huahun.payment8001.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName PaymentDTO
 * @Description TODO
 * @Author zzh
 * @Date 2021/7/22 8:57
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {
    private Long id;
    private String serial;
}
