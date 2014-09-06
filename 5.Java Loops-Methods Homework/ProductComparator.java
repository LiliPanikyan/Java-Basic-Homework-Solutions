import java.util.Comparator;

public class OrderComparator implements Comparator<Order> {

	@Override
	public int compare(Order arg0, Order arg1) {
		 if (arg0.getAmount() > arg1.getAmount()) {
	         return 1;
	  } else if (arg0.getAmount() == arg1.getAmount()) {
	        return 0;
	  } else {
	        return -1;
	  }
	}
}
