/*
Student Name: Tianyi Chen
Student Number:041056592
Course & Section #: 22S_CST8288
Declaration:
This is my own original work and is free from Plagiarism.
*/
package dataaccesslayer;

import java.util.List;

import transferobjects.ReceipistDTO;
/**
 * Interface for accessing and manipulating receipist data.
 */
public interface ReceipistDAO {
    /**
     * Retrieves all receipists.
     *
     * @return A list of all receipists.
     */
	List<ReceipistDTO> getAllReceipists();
    /**
     * Retrieves a receipist by their ID.
     *
     * @param ID The ID of the receipist to retrieve.
     * @return The receipist with the specified ID.
     */
	ReceipistDTO getReceipistsById(Integer ID);
     /**
     * Adds a new receipist.
     *
     * @param receipist The receipist to add.
     */
	void addReceipist(ReceipistDTO receipist);
     /**
     * Updates an existing receipist.
     *
     * @param receipist The receipist to update.
     */
	void updateReceipists(ReceipistDTO receipist);
     /**
     * Deletes a receipist.
     *
     * @param receipist The receipist to delete.
     */
	void deleteReceipists(ReceipistDTO receipist);
     /**
     * Retrieves metadata information.
     *
     * @return The metadata information.
     */
        String getMetadata();
}
    

