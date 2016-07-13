package com.jc.composite;

/**
 * 
 * @author Jimmy
 *	Composite組合模式
 *	http://openhome.cc/Gossip/DesignPattern/CompositePattern.htm
 *	
 *	用於: 數個物件之間，呈現一種樹狀結構。物件之間可以組合。
 *	組合模式描述了如何將容器對象和葉子對象進行遞歸組合
 *	使得用戶在使用時無須對它們進行區分可以一致地對待容器對象和葉子對象，這就是組合模式的模式動機。
 */
public interface IPlayable { //這邊拉出來放可播放的東西(可能是一首歌 也可能是一個播放清單 播放清單可以包含歌)
	public void play(); //兩者共同擁有的功能
}
