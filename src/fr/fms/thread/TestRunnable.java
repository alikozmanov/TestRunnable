package fr.fms.thread; // 2.2

public class TestRunnable implements Runnable {

    @Override
    public void run() {
    	String[] symbols = {"!*!",
    						"**",
    						"#***#",
    						"$****$",
    						"%*****%",
    						"&******&",
    						"'*******'",
    						"(********(",
    						")*********)",
    						"************"};
        for (int i = 0; i < symbols.length; i++) {
            	System.out.print(symbols[(i)]); 
            	
            System.out.println();
        }
    }

    public static void main(String[] args) { 
        Thread thread = new Thread(new TestRunnable());
        thread.start();
    }
}

