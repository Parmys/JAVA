import java.util.Scanner;

public class  Version1{


		public static void main(String [] args){
			Scanner  sc=new Scanner (System.in);
			String  nom, prenom, adresse, nomCheval1,  nomCheval2, nomCheval3;
			String  numCarte;
			char rep;
			
			
			do{
				
						//SAISIE
						
						 System.out.println("Nom du cavalier\t : ");
						 nom=sc.nextLine();
						 
						 System.out.println("Prénom du cavalier\t : ");
						 prenom=sc.nextLine();
						 
						 System.out.println("Adresse du cavalier\t : ");
						 adresse=sc.nextLine();
						 
						 System.out.println("Cheveaux préféres\t : ");
						 nomCheval1=sc.nextLine();
						 nomCheval2=sc.nextLine();
						 nomCheval3=sc.nextLine();
						 
						 System.out.println("No  carte FNTE\t : ");
						 numCarte=sc.nextLine();
												
						//PRESENTATION
						System.out.print(" \n\nNom du cavalier : "  + nom  );
						System.out.print(" \n\nPrénom du cavalier : "  + prenom  );
						System.out.print(" \n\nAdresse du cavalier : "  + adresse  );
						System.out.print(" \n\nChevaux preferes : " +"\r\t\t" + nomCheval1+"\r\t\t"+ nomCheval2 +"\r\t\t"+  nomCheval1);
						System.out.print(" \n\nNo  carte FNTE : "  + numCarte  );
						
						
						//MESSAGE DE FIN
						System.out.println("\n\n Voulez-vous continuer (O/N)? ");
						rep=sc.nextLine().charAt(0);
					    
						
						
			}while (rep=='o');
					sc.close();
		}
		
		
		
}