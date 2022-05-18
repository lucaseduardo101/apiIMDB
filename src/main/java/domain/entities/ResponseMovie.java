package domain.entities;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseMovie implements Response{

	@JsonProperty("expression")
	private String expression;

	@JsonProperty("searchType")
	private String searchType;

	@JsonProperty("errorMessage")
	private String errorMessage;

	@JsonProperty("results")
	private List<ResultsItem> results;

	public void setExpression(String expression){
		this.expression = expression;
	}

	public String getExpression(){
		return expression;
	}

	public void setSearchType(String searchType){
		this.searchType = searchType;
	}

	public String getSearchType(){
		return searchType;
	}

	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage(){
		return errorMessage;
	}

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	@Override
	public String toString() {
		return "ResponseMovie{" +
				"expression='" + expression + '\'' +
				", searchType='" + searchType + '\'' +
				", errorMessage='" + errorMessage + '\'' +
				", results=" + results +
				'}';
	}
}