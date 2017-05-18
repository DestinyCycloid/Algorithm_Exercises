package extend;

import java.util.List;
/**
 * ����̰���㷨��
 * @author huangfei
 *
 */
public class Greedy {
	boolean[] choice;
	List<Action> actions;
	public Greedy(List<Action> actions){
		choice=new boolean[actions.size()];
		this.actions=actions;
	}
	/**
	 * ���ǻ��̰���㷨�Ľ��
	 */
	public void getGeedyResult(){
		this.greedyChoice();
		System.out.println("��������Ӽ�Ϊ��");
		for(int i=0;i<this.actions.size();i++){
			if(choice[i]){	
				System.out.print(actions.get(i).getinfo());
			}
		}
	}
	/**
	 * ����̰���㷨
	 */
	public void greedyChoice(){
		choice[0]=true;
		int j=0;
		for(int i=1;i<this.actions.size();i++){
			if(this.actions.get(i).starttime>=this.actions.get(j).endtime){
				choice[i]=true;
				j=i;
			}
			else{
				choice[i]=false;
			}
		}
	}
	
}
