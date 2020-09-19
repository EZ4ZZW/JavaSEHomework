# Solution
Orz Orz Orz
## 1.JFrame
提供运行窗口
## 2.JPanel
提供画布
## 3.Canvas类
### static canvas
提供静态画布，保存所有已画图形
### HashMap and List < Object >
提供画图队列，每次redraw时会对List进行遍历，查找该类在哈希表中对应的键值


## 4.Square/Circle类
### erase方法
擦除图形
### draw方法
绘制图形
### 执行步骤
修改图形参数后，先erase后draw，或者进行redraw重新绘制所有图形

-----------------------------
**注意，对于Swing的各各组件(JPanel\JFrame)，必须先把JPanel单独封装，不然无法显示图形，原因待解决，目前认为是构造器的问题**
