package day12.network;


import java.net.MalformedURLException;
import java.net.URL;


public class Mainclass02 {
	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("https://n.news.naver.com/article/469/0000705639?cds=news_media_pc&type=editn");
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		String query = url.getQuery();
		
		System.out.println("protocol :" + protocol);
		System.out.println("host : " + host);
		
		System.out.println("query : " + query);
		
	}
	
}
