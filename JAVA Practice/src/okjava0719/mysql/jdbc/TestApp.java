package okjava0719.mysql.jdbc;

import java.util.ArrayList;

public class TestApp {
	public static void main(String[] args){
/*		String prname="마법지팡이";
		int price=25000;
		String manufacture="호그와트";
		Product product=new Product(prname,price,manufacture);
		
		ProductDAO productDAO=new ProductDAO();
		boolean isSucceed=productDAO.newProduct(product);
		System.out.println("성공여부 :"+isSucceed);*/
		
		ProductDAO dao=new ProductDAO();
		
		Product p=new Product();
		p.setPrname("아이폰7plus");
		p.setPrice(900000);
		p.setManufacture("애플");
		
		if(dao.newProduct(p)){
			System.out.println("등록성공!");
		}else{
			System.out.println("등록실패!");
		}
		
		ArrayList<Product> data=dao.getAll();
		
		for(Product prd:data){
			System.out.printf("%d\t%s\t%d\t%s",prd.getPrcode(),prd.getPrname(),prd.getPrice(),prd.getManufacture());
		}
	}
}
