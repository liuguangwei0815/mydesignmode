package com.misco.server.prototype;

import lombok.Data;

@Data
public class Mail implements Cloneable{

	String username;
	String addr;
	String context;
	//使用默认的就可以了
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
