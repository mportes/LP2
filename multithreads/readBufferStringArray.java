package multithreads;

import java.security.SecureRandom;

public class readBufferStringArray implements Runnable{
	private static final SecureRandom generator = new SecureRandom();
	private final buffer sharedLocation;
	
	public readBufferStringArray(buffer sharedLocation) {
		this.sharedLocation = sharedLocation;
	}

	public void run() {
		int sum = 0;
		for (int count = 1; count <= 10; count++) {
			try {
				Thread.sleep(generator.nextInt(3000));
				sum += sharedLocation.getBufferStringArray();
				System.out.printf("\t\t\t%2d%n",sum);
			} catch(InterruptedException e){
				Thread.currentThread().interrupt();				
			}			
		}
		System.out.printf("%n%s %d%n%s%n", "Leitura do total de valores string: ", sum, "Leitura string finalizada!");
	}
}
