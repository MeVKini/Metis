package grocery.db;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Reciepe {

	@Id private String id;

	private String name;
	private String description;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getServingSize() {
		return servingSize;
	}

	public void setServingSize(String servingSize) {
		this.servingSize = servingSize;
	}

	public String getCalories() {
		return calories;
	}

	public void setCalories(String calories) {
		this.calories = calories;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDeconstructionOfRecipe() {
		return deconstructionOfRecipe;
	}

	public void setDeconstructionOfRecipe(String deconstructionOfRecipe) {
		this.deconstructionOfRecipe = deconstructionOfRecipe;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getStepsToCook() {
		return stepsToCook;
	}

	public void setStepsToCook(String stepsToCook) {
		this.stepsToCook = stepsToCook;
	}

	public String getEstimatedCookingTime() {
		return estimatedCookingTime;
	}

	public void setEstimatedCookingTime(String estimatedCookingTime) {
		this.estimatedCookingTime = estimatedCookingTime;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	private String servingSize;
	private String calories;
	private String author;
	private String deconstructionOfRecipe;
	private String story;
	private List tags;
	private Date createdDate;
	private String stepsToCook;
	private String estimatedCookingTime;
	private String cuisine;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
