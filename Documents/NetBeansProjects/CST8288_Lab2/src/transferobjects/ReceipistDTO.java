/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transferobjects;

/*
Student Name: Tianyi Chen
Student Number:041056592
Course & Section #: 22S_CST8288
Declaration:
This is my own original work and is free from Plagiarism.
*/
/**
 * The ReceipistDTO class represents a data transfer object for a recipient.
 * It encapsulates the information related to a recipient, including the recipient's award ID,
 * name, year, city, and category.
 */
public class ReceipistDTO {
    
    private int AwardID;
    private String Name;
    private int Year;
    private String City;
    private String Category;
    
    /**
     * Returns the award ID of the recipient.
     *
     * @return The award ID of the recipient.
     */
    public int getAwardID() {
				return AwardID;
			}
     /**
     * Sets the award ID of the recipient.
     *
     * @param awardID The award ID to set for the recipient.
     */
			public void setAwardID(int awardID) {
				AwardID = awardID;
			}
                         /**
     * Returns the name of the recipient.
     *
     * @return The name of the recipient.
     */
			public String getName() {
				return Name;
			}
     /**
     * Sets the name of the recipient.
     *
     * @param name The name to set for the recipient.
     */
			public void setName(String name) {
				Name = name;
			}
     /**
     * Returns the year of the recipient.
     *
     * @return The year of the recipient.
     */
			public int getYear() {
				return Year;
			}
    /**
     * Sets the year of the recipient.
     *
     * @param year The year to set for the recipient.
     */
    public void setYear(int year) {
        Year = year;
    }
    
    /**
     * Returns the city of the recipient.
     *
     * @return The city of the recipient.
     */
    public String getCity() {
        return City;
    }
    
    /**
     * Sets the city of the recipient.
     *
     * @param city The city to set for the recipient.
     */
    public void setCity(String city) {
        City = city;
    }
    
    /**
     * Returns the category of the recipient.
     *
     * @return The category of the recipient.
     */
    public String getCategory() {
        return Category;
    }
    
    /**
     * Sets the category of the recipient.
     *
     * @param category The category to set for the recipient.
     */
    public void setCategory(String category) {
        Category = category;
    }
    
}