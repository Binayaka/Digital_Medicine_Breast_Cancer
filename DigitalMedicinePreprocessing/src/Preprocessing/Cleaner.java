package Preprocessing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.ListUtils;

public class Cleaner {
	public static final String	ORIGINAL		= "D:\\Downloads\\Documents\\breast-cancer-wisconsin.data.txt";
	public static final String	CLEANED_TRAIN	= "D:\\Downloads\\Documents\\breast-cancer-wisconsin.data.cleaned.train.csv";
	public static final String	CLEANED_TEST	= "D:\\Downloads\\Documents\\breast-cancer-wisconsin.data.cleaned.test.csv";
	public static final String	HEADER			= "ID,Clump Thickness,Uniformity of Cell Size,Uniformity of Cell Shape,Marginal Adhesion,Single Epithelial Cell Size,Bare Nuclei,Bland Chromatin,Normal Nucleoli,Mitoses,Class";

	public static void main(String[] args) {
		Cleaner c = new Cleaner();
		c.run();
	}

	public void run() {
		try {
			String line = "";
			FileReader fileReader = new FileReader(ORIGINAL);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			List<String> instances = new ArrayList<>();
			while ((line = bufferedReader.readLine()) != null) {
				if (!line.contains("?")) {
					instances.add(line);
				}
			}
			bufferedReader.close();
			fileReader.close();
			int count = (int) (instances.size() - (0.15 * instances.size()));
			List<List<String>> partitions = ListUtils.partition(instances, count);
			partitions.get(0).add(0, HEADER);
			partitions.get(1).add(0, HEADER);
			FileWriter fileWriter = new FileWriter(CLEANED_TRAIN);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			for (String s : partitions.get(0)) {
				bufferedWriter.write(s);
				bufferedWriter.write("\r\n");
			}
			bufferedWriter.close();
			fileWriter.close();
			fileWriter = new FileWriter(CLEANED_TEST);
			bufferedWriter = new BufferedWriter(fileWriter);
			for (String s : partitions.get(1)) {
				bufferedWriter.write(s);
				bufferedWriter.write("\r\n");
			}
			bufferedWriter.close();
			fileWriter.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + ORIGINAL + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + ORIGINAL + "'");
			ex.printStackTrace();
		}
	}
}
