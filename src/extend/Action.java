package extend;
/**
 * ���ǻ��
 * @author huangfei
 *
 */
public class Action {
	public int id;
	public int starttime;
	public int endtime;
	/**
	 * ���ǻ��
	 * @param id
	 * ����
	 * @param stattime
	 * ���ʼʱ��
	 * @param endtime
	 * �����ʱ��
	 */
	public Action(int id, int stattime,int endtime){
		this.id=id;
		this.starttime=stattime;
		this.endtime=endtime;
	}
	public String getinfo(){
		String result="action's id="+id+" starttime="+starttime+" endtime="+endtime+"\n";
		return result;
	}
}
