`1.适配器`
    定义：适配器模式把一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
    优点：更好的复用性和扩展
    缺点：隐藏了调用细节，增加了系统的复杂性。系统中不适合出现太多，更好的方法是重构。
`2.适配器`
    定义:将一个请求或者操作封装到一个对象中.命令模式允许系统使用不同的请求把客户端参数化,具体的请求排队或记录请求的日志,提供命令的撤销和恢复的功能.
    优点:解耦合,更动态的控制,宏命令(一组命令),更好的扩展性.
    缺点:可能会造成具体命令类爆炸增长
