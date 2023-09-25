package cst8288_lab2;

/*
Student Name: Tianyi Chen
Student Number:041056592
Course & Section #: 22S_CST8288
Declaration:
This is my own original work and is free from Plagiarism.
*/
import businesslayer.ReceipistBusinessLogic;
import businesslayer.ValidationException;
import transferobjects.ReceipistDTO;
import dataaccesslayer.ReceipistDaolmpl;
import java.util.List;

/**
 * A simple demonstration class that showcases the usage of the ReceipistBusinessLogic class.
 */
public class SimpleDemo {
    /**
     * Executes the demonstration.
     */
	public void demo(){
		try{
			ReceipistBusinessLogic logic = new ReceipistBusinessLogic();
			List<ReceipistDTO> list = null;
			ReceipistDTO receipist = null;
                        
                        System.out.println("Printing Metadata");
                        ReceipistDaolmpl dao = new ReceipistDaolmpl();
                        String metadata = dao.getMetadata();
                        System.out.println(metadata);
			
			System.out.println("Printing Receipists");
			list = logic.getAllReceipists();
			printReceipist(list);
			
			System.out.println("Printing One Receipist");
                        receipist =  logic.getReceipistsById(63);
			printReceipist(receipist);
			System.out.println();
			
			System.out.println("Inserting One Receipist");
			receipist = new ReceipistDTO();
                        receipist.setAwardID(100);
                        receipist.setName("name");
                        receipist.setYear(2200);
                        receipist.setCity("city");
                        receipist.setCategory("Category");
                        logic.addReceipist(receipist);
			list = logic.getAllReceipists();
			printReceipist(list);
			
			
			System.out.println("Updating last receipist");
			Integer updatePrimaryKey = list.get(list.size() - 1).getAwardID();
                        receipist = new ReceipistDTO();
                        receipist.setAwardID(updatePrimaryKey);
                        receipist.setName("UpdateName");
                        receipist.setYear(2023);
                        receipist.setCity("UpdateCity");
                        receipist.setCategory("UpdateCategory");
			logic.updateReceipists(receipist);
			list = logic.getAllReceipists();
			printReceipist(list);
			
			System.out.println("Deleting last receipist");
			receipist = list.get(list.size() - 1);
                        logic.deleteReceipists(receipist);
                        list = logic.getAllReceipists();
                        printReceipist(list);
                        
		}
		catch(ValidationException e){
			System.err.println(e.getMessage());
		}

	}
	
     /**
     * Prints the details of a single receipist.
     *
     * @param receipist The receipist DTO to print.
     */
	private static void printReceipist(ReceipistDTO receipist){
	    	String output;
            output = String.format("%-4d\t %-25s\t %-7s\t %-5s\t %s",
                    receipist.getAwardID(),
                    receipist.getName(),
                    receipist.getYear(),
                    receipist.getCity(),
                    receipist.getCategory());
               
	    	System.out.println(output);
	}
	
     /**
     * Prints the details of a list of receipists.
     *
     * @param receipists The list of receipists to print.
     */
	private static void printReceipist(List<ReceipistDTO> receipists){
            System.out.println(String.format("%-4s\t %-25s\t %-7s\t %-5s\t %s",
            "ID", "name", "year", "city", "category"));
            System.out.println("-----------------------------------------------------------------------------");
	    for(ReceipistDTO receipist : receipists){
	    	printReceipist(receipist);
	    }
	    System.out.println();
	}
	

}
