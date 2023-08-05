# Sudoku-bruteForce

This mini-project was developed during the first year of university (2019-2020 course) while learning the fundamentals of programming in Java.

## Overview

Sudoku-bruteForce provides a text-based implementation of the classic Sudoku game. Instead of using a graphical interface, the Sudoku table is painted using Unicode characters. To input numbers, the user needs to provide the coordinates of the cell they want to fill. The game offers different modes with five levels of difficulty.

## Game Modes

1. Predefined Sudoku:
   - Classic Mode: In this mode, players can solve predefined Sudoku boards without any assistance or indications.
   - Lives Mode: For an extra challenge, users can choose to play with "lives." They have limited lives to use throughout the game, and mistakes will be penalized.

2. Random Sudoku: this mode allows players to solve randomly generated Sudoku boards without any assistance or indications. However it is not assured that there will be an unique solution.

*Note:* In Random Sudoku, it is not assured that there will be a unique solution. The board is generated using a self-invented random algorithm.

## Sudoku Generator Algorithm

The algorithm used to create random Sudoku boards follows these steps:

1. Generate a Sudoku board that adheres to the rules by filling in the numbers one by one, starting from 1 and incrementing until the board is complete without violating Sudoku rules.

2. If the algorithm reaches an endpoint where it cannot fill the entire board, it clears the board and starts the process again.

3. After generating the filled board, a certain number of cells are randomly eliminated based on the difficulty level chosen by the player.

*Note:* The algorithm has been tested empirically and usually succeeds in generating a filled Sudoku board within 3 or 4 attempts.

## How to Play

1. Run the Java program to start the game.

2. Select the desired game mode and difficulty level.

3. Use the coordinates of the cells to input numbers and solve the Sudoku.

4. Keep playing until you successfully complete the Sudoku puzzle.

## Program Visualization:

<img width="572" alt="image" src="https://github.com/lucia-jiang/Sudoku-bruteForce/assets/104275311/b477e192-c854-43c4-91cb-e516394bdaca">
