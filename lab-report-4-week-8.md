# Lab report 3
- This is my Github Repo: [Repo](https://github.com/Borna1103/cse15L-labs)
- This is my teams Github Repo: [Repo](https://github.com/michellem8/markdown-parser)


## Expected Outputs:
1:

![snippet 1](https://user-images.githubusercontent.com/72767545/170441222-889959c4-d43e-4dea-aa70-6b06ee6884ed.png)

2:

![snippet 2](https://user-images.githubusercontent.com/72767545/170441254-7819ea75-7f0c-4b75-a0b2-e25ada272547.png)

3:

![snippet 3](https://user-images.githubusercontent.com/72767545/170441276-e6a684bf-6581-4573-856b-43c0be67bac6.png)

## Tests made on `MarkdownParseTest.java`:

![markdowntest implimentation](https://user-images.githubusercontent.com/72767545/170447585-b2edbe8c-54f8-4fb9-ac4d-7c0ea2baf1df.png)

## Own implimentation:

![ownsnip](https://user-images.githubusercontent.com/72767545/170450506-b9cdb25c-6e62-4f7d-a4a3-8618a8a70bb1.png)

all test failed due to `AssertionError`

## Others implimentation:

![othersnip](https://user-images.githubusercontent.com/72767545/170450771-eb21eef1-5611-4f05-b3b5-c2e6141f5852.png)

all test failed due to `AssertionError`

## Changes to code:

I think for my code, that there only needs to be a small change to remove graves from the links.
Adding a line of code that, if a grave is seen, skip over it in the output would make snip 1 work.
I would also need to delete any duplicate links, like google.com twice, I think that I could do these changes in less than 10 lines.

For snip 2, t was close. I would need to modify the file so closed parenthesis can be read, up until the last closed parenthesis, as a.com(()) was not fulyl read.

For snip 3 a lot would need to be changed. For example to beable to remove links without parenthesis endings, indents, commans and other error prone symbols that would get in the way.
