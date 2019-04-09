package IO;

import java.io.*;

class PReader extends Thread {
	PipedOutputStream out;
	String fname;

	public PReader(PipedOutputStream pout, String file) {
		out = pout;
		fname = file;
	}

	public void run() {
		System.out.println("reader thread started...");
		try {

			BufferedReader b = new BufferedReader(new InputStreamReader(new FileInputStream(fname)));
			PrintWriter pipe = new PrintWriter(out);
			System.out.println("Reading data from file & providing it to writer thread...");
			while (true) {
				String line = b.readLine();
				if (line == null)
					break;
				pipe.println(line);
				pipe.flush();
				System.out.println("data is written to the pipe...");

			}
			pipe.close();
		} catch (Exception e) {
		}

		System.out.println("Reading thread is terminating..");
	}
}

class PWriter extends Thread {
	PipedInputStream in;
	String fname;

	public PWriter(PipedInputStream pin, String file) {
		in = pin;
		fname = file;
	}

	public void run() {
		System.out.println("Writer thread is started...");
		try {
			BufferedReader b = new BufferedReader(new InputStreamReader(in));
			PrintWriter file = new PrintWriter(new FileOutputStream(fname));
			System.out.println("Reading data from file and converting its case and writing to a file...");
			while (true) {
				String line = b.readLine();
				if (line == null)
					break;
				file.println(line.toUpperCase());
				System.out.println("data is written to file...");
			}
			file.close();
		} catch (Exception e) {
		}

		System.out.println("Writer thread is terminating...");
	}
}

class PipeTest {
	public static void main(String ar[]) {
		try {
			PipedOutputStream out = new PipedOutputStream();
			PipedInputStream in = new PipedInputStream(out);
			System.out.println("starting Reader and Writer Threads...");
			PReader reader = new PReader(out, ar[0]);
			PWriter writer = new PWriter(in, ar[1]);
			reader.start();
			writer.start();
		} catch (Exception e) {
		}
	}
}
