package br.com.springIntro.sectionThree;

public class FileWriter implements LogWriter {
    
    public void write(String text){
	System.out.println("Write to file " + text);
    }
}