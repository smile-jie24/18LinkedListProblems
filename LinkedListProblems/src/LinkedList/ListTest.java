package LinkedList;

public class ListTest {
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList<Integer>();
	
		//�γ�Ĭ�ϵĲ�������
		for(int i=0;i<4;i++) {
			list.addFirst(i);
			//System.out.println("insert"+"'"+i+"'"+"success:  "+list);
		}
		
		//1-Count() Test
		/*
		System.out.print("1-Count()���Խ����");
		int a=list.Count(list, 2);
		System.out.println(a);
		*/
		
		//2-GetNth() Test
		/*
		System.out.print("2-GetNth()���Խ��:");
		System.out.println(list.GetNth(list, 2));
		*/
		 
		//3-DeleteList() Test
		/*
		System.out.println("3-DeleteList()���Խ����");
		System.out.print("DeleteList()ǰ������Ϊ��");
		System.out.println(list);
		list.DeleteList(list);
		System.out.print("DeleteList()�������Ϊ��");
		System.out.println(list);
		*/
	
		
		//4-pop() Test
		/*
		System.out.println("4-pop()���Խ��");
		System.out.print("pop()ǰ������");
		System.out.println(list);
		System.out.print("��������ĵ�һ���ڵ㣺");
		System.out.println(list.pop(list));
		System.out.print("pop()�������");
		System.out.println(list);
		*/
		
		//5-add() Test
		/*
		System.out.print("add()ǰ������");
		System.out.println(list);
		System.out.print("������λ�ò���ڵ㣺");
		list.add(12,0);
		list.add(42,1);
		list.add(5,1);
		System.out.println(list);
		*/	
		
		//6-SortedInsert() Test
		/*
		System.out.print("SortedInsert()ǰ������");
		System.out.println(list);
		list.SortedInsert(list, list.createNode(22));
		list.SortedInsert(list, list.createNode(100));
		list.SortedInsert(list, list.createNode(3));
		list.SortedInsert(list, list.createNode(0));
		System.out.print(SortedInsert()�������);
		System.out.println(list);
		*/
		
		//6-SortedInsert2() Test
		/*
		System.out.print("SortedInsert2()ǰ������");
		System.out.println(list);
		list.SortedInsert2(list, list.createNode(5));
		list.SortedInsert2(list, list.createNode(2));
		list.SortedInsert2(list, list.createNode(0));
		System.out.print("SortedInsert2()�������:");
		System.out.println(list);
		*/
		
		
	}
}
