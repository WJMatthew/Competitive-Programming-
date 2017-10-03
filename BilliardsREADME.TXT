
PROJECT TITLE: Billiards
PURPOSE OF PROJECT: Determine whether a billiard ball shot will go in the hole.
VERSION or DATE: Sep 30, 2017
HOW TO START THIS PROJECT:
AUTHORS:  @mattjohnson
USER INSTRUCTIONS:

Dr. Jim is tired of losing when he plays billiard with his physics friends, so he asks you to write a program to help him refine his skills. 

The input of his program includes five variables: 
w = width of the billiard table (in metres) 
α = angle of departure of the ball (varies from 0 to 180◦ ) 
v = the ball’s initial velocity (metres/second)
d = the ball’s deceleration rate (metres/second2 ) (d ≥ 0) 
x = the x-coordinate of the position of the hole (y-coordinate is zero) 

As illustrated in the figure below, the initial position of the ball is at the origin of the coordinate axis (x=0, y=0) which can be assumed to not be in the hole according to the definition. The billiard table has only two edges, extending forever, between which the ball bounces. The edges of the table are true; i.e. the ball bounces between the table edges in perfect manner, where the angle of incidence equals the angle of reflection. The ball and the hole are considered as mathematical points — their dimensions are zero. 
The ball is considered to enter the hole if the distance to the hole along the lower edge becomes smaller or equal to  = 0.001 metres at any time. 

Input 
The first line of input contains the number of test cases n. For each case, the input consists of one line containing five floating-point values, one for each of the five variables. 

Output 
For each test case, the program should output one line containing one word  HIT if the ball enters the hole, or MISS otherwise. 

Sample input: 
3 
1 45 2 0 4 
1 135 2 0.5 -4 
1 45 2 0.3535 4 

Sample output: 
HIT 
MISS 
HIT
