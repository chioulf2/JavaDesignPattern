package com.jc.prototype;
/**
 * 
 * @author Jimmy
 * prototype模式
 * 	
 * Java本身就有Clonenable可以使用
 * 
 * 	原型模式適合在什麼場景使用?
 * 	一是類初始化需要消化非常多的資源,這個資源包括數據、硬件資源等
 * 	二是通過new 產生一個對象需要非常繁瑣的數據準備或訪問權限,則可以使用原型模式
 * 	三是一個對象需要提供給其他對象訪問,而且各個調用者可能都需要修改其值時,可以考慮使用原型模式拷貝多個對象供調用者使用。
 * 	在實際項目中,原型模式很少單獨出現,一般是和工廠方法模式一起出現,通過 clone 的方法創建一個對象,然後由工廠方法提供給調用者。
 * 	原型模式先產生出一個包含大量共有信息的類,然後可以拷貝出副本,修正細節信息,建立了一個完 整的個性對象。
 *
 */
public class Mail implements Cloneable{
	// 收件人
	private String receiver; // 郵件名稱
	private String subject; // 稱謂
	private String appellation; // 郵件內容
	private String contxt; // 郵件的尾部,一般都是加上“XXX版權所有”等信息
	private String tail;

	// 構造函數
	public Mail(AdvTemplate advTemplate) {
		this.contxt = advTemplate.getAdvContext();
		this.subject = advTemplate.getAdvSubject();
	}
	
	@Override
	public Mail clone(){
		Mail mail = null;
		try{
			mail = (Mail)super.clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return mail;
	}
	
	//以下是getter setter
	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAppellation() {
		return appellation;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public String getContxt() {
		return contxt;
	}

	public void setContxt(String contxt) {
		this.contxt = contxt;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}
}
