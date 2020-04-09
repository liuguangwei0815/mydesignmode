/**
 * 
 */
package com.misco.server.single.enumsingle;

/**
 * @author liuwei 枚举单例，可以防止反序列破坏单例、防止反射攻击的
 */
public enum EnumSingle {
	INSTANCE("我是单例"){
		protected void helow() {
			System.out.println("hellow");
		}
	};
	//这有声明这个才能访问里面的方法
	protected abstract void helow();
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	EnumSingle(String name) {
		this.name = name;
	}
	//对象
	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
