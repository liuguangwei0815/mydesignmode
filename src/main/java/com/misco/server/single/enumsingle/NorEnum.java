package com.misco.server.single.enumsingle;

import java.util.Arrays;
import java.util.List;

/**
 * 普通枚举类
 * 
 * @author liuwei
 *
 */
public enum NorEnum {

	BOC("a", "0104", "中国银行");

	private final String name;
	private final String name1;
	private final String name2;

	public String getName() {
		return name;
	}

	public String getName1() {
		return name1;
	}

	public String getName2() {
		return name2;
	}

	NorEnum(String name, String name1, String name2) {
		this.name = name;
		this.name1 = name1;
		this.name2 = name2;
	}

	public static String getIdByCode(String code) {
		for (NorEnum ilp : NorEnum.values())
			if (code.equals(ilp.getName()))
				return ilp.getName1();
		return null;
	}

	public static List<NorEnum> getAllList() {
		return Arrays.asList(NorEnum.values());

	}
}
