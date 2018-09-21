package com.phpsong.commonmodule.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  ServiceEnum {
    SUCCESS("1","成功"),
    FAIL("2","失败")
    ;
    private String code;

    private String message;


}
