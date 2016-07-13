package com.jc.composite;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IPlayable{
	
	List<IPlayable> playList = new ArrayList<IPlayable>(); //這邊宣告吃的東西用IPlayable而不是song！！ 因為兩種型態(list.song)都可吃
	String listName;
	
	public Playlist(String _listName){
		this.listName = _listName;
	}
	
	//注意這邊傳入的參數 選擇用IPlayable而不是song!
	public void add(IPlayable playable){ //只有playlist才有的功能 根節點(song)不需要有新增歌曲的功能
		playList.add(playable);
	}
	
	@Override
	public void play(){
		System.out.println("播放清單:" + listName);
		//迴圈漂亮 利用interface來接 因為有不只一種情況(Playlist或song)
		for(IPlayable playable : playList){
			//這句漂亮！ 運用遞迴處理 如果遇到Playlist會繼續遞迴處理 遇到song就會執行他的play
			playable.play();
		}
	}
}
