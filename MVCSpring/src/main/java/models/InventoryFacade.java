package models;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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
		/*Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file
		
		//creating seession factory object
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating session object
		Session session=factory.openSession();*/
		Session session = HibernateUtil.getSessionFromFactory();

		//creating transaction object
		Transaction t=session.beginTransaction();
		
		session.persist(object.inventory);//persisting the object
		
		t.commit();//transaction is commited
		session.close();
	}

}
