package Liquid;

    abstract public class Liquid {
        String name;
        String state;
        double mass;
        double volume;
      double t;

        public Liquid(String name, String state, double mass, double volume,double t) {
            this.name=name;
            this.state=state;
            this.mass=mass;
            this.volume=volume;
            this.t=t;
        }

        public abstract double density ();
        public abstract  double BoilingT();


}
