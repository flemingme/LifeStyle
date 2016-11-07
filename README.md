# LearnLifeStyle

Acitivity一般会处于以下四种状态：

1.当Activity位于栈顶时，此时正好处于屏幕最前方，此时处于运行状态；

2.当Activity失去了焦点但仍然对用于可见（如栈顶的Activity是透明的或者栈顶Activity并不是铺满整个手机屏幕），此时处于暂停状态；

3.当Activity被其他Activity完全遮挡，此时此Activity对用户不可见，此时处于停止状态；

4.当Activity由于人为或系统原因（如低内存等）被销毁，此时处于销毁状态；
