package seedu.addressbook.ui;

import static seedu.addressbook.common.Messages.*;

import java.util.ArrayList;
import java.util.List;

import seedu.addressbook.data.person.ReadOnlyPerson;

public class Formatter {

    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    static final String LINE_PREFIX = "|| ";
    
    /** A platform independent line separator. */
    static final String LS = System.lineSeparator();
    
    static final String DIVIDER = "===================================================";
    
    /** Format of indexed list item */
    static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";

    static final String[] goodbyeMessage = { MESSAGE_GOODBYE, DIVIDER, DIVIDER };

    static final String userCommand = LINE_PREFIX + "Enter command: ";
    
    /** Offset required to convert between 1-indexing and 0-indexing. */
    public static final int DISPLAYED_INDEX_OFFSET = 1;
    
    static String repeatCommand(String fullInputLine) {
        return "[Command entered:" + fullInputLine + "]";
    }
    
    public static String[] getWelcomeMessage(String version, String storageFilePath) {
        String storageFileInfo = String.format(MESSAGE_USING_STORAGE_FILE, storageFilePath);
        return new String[] { DIVIDER, DIVIDER, MESSAGE_WELCOME, version, MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE,
                storageFileInfo, DIVIDER };
    }

    public static String[] getInitFailedMessage() {
        return new String[] { MESSAGE_INIT_FAILED, DIVIDER, DIVIDER };
    }

    public static String formatMessageToUser(String m) {
        return LINE_PREFIX + m.replace("\n", LS + LINE_PREFIX);

    }

    public static String[] formatResultToUser(String feedbackToUser) {
        return new String[] { feedbackToUser, DIVIDER };
    }

    public static List<String> formatPerson(List<? extends ReadOnlyPerson> persons) {
        final List<String> formattedPersons = new ArrayList<>();
        for (ReadOnlyPerson person : persons) {
            formattedPersons.add(person.getAsTextHidePrivate());
        }
        return formattedPersons;
    }

    /** Formats a list of strings as a viewable indexed list. */
    static String getIndexedListForViewing(List<String> listItems) {
        final StringBuilder formatted = new StringBuilder();
        int displayIndex = 0 + DISPLAYED_INDEX_OFFSET;
        for (String listItem : listItems) {
            formatted.append(getIndexedListItem(displayIndex, listItem)).append("\n");
            displayIndex++;
        }
        return formatted.toString();
    }

    /**
     * Formats a string as a viewable indexed list item.
     *
     * @param visibleIndex
     *            visible index for this listing
     */
    private static String getIndexedListItem(int visibleIndex, String listItem) {
        return String.format(Formatter.MESSAGE_INDEXED_LIST_ITEM, visibleIndex, listItem);
    }

}