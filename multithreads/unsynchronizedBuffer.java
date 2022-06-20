package multithreads;

public class unsynchronizedBuffer implements buffer {
	private int[] bufferIntArray = new int[10];
	private double[] bufferDoubleArray = new double[10];
	private String[] bufferStringArray = new String[10];
	private int i = 0;
	private int j = 0;
	private int c = 0;

	public unsynchronizedBuffer() {
		for(int i = 0; i < bufferStringArray.length; i++) {
			bufferStringArray[i] = "";
		}
	}
	
	public void putBufferIntArray(int value) throws InterruptedException{
		System.out.printf("Escrevendo valor int: ", value);
		for(int i = 0; i < bufferIntArray.length; i++) {
			if(bufferIntArray[i] == 0) {
				bufferIntArray[i] = value;
			}
		}
	}

	public int getBufferIntArray() throws InterruptedException{
		System.out.printf("Leitura valor int: ", bufferIntArray[i]);
		if(i != bufferDoubleArray.length - 1 && bufferDoubleArray[i+1] != 0) ++i;
		return bufferIntArray[i];
	}

    public void putBufferDoubleArray(double value) throws InterruptedException {
		System.out.printf("Escrevendo valor double: ", value);
		for(int i = 0; i < bufferDoubleArray.length; i++) {
			if(bufferDoubleArray[i] == 0.0) {
				bufferDoubleArray[i] = value;
			}
		}
    }

	public double getBufferDoubleArray() throws InterruptedException {
		System.out.printf("Leitura valor double: ", bufferDoubleArray[j]);
		if(j != bufferDoubleArray.length - 1 && bufferDoubleArray[j+1] != 0.0) ++j;
		return bufferDoubleArray[j];
    }

	public void putBufferStringArray(int value) throws InterruptedException {
		System.out.printf("Escrevendo valor string: ", value);
		for(int i = 0; i < bufferStringArray.length; i++) {
			if(bufferStringArray[i].equals("")) {
				bufferStringArray[i] = String.valueOf(value);
			}
		}
    }

	public int getBufferStringArray() throws InterruptedException {
		System.out.printf("Leitura valor string: ", bufferStringArray[c]);
		if(c != bufferStringArray.length - 1 && !bufferStringArray[c+1].equals("")) ++c;
		if(bufferStringArray[c].equals("")) return 0;
		return Integer.parseInt(bufferStringArray[c]);
    }
}