# 6.Z字形变换
难度 中等
## 题目描述
将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。

比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：

<pre>
L   C   I   R
E T O E S I I G
E   D   H   N
</pre>

之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。

请你实现这个将字符串进行指定行数变换的函数：

string convert(string s, int numRows);

#### 示例 1:

输入: s = "LEETCODEISHIRING", numRows = 3

输出: "LCIRETOESIIGEDHN"

#### 示例 2:

输入: s = "LEETCODEISHIRING", numRows = 4

输出: "LDREOEIIECIHNTSG"

解释:

<pre>
L     D     R
E   O E   I I
E C   I H   N
T     S     G
</pre>

## 解法一 按行排序
从左到右迭代 s，将每个字符添加到合适的行。

可以使用当前行和当前方向这两个变量对合适的行进行跟踪。

时间复杂度：O(n)

空间复杂度：O(n)

## 解法二 按行访问
行 0中的字符位于索引 k(2⋅numRows−2) 处;

行 numRows−1 中的字符位于索引 k(2⋅numRows−2)+numRows−1 处;

内部的行i中的字符位于索引k(2⋅numRows−2)+i 以及 (k+1)(2⋅numRows−2)−i 处;

