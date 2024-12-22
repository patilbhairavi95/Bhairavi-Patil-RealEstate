package com.spring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class BuyNow {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long booking_Id;
	private String username;
	 private String customerName;
	 private int pinCode;
	 private String area;
	 private long phoneNumber;
	 private int totalPrice;
	 private int count;
	 private int serviceId;
	 private String serviceName;
	 private int servicPrice;
	 @Column(length = 700)
	 private String serviceImage;
	 private String serviceDesc;
	private String serviceCategory;
	public long getBooking_Id() {
		return booking_Id;
	}
	public void setBooking_Id(long booking_Id) {
		this.booking_Id = booking_Id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public int getServicPrice() {
		return servicPrice;
	}
	public void setServicPrice(int servicPrice) {
		this.servicPrice = servicPrice;
	}
	public String getServiceImage() {
		return serviceImage;
	}
	public void setServiceImage(String serviceImage) {
		this.serviceImage = serviceImage;
	}
	public String getServiceDesc() {
		return serviceDesc;
	}
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}
	public String getServiceCategory() {
		return serviceCategory;
	}
	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}
	public BuyNow(long booking_Id, String username, String customerName, int pinCode, String area, long phoneNumber,
			int totalPrice, int count, int serviceId, String serviceName, int servicPrice, String serviceImage,
			String serviceDesc, String serviceCategory) {
		super();
		this.booking_Id = booking_Id;
		this.username = username;
		this.customerName = customerName;
		this.pinCode = pinCode;
		this.area = area;
		this.phoneNumber = phoneNumber;
		this.totalPrice = totalPrice;
		this.count = count;
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.servicPrice = servicPrice;
		this.serviceImage = serviceImage;
		this.serviceDesc = serviceDesc;
		this.serviceCategory = serviceCategory;
	}
	public BuyNow() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BuyNow [booking_Id=" + booking_Id + ", username=" + username + ", customerName=" + customerName
				+ ", pinCode=" + pinCode + ", area=" + area + ", phoneNumber=" + phoneNumber + ", totalPrice="
				+ totalPrice + ", count=" + count + ", serviceId=" + serviceId + ", serviceName=" + serviceName
				+ ", servicPrice=" + servicPrice + ", serviceImage=" + serviceImage + ", serviceDesc=" + serviceDesc
				+ ", serviceCategory=" + serviceCategory + "]";
	}
	

}
