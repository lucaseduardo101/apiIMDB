package domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemsItem{

	@JsonProperty("imDbRating")
	private String imDbRating;

	@JsonProperty("image")
	private String image;

	@JsonProperty("fullTitle")
	private String fullTitle;

	@JsonProperty("imDbRatingCount")
	private String imDbRatingCount;

	@JsonProperty("year")
	private String year;

	@JsonProperty("rank")
	private String rank;

	@JsonProperty("id")
	private String id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("crew")
	private String crew;

	public void setImDbRating(String imDbRating){
		this.imDbRating = imDbRating;
	}

	public String getImDbRating(){
		return imDbRating;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setFullTitle(String fullTitle){
		this.fullTitle = fullTitle;
	}

	public String getFullTitle(){
		return fullTitle;
	}

	public void setImDbRatingCount(String imDbRatingCount){
		this.imDbRatingCount = imDbRatingCount;
	}

	public String getImDbRatingCount(){
		return imDbRatingCount;
	}

	public void setYear(String year){
		this.year = year;
	}

	public String getYear(){
		return year;
	}

	public void setRank(String rank){
		this.rank = rank;
	}

	public String getRank(){
		return rank;
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

	public void setCrew(String crew){
		this.crew = crew;
	}

	public String getCrew(){
		return crew;
	}

	@Override
	public String toString() {
		return "ItemsItem{" +
				"imDbRating='" + imDbRating + '\'' +
				", image='" + image + '\'' +
				", fullTitle='" + fullTitle + '\'' +
				", imDbRatingCount='" + imDbRatingCount + '\'' +
				", year='" + year + '\'' +
				", rank='" + rank + '\'' +
				", id='" + id + '\'' +
				", title='" + title + '\'' +
				", crew='" + crew + '\'' +
				'}';
	}
}