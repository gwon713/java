package member;
//�߻� �޼���� ����θ� ����. ���������� ����� ���ؼ�
public interface Dao {
	void insert(Member m);
	Member select(String id);
	void update(Member m);//�̸���, pwd ����
	void delete(String id);
}

//ȸ������(insert) / �α���(select) / �α׾ƿ� / Ż��(delete)
/// ������Ȯ��(select) / ������ ����(update)