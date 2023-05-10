## User Stories

1. As a student of the Academy I want to be able to add a specific item to my Learning Plan.

2. As a student of the Academy if I change my mind I want to be able to remove a item from my Learning Plan.

3. As a student of the Academy I'd like to know when my Learning plan is full, when I try to add another item (Course, Tutorial, Certification) to it.

4. As a manager at the Academy, I'd like to be able to change the capacity of Learning Plans.

5. As a student of the Academy, I'd like to know that if I try to remove an item that doesn't exist in my Learning Plan.

## Domain Model

                             **LearningPlan**

| Members/Attributes/Fields      | Methods                              | Scenarios | Outcomes/Outputs           |
|--------------------------------|---------                             |-----------|------------------          |
| `ArrayList< String> planItem`   | AddItem(String newItem)        | adding an item on the ArrayList          | void                       |
| `ArrayList< Integer> planCosts` | AddCost(int NewCost)           | adding a cost on the ArrayList                                   | void                       |
|                                | RemoveItem(String Item)              |checkout for the item we want to remove and output the index    | int                     |
|                                | RemoveCost(int Cost)                 | take the index and remove the cost that its saved there        | void                       |





