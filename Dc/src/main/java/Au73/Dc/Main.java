package Au73.Dc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.NumberFormat;

public class Main {
	public static void main(String[] args) {
		try {
			start(args[0],args[1],args[2]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid Path");
		}
		
		System.exit(0);
	}
	/**
	 * 程序启动
	 * @param Path1 源文件地址
	 * @param Path2 抄袭文件地址
	 * @param Path3 答案输出地址
	 * @throws Exception 文件读取报错
	 */
	public static void start(String Path1 ,String Path2 , String Path3) throws Exception {
		String str1 ,str2,str3;
			str1=FileUtils.readFile(Path1);
			str2=FileUtils.readFile(Path2);
		 MySimHash hash1 = new MySimHash(str1, 64);
	     MySimHash hash2 = new MySimHash(str2, 64);
	     double d=hash1.getSemblance(hash2);
	     NumberFormat ddf1=NumberFormat.getNumberInstance() ;
	     ddf1.setMaximumFractionDigits(2);//四舍五入指定输出2位小数
	     String s= ddf1.format(d) ;
	     str3=""+s;
	     fileOut(Path3,str3);
	}
	

	
	public static void fileOut(String Path,String str) throws IOException {
		File f=new File(Path);//指定文件
		FileOutputStream fos=new FileOutputStream(f);
		OutputStreamWriter osw=new OutputStreamWriter(fos);
		BufferedWriter bw=new BufferedWriter(osw);
		bw.write(str);
		bw.newLine();
		bw.close();
	}
	

	
	
}
