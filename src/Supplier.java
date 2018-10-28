import java.util.Scanner;

public class Supplier {
	String	supplierId;		
	String	supplierName;		
	String	supplierAddress;		
	int	supplierFeedback;
Product [] productSupplied;
int count;

public Supplier()
	 {
		         supplierId=null;
		         supplierName=null;
				 supplierAddress=null;
				 supplierFeedback=0;
				 count=0;
	 }
public Supplier(String v1,String v2,String v3,int v4  )
{
	 supplierId=v1;
	 supplierName=v2;
	 supplierAddress=v3;
	 supplierFeedback=v4;
}

        

	  public String getSupplierId() {
	return supplierId;
}
public void setSupplierId(String supplierId) {
	this.supplierId = supplierId;
}
public String getSupplierName() {
	return supplierName;
}
public void setSupplierName(String supplierName) {
	this.supplierName = supplierName;
}
public String getSupplierAddress() {
	return supplierAddress;
}
public void setSupplierAddress(String supplierAddress) {
	this.supplierAddress = supplierAddress;
}
public int getSupplierFeedback() {
	return supplierFeedback;
}
public void setSupplierFeedback(int supplierFeedback) {
	this.supplierFeedback = supplierFeedback;
}
static Scanner in1=new Scanner(System.in);
	 public void addSupplier()
	   {
		   System.out.println("enter id");
		   this.supplierId=in1.nextLine();
		   System.out.println("enter name");
		   this.supplierName=in1.nextLine();
		   System.out.println("enter supplierAddress");
		   this.supplierAddress=in1.nextLine();
		   System.out.println("enter supplierFeedback");
		   this.supplierFeedback=in1.nextInt();
	   }
	  public  void changeSupplier()
	   {
		
		   System.out.println("enter new name");
		   this.supplierName=in1.nextLine();
		   System.out.println("enter new supplierAddress");
		   this.supplierAddress=in1.nextLine();
		   System.out.println("enter new supplierFeedback");
		   this.supplierFeedback=in1.nextInt();
	   }
	  public void removeSupplier()
	   {
		  this.supplierId=null;
		  this.supplierName=null;
		  this.supplierAddress=null;
		  this.supplierFeedback=0;
		  for(int i=0;i<this.productSupplied.length;i++)
		  {
		  this.productSupplied[0].productId=null;
		  this.productSupplied[0].productName=null;
		  this.productSupplied[0].productDescription=null;
		  this.productSupplied[0].productPrice=0;
		  }
	   }
	 public  void dispSupplier()
	   {
		 if(this==null)
		 {
			 return;
		 }
		  System.out.println("id= "+this.getSupplierId()+ "name= "+this.getSupplierName()+" adress "+this.getSupplierAddress()+" feedback "+this.getSupplierFeedback());
	   }
	public  void dispProduct()
	  {
		 System.out.println("products of "+this.getSupplierName()+" are ");
		 for(Supplier current: productSupplied)
		 {
		 System.out.println(this.current.getProductId()+","+this.current.getProductName()+","+this.current.getProductDescription()+","+this.current.getProductPrice());
		 }
	  }
	   
	   
}




/*Given the following entity description:

	SupplierId		String
	SupplierName		String
	SupplierAddress		String
	SupplierFeedback	int
	ProductsSupplied[]	Product[]

	ProductId		String
	ProductName		String
	ProductDescription	String
	ProductPrice		float

Create an application for the following features

	1. Supplier
	2. Product

	1-1. Add a suppliers
	1-2. Change supplier details
	1-3. Remove a supplier
	1-4. Display supplier names in descending order of feedback
	1-5. Display products supplied for a specific supplier

	2-1. Add a product
	2-2. Change product details
	2-3. Remove a product
	2-4. Sort products by price*/