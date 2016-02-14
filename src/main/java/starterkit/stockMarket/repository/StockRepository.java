package starterkit.stockMarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import starterkit.stockMarket.entity.*;

public interface StockRepository extends JpaRepository<StockEntity, DateEntity> {

    @Query("SELECT *"
    		+ "FROM date"
    		+ "WHERE date.date = (:date)")
    public DateEntity findStocksFromDate(@Param("date") String date);
    
}