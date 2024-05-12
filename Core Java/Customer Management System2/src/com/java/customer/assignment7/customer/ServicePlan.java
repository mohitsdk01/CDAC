package com.java.customer.assignment7.customer;

public enum ServicePlan {
	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);
	private double plan;
		ServicePlan(double plan) {
		this.plan = plan;
	}

	@Override
	public String toString() {
		return name() + ":" + plan;
	}

	public double getPlan() {
		return plan;
	}

	public void setPlan(double plan) {
		this.plan = plan;
	}	
}
