package com.weikun.api.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 订单修改收货人信息参数
 */
@Data
public class OmsReceiverInfoParam implements Serializable {
    private Long orderId;
    private String receiverName;
    private String receiverPhone;
    private String receiverPostCode;
    private String receiverDetailAddress;
    private String receiverProvince;
    private String receiverCity;
    private String receiverRegion;
    private Integer status;
}
