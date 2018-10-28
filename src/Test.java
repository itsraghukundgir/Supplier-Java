import java.util.Scanner;
import java.lang.*;



public class Test
{
	

   public	Supplier[] suppliers;
    public	Product[] products;

  static Scanner in=new Scanner(System.in);
  
	public static void main(String[] args)
	{
		 int countSupplier=0,productCount=0;
		 
	 Test mainApp=new Test();
	 
     System.out.println("enter a  NO of supplier");
	 int var=in.nextInt();
	 mainApp.suppliers=new Supplier[var];
	 
	 mainApp.products=new Product[var];
	 
	 
	 System.out.println("1.supplier 2.product 3.exit");
	 System.out.println("entr a choice");
	 int choice=in.nextInt();

	 		
	 do
	 {
		  if(choice==1)
		  {
			  System.out.println("1.add supplier 2.change supplier 3.remove supplier 4.disp supplieer 5.disp product 6.exit");
			  System.out.println("eneter va choice ");
			  int wish=in.nextInt();
			 
			  do
			  {
				  switch(wish)
				  {
				  
				  case 1:
					  if(countSupplier==var)
					  {
						  System.out.println("stack overflow");
						
					  }
					  else
					  {
					   mainApp.suppliers[countSupplier]=new Supplier();
					   mainApp.suppliers[countSupplier].addSupplier();
					   countSupplier++;
					  }
					   break;
					   
				  case 2:
					   System.out.println("which supplier u want 2 change. enter the id of that supplier");
					   String id1=in.nextLine();
					   
					   for(int i=0;i<mainApp.suppliers.length;i++)
					   {
						   if(mainApp.suppliers[i].supplierId.equals(id1))
						   {
							   mainApp.suppliers[i].changeSupplier();
							   break;
						   }
					   }
					   
					   break;
					   
				  case 3:
					  System.out.println("which supplier u want 2 remove. enter the id of that supplier");
					  String remove=in.nextLine();
					 
					   for(int i=0;i<mainApp.suppliers.length;i++)
					   {
						   if(mainApp.suppliers[i].supplierId.equals(remove))
						   {
							   mainApp.suppliers[i].removeSupplier();
							   break;
						   }
					   }
					   
					   break;
					   
				  case 4:
					  for(Supplier current:mainApp.suppliers)
					  {
						  current.dispSupplier();	
					  }
					  
					   break;
					   
				  case 5:
					  System.out.println("enter the id of  supplier whose u want 2 see the products");
					  String productDis=in.nextLine();
					  for(int i=0;i<mainApp.suppliers.length;i++)
					   {
						   if(mainApp.suppliers[i].supplierId.equals(productDis))
						   {
							   mainApp.suppliers[i].dispProduct();
							   break;
						   }
					   }
					   break;
					   
				  case 6:
					     System.exit(0);
					     break;
					     
				  default: 
			            System.out.println("invalid input");
			            break; 
					  
					   	     
				  }
			  }
			  while(wish !=6);
			  
			  
		  }
		  else if(choice==2)
		  {
			  System.out.println("1.add product 2.change product 3.remove product 4.sort product  5.exit");
			  System.out.println("enter a choice ");
			  int pWish=in.nextInt();
			
			  
			  do
			  {
				  switch (pWish)
				  {
				  case 1:
					       System.out.println("in which supplier u want  2 add product,enter the id of that supplier please");
					        String id2=in.nextLine();
					        for(int i=0;i<mainApp.suppliers.length;i++)
					        {
					        	if(mainApp.suppliers[i].getSupplierId().equals(id2))
					        	{
					        		  if(  mainApp.suppliers[i].count==var)
									     {
									    	 System.out.println("product overflow");
									    	 break;
									     }
									     else
									     {
									    	 mainApp.suppliers[i].productSupplied[mainApp.suppliers[i].count]=new Product();
									    	 Product p= mainApp.suppliers[i].productSupplied[mainApp.suppliers[i].count];
									    	p.addProduct();
									    	 mainApp.suppliers[i].count++;
									    	 break;
									     }
					        	}
					       }
					   
					  break;
					  
				  case 2:
					   System.out.println("in which supplier u want  2 change details product,enter the id of that supplier please");
				        String id3=in.nextLine();
				        boolean flag=false;
				        for(int i=0;i<mainApp.suppliers.length;i++)
				        {
				        	if(mainApp.suppliers[i].getSupplierId().equals(id3))
				        	{
				        		System.out.println("which product u want 2 change.enter the id of that product");
				        		String  s1=in.nextLine();
				        		for(int j=0;i<mainApp.suppliers[i].productSupplied.length;j++)
				        		{
				        			if(mainApp.suppliers[i].productSupplied[j].getProductId().equals(s1))
				        			{
				        				mainApp.suppliers[i].productSupplied[j].changeProduct();
				        				flag=true;
				        				break;
				        			}
				        		}
				        		
				        	}
				        	if(flag==true)
				               break;
				        }
				        	
					
					  break;
					  
				  case 3:
					  System.out.println("in which supplier u want  2  remove product,enter the id of that supplier please");
				        String id4=in.nextLine();
				        boolean flag1=false;
				        
				        for(int i=0;i<mainApp.suppliers.length;i++)
				        {
				        	if(mainApp.suppliers[i].getSupplierId().equals(id4))
				        	{
				        		System.out.println("which product u want 2 change.enter the id of that product");
				        		String  s2=in.nextLine();
				        		for(int j=0;i<mainApp.suppliers[i].productSupplied.length;j++)
				        		{
				        			if(mainApp.suppliers[i].productSupplied[j].getProductId().equals(s2))
				        			{
				        				mainApp.suppliers[i].productSupplied[j].removeProduct();
				        				flag1=true;
				        				break;
				        			}
				        		}
				        		
				        	}
				        	if(flag1==true)
				               break;
				        }
				        	
					  break;
					  
				  case 4:
					  System.out.println("in which supplier u want  2  remove product,enter the id of that supplier please");
				        String sort1=in.nextLine();
				        
				        for(int i=0;i<mainApp.suppliers.length;i++)
				        {
				        	if(mainApp.suppliers[i].getSupplierId().equals(sort1))
				        	{
				        		//mainApp.suppliers[i].sortProduct();
				        	}
				           	
				        }
					  break;
					  
				  case 5:
					   System.exit(0);
					   break;
				  }
				  
			  }
			  
			  while(pWish !=5);
		  }
		  else
		  {
			  break;
		  }
		  
	 }
	 while(choice==2 || choice ==1);	
}
}