# Connect-Four
Connect Four game 

Game programmed using object programming in Java and GUI JavaFx

Class-

ConnectButton: for buttons with their specified row and column

ConnectFourApplication: for the GUI for the game made with buttons that change to Red or black

Comment - Used Observer/Obzervable interface to update the game with each turn

ConnectFourEnum: To initialize instances of RED, BLACK or when the game is in progress or when a button is empty

ConnectFourGame: Logic to check if game is still going or who won (Red or Black) and update buttons from ConnectFourApplication, also, to change turns between players

ConnectFourTestClient: To run the game and test if it can be played

ConnectMove: to speficy the row, column and colour for the buttons
