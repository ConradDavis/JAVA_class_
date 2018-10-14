package $011.inheri.f5;
/*题目：现有父类Goods， 
在此基础上派生出子类Clothing，
 子类定义了自己的属性String类型的类别（style），
有带参数的构造方法，覆盖了父类的show方法，
调用父类被覆盖的show方法，
增加打印自己的属性的语句，
请实现Clothing类的编写*/
public class Goods {
    double unitPrice;//单价
    double account;//数量
    Goods(double unitPrice, double account) {
            this.unitPrice=unitPrice ;
            this.account=account ;
    }
    double totalPrice() {//计算总价格
            return unitPrice * account;
    }
    void show() {
            System.out.println("单价是" + unitPrice);
            System.out.println("购买数量为" + account);
            System.out.println("购买商品的总金额是" + this.totalPrice());
    }
}

