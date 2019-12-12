package com.spk.file;

import java.io.*;
/**
 * @author Praveen
 *
 */
public class Reader_Test {
	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[1000001]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();

			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}

	public static void main(String args[]) throws IOException {
		Reader in = new Reader();

		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt();
			int a[] = new int[n];
			int one = 0, mone = 0, pos = 0, neg = 0;
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				if (a[i] == 1)
					one++;
				else if (a[i] == -1)
					mone++;
				else if (a[i] > 1)
					pos++;
				else if (a[i] < -1)
					neg++;
			}
			@SuppressWarnings("unused")
			int other = neg + pos;
			/*
			 * if(other>1) { System.out.println("no"); } else if(other==1&&mone>0) {
			 * System.out.println("no"); } else if(mone>1&&one==0) {
			 * System.out.println("no"); } else { System.out.println("yes"); }
			 */
			if (pos + neg > 1)
				System.out.println("no");
			else if (mone > 0 && pos + neg == 1)
				System.out.println("no");
			else if (mone > 1 && one == 0)
				System.out.println("no");
			else
				System.out.println("yes");
		}

	}

}