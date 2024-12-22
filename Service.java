package com.spring.model;

import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Service {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int serviceId;
    @Column(length = 20)
	private String serviceName;
	@Column(length = 20)
	private String serviceType;
	@Column(length = 20)
	private String serviceCategory;
	private int servicePrice;
	@Column(length = 20)
	private int serviceRentPrice;
	private String serviceAddress;
	private int serviceMeasure;
	@Column(length = 30)
	private String serviceDesc;
	@Column(length = 1500)
	private String img1;
	@Column(length = 1500)
	private String img2;
	@Column(length = 1500)
	private String img3;
	@Column(length = 1500)
	private String img4;
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
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getServiceCategory() {
		return serviceCategory;
	}
	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}
	public int getServicePrice() {
		return servicePrice;
	}
	public void setServicePrice(int servicePrice) {
		this.servicePrice = servicePrice;
	}
	public int getServiceRentPrice() {
		return serviceRentPrice;
	}
	public void setServiceRentPrice(int serviceRentPrice) {
		this.serviceRentPrice = serviceRentPrice;
	}
	public String getServiceAddress() {
		return serviceAddress;
	}
	public void setServiceAddress(String serviceAddress) {
		this.serviceAddress = serviceAddress;
	}
	public int getServiceMeasure() {
		return serviceMeasure;
	}
	public void setServiceMeasure(int serviceMeasure) {
		this.serviceMeasure = serviceMeasure;
	}
	public String getServiceDesc() {
		return serviceDesc;
	}
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}
	public String getImg1() {
		return img1;
	}
	public void setImg1(String img1) {
		this.img1 = img1;
	}
	public String getImg2() {
		return img2;
	}
	public void setImg2(String img2) {
		this.img2 = img2;
	}
	public String getImg3() {
		return img3;
	}
	public void setImg3(String img3) {
		this.img3 = img3;
	}
	public String getImg4() {
		return img4;
	}
	public void setImg4(String img4) {
		this.img4 = img4;
	}
	public Service(int serviceId, String serviceName, String serviceType, String serviceCategory, int servicePrice,
			int serviceRentPrice, String serviceAddress, int serviceMeasure, String serviceDesc, String img1,
			String img2, String img3, String img4) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.serviceType = serviceType;
		this.serviceCategory = serviceCategory;
		this.servicePrice = servicePrice;
		this.serviceRentPrice = serviceRentPrice;
		this.serviceAddress = serviceAddress;
		this.serviceMeasure = serviceMeasure;
		this.serviceDesc = serviceDesc;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
	}
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Service [serviceId=" + serviceId + ", serviceName=" + serviceName + ", serviceType=" + serviceType
				+ ", serviceCategory=" + serviceCategory + ", servicePrice=" + servicePrice + ", serviceRentPrice="
				+ serviceRentPrice + ", serviceAddress=" + serviceAddress + ", serviceMeasure=" + serviceMeasure
				+ ", serviceDesc=" + serviceDesc + ", img1=" + img1 + ", img2=" + img2 + ", img3=" + img3 + ", img4="
				+ img4 + "]";
	}
	
}