package com.spk.encrypt;

import java.io.File;

import javax.crypto.Cipher;

/**
 * @author Praveen
 *
 */
public class CryptoUtil {

	private static String ALGORITHM = "AES";
	private static String TRANSFORMATION = "AES";

	public static void encrypt(String key, File inputFile, File outputFile) throws CryptoException {
		doCrypto(Cipher.ENCRYPT_MODE, key, inputFile, outputFile);

	}

	private static void doCrypto(int encryptMode, String key, File inputFile, File outputFile) {
		// TODO Auto-generated method stub

	}

}
