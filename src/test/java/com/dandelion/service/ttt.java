package com.dandelion.service;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式测试
 * 
 * @author JackSpancer
 *
 */
public class ttt {

	public static void main(String[] arg) {
		// add(1);
		while (true) {
			Scanner in = new Scanner(System.in);
			String string = in.nextLine();
			Pattern pattern = Pattern.compile("[a-z].*");
			Matcher matcher = pattern.matcher(string);
			if (matcher.matches()) {
				System.out.println("匹配成功");
			} else {
				System.out.println("匹配失败");
			}
		}
	}

}
