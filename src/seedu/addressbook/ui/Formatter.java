package seedu.addressbook.ui;

import static seedu.addressbook.common.Messages.*;

public class Formatter {
	
	private static final String newLine = "\n";
	
	/** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";

    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();

    private static final String DIVIDER = "===================================================";

    /** Format of indexed list item */
    private static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";

    public static String addLinePrefix() {
    	return LINE_PREFIX;
    }
    
    public static String formatWelcomeMessage(String version, String storageFilePath) {
    	String storageFileInfo = String.format(MESSAGE_USING_STORAGE_FILE, storageFilePath);
    	return DIVIDER + newLine + DIVIDER + newLine + MESSAGE_WELCOME + newLine + 
    			version + newLine + MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE + newLine + 
    			storageFileInfo + newLine + DIVIDER;
    }
    
    public static String formatGoodbyeMessage() {
    	return MESSAGE_GOODBYE + newLine + DIVIDER + newLine + DIVIDER;
    }
    
    public static String formatInitFailedMessage() {
    	return MESSAGE_INIT_FAILED + newLine + DIVIDER + newLine + DIVIDER;
    }
    
    public static String formatOutput(String output) {
    	return LINE_PREFIX + output.replace(newLine, LS + LINE_PREFIX);
    }
    
    public static String formatResult(String result) {
    	return result + newLine + DIVIDER;
    }
    
    public static String formatIndexedListItem(int visibleIndex, String listItem) {
    	return String.format(MESSAGE_INDEXED_LIST_ITEM, visibleIndex, listItem);
    }
    
}
