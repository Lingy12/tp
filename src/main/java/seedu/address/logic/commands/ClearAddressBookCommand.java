package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.model.AddressBook;
import seedu.address.model.Model;

//@@author {zhXchD}
/**
 * Clears the address book.
 */
public class ClearAddressBookCommand extends Command {


    public static final String COMMAND_WORD = "clearc";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Clears all contacts in the address book.\n"
            + "Example: clearc";

    public static final String MESSAGE_SUCCESS =
            "Address book has been cleared!";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.setAddressBook(new AddressBook());
        return new CommandResult(MESSAGE_SUCCESS).setAddressBookTab();
    }
}
