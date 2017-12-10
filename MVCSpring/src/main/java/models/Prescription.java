package models;

public class Prescription {
	private String patient_id;
	public String getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}
	private Double current_temperature=0.0;
	private Double current_pressure=0.0;
	public Double getCurrent_temperature() {
		return current_temperature;
	}
	public void setCurrent_temperature(Double current_temperature) {
		this.current_temperature = current_temperature;
	}
	public Double getCurrent_pressure() {
		return current_pressure;
	}
	public void setCurrent_pressure(Double current_pressure) {
		this.current_pressure = current_pressure;
	}
	private Integer prescription_id;
	private Integer inventory_id_1;
	private Integer inventory_id_2;
	private Integer inventory_id_3;
	private Integer inventory_id_4;
	private Integer inventory_id_5;
	
	public Integer getPrescription_id() {
		return prescription_id;
	}
	public void setPrescription_id(Integer prescription_id) {
		this.prescription_id = prescription_id;
	}
	
	
	public Integer getInventory_id_1() {
		return inventory_id_1;
	}
	public void setInventory_id_1(Integer inventory_id_1) {
		this.inventory_id_1 = inventory_id_1;
	}
	public Integer getInventory_id_2() {
		return inventory_id_2;
	}
	public void setInventory_id_2(Integer inventory_id_2) {
		this.inventory_id_2 = inventory_id_2;
	}
	public Integer getInventory_id_3() {
		return inventory_id_3;
	}
	public void setInventory_id_3(Integer inventory_id_3) {
		this.inventory_id_3 = inventory_id_3;
	}
	public Integer getInventory_id_4() {
		return inventory_id_4;
	}
	public void setInventory_id_4(Integer inventory_id_4) {
		this.inventory_id_4 = inventory_id_4;
	}
	public Integer getInventory_id_5() {
		return inventory_id_5;
	}
	public void setInventory_id_5(Integer inventory_id_5) {
		this.inventory_id_5 = inventory_id_5;
	}

}
