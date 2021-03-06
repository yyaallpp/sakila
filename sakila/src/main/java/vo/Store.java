package vo;

public class Store { // 도메인 일치
	private int storeId;
	private int manegerStaffId;
	private int addressId;
	private String lastUpdate;
	
	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", manegerStaffId=" + manegerStaffId + ", addressId=" + addressId
				+ ", lastUpdate=" + lastUpdate + "]";
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public int getManegerStaffId() {
		return manegerStaffId;
	}
	public void setManegerStaffId(int manegerStaffId) {
		this.manegerStaffId = manegerStaffId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
}
