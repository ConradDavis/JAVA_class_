/**
  * @(#)tools.FishUtilities.java  2008-7-31  
  * Copy Right Information	: Tarena
  * Project					: tools
  * JDK version used		: jdk1.6.4
  * Comments				: ���������С����ײ�ࡣ
  * Version					: 1.0
  * Sr	Date		Modified By		Why & What is modified
  * 1.	2008-7-31 	С��     		�½�
  **/
package tools;

import fish.BigMouthFish;
import fish.FishBean;

 /**
 * ���������С����ײ�ࡣ<br>
 * ������ϰMath�ľ�̬������ʹ�á�
 * 2008-7-31
 * @author		���ڿƼ�[Tarena Training Group]
 * @version	1.0
 * @since		JDK1.6(����) 
 * @author		Administrator
 */
public class FishUtilities {

	/**
	 * ���ش������Ƿ�Ե���С�㡣<br>
	 * ��ʽ�����2��(Բ)֮���Ƿ����л��ཻ��<br>
	 * �ж�2Բ��֮��ľ���С��2Բ�뾶֮�͡��˴��ж�С�ڴ�����İ뾶���ɡ��ô�������ԳԵ�С�㡣
	 * @param fish
	 * @param bean
	 * @return ���ش����Ƿ�Ե�С�㡣
	 */
	public static boolean isInteraction(BigMouthFish fish,FishBean bean){
		return Math.pow(fish.posx+fish.size/2-bean.posx-bean.size/2,2)+Math.pow(fish.posy+fish.size/2-bean.posy-bean.size/2, 2)<=Math.pow(fish.size/2, 2);
	}
}
