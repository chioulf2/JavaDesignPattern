package com.jc.composite;

public class Main {
	public static void main(String[] args){
		Playlist all = new Playlist("全部播放清單");
		
		Song song = new Song("等待");
		
		Playlist changList = new Playlist("張信哲");
		changList.add(new Song("信仰"));
		changList.add(new Song("別讓我傷心"));
		
		Playlist maydayList = new Playlist("五月天");
		maydayList.add(new Song("派對動物"));
		maydayList.add(new Song("入陣曲"));
		
		all.add(song);
		all.add(changList);
		all.add(maydayList);
		
		all.play();

	}
}
