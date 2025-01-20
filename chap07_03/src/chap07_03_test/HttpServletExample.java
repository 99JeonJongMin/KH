package chap07_03_test;

public class HttpServletExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}
	
	public static void method (HttpServlet servlet){
		servlet.service();
	}

}
