------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:
sample input
3
1 1
2 3
4 3

Problem 
Find a path such that the knight visits every square once. 
The knight can start and end on any square of the board.

Input

The input begins with a positive integer n in the first line. 
The following lines contain n test cases. Each test case consists of a single line with two positive integers p and q, such that 1 <= p * q <= 26. 
This represents a p * q chessboard, where p describes how many different square numbers 1, . . . , p exist, q describes how many different square letters exist. 
These are the first q letters of the Latin alphabet: A, . . .

Output

The output for every scenario begins with a line containing "Scenario #i:", where i is the number of the scenario starting at 1. 
Then print a single line containing the lexicographically first path that visits all squares of the chessboard with knight moves followed by an empty line. 
The path should be given on a single line by concatenating the names of the visited squares. 
Each square name consists of a capital letter followed by a number. 
If no such path exist, you should output impossible on a single line.
