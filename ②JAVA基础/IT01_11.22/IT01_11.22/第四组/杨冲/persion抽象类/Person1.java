package com;
/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月20日 下午8:07:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
//
//2、创建抽象类Person，
//并定义抽象方法getContent()返回值是字符串，
//额外定义say方法调用getContent（）方法并输出；子类Sudent、Workder继承Person类
//；并实现抽象类的方法getContent；实例化对象并分别调用say（）方法 。


public abstract class Person1 {
	private String getContent;
	public Person1(String getContent) {
		super();
		this.getContent = getContent;
	}
	public abstract  String getContent();
	abstract void say();
	

}
