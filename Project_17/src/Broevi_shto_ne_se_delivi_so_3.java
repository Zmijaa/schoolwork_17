import java.util.Scanner;
public class Broevi_shto_ne_se_delivi_so_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner var=new Scanner(System.in);
System.out.println("Da se ispecatat:clenovi na niza koi ne se delivi so 3");
System.out.print("Vnesi broj na clenovi vo niza");
int n=var.nextInt();
int niza[]=new int[n];
System.out.println("Vnesi gi clenovite vo nizata");
for (int i=0; i < niza.length; i++) {
System.out.print(i + "-->");
niza[i]=var.nextInt();
}
for(int i=0; i <niza.length; i++) {
	if (niza[i] % 3 !=0)
		System.out.println("niza["+i+"]=" +niza[i]);
          }
     }
}
