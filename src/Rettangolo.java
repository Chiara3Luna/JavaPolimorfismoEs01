class Rettangolo extends Forma {
    //proprietà del rettangolo
    private double base;
    private double altezza;

    //mi creo il costruttore
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    //override del metodo
    @Override
    public void calcolaArea() {
        double area = base * altezza;
        System.out.println("L'area del rettangolo è: " + area);
    }
}