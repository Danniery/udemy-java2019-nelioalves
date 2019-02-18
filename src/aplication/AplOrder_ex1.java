package aplication;

import java.util.Date;

import com.outros.exercicios.Order_ex1;

import entities.enums.OrderStatus;

public class AplOrder_ex1 {

	public static void main(String[] args) {

		Order_ex1 order = new Order_ex1(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
