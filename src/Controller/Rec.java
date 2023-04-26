package Controller;

public class Rec {
	public int Rec_N(int[] VT, int Tamanho, int n) {
		if (Tamanho < 0) {
			return 0;
		}else {
			n = Rec_N(VT, Tamanho-1,n);
			if (VT[Tamanho] < 0) {
				n = 1 + n;
			}
			return n;
		}
	}
}
