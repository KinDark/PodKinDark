package myProjektTarr2019java6Dar.podstawy.instrukcje.warunkowe;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 29.02.2020
 **/
public class InstrukcjeWarunkoweMain {

    public static void main(String[] args) {
        // wykonaj metodę sprawdzajacą pełnioletność
        // wykorzystaj instrukcję warunkową

        // kto ?
        // osoba
        int wiek = 5;
        boolean czyPelnolenia = sprawdzCzyPelnoletnia(wiek);
        System.out.println("Jeżeli masz "+wiek+" lat to pelnoletni="+czyPelnolenia);
    }

    private static boolean sprawdzCzyPelnoletnia(int wiek) {
        // z użyciem instrukcji warunkowej
        if(wiek>17){
            return true;
        }else{
            return false;
        }
        // oczywiscie mozna zapisac w jednej linii
//        return wiek>17;
    }
}
