package $011.inheri.f5;
/*��Ŀ�����и���Goods�� 
�ڴ˻���������������Clothing��
 ���ඨ�����Լ�������String���͵����style����
�д������Ĺ��췽���������˸����show������
���ø��౻���ǵ�show������
���Ӵ�ӡ�Լ������Ե���䣬
��ʵ��Clothing��ı�д*/
public class Goods {
    double unitPrice;//����
    double account;//����
    Goods(double unitPrice, double account) {
            this.unitPrice=unitPrice ;
            this.account=account ;
    }
    double totalPrice() {//�����ܼ۸�
            return unitPrice * account;
    }
    void show() {
            System.out.println("������" + unitPrice);
            System.out.println("��������Ϊ" + account);
            System.out.println("������Ʒ���ܽ����" + this.totalPrice());
    }
}

