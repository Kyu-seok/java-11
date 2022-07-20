package thread.read_write_lock_example;

import com.sun.source.tree.Tree;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

    }

    public static class InventoryDatabase {
        private TreeMap<Integer, Integer> priceToCountMap = new TreeMap<>();


        public int getNumberOfItemsInPriceRange(int lowerBound, int upperBound) {
            Integer fromKey = priceToCountMap.ceilingKey(lowerBound);

            Integer toKey = priceToCountMap.floorKey(upperBound);

            if (fromKey == null || toKey == null) {
                return 0;
            }

            NavigableMap<Integer, Integer> rangeOfPrices = priceToCountMap.subMap(fromKey, true, toKey, true);

            int sum = 0;
            for (int numberOfItemsForPrice : rangeOfPrices.values()) {
                sum += numberOfItemsForPrice;
            }

            return sum;
        }

    }
}
