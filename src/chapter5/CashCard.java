package chapter5;

// 在JDK5之后，新增了import static语法
import static java.lang.System.out;

// 封装对象
// 封装的目的就是隐藏对象细节，将对象当作黑箱进行操作
// private成员：类私有
// default成员：在相同包的类程序代码中可以直接存取——“包范围权限”
// public成员： 公开类，其他包中的类可以使用
public class CashCard {
	private String number; // private定义私有成员，不能被外界调用，因此要相应配备get方法
	private int balance;
	private int bonus;
	static final double PI = 3.141596; //  static成员属于类，不会让个别对象拥有
	
	// 在创建对象之后、调用构造之前，若有想执行的流程，可以使用{}定义
	{
		// System.out.println("对象初始化区块");
		// 引入static成员之后
		out.println("对象初始化区块");
	}
	
	// 动作想在位码加载后执行，可以定义static区块，只会执行一次
	static {
	 	// System.out.println("位码加载后就会被执行");
	 	// 引入static成员之后
	 	out.println("位码加载后就会被执行");
	}
	
	// 构造函数
	CashCard(String number, int balance, int bonus) {
		this.number = number;
		this.balance = balance;
		this.bonus = bonus;
	}
	
	// 重载(Overload)构造函数 [注意]自动装箱、拆箱问题
	CashCard(String number) {
		this.number = number;
		this.balance = 0;
		this.bonus = 0;
	}
	
	// 在一个构造函数中，可以用this()调用另一个构造函数，但是，只能出现在构造函数的第一行。
	// 所以上面那个第一个构造函数可以改写成如下形式
	// CashCard(String number, int balance, int bonus) {
	// 	this(number);
	// 	this.balance = balance;
	//	this.bonus = bonus;
    // }
	
	 void store(int money) { // 储值时调用的方法
		 if (money > 0) {
			 this.balance += money;
			 if (money > 1000) {
				 this.bonus ++;
			 }
		 } else {
			 System.out.println("Error: quantity can not be negative");
		 }
	 }
	 
	 void charge(int money) { // 扣款时调用的方法
		 if (money > 0) {
			 if (money <= this.balance) {
				 this.balance -= money;
			 } else {
				System.out.println("Cannot afford this"); 
			 }
		 } else {
			 System.out.println("Error: quantity can not be negative");
		 }
	 }
	 
	 int exchange(int bonus) { // 兑换时调用
		 if (bonus > 0) {
			 this.bonus -= bonus;
		 }
		 return this.bonus;
	 }
	 
	 // 提供取值方法成员
	 public String getNumber() {
		 return number;
	 }

	 public int getBalance() {
		 return balance;
	 }

	 public int getBonus() {
		 return bonus;
	 }
	 
	 public void setNumber(String number) {
		 this.number = number;
	 }
}
