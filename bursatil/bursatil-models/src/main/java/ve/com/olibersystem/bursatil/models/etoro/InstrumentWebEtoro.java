package ve.com.olibersystem.bursatil.models.etoro;

import java.util.List;

public class InstrumentWebEtoro {
	private boolean AllowBuy= true;
	private boolean AllowClosePosition= true;
	private boolean AllowEditSlTp= true;
	private boolean AllowEditStopLoss= true;
	private boolean AllowEditStopLossLeveraged= true;
	private boolean AllowEditTakeProfit= true;
	private boolean AllowEditTakeProfitLeveraged= true;
	private boolean AllowEntryOrders= true;
	private boolean AllowExitOrder= true;
	private boolean AllowManualTrading= true;
	private boolean AllowPendingOrders= true;
	private boolean AllowRedeem= false;
	private boolean AllowSell= true;
	private boolean AllowTrailingStopLoss= true;
	private int BuyCurrencyID= 2;
	private double BuyEndOfWeekFee= 0.000339;
	private double BuyOverNightFee= 0.000113;
	private int DefaultLeverage= 50;
	private int DefaultStopLossPercentage= 50;
	private int DefaultTakeProfitPercentage= 50;
	private boolean DefaultTrailingStopLoss= false;	
	private int InstrumentID= 1;	
	private boolean IsDelisted= false;
	private boolean IsGuaranteeSlTp= false;
	private boolean IsVisible= false;
	private int Leverage1MaintenanceMargin= 100;
	private double LeveragedBuyEndOfWeekFee= 0.000339;
	private double LeveragedBuyOverNightFee= 0.000113;
	private double LeveragedSellEndOfWeekFee= -0.000141;
	private double LeveragedSellOverNightFee= -0.000047;
	List<Object> Leverages;
	private long MaxPositionUnits= 2000000;
	private long MaxPositionUnitsForRedeem= 1000000;
	private int MaxRateDiffPercentage= 0;
	private int MaxStopLossPercentage= 100;
	private int MaxTakeProfitPercentage= 1000;
	private int MinPositionAmount= 25;
	private int MinPositionAmountAbsolute= 25;
	private double MinPositionUnitsForRedeem= 0.1;
	private double MinStopLossPercentage= 0;
	private double MinTakeProfitPercentage= 0;
	private double NonLeveragedBuyEndOfWeekFee= 0.000339;
	private double NonLeveragedBuyOverNightFee= 0.000113;
	private double NonLeveragedSellEndOfWeekFee= -0.000141;
	private double NonLeveragedSellOverNightFee= -0.000047;
	List<Object> PotentialDisplayLeverages;
	private int Precision= 4;
	private boolean RequiresW8Ben= false;
	private boolean RestrictedManualOpen= false;
	private int SellCurrencyID= 1;
	private double SellEndOfWeekFee= -0.000141;
	private double SellOverNightFee= -0.000047;
	private int SettledBuyMaxLeverage= 0;
	private int SettledSellMaxLeverage= 0;
	private int TypeID= 1;
	private int UnitMargin= 1;
	public boolean isAllowBuy() {
		return AllowBuy;
	}
	public void setAllowBuy(boolean allowBuy) {
		AllowBuy = allowBuy;
	}
	public boolean isAllowClosePosition() {
		return AllowClosePosition;
	}
	public void setAllowClosePosition(boolean allowClosePosition) {
		AllowClosePosition = allowClosePosition;
	}
	public boolean isAllowEditSlTp() {
		return AllowEditSlTp;
	}
	public void setAllowEditSlTp(boolean allowEditSlTp) {
		AllowEditSlTp = allowEditSlTp;
	}
	public boolean isAllowEditStopLoss() {
		return AllowEditStopLoss;
	}
	public void setAllowEditStopLoss(boolean allowEditStopLoss) {
		AllowEditStopLoss = allowEditStopLoss;
	}
	public boolean isAllowEditStopLossLeveraged() {
		return AllowEditStopLossLeveraged;
	}
	public void setAllowEditStopLossLeveraged(boolean allowEditStopLossLeveraged) {
		AllowEditStopLossLeveraged = allowEditStopLossLeveraged;
	}
	public boolean isAllowEditTakeProfit() {
		return AllowEditTakeProfit;
	}
	public void setAllowEditTakeProfit(boolean allowEditTakeProfit) {
		AllowEditTakeProfit = allowEditTakeProfit;
	}
	public boolean isAllowEditTakeProfitLeveraged() {
		return AllowEditTakeProfitLeveraged;
	}
	public void setAllowEditTakeProfitLeveraged(boolean allowEditTakeProfitLeveraged) {
		AllowEditTakeProfitLeveraged = allowEditTakeProfitLeveraged;
	}
	public boolean isAllowEntryOrders() {
		return AllowEntryOrders;
	}
	public void setAllowEntryOrders(boolean allowEntryOrders) {
		AllowEntryOrders = allowEntryOrders;
	}
	public boolean isAllowExitOrder() {
		return AllowExitOrder;
	}
	public void setAllowExitOrder(boolean allowExitOrder) {
		AllowExitOrder = allowExitOrder;
	}
	public boolean isAllowManualTrading() {
		return AllowManualTrading;
	}
	public void setAllowManualTrading(boolean allowManualTrading) {
		AllowManualTrading = allowManualTrading;
	}
	public boolean isAllowPendingOrders() {
		return AllowPendingOrders;
	}
	public void setAllowPendingOrders(boolean allowPendingOrders) {
		AllowPendingOrders = allowPendingOrders;
	}
	public boolean isAllowRedeem() {
		return AllowRedeem;
	}
	public void setAllowRedeem(boolean allowRedeem) {
		AllowRedeem = allowRedeem;
	}
	public boolean isAllowSell() {
		return AllowSell;
	}
	public void setAllowSell(boolean allowSell) {
		AllowSell = allowSell;
	}
	public boolean isAllowTrailingStopLoss() {
		return AllowTrailingStopLoss;
	}
	public void setAllowTrailingStopLoss(boolean allowTrailingStopLoss) {
		AllowTrailingStopLoss = allowTrailingStopLoss;
	}
	public int getBuyCurrencyID() {
		return BuyCurrencyID;
	}
	public void setBuyCurrencyID(int buyCurrencyID) {
		BuyCurrencyID = buyCurrencyID;
	}
	public double getBuyEndOfWeekFee() {
		return BuyEndOfWeekFee;
	}
	public void setBuyEndOfWeekFee(double buyEndOfWeekFee) {
		BuyEndOfWeekFee = buyEndOfWeekFee;
	}
	public double getBuyOverNightFee() {
		return BuyOverNightFee;
	}
	public void setBuyOverNightFee(double buyOverNightFee) {
		BuyOverNightFee = buyOverNightFee;
	}
	public int getDefaultLeverage() {
		return DefaultLeverage;
	}
	public void setDefaultLeverage(int defaultLeverage) {
		DefaultLeverage = defaultLeverage;
	}
	public int getDefaultStopLossPercentage() {
		return DefaultStopLossPercentage;
	}
	public void setDefaultStopLossPercentage(int defaultStopLossPercentage) {
		DefaultStopLossPercentage = defaultStopLossPercentage;
	}
	public int getDefaultTakeProfitPercentage() {
		return DefaultTakeProfitPercentage;
	}
	public void setDefaultTakeProfitPercentage(int defaultTakeProfitPercentage) {
		DefaultTakeProfitPercentage = defaultTakeProfitPercentage;
	}
	public boolean isDefaultTrailingStopLoss() {
		return DefaultTrailingStopLoss;
	}
	public void setDefaultTrailingStopLoss(boolean defaultTrailingStopLoss) {
		DefaultTrailingStopLoss = defaultTrailingStopLoss;
	}
	public int getInstrumentID() {
		return InstrumentID;
	}
	public void setInstrumentID(int instrumentID) {
		InstrumentID = instrumentID;
	}
	public boolean isIsDelisted() {
		return IsDelisted;
	}
	public void setIsDelisted(boolean isDelisted) {
		IsDelisted = isDelisted;
	}
	public boolean isIsGuaranteeSlTp() {
		return IsGuaranteeSlTp;
	}
	public void setIsGuaranteeSlTp(boolean isGuaranteeSlTp) {
		IsGuaranteeSlTp = isGuaranteeSlTp;
	}
	public boolean isIsVisible() {
		return IsVisible;
	}
	public void setIsVisible(boolean isVisible) {
		IsVisible = isVisible;
	}
	public int getLeverage1MaintenanceMargin() {
		return Leverage1MaintenanceMargin;
	}
	public void setLeverage1MaintenanceMargin(int leverage1MaintenanceMargin) {
		Leverage1MaintenanceMargin = leverage1MaintenanceMargin;
	}
	public double getLeveragedBuyEndOfWeekFee() {
		return LeveragedBuyEndOfWeekFee;
	}
	public void setLeveragedBuyEndOfWeekFee(double leveragedBuyEndOfWeekFee) {
		LeveragedBuyEndOfWeekFee = leveragedBuyEndOfWeekFee;
	}
	public double getLeveragedBuyOverNightFee() {
		return LeveragedBuyOverNightFee;
	}
	public void setLeveragedBuyOverNightFee(double leveragedBuyOverNightFee) {
		LeveragedBuyOverNightFee = leveragedBuyOverNightFee;
	}
	public double getLeveragedSellEndOfWeekFee() {
		return LeveragedSellEndOfWeekFee;
	}
	public void setLeveragedSellEndOfWeekFee(double leveragedSellEndOfWeekFee) {
		LeveragedSellEndOfWeekFee = leveragedSellEndOfWeekFee;
	}
	public double getLeveragedSellOverNightFee() {
		return LeveragedSellOverNightFee;
	}
	public void setLeveragedSellOverNightFee(double leveragedSellOverNightFee) {
		LeveragedSellOverNightFee = leveragedSellOverNightFee;
	}
	public List<Object> getLeverages() {
		return Leverages;
	}
	public void setLeverages(List<Object> leverages) {
		Leverages = leverages;
	}
	public long getMaxPositionUnits() {
		return MaxPositionUnits;
	}
	public void setMaxPositionUnits(long maxPositionUnits) {
		MaxPositionUnits = maxPositionUnits;
	}
	public long getMaxPositionUnitsForRedeem() {
		return MaxPositionUnitsForRedeem;
	}
	public void setMaxPositionUnitsForRedeem(long maxPositionUnitsForRedeem) {
		MaxPositionUnitsForRedeem = maxPositionUnitsForRedeem;
	}
	public int getMaxRateDiffPercentage() {
		return MaxRateDiffPercentage;
	}
	public void setMaxRateDiffPercentage(int maxRateDiffPercentage) {
		MaxRateDiffPercentage = maxRateDiffPercentage;
	}
	public int getMaxStopLossPercentage() {
		return MaxStopLossPercentage;
	}
	public void setMaxStopLossPercentage(int maxStopLossPercentage) {
		MaxStopLossPercentage = maxStopLossPercentage;
	}
	public int getMaxTakeProfitPercentage() {
		return MaxTakeProfitPercentage;
	}
	public void setMaxTakeProfitPercentage(int maxTakeProfitPercentage) {
		MaxTakeProfitPercentage = maxTakeProfitPercentage;
	}
	public int getMinPositionAmount() {
		return MinPositionAmount;
	}
	public void setMinPositionAmount(int minPositionAmount) {
		MinPositionAmount = minPositionAmount;
	}
	public int getMinPositionAmountAbsolute() {
		return MinPositionAmountAbsolute;
	}
	public void setMinPositionAmountAbsolute(int minPositionAmountAbsolute) {
		MinPositionAmountAbsolute = minPositionAmountAbsolute;
	}
	public double getMinPositionUnitsForRedeem() {
		return MinPositionUnitsForRedeem;
	}
	public void setMinPositionUnitsForRedeem(double minPositionUnitsForRedeem) {
		MinPositionUnitsForRedeem = minPositionUnitsForRedeem;
	}
	public double getMinStopLossPercentage() {
		return MinStopLossPercentage;
	}
	public void setMinStopLossPercentage(double minStopLossPercentage) {
		MinStopLossPercentage = minStopLossPercentage;
	}
	public double getMinTakeProfitPercentage() {
		return MinTakeProfitPercentage;
	}
	public void setMinTakeProfitPercentage(double minTakeProfitPercentage) {
		MinTakeProfitPercentage = minTakeProfitPercentage;
	}
	public double getNonLeveragedBuyEndOfWeekFee() {
		return NonLeveragedBuyEndOfWeekFee;
	}
	public void setNonLeveragedBuyEndOfWeekFee(double nonLeveragedBuyEndOfWeekFee) {
		NonLeveragedBuyEndOfWeekFee = nonLeveragedBuyEndOfWeekFee;
	}
	public double getNonLeveragedBuyOverNightFee() {
		return NonLeveragedBuyOverNightFee;
	}
	public void setNonLeveragedBuyOverNightFee(double nonLeveragedBuyOverNightFee) {
		NonLeveragedBuyOverNightFee = nonLeveragedBuyOverNightFee;
	}
	public double getNonLeveragedSellEndOfWeekFee() {
		return NonLeveragedSellEndOfWeekFee;
	}
	public void setNonLeveragedSellEndOfWeekFee(double nonLeveragedSellEndOfWeekFee) {
		NonLeveragedSellEndOfWeekFee = nonLeveragedSellEndOfWeekFee;
	}
	public double getNonLeveragedSellOverNightFee() {
		return NonLeveragedSellOverNightFee;
	}
	public void setNonLeveragedSellOverNightFee(double nonLeveragedSellOverNightFee) {
		NonLeveragedSellOverNightFee = nonLeveragedSellOverNightFee;
	}
	public List<Object> getPotentialDisplayLeverages() {
		return PotentialDisplayLeverages;
	}
	public void setPotentialDisplayLeverages(List<Object> potentialDisplayLeverages) {
		PotentialDisplayLeverages = potentialDisplayLeverages;
	}
	public int getPrecision() {
		return Precision;
	}
	public void setPrecision(int precision) {
		Precision = precision;
	}
	public boolean isRequiresW8Ben() {
		return RequiresW8Ben;
	}
	public void setRequiresW8Ben(boolean requiresW8Ben) {
		RequiresW8Ben = requiresW8Ben;
	}
	public boolean isRestrictedManualOpen() {
		return RestrictedManualOpen;
	}
	public void setRestrictedManualOpen(boolean restrictedManualOpen) {
		RestrictedManualOpen = restrictedManualOpen;
	}
	public int getSellCurrencyID() {
		return SellCurrencyID;
	}
	public void setSellCurrencyID(int sellCurrencyID) {
		SellCurrencyID = sellCurrencyID;
	}
	public double getSellEndOfWeekFee() {
		return SellEndOfWeekFee;
	}
	public void setSellEndOfWeekFee(double sellEndOfWeekFee) {
		SellEndOfWeekFee = sellEndOfWeekFee;
	}
	public double getSellOverNightFee() {
		return SellOverNightFee;
	}
	public void setSellOverNightFee(double sellOverNightFee) {
		SellOverNightFee = sellOverNightFee;
	}
	public int getSettledBuyMaxLeverage() {
		return SettledBuyMaxLeverage;
	}
	public void setSettledBuyMaxLeverage(int settledBuyMaxLeverage) {
		SettledBuyMaxLeverage = settledBuyMaxLeverage;
	}
	public int getSettledSellMaxLeverage() {
		return SettledSellMaxLeverage;
	}
	public void setSettledSellMaxLeverage(int settledSellMaxLeverage) {
		SettledSellMaxLeverage = settledSellMaxLeverage;
	}
	public int getTypeID() {
		return TypeID;
	}
	public void setTypeID(int typeID) {
		TypeID = typeID;
	}
	public int getUnitMargin() {
		return UnitMargin;
	}
	public void setUnitMargin(int unitMargin) {
		UnitMargin = unitMargin;
	}
	
	
}
