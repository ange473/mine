package 第十三周作业;
public class TelcomAccountSystem {
	public static void main(String[] args) {
		TelcomUser telcomUser = new TelcomUser("13122782807");
		telcomUser.generateCommunicateRecord();
		telcomUser.printDetails();
		telcomUser.printCallToDetails();
	}
}
