// 5. Wykonaj zadanie: (Rusz Głową Java, wydanie 2, Rozdział 1 - str. 52):
//
//    Magnesiki z kodem
//    Działający program Javy został podzielony na fragmenty. Czy jesteś w stanie złożyć
//    go z powrotem w jedną całość, tak aby wygenerował przedstawione poniżej wyniki?
//    Niektóre nawiasy klamrowe spadły na podłogę i były zbyt małe, aby można je było
//    podnieść, dlatego w razie potrzeby możesz je dodawać!

// Kod w odpowiedniej kolejności z uzupełnionymi nawiasami:
class Układanka {					 // Fragment 3.
	public static void main(String[] args) {
		int x = 3;				 // Fragment 5.
		
		while (x > 0) {				 // Fragment 7.
			if (x > 2) {			 // Fragment 4.
				System.out.print("a");
			}

			x = x - 1;			 // Fragment 6.
			System.out.print("-");

			if (x == 2) {			 // Fragment 2.
				System.out.print("b c");
			}

			if (x == 1) {			 // Fragment 1.
				System.out.print("d");
				x = x - 1;
			}
		}
	}
}
