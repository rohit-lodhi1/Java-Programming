class Test{
	
	public static void main(String[] args) {
		
		String s="abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<s.length();i++)
		{
			int asc=s.charAt(i);
			System.out.println(s.charAt(i)+"->"+asc);
		}
	}
}