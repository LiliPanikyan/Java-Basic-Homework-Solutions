
public class _3_FullHouse {
	public static void printCard(int number){
		if(number<11)
			System.out.println(number);
			else{
				switch(number){
				case 11:System.out.println("J");break;
				case 12:System.out.println("Q");break;
				case 13:System.out.println("K");break;
				case 14:System.out.println("A");break;
				}
			}
		}
		public static void suit(int number){
			
			switch(number){
			case 1:System.out.println('♣' + " ");break;
			case 2:System.out.println('♦' + " ");break;
			case 3:System.out.println('♥' + " ");break;
			case 4:System.out.println('♠' + " ");break;
			}
		}

	public static void main(String[] args) {
		int counter = 0;
		for(int firstCard = 2; firstCard<= 14 ; firstCard++){
	           for(int secondCard = 2; secondCard<=14 ; secondCard++){
	                   if(secondCard==firstCard) continue;
	                   for(int s1 = 1 ; s1<=4 ; s1++){
	                           for(int s2 = s1+1 ; s2<=4; s2++){
	                                   for(int s3 = s2+1; s3 <=4 ; s3++){
	                                           for(int s4 = 1; s4 <=4 ; s4++){
	                                                   for(int s5 = s4+1 ; s5<=4 ; s5++){
	                                                   printCard(firstCard);
	                                                           suit(s1);
	                                                           printCard(firstCard);
	                                                           suit(s2);
	                                                           printCard(firstCard);
	                                                           suit(s3);
	                                                           printCard(secondCard);
	                                                           suit(s4);
	                                                           printCard(secondCard);
	                                                           suit(s5);
	                                                           System.out.println();
	                                                           counter++;
	                                                           }
	                                   }
	                           }
	                   }
	           }
	           System.out.println(counter);	           
	       }
        }
	}
}