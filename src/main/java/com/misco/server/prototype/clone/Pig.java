/**
 * 
 */
package com.misco.server.prototype.clone;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @author liuwei 小猪佩奇
 */
public class Pig implements Cloneable {
	@Setter
	@Getter
	private String name;
	@Setter
	@Getter
	private Date birthday;

	public Pig(String name, Date birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//进行深度克隆 ，就不能调用父类了额clone
		Pig p = (Pig) super.clone();
		p.birthday = (Date) p.getBirthday().clone();
		return p;
	}

	@Override
	public String toString() {
		return "Pig [name=" + name + ", birthday=" + birthday + "]";
	}

}
