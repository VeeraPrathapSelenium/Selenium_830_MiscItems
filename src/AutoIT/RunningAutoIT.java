package AutoIT;

import java.io.IOException;

public class RunningAutoIT {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		String[] arr=new String[2];
		
		arr[0]="C:\\Users\\DELL\\Desktop\\Autoit\\Test.exe";//Auto it compiled .exce file path
		
		arr[1]="C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg";//Image file that need to be uploaded.This will send as argument to the autoit file to the control edit
		
		
		Process p=Runtime.getRuntime().exec(arr);
		
		p.destroy();
		
		
		
		

	}

}
