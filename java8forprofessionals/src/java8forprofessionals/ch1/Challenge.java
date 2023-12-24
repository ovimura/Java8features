package java8forprofessionals.ch1;

import java.util.*;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Challenge {
	public static void main(String[] args) {
		Order order = new Order("cola", new Date());
		
		System.out.println("Not Empty: " + OrderUtil.getOrdersAfterDate(Arrays.asList(order), new Date(20, 0, 1)).toString());
		System.out.println("Empty: " + OrderUtil.getOrdersAfterDate(Arrays.asList(order), new Date()));
		
		NewOrder newOrder = new NewOrder("cola", LocalDateTime.now());
		System.out.println("Not Empty: " + OrderUtil.newGetOrdersAfterDate(Arrays.asList(newOrder), LocalDateTime.of(2022, 1, 1, 0, 0)));
		System.out.println("Empty: " + OrderUtil.newGetOrdersAfterDate(Arrays.asList(newOrder), LocalDateTime.now()));
	}
}

class OrderUtil {
	public static ArrayList<Order> getOrdersAfterDate(List<Order> orders, Date date) {
		ArrayList<Order> result = new ArrayList();
		for(Order order: orders) {
			if(order.getDate().compareTo(date) < 0) {
				continue;
			}
			result.add(order);
		}
		return result;
	}
	
	public static ArrayList<NewOrder> newGetOrdersAfterDate(List<NewOrder> orders, LocalDateTime ldt) {
		ArrayList<NewOrder> result = new ArrayList();
		for(NewOrder order: orders) {
			if(order.getDate().isAfter(ldt)) {
				result.add(order);
			}
		}
		return result;
	}
}


class Order {
	private String name;
	private Date date;
	
	public Order(String name, Date date) {
		this.name = name;
		this.date = date;
	}
	
	public void setDate(Date date) {
		LocalDateTime ldt = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		this.date = date;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return "Order Name: " + this.name + ", " + this.date.toString() + ";";
	}
}

class NewOrder {
	private String name;
	private LocalDateTime ldt;
	
	public NewOrder(String name, LocalDateTime ldt) {
		this.name = name;
		this.ldt = ldt;
	}
	
	public void setDate(LocalDateTime ldt) {
		this.ldt = ldt;
	}
	
	public LocalDateTime getDate() {
		return this.ldt;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		
		DateTimeFormatter ff = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		return "Order Name: " + this.name + ", " + this.ldt.format(ff) + "; ";
	}
}