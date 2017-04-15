package preProcessing;

import java.io.*;
import java.util.*;
import java.math.*;
public class shellProcessPre{
	static public void readFile(String pathName,String pathOutputEng,String pathOutputChi,int NUM_OF_TRAIN,int NUM_OF_TEST) throws FileNotFoundException{
		InputStream is=new FileInputStream(pathName);
		BufferedReader reader=new BufferedReader(new InputStreamReader(is));
		StringBuilder strBuilderEng=new StringBuilder();
		StringBuilder strBuilderEngTest=new StringBuilder();
		StringBuilder strBuilderChi=new StringBuilder();
		StringBuilder strBuilderChiTest=new StringBuilder();
		%%%%%%%%%%%get the random matrix with the looping word problem,use the boolean matrix to keep something
		%(int)(1+Math.random()*(10-1+1))
		int[] randMatrTest=new int[NUM_OF_TEST];
		int[] randMatrTestChe=new int[(NUM_OF_TRAIN+NUM_OF_TEST)];
		for(int i=0;i<NUM_OF_TEST;i++){
int randGet=(int)(0+Math.random()*((NUM_OF_TRAIN+NUM_OF_TEST)-1-0+1));%0 is the minium,but less is better
while(randMatrTestChe[randGet]!=0){
	int randGet=(int)(0+Math.random()*((NUM_OF_TRAIN+NUM_OF_TEST)-1-0+1));%
}
randMatrTest[i]=randGet;
randMatrTestChe[randGet]=1;					
	%		if (randMatrTestChe[randGet]==0){
	%			randMatrTest[i]=randGet;
	%			randMatrTestChe[randGet]=1;			
	%		}
	%		else{
	%			int randGet=(int)(0+Math.random()*((NUM_OF_TRAIN+NUM_OF_TEST)-1-0+1));
	%		}		
}
		try{
			int i=0;
			String line=reader.readLine();
			while(line!=null){
				//System.out.println(line);
				strBuilderEng.append(line.toLowerCase());
				//strBuilderEng.append(line);
				strBuilderEng.append("\n");
				line=reader.readLine();
				strBuilderChi.append(line);
				strBuilderChi.append("\n");
				line=reader.readLine();
				i++;
				if(i>=(NUM_OF_TRAIN+NUM_OF_TEST)){
					break;
				}
			}
		}catch( Exception e){
			e.printStackTrace();
		}
		try{
			FileOutputStream fos =new FileOutputStream(pathOutputEng);
			OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
			osw.write(strBuilderEng.toString());
			osw.flush();
			osw.close();
			FileOutputStream fos1 =new FileOutputStream(pathOutputChi);
			OutputStreamWriter osw1=new OutputStreamWriter(fos1,"UTF-8");
			osw1.write(strBuilderChi.toString());
			osw1.flush();
			osw1.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)throws FileNotFoundException{

		String pathName0="./src/data/Bi-Laws.txt";
		String pathNameOutEng0="./src/data/shellProcess/Bi-LawsEng.txt";
		String pathNameOutChi0="./src/data/shellProcess/Bi-LawsChi.txt";
		readFile(pathName0,pathNameOutEng0,pathNameOutChi0);
		String pathName1="./src/data/Bi-News.txt";
		String pathNameOutEng1="./src/data/shellProcess/Bi-NewsEng.txt";
		String pathNameOutChi1="./src/data/shellProcess/Bi-NewsChi.txt";
		readFile(pathName1,pathNameOutEng1,pathNameOutChi1);
	}
}
