package View;
import Controller.Rec;

public class Main {

	public static void main(String[] args) {
		Rec R = new Rec();
		int VT[] = {40,-8,8,41,-95,-78,-8,100};
		int Tamanho = VT.length-1;
		int N = 0;
		System.out.println(R.Rec_N(VT, Tamanho,N));
	}

}
