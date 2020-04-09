package com.misco.server.single.enumsingle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
	public static void main(String[] args)
			throws FileNotFoundException, IOException, ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		// 不会有反序列破坏单例的问题
//		EnumSingle en = EnumSingle.INSTANCE;
//		en.setData(new Object());
//		System.out.println("枚举单例："+en.getData());
//		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ebreakSingle"));
//		out.writeObject(en);
//		// 将这个对象序列号到我们的文件中
//		ObjectInputStream in = new ObjectInputStream(new FileInputStream("ebreakSingle"));
//		EnumSingle en1 = (EnumSingle) in.readObject();
//		System.out.println("反序列化获取对象：" + en1.getData());
//		System.out.println("他们是否相等：" + (en.getData() == en1.getData()));
//		//那他们发反射吗
// 不会有反射攻击，就是可以通过构造的私有打开，static 可以防止，但是延迟加载的是不行的 如果反射限制性 那么会建立两个对象
//		Class<?> clazz = EnumSingle.class;
//		Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
//		c.setAccessible(true);
//		// 无参数构造器
//		EnumSingle enew = (EnumSingle) c.newInstance("jack", 6666);
//		System.out.println("反射获取的实例对象" + enew);
		
	//枚举
	//1、常量里的标签，标签有（），标签类型对应属性， 声明一个默认的构造 ，关键字：标签 （），默认构造 、属性
	//2、常量后跟{} 里面可以方法。可以通过abstract 方法访问
		EnumSingle.INSTANCE.helow();
	}
}
