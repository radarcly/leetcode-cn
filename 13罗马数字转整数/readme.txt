题目描述：
给定一个罗马数字，将其转换成整数。

返回的结果要求在 1 到 3999 的范围内。

解题思路：
在罗马数字中
1.相同的数字连写， 所表示的数等于这些数字相加得到的数。如 XXX表示 30
2.小的数字在大的数字的右边， 所表示的数等于这些数字相加得到的数 如VIII 表示8
3.小的数字(限于I, X, C)在大的数字的左边， 所表示的数等于大数减去小的数： 如IV 表示4
所以我们从左往右对表示罗马数字的字符串进行遍历，如果右一位的字符大于本位的字符，则最终结果要减去本位的字符代表的数值。
反之如果右边一位的字符小于或者等于本位字符，则最终结果要加上本位字符代表的数值。

另：罗马字母实则可看成英文大写字母，ASCII码值在0-127之间，故构造长度为128的数组，取其下标数字等于I,V,X,C,M,L,D的位置使用。