package com.jc.visitor;

/**
 * 
 * @author Jimmy
 *
 *	訪問者模式 還沒有很懂 pdf例子比網頁清楚
 *	http://openhome.cc/Gossip/DesignPattern/VisitorPattern.htm
 *
 *	簡單來說設定一個一個訪問對象 如果要使用它 就讓訪問者被accept 就可以用它	
 *
 */
public class Main {
	public static void main(String[] args) {
		Service service = new Service();
		service.doService(new Member());
	}
}



interface Visitable {
	void accept(Visitor visitor);
}

interface Visitor {
	void visit(Member member);

	void visit(VIP vip);
}

class Customer implements Visitable {
	void doCustomer() {
		System.out.println("客戶服務");
	}

	void pay() {
		System.out.println("結帳");
	}

	public void accept(Visitor visitor) {
		// nothing to do
	}
}

class Member extends Customer {
	void doMember() {
		System.out.println("會員服務");
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this); // 看似多型，其實是 overload
	}
}

class VIP extends Customer {
	void doVIP() {
		System.out.println("VIP 服務");
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this); // 看似多型，其實是 overload
	}
}

class VisitorImpl implements Visitor {
	public void visit(Member member) {
		member.doMember();
	}

	public void visit(VIP vip) {
		vip.doVIP();
	}
}

class Service {
	private Visitor visitor = new VisitorImpl();

	void doService(Customer customer) {
		customer.doCustomer();
		((Visitable) customer).accept(visitor);
		customer.pay();
	}
}
