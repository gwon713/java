package p0413.address;
//�����������(�迭) ó�� Ŭ����
public class Dao {//Data Access Object
	Member[] datas = new Member[10];
	int cnt=0;
	void insert(Member m){
		datas[cnt] = m;
		cnt++;
	}
	int getIdx(String name){
		for(int i=0; i<cnt; i++){
			if(name.equals(datas[i].name)){
				return i;
			}
		}
		return -1;
	}
	Member select(String name){
		int i=getIdx(name);
		if(i!=-1){
			return datas[i];
		}
		else return null;
	}
	void update(Member m){
		int i = getIdx(m.name);
		if(i!=-1){
			datas[i]= m;
		}
		else System.out.println("���� �̸�");
		
	}
	void delete(String name){
		int del = getIdx(name);
		if(del!=-1){
			datas[del] = null;
			for(int i=0; i<cnt-1;i++){
				datas[i]=datas[i+1];
			}
			cnt--;
		}
		else System.out.println("���� �̸�");
		
	}
	void printAll(){
		for(int i=0;i<cnt;i++){
			datas[i].printInfo();
		}
	}
}
