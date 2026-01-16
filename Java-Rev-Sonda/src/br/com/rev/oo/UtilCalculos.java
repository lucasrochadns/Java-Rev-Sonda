package br.com.rev.oo;

public class UtilCalculos {

        public static Double areaTriangle (Double xA, Double xB, Double xC){
            double p = (xA + xB + xC) / 2;
            return Math.sqrt(p *(p - xA) * (p - xB) * (p - xC));
        }
}
