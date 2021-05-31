### Backspace String Compare

Two strings are said to be the same if they are of the same length and have the same character at each index.
Backspacing in a string removes the previous character in the string.

Given two strings containing lowercase English letters and the character `#` which represents a backspace key, determine
if the two final strings are equal. Return `1` if they are equal or `0` if they are not. Note that backspacing an empty
string results in an empty string.
<br/>

##### Example

 ```
 s1 = axx#bb#c 
s2 = axbd#c#c 
```

In the first string, one `x` and one `b` are backspaced over. The first string becomes `axbc`. The second string also
becomes `axbc`. The answer is `1`.
<br/>

#### Function Description

Complete the function compareStrings in the editor below.

compareStrings has the following parameter(s):

string s1: the first string 
string s2: the second string

```
s1 = yf#c# 
s2 = yy#k#pp##
```

```
Output -> 1
```

**Explanation**
Both the strings s1 and s2 result in `y` after processing backspaces.
<br/>
<br/>

##### Sample Case 1
```
s1 = hacc#kk# 
s2 = hb##ackk## 
```
```
Output -> 0
```

**Explanation **
The first string becomes `hack` while the second string becomes `ac`.
