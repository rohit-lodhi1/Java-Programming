class Account{

  private String name,mobile;
	private int acc;
   Account(String name,String mobile,int acc)
   {
      this.name=name;
      this.mobile=mobile;
      this.acc=acc;
   }
	public String toString(){           
           return "NAME :- "+name+"  "+"MOBILE :- "+mobile+"  "+"ACCOUNT NO :- "+acc;
	}	  
      public boolean matchAcc(int acc){
             return this.acc==acc;
      }
      public boolean matchMobile(String mobile){
             return this.mobile.equals(mobile);
      }
}

class LenaDenaBank{

      Account account[];

      int totalacc=0;
      LenaDenaBank()
      {
      	 account=new Account[5];
      }

      public boolean isAccount(int acc)
      {     
         for(int i=0;i<totalacc;i++)
         {
          if(account[i].matchAcc(acc))
            return true;
        }
          return false;
      }

      public boolean ismobile(String mobile)
      {    
         for(int i=0;i<totalacc;i++)
         {
          if(account[i].matchMobile(mobile))
            return true;
        }
          return false;
      }

	public void createAcc(String name,String mobile,int acc){
     
      
             Account ac1=new Account(name,mobile,acc);
      
    //   account[totalacc++]=ac1;
          if(isAccount(acc))
          {
          	System.out.println("Already Exists "+acc);
          }     
          else if(ismobile(mobile))
          {
             System.out.println("Already Exists "+mobile);
          }
          else
          {
                    account[totalacc++]=ac1;
          }
         
	}

	public void viewAcc()
	{
		for(int i=0;i<totalacc;i++)
		{
			System.out.println(account[i]);
		}
	}
}

class Test{

	public static void main(String[] args) {
		
		LenaDenaBank lbd=new LenaDenaBank();
		lbd.createAcc("abc","6263703637",100);
		lbd.createAcc("Xyz","6263703637",101);
		lbd.createAcc("mno","9132703637",102);
           
        lbd.viewAcc();
	}
}