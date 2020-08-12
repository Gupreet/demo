package knapsack;

public class FractionalKnapsackItem {
	private int index;
	private int value;
	private int weight;
	private double ratio;
	
	
	public FractionalKnapsackItem(int index, int value, int weight) {
		super();
		this.index = index;
		this.value = value;
		this.weight = weight;
		this.ratio=value*1.0/weight;
	}
	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}
	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/**
	 * @return the ratio
	 */
	public double getRatio() {
		return ratio;
	}
	/**
	 * @param ratio the ratio to set
	 */
	public void setRatio(double ratio) {
		this.ratio = ratio;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FractionalKnapsackItem [index=" + index + ", value=" + value + ", weight=" + weight + ", ratio=" + ratio
				+ "]";
	}
	
}
