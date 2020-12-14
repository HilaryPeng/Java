1. we found “the little cat” is in the hat, we like “the little cat” . 按照所有的单词 其中“the little cat” 要看成一个单词

答案： 

```js
var text = "we found “the little cat” is in the hat, we like “the little cat”";
// 首先按照空格分割匹配 然后按照“” 中匹配即可。
// 获取所有单词 
// answer:  \w+|“.+?” 

// \w 任意非空字符 + 表示一次以上 | 或 “” 开头或者结尾 . 任意字符 + 出现一次或者多次 ? 表示使用非贪婪模式
// 非贪婪模式 在尽可能短的情况下去进行匹配。



```



Trtret