package myProjektTarr2019java6Dar.podstawy.interfejsy;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 15.02.2020
 **/
public class RynekMcDonaldImpl implements McDonald {

    public void poproszeFrytki(double kwota) {
        System.out.println("Witamy w McDonald na rynku");
        System.out.println("Oto Twoje frytki");
    }

    public void poproszeMcFlury(double kwota) {
        System.out.println("Witamy w McDonald na rynku");
        System.out.println("Oto Twój McFlury");
    }
}
