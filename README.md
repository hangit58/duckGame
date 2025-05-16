# Duck Game 
------------------------------------------------------------------------
This is the project README file. This game has been influenced by the youtube viral video "The Duck Song".
------------------------------------------------------------------------

PROJECT TITLE: Duck Game 
PURPOSE OF PROJECT: Ducks rule the world and have humans as pets, as they move along a grid board.
VERSION or DATE: 5/15/2025 (Last Updated)
HOW TO START THIS PROJECT: Run the code, and enter duck player name.
Classes & features: Animal, Duck, Grape, Human, World, Main classes
- the board updates like tictactoe
- ducks are x's, humans are o's
- lemon power 
AUTHORS: Tina Luu
USER INSTRUCTIONS: Have fun and name your humans!

Project Flow:
Start
 |
 |-- Prompt user for Duck name
 |
 |-- Create Duck object (from Duck class → extends Animal)
 |
 |-- Create World (grid) with World class
 |       |
 |       |-- World handles: grid init, clearing, printing, entity positioning
 |
 |-- Create Human (Tommy)
 |
 |-- Game Loop (until "exit" command):
         |
         |-- Clear world grid
         |
         |-- Set Duck and Human positions
         |
         |-- Print Grid
         |
         |-- Get user command:
               |
               |-- "move up/down/left/right" → Update Duck's position
               |
               |-- "add human [name]" → Create new Human object
               |                         Place human near Duck
               |
               |-- "inventory" → Call Duck's `listInventory()` (from Animal)
               |
               |-- Unrecognized → Show error
         |
         |-- Repeat loop
 |
Exit program
