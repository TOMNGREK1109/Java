package mondai13;

public abstract class Shape {
    public abstract String toString();
    public abstract void draw();

    public void print(){
        
    }
        @Override
        public String toString() {
            return "Point";
        }

        @Override
        public void draw() {
            System.out.println("+");
        }
    
}
