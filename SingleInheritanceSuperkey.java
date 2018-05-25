class Addition
	{
		int No1 = 10;
		int No2 = 20;
		int Aresult;

		public int AdditionOperation()
		{
			Aresult = No1 + No2;
			return Aresult;
		}
	}
class Multipilication extends Addition
	{
		int No3 = 10;
		int Mresult;

		public int MultipilicationOperation()
		{
			Mresult = super.Aresult * No3;
			return Mresult;
		}
	}
class SingleInheritanceSuperkey
	{
		public static void main(String[] args)
		{
			Multipilication mo = new Multipilication();
			System.out.println("Addition Operation Result is : " + mo.AdditionOperation());
			System.out.println("Multipilication Operation Result is : " + mo.MultipilicationOperation());

		}
	}
