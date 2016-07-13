package com.jc.composite;

public class Song implements IPlayable{
	
	private String name;
	public Song(String _name) {
		this.name = _name;
	}
	@Override
	public void play(){
		System.out.println("現正播放:" + this.name);
	}
}
