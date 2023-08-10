package work;

public class SCP {
	
	public static String[] split(String s, String sep) {
		String arr[];
		int j = 0, k = 0, count = 1;
		char separate;
		if (sep.length() > 0)
			separate = sep.charAt(0);
		else {
			arr = new String[1];
			arr[0] = s;
			return arr;
		}

		while (j < s.length())
			if (s.charAt(j++) == separate)
				count++;

		j = 0;
		arr = new String[count];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == separate) {
				arr[k++] = s.substring(j, i);
				j = i + 1;
			}
			if (i == s.length() - 1)
				arr[k++] = s.substring(j, i + 1);

		}
		return arr;
	}

    public static void main(String[] args) {
      String s="Hello, hell, school,love";
      String a[];
   
      a=split(s,",");
      
      for(String d:a)
      System.out.println(d);
      System.out.println(a[0]);
    	
    }
}