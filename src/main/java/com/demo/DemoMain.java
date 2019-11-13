package com.demo;

import java.net.InetAddress;

public class DemoMain {

	public static void main(String[] argv) throws Exception {
		InetAddress addr = InetAddress.getByName("www.google.com");
		String hostnameCanonical = addr.getCanonicalHostName();
		System.out.println(hostnameCanonical);
	}
}