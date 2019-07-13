package com.liushaoshuai.common.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		String name = FileUtil.getExtendName("aaa.jpg");
		System.out.print(name);
	}

	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}

	@Test
	public void testGetUserDirectory() {
		File file = FileUtil.getUserDirectory();
		System.out.println(file);
	}

}