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


Tetris
Tetris is a popular computer game played in a field consisting of CC columns and an unlimited number of rows. In one move, one of the following seven pieces is dropped into the field:

\includegraphics[width=0.95\textwidth ]{tetris1}
When dropping a piece, the player is free to rotate the piece 9090, 180180 or 270270 degrees and to move it left or right, as long as the piece stays entirely in the field. The piece then falls until it settles on the bottom of the field or on already occupied squares. In our variant of Tetris the piece must fall so that all parts of the piece are on the bottom of the field or on already occupied squares. In other words, after the piece has fallen there may not be a free square such that some square above it is occupied.

For example, let the field be six columns wide with initial heights (the number of already occupied squares in each column) 22, 11, 11, 11, 00 and 11. Piece number 55 can then be dropped into the field in five different ways:

\includegraphics[width=0.95\textwidth ]{tetris2}
You are given the initial heights of all columns and the figure to be dropped into the field.

Write a program that calculates the number of different ways to do this, i.e., the number of different field configurations that can be achieved by dropping the piece.

Input
The first line contains two integers CC and PP, 1≤C≤1001≤C≤100, 1≤P≤71≤P≤7, the number of columns and the number of the piece to be dropped.

The second line contains CC integers separated by single spaces, each between 00 and 100100, inclusive. These are the initial heights of the columns.

Output
Output on a single line the number of different ways to drop the piece in the field.

Sample Input 1	
6 5
2 1 1 1 0 1

Sample Output 1
5

Sample Input 2	
5 1
0 0 0 0 0
Sample Output 2
7

Sample Input 3	
9 4
4 3 5 4 6 5 7 6 6
Sample Output 3
1
