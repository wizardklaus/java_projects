package Practice;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class CreateSeqFile extends Frame implements ActionListener{
	private TextField account, name, balance;
	private Button enter, done;
	private DataOutputStream output; //필터 스트림 객체
	public CreateSeqFile(){
		super("고객파일을 생성");
		setSize(250,130);
		setLayout(new GridLayout(4,2));
		add(new Label("계좌번호"));
		account=new TextField(); //구좌번호 입력 필드
		add(account);
		add(new Label("이름"));
		name=new TextField(20); //이름 입력필드
		add(name);
		add(new Label("잔고"));
		balance=new TextField(20); //잔고 입력필드
		add(balance);
		enter=new Button("입력"); //입력된 데이터를 저장하는 버튼
		enter.addActionListener(this); //이벤트와 연결
		add(enter);
		done=new Button("종료"); //입력된 데이터를 저장하는 버튼
		done.addActionListener(this); //이벤트와 연결
		add(done);
		setVisible(true);
	}
	
	public void addRecord()
	{
		int accountNo=0;
		String Title;
		String TPath;
		if(!account.getText().equals("")){ //구좌번호의 입력을 체크
			try
			{
				accountNo=Integer.parseInt(account.getText());
				if(accountNo>0){
					Title=JOptionPane.showInputDialog(null,"저장파일의 제목을 입력해주세요","clint");
					
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
								output=new DataOutputStream(new FileOutputStream(Title,true)); //기존의 Text파일 열기
								output.writeUTF(account.getText()); //필터 스트림을 통하여 정수값을 저장한다
								output.writeUTF(name.getText()); //문자열을 저장한다
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
							output.writeUTF(name.getText()); //문자열을 저장한다
							output.writeUTF(balance.getText());
						}
						account.setText(""); //텍스트 필드를 삭제
						name.setText("");
						balance.setText("");
						output.close();
					}
				}
			}catch (NumberFormatException nfe){
				System.err.println("정수를 입력해야 합니다");
			}catch (IOException io){
				System.err.println(io.toString());
				System.exit(1);
			}
		}
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==enter)
		{
			addRecord(); //입력된 데이터를 파일에 저장한다
		}
		if (e.getSource()==done){
			System.exit(0); //프로그램을 종료한다
		}
	}
	public static void main(String[] args){
		new CreateSeqFile();
	}
}
