package m1sample;

import java.util.*;




public class Maig {
	public static void main(String[] args) {
		
		IAnalyticsStore store = new AnalyticsStore();
		Analytics a = new Analytics(store,3);
		
		a.registeration(ActionEnum.LOGIN);
		a.registeration(ActionEnum.LOGOUT);
		a.registeration(ActionEnum.CLICK);
		a.registeration(ActionEnum.PURCHASE);
		
		System.out.println("remaining actions to be done: "+a.getremainingsize());
		System.out.println("Total num of: "+a.getTotal());
		
	}
}
enum ActionEnum{
	LOGIN,
	LOGOUT,
	CLICK,
	PURCHASE
}

interface IAnalyticsStore{
	void storeAction(Queue<ActionEnum> q);
}

class AnalyticsStore implements IAnalyticsStore{
	@Override
	public void storeAction(Queue<ActionEnum> q) {
		System.out.println("Sending batch to Analytics Store: "+q);
	}
	
}
class Analytics {
	private IAnalyticsStore analyticsStore;
	private int k;
	private Queue<ActionEnum> actionqueue;
	private int total;
	
	public Analytics(IAnalyticsStore analyticsStore,int k) {
		if(k<0) {
			throw new IllegalArgumentException("k must be greater than 0");
		}
		this.analyticsStore=analyticsStore;
		this.k = k;
		this.actionqueue = new LinkedList<>();
		this.total=0;
	}
	
	
	public void registeration(ActionEnum a) {
		actionqueue.offer(a);
		total++;
		
		if(actionqueue.size() == k) {
			analyticsStore.storeAction(actionqueue);
			
			
			actionqueue.clear();
			
		}
	}
		public int getTotal() {
			return total;
		}
		public int getremainingsize() {
			return actionqueue.size();
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}