package Practice;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class CreateSeqFile extends Frame implements ActionListener{
	private TextField account, name, balance;
	private Button enter, done;
	private DataOutputStream output; //���� ��Ʈ�� ��ü
	public CreateSeqFile(){
		super("�������� ����");
		setSize(250,130);
		setLayout(new GridLayout(4,2));
		add(new Label("���¹�ȣ"));
		account=new TextField(); //���¹�ȣ �Է� �ʵ�
		add(account);
		add(new Label("�̸�"));
		name=new TextField(20); //�̸� �Է��ʵ�
		add(name);
		add(new Label("�ܰ�"));
		balance=new TextField(20); //�ܰ� �Է��ʵ�
		add(balance);
		enter=new Button("�Է�"); //�Էµ� �����͸� �����ϴ� ��ư
		enter.addActionListener(this); //�̺�Ʈ�� ����
		add(enter);
		done=new Button("����"); //�Էµ� �����͸� �����ϴ� ��ư
		done.addActionListener(this); //�̺�Ʈ�� ����
		add(done);
		setVisible(true);
	}
	
	public void addRecord()
	{
		int accountNo=0;
		String Title;
		String TPath;
		if(!account.getText().equals("")){ //���¹�ȣ�� �Է��� üũ
			try
			{
				accountNo=Integer.parseInt(account.getText());
				if(accountNo>0){
					Title=JOptionPane.showInputDialog(null,"���������� ������ �Է����ּ���","clint");
					
					if(!Title.equals(""))
					{
						File SFile=new File(".");
						TPath=SFile.getPath();
						SFile=new File(TPath);
						File[] AFiles=SFile.listFiles();
						Title=Title+".txt";
						int Fileflag=0;
						for(File file:AFiles)
						{
							if(file.getName().equals(Title))
							{
								FileOutputStream outputStream=null;
								output=new DataOutputStream(new FileOutputStream(Title,true)); //������ Text���� ����
								output.writeUTF(account.getText()); //���� ��Ʈ���� ���Ͽ� �������� �����Ѵ�
								output.writeUTF(name.getText()); //���ڿ��� �����Ѵ�
								output.writeUTF(balance.getText());
								Fileflag=1;
								break;
							}
						}
						if(Fileflag==0)
						{
							try{
								output=new DataOutputStream(new FileOutputStream(Title));
							}catch (IOException e){
								System.err.println(e.toString());
								System.exit(1);
							}
							output.writeUTF(account.getText());
							output.writeUTF(name.getText()); //���ڿ��� �����Ѵ�
							output.writeUTF(balance.getText());
						}
						account.setText(""); //�ؽ�Ʈ �ʵ带 ����
						name.setText("");
						balance.setText("");
						output.close();
					}
				}
			}catch (NumberFormatException nfe){
				System.err.println("������ �Է��ؾ� �մϴ�");
			}catch (IOException io){
				System.err.println(io.toString());
				System.exit(1);
			}
		}
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==enter)
		{
			addRecord(); //�Էµ� �����͸� ���Ͽ� �����Ѵ�
		}
		if (e.getSource()==done){
			System.exit(0); //���α׷��� �����Ѵ�
		}
	}
	public static void main(String[] args){
		new CreateSeqFile();
	}
}
