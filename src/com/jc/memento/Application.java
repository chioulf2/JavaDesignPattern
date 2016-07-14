package com.jc.memento;

/**
 * 
 * @author Jimmy
 * Memento模式	
 *	
 *	http://openhome.cc/Gossip/DesignPattern/MementoPattern.htm
 *	http://xyz.cinc.biz/2013/07/memento-pattern.html
 *
 *	實現重點在於，區分 Originator、Memento、Caretaker 三個物件
 *	Originator 可將自己的狀態儲存在 Memento 中，並將 Memento 保留在 Caretaker 裡面。
 *	當 Originator 要回復狀態時，再從 Caretaker 取得 Memento 進行回復。
 */
class Application {
    private String state = "default setting";
    
    Backup backup() {
        return new Backup(state);
    }
    void recover(Backup backup) {
        this.state = backup.state;
    }
    
    void setState(String state) {
        this.state = state;
    }
    String getState() {
        return state;
    }
}
