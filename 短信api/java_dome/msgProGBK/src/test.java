import java.util.HashMap;
import java.util.Map;

/**  
 * @Title: http://www.smschinese.cn/api.shtml
 * @date 2011-3-22
 * @version V1.2  
 */
public class test {
	
	//�û���
	private static String Uid = "Kaloneme";
	
	//�ӿڰ�ȫ��Կ
	private static String Key = "216e12d9c398105622cf";
	
	//�ֻ����룬���������13800000000,13800000001,13800000002
	private static String smsMob = "15005933756,17720806830";
	
	//��������
	private static String smsText = "��֤�룺8888";
	
	public static void main(String[] args) {
		
		HttpClientUtil client = HttpClientUtil.getInstance();
		
		//GBK����
		int resultGbk = client.sendMsgGbk(Uid, Key, smsText, smsMob );
		if(resultGbk>0){
			System.out.println("GBK�ɹ���������=="+resultGbk);
		}else{
			System.out.println(client.getErrorMsg(resultGbk));
		}
	}
}
