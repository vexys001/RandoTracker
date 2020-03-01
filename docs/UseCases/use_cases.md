# Use Cases

## CU01 : Load an Item List

**Scope:**  System Use case

**Level:** User-goal Level

**Primary Actor:** User

**Stakeholders and Interests:**
- User:  Wants a list as stated by the document loaded.

**Preconditions:** User has a valid list to load.

**Postconditions:** User has a list of buttons for each item of the list to use.

**Main Success Scenario:** 
1. User opens the menu.
2. User selects Load and a document explorer window is opened at the root of the program.
3. User selects a XML file from his desired folder.
4. File is loaded and a list of buttons for each item of the list appears.

**Extensions:**
1-3a: The player cancels the loading selection and returns to the menu.\n
    1. During Step 1, you can click somewhere else to close the menu.
    2. During Step 2 and 3, you can click cancel at anytime and returns to the main window.
3a. The player selects a wrong type of file.
    1. The system does not allow to other types of documents to appear in the explorer window.
    2. OR The system warns the user of an undesired type of file being loaded. Lets the user pick again.
4a. The XML format of the list is invalid.
    1. Warns the user that the list could not be loaded due to errors in the document format.

**Special Requirements** 
- User has a valid XML file containing a list of items.