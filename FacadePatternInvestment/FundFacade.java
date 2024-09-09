
public class FundFacade {
	Stock1 st1;
	Stock2 st2;
	Stock3 st3;
	
	NationalDebt1 nd1;
	
	Reality1 rt1;
	
	public FundFacade() {
		st1 = new Stock1();
		st2 = new Stock2();
		st3 = new Stock3();
		
		nd1 = new NationalDebt1();
		rt1 = new Reality1();
		
	}
	
	public void BuyFundPortfolio1() {
		st1.buy();
		
		// I missed "st2", intentionally
		
		st3.buy();
		
		nd1.buy();
		
		rt1.buy();
		
		System.out.println("Buying Fund based on Portfolio1 is done!");
	}
	
	public void BuyFundPortfolio2() {
		st1.buy();
		
		st2.buy();
		
		// I missed "st3", intentionally
		
		nd1.buy();
		
		rt1.buy();
		
		System.out.println("Buying Fund based on Portfolio2 is done!");
	}
	
	public void SellAllFund() {
		if (st1 != null) {
			st1.sell();
			st1 = null;
		}
		
		if (st2 != null) {
			st2.sell();
			st2 = null;
		}
		
		if (st3 != null) {
			st3.sell();
			st3 = null;
		}
		
		if (nd1 != null) {
			nd1.sell();
			nd1 = null;
		}
		
		if (rt1 != null) {
			rt1.sell();
			rt1 = null;
		}
		
		System.out.println("Selling all Fund are done!");
		
		System.gc();
	}
}
