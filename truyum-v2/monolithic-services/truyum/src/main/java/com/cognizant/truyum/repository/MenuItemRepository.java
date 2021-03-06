package com.cognizant.truyum.repository;

import java.util.List;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.truyum.model.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem,Long>{

	
	
	
	@Query("From MenuItem m where m.active=1 and m.Date_of_Launch<CURDATE()")
    List<MenuItem> getMenuItemCustomer();

	
//	@Query("From MenuItem m where me_id=?1")
//	public MenuItem getMenuItem(long menuItemId);
//	


}
