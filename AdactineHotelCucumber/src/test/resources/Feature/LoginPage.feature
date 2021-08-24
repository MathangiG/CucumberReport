Feature: Verifying Adactine Page Login

@tag1
Scenario Outline: Verifying Adactin login With Valid Credentials
Given User is on Adactine Login page
When User should login "<username>" and "<password>"
And User should search hotel "<location>" , "<hotel>" , "<roomType>" , "<RoomNo>" , "<adult>" and "<child>"
And User should select the room
And User should book room "<firstName>" , "<lastName>" , "<address>" , "<ccNo>" , "<ccType>" , "<month>" , "<year>" and "<cvv>"
Then User should generate order Id

Examples:|
| username | password | location | hotel          | roomType     | RoomNo  | adult      | child    | firstName | lastName  | address | ccNo             | ccType | month   | year | cvv |
| Mathangi | A2J3X1   | Sydney   | Hotel Creek    | Standard     | 1 - One | 4 - Four   | 2 - Two  | Mathangi  | Sankar    | Chennai | 1234567890123456 | VISA   | October | 2017 | 345 |
| Mathangi | A2J3X1   | Melbourne| Hotel Sunshine | Standard     | 2 - Two | 2 - Two    | 0 - None | Praneet   | Sankar    | Chennai | 1234567890123456 | VISA   | October | 2017 | 345 |
| Mathangi | A2J3X1   | Brisbane | Hotel Hervey   | Super Deluxe | 1 - One | 1 - One    | 0 - None | Sankar    | Muthu     | Chennai | 1234567890123456 | VISA   | October | 2017 | 345 |
| Mathangi | A2J3X1   | Adelaide | Hotel Cornice  | Standard     | 1 - One | 1 - One    | 0 - None | Pavithra  | Ram       | Chennai | 1234567890123456 | VISA   | October | 2017 | 345 |
| Mathangi | A2J3X1   | London   | Hotel Sunshine | Deluxe       | 1 - One | 3 - Three  | 1 - One  | Devi      | Ganesan   | Chennai | 1234567890123456 | VISA   | October | 2017 | 345 |
| Mathangi | A2J3X1   | Adelaide | Hotel Creek    | Standard     | 1 - One | 1 - One    | 0 - None | Gayathri  | Ganesan   | Chennai | 1234567890123456 | VISA   | October | 2017 | 345 |
| Mathangi | A2J3X1   | London   | Hotel Creek    | Deluxe       | 1 - One | 1 - One    | 0 - None | Gowri     | Balu      | Chennai | 1234567890123456 | VISA   | October | 2017 | 345 |
| Mathangi | A2J3X1   | Sydney   | Hotel Cornice  | Standard     | 1 - One | 1 - One    | 0 - None | Hanshika  | Sarava    | Chennai | 1234567890123456 | VISA   | October | 2017 | 345 |
| Mathangi | A2J3X1   | Brisbane | Hotel Hervey   | Standard     | 1 - One | 1 - One    | 0 - None | Mathangi  | Ganesan   | Chennai | 1234567890123456 | VISA   | October | 2017 | 345 |

@tag2
Scenario Outline: Verifying Adactin login With Valid Credentials
Given User is on Adactine Login page
When User should login "<username>" and "<password>"
And User should search hotel "<location>" , "<hotel>" , "<roomType>" , "<RoomNo>" , "<adult>" and "<child>"
And User should select the room
And User should book room "<firstName>" , "<lastName>" , "<address>" , "<ccNo>" , "<ccType>" , "<month>" , "<year>" and "<cvv>"
Then User should generate order Id

Examples:|
| username | password | location | hotel          | roomType     | RoomNo  | adult      | child    | firstName | lastName  | address | ccNo             | ccType | month   | year | cvv |
| Mathangi | A2J3X1   | Sydney   | Hotel Creek    | Standard     | 1 - One | 4 - Four   | 2 - Two  | Mathangi  | Sankar    | Chennai | 1234567890123456 | VISA   | October | 2017 | 345 |

@tag3
Scenario Outline: Verifying Adactin login With Valid Credentials
Given User is on Adactine Login page
When User should login "<username>" and "<password>"
And User should search hotel "<location>" , "<hotel>" , "<roomType>" , "<RoomNo>" , "<adult>" and "<child>"
And User should select the room
And User should book room "<firstName>" , "<lastName>" , "<address>" , "<ccNo>" , "<ccType>" , "<month>" , "<year>" and "<cvv>"
Then User should generate order Id

Examples:|
| username | password | location | hotel          | roomType     | RoomNo  | adult      | child    | firstName | lastName  | address | ccNo             | ccType | month   | year | cvv |
| Mathangi | A2J3X1   | Sydney   | Hotel Creek    | Standard     | 1 - One | 4 - Four   | 2 - Two  | Mathangi  | Sankar    | Chennai | 1234567890123456 | VISA   | October | 2017 | 345 |
