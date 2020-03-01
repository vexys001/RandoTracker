# Use Cases

**Stars mean incomplete use cases**

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

1-3a: The player cancels the loading selection and returns to the menu.

    1. During Step 1, you can click somewhere else to close the menu.

    2. During Step 2 and 3, you can click cancel at anytime and returns to the main window.
   
3a. The player selects a wrong type of file.
    
    1. The system does not allow to other types of documents to appear in the explorer window.
    
    2. OR The system warns the user of an undesired type of file being loaded. Lets the user pick again.

4a. The XML format of the list is invalid.
    
    1. Warns the user that the list could not be loaded due to errors in the document format.

**Special Requirements** 
- User has a valid XML file containing a list of items.

## CU02 : Save an Item List

**Scope:**  System Use case

**Level:** User-goal Level

**Primary Actor:** User

**Stakeholders and Interests:**
- User:  Wants to save a list in progress to reload for later.

**Preconditions:** User has a list loaded.

**Postconditions:** User has a new XML file in folder of his choice of the current loaded list.

**Main Success Scenario:** 
1. User opens the menu.
2. User selects Save and a document explorer window is opened at the root of the program.
3. User selects a name and a desired folder for the new XML file.
4. XML File is created.

**Extensions:**

1-3a: The player cancels the saving selection and returns to the menu.

    1. During Step 1, you can click somewhere else to close the menu.

    2. During Step 2 and 3, you can click cancel at anytime and returns to the main window.

**Special Requirements** 
- User has a valid XML file containing a list of items. The user has already loaded this list in the tracker.

## CU03 : Categorize an Item of the List

**Scope:**  System Use case

**Level:** Subfunction Level

**Primary Actor:** System

**Stakeholders and Interests:**
- User:  Wants to have a list of Buttons that can be differientiated by their Categories

**Preconditions:** User has a valid list to load with the proper tags for categories.

**Postconditions:** User has a list of buttons for each item of the list to use. Buttons of the same categories have the same look(color).

**Main Success Scenario:** 
1. User opens the menu.
2. User selects Load and a document explorer window is opened at the root of the program.
3. User selects a XML file from his desired folder.
4. File is loaded and a list of buttons for each item of the list appears. Buttons of the same categories look similar(color).

**Extensions:**

1-3a: The player cancels the loading selection and returns to the menu.

    1. During Step 1, you can click somewhere else to close the menu.

    2. During Step 2 and 3, you can click cancel at anytime and returns to the main window.
   
3a. The player selects a wrong type of file.
    
    1. The system does not allow to other types of documents to appear in the explorer window.
    
    2. OR The system warns the user of an undesired type of file being loaded. Lets the user pick again.

4a. The XML format of the list is invalid.
    
    1. Warns the user that the list could not be loaded due to errors in the document format.

**Special Requirements** 
- User has a valid XML file containing a list of items with category tags.

## CU04 : Remove an Item of the List 

**Scope:**  System Use case

**Level:** User-goal Level

**Primary Actor:** User

**Stakeholders and Interests:**
- User:  Wants to remove an item of the list. To mark that he might have found said item.

**Preconditions:** User has a list loaded.

**Postconditions:** User has an updated list with one less item of the selected item.

**Main Success Scenario:** 
1. User clicks on a button for an Item.
2. The List is updated.

**Extensions:**

N/A

**Special Requirements** 
- User has a valid XML file containing a list of items. The user has already loaded this list in the tracker.

## CU05 : Undo an Item Removal 

**Scope:**  System Use case

**Level:** User-goal Level

**Primary Actor:** User

**Stakeholders and Interests:**
- User:  Wants to undo a recent item removal.

**Preconditions:** User has a list loaded and has removed an item.

**Postconditions:** User has an updated list with the last removed item back.

**Main Success Scenario:** 
1. User opens the menu.
2. User selects Undo remove
3. The List is updated.

**Extensions:**

1a: The player cancels the undo and returns to the list.

    1. You can click somewhere else to close the menu.

**Special Requirements** 
- User has a valid XML file containing a list of items. The user has already loaded this list in the tracker. The user has removed one or more item off the loaded list.

## CU06 : Reset the Item List 

**Scope:**  System Use case

**Level:** User-goal Level

**Primary Actor:** User

**Stakeholders and Interests:**
- User:  Wants to reset the list he last loaded.

**Preconditions:** User has a list loaded.

**Postconditions:** The List is reset to its formal state.

**Main Success Scenario:** 
1. User opens the menu.
2. User selects Reset
3. The List is reset to its formal state.

**Extensions:**

1a: The player cancels the reset and returns to the list.

    1. You can click somewhere else to close the menu.

**Special Requirements** 
- User has a valid XML file containing a list of items. The user has already loaded this list in the tracker.

## CU07 : Undo the Reset the Item List 

**Scope:**  System Use case

**Level:** User-goal Level

**Primary Actor:** User

**Stakeholders and Interests:**
- User:  Wants to undo the last reset of the list.

**Preconditions:** User has a list loaded and he reset it.

**Postconditions:** The List is reset to its state before the last reset.

**Main Success Scenario:** 
1. User opens the menu.
2. User selects Undo reset
3. The list is updated to its state before the last reset.

**Extensions:**

1a: The player cancels the undo reset and returns to the list.

    1. You can click somewhere else to close the menu.

**Special Requirements** 
- User has a valid XML file containing a list of items. The user has already loaded this list in the tracker. The user has reset the list.

## CU08 : Submit Leftover Report

**Scope:**  System Use case

**Level:** User-goal Level

**Primary Actor:** User

**Stakeholders and Interests:**
- User:  Wants to save a list as completed for statistics.

**Preconditions:** User has a list loaded.

**Postconditions:** The list is removed form the screen. The statistics of the completed list are saved.

**Main Success Scenario:** 
1. User opens the menu.
2. User selects Save as completed.
3. The list is removed.
4. The statistics associated to the completed list are saved.

**Extensions:**

1: The player cancels the saving selection and returns to the menu.

    1. During Step 1, you can click somewhere else to close the menu.

**Special Requirements** 
- User has a valid XML file containing a list of items. The user has already loaded this list in the tracker. The statistics have a place to be saved.

## CU09 : Opens Statistics Page 

**Scope:**  System Use case

**Level:** User-goal Level

**Primary Actor:** User

**Stakeholders and Interests:**
- User:  Wants to see his statistics for a game.

**Preconditions:** User has a record of statistics.

**Postconditions:** Window displaying some statistics is displayed.

**Main Success Scenario:** 
1. User opens the menu.
2. User selects Show statistics.
3. User selects a game.
4. Window displaying statistics from selected game appears.

**Extensions:**

1-3a: The player cancels the statistics selection and returns to the window.

    1. During Step 1, you can click somewhere else to close the menu.

    2. During Step 2 and 3, you can click cancel at anytime and returns to the main window.

4a. The player closes the statistics window.

    1. The window has a close button.

**Special Requirements** 
- User has a record of statistics.
