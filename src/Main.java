public class Main {
    public static void main(String[] args) {
        System.out.println( Math.pow(4,2) );
        System.out.println( Math.ceil(5.1) );
        System.out.println( Math.floor(8.9) );
        System.out.println( Math.sqrt(64) );
        System.out.println( Math.round(12.34) );
        System.out.println( Math.round(12.56) );
        System.out.println( Math.max(7,3) );
        System.out.println( Math.min(7,3) );
        System.out.println( Math.max(2.3,5.6) );
        System.out.println( Math.min(2.3,5.6) );
        System.out.println( Math.abs(-213) );
        System.out.println( Math.abs(213) );
        System.out.println( Math.ceil(Math.sqrt(17)) );
        System.out.println( Math.random()*10 );

        Quiz test = new Quiz();
        test.one();
        test.one();
        test.two();
        test.one();
        test.two();


        test.one();
        test.three();
        test.two();
    }
}