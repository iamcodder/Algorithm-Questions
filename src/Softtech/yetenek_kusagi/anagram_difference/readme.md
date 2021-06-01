## Anagram Difference
An anagram is a word whose characters can be rearranged to create another word. Given two strings, determine the minimum number of characters in either string that must be modified to make the two strings anagrams . If it is not possible to make the two strings anagrams, return `-1`.

#### Example:
```
a = ['tea', 'tea', 'act']
b = ['ate', 'toe', 'acts']
```


`a[0] = tea` and `b[0] = ate` are anagrams, so 0 characters need to be modified.
`a[1] = tea` and `b[1] = toe` are not anagrams.  Modify 1 character in either string (o → a or a → o) to make them anagrams.
`a[2] = act` and `b[2] = acts` are not anagrams and cannot be converted to anagrams because they contain different numbers of characters.
The return array is `[0, 1, -1]`


### Function Description

getMinimumDifference has the following parameter(s):

`string a[n]`:  an array of strings

`string b[n]`:  an array of strings


##### Return

`int[n]`  an array of integers which denote the minimum number of characters in either string that need to be modified to make the two strings anagrams. If it is not possible, return `-1`.


#### Sample Case 0

```
a = ['a', 'jk', 'abb', 'mn', 'abc']
b = ['bb', 'kj', 'bbc', 'op', 'def']
```
``` 
Output -> [-1,0,1,2,3]
```

#### Explanation

Perform the following n = 5 calculations:

- Index 0: a and bb cannot be anagrams because they contain different numbers of characters.
- Index 1: jk and kj are already anagrams because they both contain the same characters at the same frequencies.
- Index 2: abb and bbc differ by one character.
- Index 3: mn and op differ by two characters.
- Index 4: abc and def differ by three characters.
- After checking each pair of strings, return the array `[-1, 0, 1, 2, 3]` as the answer.