# Use Cases

**Stars mean incomplete use cases**

- [Use Cases](#use-cases)
  - [CU01 : Load an Item List](#cu01--load-an-item-list)
  - [CU02 : Save an Item List *](#cu02--save-an-item-list)
  - [CU03 : Categorize an Item of the List *](#cu03--categorize-an-item-of-the-list)
  - [CU04 : Remove an Item of the Button List](#cu04--remove-an-item-of-the-button-list)
  - [CU05 : Undo an Item Removal *](#cu05--undo-an-item-removal)
  - [CU06 : Reset the Button List](#cu06--reset-the-button-list)
  - [CU07 : Undo the Reset the Item List *](#cu07--undo-the-reset-the-item-list)
  - [CU08 : Submit Leftover Report *](#cu08--submit-leftover-report)
  - [CU09 : Opens Statistics Page *](#cu09--opens-statistics-page)
  - [Return to README](#return-to-readme)


## CU01 : Load an Item List

**Scope:**  System Use case

**Level:** User-goal Level

**Primary Actor:** User

**Stakeholders and Interests:**
- User:  Wants a list as stated by the document loaded.

**Preconditions:** User has a valid document to load.

**Postconditions:** User has a list of buttons for each item of the list to use.

**Main Success Scenario:** 
1. User selects Load in the menu and a Document Explorer Window is opened at the root of the program.
2. User selects a XML file from his desired folder.
3. File is loaded and a list of buttons for each item of the list appears.

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

## CU02 : Save an Item List *

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

## CU03 : Categorize an Item of the List *

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

## CU04 : Remove an Item of the Button List 

**Scope:**  System Use case

**Level:** User-goal Level

**Primary Actor:** User

**Stakeholders and Interests:**
- User:  Wants to remove an item of the list. To mark that he might have found said item.

**Preconditions:** User has a list loaded.

**Postconditions:** User has an updated list with one less item of the selected item.

**Main Success Scenario:** 
1. User clicks on a button for an Item.
2. The button has its occurence updated.
   1. If the button had only one occurence left, the button is removed from the button list. 
   2. If the button had more than one occurence left, the occurence variable of the button is reduced by one. 
3. All buttons have their probability updated.

**Extensions:**

N/A

**Special Requirements** 
- User has a valid XML file containing a list of items. The user has already loaded this list in the tracker.

## CU05 : Undo an Item Removal *

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

## CU06 : Reset the Button List 

**Scope:**  System Use case

**Level:** User-goal Level

**Primary Actor:** User

**Stakeholders and Interests:**
- User:  Wants to reset the list he last loaded.

**Preconditions:** User has a list loaded.

**Postconditions:** The List is reset to its state at the moment of its download.

**Main Success Scenario:** 
1. User selects Reset in the menu.
2. The ButtonList is reset to its state at the moment of its download.

**Extensions:**

1a: The player cancels the reset and returns to the list.

    1. You can click somewhere else to close the menu.

**Special Requirements** 
- User has a valid XML file containing a list of items. The user has already loaded this list in the tracker.

## CU07 : Undo the Reset the Item List *

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

## CU08 : Submit Leftover Report *

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

## CU09 : Opens Statistics Page *

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

## [Return to README](../../README.md)