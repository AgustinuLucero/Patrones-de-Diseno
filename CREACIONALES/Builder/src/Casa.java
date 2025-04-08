public class Casa {
    private int puertas;
    private int ventanas;
    private int habitaciones;
    private String tipoTecho;
    private Boolean garage;
    private Boolean patio;

    private Casa(Builder builder){
        this.garage = builder.garage;
        this.habitaciones = builder.habitaciones;
        this.tipoTecho = builder.tipoTecho;
        this.patio = builder.patio;
        this.ventanas = builder.ventanas;
        this.puertas = builder.puertas;
    }

    public void mostrarCasa(){
        System.out.println("Numero de puertas: " + this.puertas);
        System.out.println("Numero de ventanas: " + this.ventanas);
        System.out.println("Numnero de habitaciónes: "+this.habitaciones);
        System.out.println("Garage: " + this.garage);
        System.out.println("Patio: " + this.patio);
        System.out.println("Tipo de Techo: " + this.tipoTecho);
    }
    public static class Builder {
        private int puertas;
        private int ventanas;
        private int habitaciones;
        private String tipoTecho;
        private Boolean garage;
        private Boolean patio;

        public Builder puertas(int puertas){
           this.puertas = puertas;
           return this;
        }

        public Builder Ventanas(int ventanas) {
            this.ventanas = ventanas;
            return this;
        }

        public Builder habitaciones(int habitaciones){
            this.habitaciones = habitaciones;
            return this;
        }

        public Builder tipoTecho(String tipoTecho){
            this.tipoTecho = tipoTecho;
            return this;
        }

        public Builder garage(Boolean garage){
            this.garage = garage;
            return this;
        }

        public Builder patio(Boolean patio){
            this.patio = patio;
            return this;
        }

        public Casa build(){
            return new Casa(this);
        }
    }

    public int getPuertas() {
        return puertas;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public int getVentanas() {
        return ventanas;
    }

    public String getTipoTecho() {
        return tipoTecho;
    }

    public Boolean getGarage() {
        return garage;
    }

    public Boolean getPatio() {
        return patio;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void setTipoTecho(String tipoTecho) {
        this.tipoTecho = tipoTecho;
    }

    public void setGarage(Boolean garage) {
        this.garage = garage;
    }

    public void setPatio(Boolean patio) {
        this.patio = patio;
    }
}