package models;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import controllers.HibernateUtil;

public class InventoryFacade {
	public Inventory inventory = new Inventory();
	
	public Double getCost() {
		return inventory.getCost();
	}
	public void setCost(Double cost) {
		inventory.setCost(cost);;
	}
	public Integer getInventory_id() {
		return inventory.getInventory_id();
	}
	public void setInventory_id(Integer inventory_id) {
		inventory.setInventory_id(inventory_id);;
	}
	public Integer getQuantity() {
		return inventory.getQuantity();
	}
	public void setQuantity(Integer quantity) {
		inventory.setQuantity(quantity);
	}
	public void updateDB(InventoryFacade object)
	{
		
		Session session = HibernateUtil.getSessionFromFactory();

		//creating transaction object
		Transaction t=session.beginTransaction();
		
		session.persist(object.inventory);//persisting the object
		
		t.commit();//transaction is commited
		session.close();
	}

}
