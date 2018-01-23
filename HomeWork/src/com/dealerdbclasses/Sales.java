package com.dealerdbclasses;

import javax.xml.crypto.Data;

public class Sales {
	int invoiceId,customerId,carId;
	Data date;
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public Data getDate() {
		return date;
	}
	public void setDate(Data date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Sales [invoiceId=" + invoiceId + ", customerId=" + customerId + ", carId=" + carId + ", date=" + date
				+ "]";
	}
	
	
}
