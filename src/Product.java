import java.util.Scanner;

public class Product 
{
   String  productId;		
   String	productName	;	
  String	productDescription;	
    float	productPrice	;


    public Product()
   {
	productId=null;
	productName=null;
	productDescription=null;
	productPrice=0;
   }


       public Product(String v1,String v2,String v3,float v4  )
  {
	productId=v1;
	productName=v2;
	productDescription=v3;
	productPrice=v4;
 }


    public String getProductId() 
     {
	return productId;
      }


     public void setProductId(String productId) {
	this.productId = productId;
    }


     public String getProductName() {
	return productName;
      }


    public void setProductName(String productName) {
	this.productName = productName;
     }


    public String getProductDescription() {
	return productDescription;
     }


    public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
     }


   public float getProductPrice() {
	return productPrice;
  }


  public void setProductPrice(float productPrice) {
	this.productPrice = productPrice;
  }

  static Scanner inp=new Scanner(System.in);
   public void addProduct ()
   {
	   System.out.println("enter id");
	   this.productId=inp.nextLine();
	   System.out.println("enter name");
	   this.productName=inp.nextLine();
	   System.out.println("enter supplierAddress");
	   this.productDescription=inp.nextLine();
	   System.out.println("enter supplierFeedback");
	   this.productPrice=inp.nextFloat ();
   }
   public  void changeProduct ()
  {
	  
	   System.out.println("enter new  name");
	   this.productName=inp.nextLine();
	   System.out.println("enter new supplierAddress");
	   this.productDescription=inp.nextLine();
	   System.out.println("enter new supplierFeedback");
	   this.productPrice=inp.nextFloat ();
  }
  public void removeProduct()
   {
	  this.productId=null;
	  this.productName=null;
	  this.productDescription=null;
	  this.productPrice=0;
   }
  
  public void sortProduct()
  {
	   
  }



}
