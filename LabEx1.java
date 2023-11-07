public class LabEx1
{
	//class #1
	public static class Games
	{
		//access specifiers - private & protected
		private int gid;
		protected String gtitle;
		//for construct overloading #1 - no arguments
		Games()
		{
			this.gid=0;
			this.gtitle="";
		}
		//for construct overloading #2 - one argument
		Games(int id)
		{
			this.gid=id;
			this.gtitle="";
		}
		//for construct overloading #3 - two arguments
		Games(int id, String title)
		{
			this.gid=id;
			this.gtitle=title;
		}
		public void show()
		{
			System.out.println("Game ID :"+this.gid);
			System.out.println("Game Title :"+this.gtitle);
		}
	}
	//class #2
	public static class Players
	{
		private int pid;
		public String ptag;
		//method #1 for method overloading - no arguments
		public void show()
		{
			System.out.println("Player ID :"+this.pid);
			System.out.println("Player Tag :"+this.ptag);
		}
		//method #2 for method overloading - one argument
		public void show(int gid)
		{
			System.out.println("Player ID :"+this.pid);
			System.out.println("Player Tag :"+this.ptag);
			System.out.println("Game ID :"+gid);
			System.out.println("Game Title :Assassin's Creed");
		}
		//method #3 for method overloading - two arguments
		public void show(int gid, String gtitle)
		{
			System.out.println("Player ID :"+this.pid);
			System.out.println("Player Tag :"+this.ptag);
			System.out.println("Game ID :"+gid);
			System.out.println("Game Title :"+gtitle);
		}
	}
	public static void main(String args[])
	{
		// constructors invoked to demonstrate overloading
		Games g1= new Games();
		Games g2= new Games(1);
		Games g3= new Games(2,"RDR2");
		g1.show();
		g2.show();
		g3.show();
		// methods invoked to demonstrate method overloading
		Players p1= new Players();
		p1.show();
		p1.show(1);
		p1.show(1,"Tomb Raider");
	}
}