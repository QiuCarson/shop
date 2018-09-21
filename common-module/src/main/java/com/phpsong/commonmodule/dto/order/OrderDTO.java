package com.phpsong.commonmodule.dto.order;

import lombok.Data;

import java.util.List;

@Data
public class OrderDTO {

	OrderInfo baseInfo;
	
	List<OrderProduct> products;
	
	List<OrderState> stateChanges;
}
