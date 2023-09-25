/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Student Name: Tianyi Chen
Student Number:041056592
Course & Section #: 22S_CST8288
Declaration:
This is my own original work and is free from Plagiarism.
*/
package businesslayer;

import java.util.List;
import dataaccesslayer.ReceipistDAO;
import dataaccesslayer.ReceipistDaolmpl;
import transferobjects.ReceipistDTO;

import java.util.List;

/**
 * The business logic class for managing receipists.
 */
public class ReceipistBusinessLogic {
	private static final int NAME_MAX_LENGTH = 30;
	private static final int CITY_MAX_LENGTH = 30;
        private static final int CATEGORY_MAX_LENGTH = 30;
	private ReceipistDAO receipistDao = null;

     /**
     * Creates a new instance of the ReceipistBusinessLogic class and initializes the ReceipistDAO.
     */
	public ReceipistBusinessLogic(){
		receipistDao = new ReceipistDaolmpl();
	}
    /**
     * Retrieves a list of all receipists.
     *
     * @return The list of receipists.
     */
	public List<ReceipistDTO> getAllReceipists(){
		return receipistDao.getAllReceipists();
	}
    /**
     * Retrieves a receipist by ID.
     *
     * @param ID The ID of the receipist.
     * @return The receipist DTO.
     */
	public ReceipistDTO getReceipistsById(Integer ID){
		return receipistDao.getReceipistsById(ID);
	}
    /**
     * Adds a new receipist.
     *
     * @param receipist The receipist DTO to add.
     * @throws ValidationException If the receipist validation fails.
     */
	public void addReceipist(ReceipistDTO receipist) throws ValidationException{
		cleanReceipist(receipist);
		validateReceipist(receipist);
		receipistDao.addReceipist(receipist);
	}
	
     /**
     * Updates an existing receipist.
     *
     * @param receipist The receipist DTO to update.
     * @throws ValidationException If the receipist validation fails.
     */
	public void updateReceipists(ReceipistDTO receipist) throws ValidationException{
		cleanReceipist(receipist);
		validateReceipist(receipist);
		receipistDao.updateReceipists(receipist);
	}
	
     /**
     * Deletes a receipist.
     *
     * @param receipist The receipist DTO to delete.
     */
	public void deleteReceipists(ReceipistDTO receipist){
		receipistDao.deleteReceipists(receipist);
	}
	
    /**
     * Cleans the receipist DTO by removing leading and trailing whitespaces from its properties.
     *
     * @param receipist The receipist DTO to clean.
     */
	private void cleanReceipist(ReceipistDTO receipist){
		if(receipist.getName() != null){ 
			receipist.setName(receipist.getName().trim());
		}
		if(receipist.getCity() != null){ 
			receipist.setCity(receipist.getCity().trim());
		}
                if(receipist.getCategory() != null){
                        receipist.setCategory(receipist.getCategory().trim());
                }
	}
	
     /**
     * Validates the receipist DTO.
     *
     * @param receipist The receipist DTO to validate.
     * @throws ValidationException If the validation fails.
     */
	private void validateReceipist(ReceipistDTO receipist) throws ValidationException{
		validateString(receipist.getName(), "name", NAME_MAX_LENGTH, true);
		validateString(receipist.getCity(), "city", CITY_MAX_LENGTH, true);
                validateString(receipist.getCategory(),"category",CATEGORY_MAX_LENGTH,true);
                       
	}

     /**
     * Validates a string value against the specified constraints.
     *
     * @param value          The string value to validate.
     * @param fieldName      The name of the field being validated.
     * @param maxLength      The maximum length allowed for the value.
     * @param isNullAllowed  Determines whether null values are allowed.
     * @throws ValidationException If the validation fails.
     */
	private void validateString(String value, String fieldName, int maxLength, boolean isNullAllowed)
	    throws ValidationException{
		if(value == null && isNullAllowed){
			// return; // null permitted, nothing to validate
		}
		else if(value == null && ! isNullAllowed){
		    throw new ValidationException(String.format("%s cannot be null", 
		    		fieldName));
		}
		else if(value.length() == 0){
			throw new ValidationException(String.format("%s cannot be empty or only whitespace", 
					fieldName));
		}
		else if(value.length() > maxLength){
			throw new ValidationException(String.format("%s cannot exceed %d characters", 
					fieldName, maxLength));
		}
	}
	/*
	private void validateInt(int value, String fieldName)
	    throws ValidationException{
		if(value <= 0){
			throw new ValidationException(String.format("%s cannot be a negative number", 
					fieldName));
		}
	}
	*/
}

/**
 *
 * @author tthm1
 */
