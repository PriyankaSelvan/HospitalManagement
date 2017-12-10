package models;

public class Bill {
	private Integer bill_id;
	private Integer prescription_id;
	public Integer getPrescription_id() {
		return prescription_id;
	}
	public void setPrescription_id(Integer prescription_id) {
		this.prescription_id = prescription_id;
	}
	private String patient_id;
	private Double final_cost=0.0;
	public Integer getBill_id() {
		return bill_id;
	}
	public void setBill_id(Integer bill_id) {
		this.bill_id = bill_id;
	}
	public String getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}
	public Double getFinal_cost() {
		return final_cost;
	}
	public void setFinal_cost(Double final_cost) {
		this.final_cost = final_cost;
	}

}
