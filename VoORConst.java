class VoOrConst
{
	public static void main(String[] args) 
	{
		char c = 'A'; 
		
		String r = (c>='A' && c<='Z' ||c>='a' && c<='z' || c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U'||c=='a'|| c=='i'|| c=='e'|| c=='o'|| c=='u'  )?"AlphaVo":"ConstVo";
		System.out.println(r);
	}
}
