package domain.entities;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Response250 implements Response {

	@JsonProperty("errorMessage")
	private String errorMessage;

	@JsonProperty("items")
	private List<ItemsItem> items;

	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage(){
		return errorMessage;
	}

	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	public List<ItemsItem> getItems(){
		return items;
	}

	@Override
	public String toString() {
		return "Response250{" +
				"errorMessage='" + errorMessage + '\'' +
				", items=" + items +
				'}';
	}
}