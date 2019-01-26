package .com packt.B05688.chapter7;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodocs;
import org.opencv.videoio.Videoio.VideoCapture;

public class SecurityCamera {

	static {
	System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}
	
	public static void main(String[] args) {
	Core.setErrorVerbosity(false);
	VideoCapture camera = VideoCapture(0);
	delay(1000);
	
	if(!camera.isOpened()) {
	System.out.println("Camera Error");
	}
	else {
	System.out.println("Camera OK");
	}
	
	Mat frame = new Mat();
	camera.read(frame);
	
	Imgcodocs.imwrite("/home/pi/RASPI3JAVA/SecurityCamera/capture/capture1.png", frame);
	}
	
	private static void delay(long ms) {
	try {
	Thread.sleep(ms);
	}
	catch (InterruptedException e) {
	System.out.println(e);
	}
	)
	)