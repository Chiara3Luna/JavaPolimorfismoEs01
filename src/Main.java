public class Main {
    public static void main(String[] args) {
        //creazione oggetti
        Forma rettangolo = new Rettangolo(5.0, 3.0);
        Forma triangolo = new Triangolo(4.0, 6.0);

        //chiamata al metodo calcolaArea delle diverse forme
        rettangolo.calcolaArea();  //stampami l'area del rettangolo
        triangolo.calcolaArea();   //stampami l'area del triangolo
    }
}