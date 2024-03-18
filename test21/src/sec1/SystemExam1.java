package sec1;

public class SystemExam1 {
	public static void main(String[] args) {
		//만약, 자바 공급자의 정보를 출력한다면,
		String vendor = System.getProperty("java.vendor");
		System.out.println("자바 공급자의 정보 : "+vendor);
		
		//현재 자바 설치 버전(java.version) 출력
		String version = System.getProperty("java.version");
		System.out.println("현재 자바 설치 버전 : "+version);
		
		//자바 클래스 경로(java.class.path) 출력
		String path = System.getProperty("java.class.path");
		System.out.println("자바 클래스 경로 : "+path);
		
		//운영체제 이름(os.name) 출력
		String osName = System.getProperty("os.name");
		System.out.println("운영체제 이름 : "+osName);
		
		//사용자 계정(user.name) 출력
		String uName = System.getProperty("user.name");
		System.out.println("사용자 계정 : "+uName);
		
		//현재 디렉토리(user.dir) 출력
		String dir = System.getProperty("user.dir");
		System.out.println("현재 디렉토리 : "+dir);
	}
}
