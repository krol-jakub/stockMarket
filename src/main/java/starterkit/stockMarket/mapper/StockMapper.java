package starterkit.stockMarket.mapper;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import starterkit.stockMarket.to.StockTo;
import starterkit.stockMarket.entity.*;

public class StockMapper {
	
	public static List<StockEntity> map2Entity(Set<StockTo> stocks) {
        return stocks.stream().map(StockMapper::map).collect(Collectors.toList());
    }
    
    public static Set<StockTo> map2To(List<StockEntity> stocks) {
        return stocks.stream().map(StockMapper::map).collect(Collectors.toSet());
    }
    
    public static StockEntity map(StockTo stockTo) {
        if(stockTo != null) {
            return new StockEntity(stockTo.getCompany(), stockTo.getBuyPrice());
        }
        return null;
    }
    
    public static StockTo map(StockEntity stockEntity) {
        if(stockEntity != null) {
            return new StockTo(stockEntity.getCompany(), stockEntity.getBuyValue(), 0);
        }
        return null;
    }

}
