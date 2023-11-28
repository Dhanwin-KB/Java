package gaming;
public class PkgIfaceGaming 
{
	public static void main(String[] args) 
	{
		Playable defaultGame = new Game();
		Playable rdr2 = new RDR2();
		defaultGame.display();
		rdr2.display();
	}
}
