# Lab Report 5

## Using vimdif for test comparisons
Here I use my repository of markdownparser to compare by using vimdiff

![Screenshot 2022-06-07 212637](https://user-images.githubusercontent.com/72767545/172531571-fa790cb6-3375-4254-b1ae-c29e55c103e3.jpg)

## VimDiff output
Here we can see that 2 of these tests which are highlighted do not match, and therefore something went wrong on test 140 and 141.

![test](https://user-images.githubusercontent.com/72767545/172531781-22744fe3-98ec-498b-95b6-4c37ddf25d3a.jpg)

## Test 140

This is the result that should be produced for test case [140](https://github.com/nidhidhamnani/markdown-parser/blob/main/test-files/140.md) as shown by commonmark.js

![test 140](https://user-images.githubusercontent.com/72767545/172533257-5646b4a1-33b3-43d3-b7db-50f4d19c8b2c.jpg)

My test case products ```~```, while the given repo produced ```[]``` which would be right since the result in commonmark.js are not links.

## Test 141

This is the result that should be produced for test case [141](https://github.com/nidhidhamnani/markdown-parser/blob/main/test-files/141.md) as shown by commonmark.js

![141](https://user-images.githubusercontent.com/72767545/172533584-5bbf6e7a-1aef-4bd9-a3b7-c1ce460b4d15.jpg)

My test case products ```~```, while the given repo produced ```[]``` which would be right since the result in commonmark.js are not links.

## Fixes to test case 140 and 141

Both of these tests, when running my version of markdownparse, do not give an output and instead an error.

![error](https://user-images.githubusercontent.com/72767545/172534320-f5bba3c3-4c02-46dd-90e8-c46f3e69aedf.jpg)

Whenever I run the test files, I get an error that exception is out of bounds. What I assume is going wrong is that there is a for or while loop in my code where the problem is
that it iterates too many times and creates an error, with not enough elements.

