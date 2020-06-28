package homework.shapes;

import java.util.Collection;

public class ShapeService {
    //public double calcRecSquare(Collection<? extends IRectangle> collection){
    public double calcRecSquare(Collection<? super Square> collection){

        double result = 0;

        for (Object o: collection) {
            if(o instanceof Rectangle) {
                Rectangle rec = (Rectangle) o;
                result += rec.sqr();
            }
        }


        return result;
    }
    public double calcRecPerimetr(Collection<? extends IRectangle> collection){
        double result = 0;

        for (IRectangle o: collection) {
            result += o.perimetr();
        }


        return result;
    }

    public double calcCircleSquare(Collection<? extends ICircle> collection){
        double result = 0;

        for (ICircle o: collection) {
            result += o.sqr();
        }


        return result;
    }

    public double calcCircleCircumference(Collection<? extends ICircle> collection){
        double result = 0;

        for (ICircle o: collection) {
            result += o.circumference();
        }


        return result;
    }


}
