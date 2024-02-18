package oop1;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setName("Product X");
		product1.setUnitPrice(10);
		product1.setDiscount(6);
		product1.setUnitsInStock(100);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product();
		product2.setName("Product Y");
		product2.setUnitPrice(100);
		product2.setDiscount(60);
		product2.setUnitsInStock(1000);
		product2.setImageUrl("image2.jpg");
		
		
		Product[] products = {product1,product2};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("1111");
		individualCustomer.setPhone("+901112323");
		individualCustomer.setFirstName("Semih");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCustomerNumber("2222");
		corporateCustomer.setPhone("02120202020");
		corporateCustomer.setCompanyName("CompanyName");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		for (Customer customer : customers) {
			System.out.println(customer.getId() + "\n" + customer.getCustomerNumber() + "\n" + customer.getPhone());
		}
	}

}
 