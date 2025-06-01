# String-Game
CodeChef Difficulty 1102 Problem

String Game
Alice and Bob are playing a game. They start with a common string S of length N. Each of them also has an initially empty personal string: A for Alice and B for Bob.

The game rules are as follows:

The game begins with Alice.

On each turn, the current player selects a single character from the remaining string S, appends it to their personal string (A or B), and then removes that character from S.

Players alternate turns until the string S becomes empty.

The goal is to determine:

Is there a way to pick characters such that both players end up with the same string by the end of the game?

Input Format
The first line contains an integer T — the number of test cases.

For each test case:

The first line contains an integer N — the length of string S.

The second line contains the string S, consisting of lowercase English letters.

Output Format
For each test case, print:

YES — if there exists any valid sequence of moves such that the strings A and B are equal at the end.

NO — otherwise.

Each output should be on a new line.
