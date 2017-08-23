package day1;

public class MyModulusAnimation {

		public static void main( String[] args ) throws Exception
		{
			for ( int i=0; i<10; i++ )
			{
			
				if ( i%10 == 1)
					System.out.print("                    __________             \r");
				if ( i%10 == 2 )
					System.out.print(" |          |            |   \r");
				if ( i%10 == 3 )
					System.out.print(" |          |            |    \r");
				if ( i%10 == 4 )
					System.out.print(" |          |            |        \r");
				if ( i%10 == 5 )  
					System.out.print(" |----------|            |         \r");
				if ( i%10 == 6 )
					System.out.print(" |          |            |    \r");
				if ( i%10 == 7 )
					System.out.print(" |          |            |      \r");
				if ( i%10 == 8 )
					System.out.print(" |          |       _____|_____     \r");
				if ( i%10 == 9)
					System.out.print("                                 \r");
                
				Thread.sleep(200);
			}
			
		}
	}

