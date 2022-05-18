package domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultsItem{

	@JsonProperty("image")
	private String image;

	@JsonProperty("description")
	private String description;

	@JsonProperty("id")
	private String id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("resultType")
	private String resultType;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setResultType(String resultType){
		this.resultType = resultType;
	}

	public String getResultType(){
		return resultType;
	}

	@Override
	public String toString() {
		return "ResultsItem{" +
				"image='" + image + '\'' +
				", description='" + description + '\'' +
				", id='" + id + '\'' +
				", title='" + title + '\'' +
				", resultType='" + resultType + '\'' +
				'}';
	}
}