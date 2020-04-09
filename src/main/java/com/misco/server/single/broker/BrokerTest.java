/**
 * 
 */
package com.misco.server.single.broker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.misco.server.single.hangurysingle.HungriySIgn;

/**
 * @author liuwei 反序列破坏单例
 */
public class BrokerTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// 获取一个对象 通过饿汉模式
		HungriySIgn hug = new HungriySIgn();
		System.out.println(hug);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("breakSingle"));
		out.writeObject(hug);
		// 将这个对象序列号到我们的文件中
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("breakSingle"));
		hug = (HungriySIgn) in.readObject();
		System.out.println("反序列化获取对象："+hug);
	}
}
