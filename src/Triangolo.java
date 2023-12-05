class Triangolo extends Forma {
    //proprietà del triangolo
    private double base;
    private double altezza;

    //costruttore x classe triangolo
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    //override del metodo calcolaArea x calcolare l'area del triangolo
    @Override
    public void calcolaArea() {
        double area = 0.5 * base * altezza;
        System.out.println("L'area del triangolo è: " + area);
    }
}