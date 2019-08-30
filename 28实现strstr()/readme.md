# 28实现strStr()
难度 简单
## 题目描述
实现 strStr() 函数。

给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

示例 1:

输入: haystack = "hello", needle = "ll"
输出: 2
示例 2:

输入: haystack = "aaaaa", needle = "bba"
输出: -1
说明:

当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。

对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。

## 注意点
解法一 暴力双循环 时间复杂度O(M*N)

解法二 KMP算法 时间复杂度O(M+N)

解法三 BM算法 时间复杂度最差和KMP一样 最佳是O(n)

解法四 Sunday算法 最坏为O(M*N) 平均复杂度为O(N)

解法五 库函数调用
         
