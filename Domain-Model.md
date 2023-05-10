## User Stories

1. As a student of the Academy I want to be able to add a specific item to my Learning Plan.

2. As a student of the Academy if I change my mind I want to be able to remove a item from my Learning Plan.

3. As a student of the Academy I'd like to know when my Learning plan is full, when I try to add another item (Course, Tutorial, Certification) to it.

4. As a manager at the Academy, I'd like to be able to change the capacity of Learning Plans.

5. As a student of the Academy, I'd like to know that if I try to remove an item that doesn't exist in my Learning Plan.                                
                                              

| Members                    | Methods                         | Scenarios                                                                         | Outputs                                                                                        |   |
|----------------------------|---------------------------------|-----------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------|---|
| ArrayList<String> planItem |                                 |                                                                                   |                                                                                                |   |
| ArrayList<int> planCost    |                                 |                                                                                   |                                                                                                |   |
|                            | add(Item)                       | 1 Successfully add a specific item to the plan                                    | Item name is added to the planItems List and Cost is added to the CostItem List, true returned |   |
|                            |                                 | 3 Item can not be added                                                           | return false                                                                                   |   |
|                            | remove (Item)                   | remove item to the list                                                           | return true and update                                                                         |   |
|                            |                                 | item does not exist                                                               | return false                                                                                   |   |
|                            | updateCapacity(int newCapacity) | 4change value of capacuty                                                         | true if succesfull                                                                             |   |
|                            |                                 |                                                                                   | false if value is 0 or negative                                                                |   |
|                            |                                 | if updateing means there would be more items in the plan than the capacity allows | return false and output message                                                                |   |
                                                                                                          