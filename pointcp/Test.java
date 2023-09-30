import java.util.Random;

/**
 * Test Performance of PointCP, PointCP2, PointCP3, PointCP5
 */
public class Test {

    private static final int ITERATIONS = 100000000;

    public static void main(String[] args) {
        Random r = new Random();
        PointCP point1 = new PointCP('C', r.nextDouble(), r.nextDouble());
        PointCP point2 = new PointCP('P', r.nextDouble(), r.nextDouble());
        PointCP2 point3 = new PointCP2('C',random.nextDouble(), random.nextDouble());
        PointCP3 point4 = new PointCP3('P',random.nextDouble(), random.nextDouble());
        PointCP5 point5 = new PointCP2('C',random.nextDouble(), random.nextDouble());
        PointCP5 point6 = new PointCP3('P',random.nextDouble(), random.nextDouble())

        long start, end, runTime;

        start = System.currentTimeMillis();

        // test PointCP (Polar)
        System.out.println("****** PointCP  Polar ******");
        testPointCP(point2);
        System.out.println("****** PointCP Polar ******" + "\n" + "\n");

        // test PointCP (Cartesian)
        System.out.println("****** PointCP Cartesian ******");
        testPointCP(point1);
        System.out.println("****** PointCP  Cartesian ******" + "\n" + "\n");

        // test PointCP2
        System.out.println("****** PointCP2 ******");
        testPointCP2Polar(point3);
        System.out.println("****** PointCP2 ******" + "\n" + "\n");

        // test PointCP3
        System.out.println("****** PointCP3 ******");
        testPointCP3Cartesian(point4);
        System.out.println("****** PointCP3 ******" + "\n" + "\n");

        // test PointCP5(Polar)
        System.out.println("****** PointCP5 Polar ******");
        testPointCP5Polar(point5);
        System.out.println("****** PointCP5 Polar ******" + "\n" + "\n");

        // test PointCP5(Cartesian)
        System.out.println("****** PointCP5 Cartesian ******");
        testPointCP5Cartesian(point6);
        System.out.println("****** PointCP5 Cartesian ******" + "\n" + "\n");

        end = System.currentTimeMillis();
        runTime = (end - start)/1000;
        System.out.println("Total run time of program: " + runTime + " s");

    }

    public static void testPointCP(PointCP pointCP) {
        Random r = new Random();
        long start, end, elapsed, total;

        double rotation = r.nextDouble();

        // test time of getX()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            pointCP.getX();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getX() in PointCP: " + elapsed + " ms");
        total = elapsed;

        // test time of getY()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            pointCP.getY();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getY() in PointCP: " + elapsed + " ms");
        total += elapsed;

        // test time of getRho()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            pointCP.getRho();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getRho() in PointCP: " + elapsed + " ms");
        total += elapsed;

        // test time of getTheta()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            pointCP.getTheta();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getTheta() in PointCP: " + elapsed + " ms");
        total += elapsed;

        // test time of getDistance()
        // `pointCP` type "Cartesian"
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            pointCP.getDistance(pointCP);
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getDistance() in PointCP: " + elapsed + " ms");
        total += elapsed;

        // test time of rotatePoint()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            pointCP.rotatePoint(rotation);
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for rotatePoint() in PointCP: " + elapsed + " ms");
        total += elapsed;

        System.out.println();
        System.out.println("*  Total time for pointCP: " + total + " ms");
    }

    public static void testPointCP2(PointCP2 pointCP) {
        Random r = new Random();
        long start, end, elapsed, total;

        double rotation = r.nextDouble();

        // test time of getX()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getX();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getX() in PointCP2: " + elapsed + " ms");
        total = elapsed;

        // test time of getY()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getY();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getY() in PointCP2: " + elapsed + " ms");
        total += elapsed;

        // test time of getRho()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getRho();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getRho() in PointCP2: " + elapsed + " ms");
        total += elapsed;

        // test time of getTheta()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getTheta();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getTheta() in PointCP2: " + elapsed + " ms");
        total += elapsed;

        // test time of getDistance()
        // `pointCP` type "Cartesian"
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getDistance(pointCP);
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getDistance() in PointCP2: " + elapsed + " ms");
        total += elapsed;

        // test time of rotatePoint()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.rotatePoint(rotation);
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for rotatePoint() in PointCP2: " + elapsed + " ms");
        total += elapsed;

        System.out.println();
        System.out.println("*  Total time for pointCP2: " + total + " ms");
    }

    public static void testPointCP3(PointCP3 pointCP) {
        Random r = new Random();
        long start, end, elapsed, total;

        double rotation = r.nextDouble();

        // test time of getX()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getX();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getX() in PointCP3: " + elapsed + " ms");
        total = elapsed;

        // test time of getY()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getY();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getY() in PointCP3: " + elapsed + " ms");
        total += elapsed;

        // test time of getRho()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getRho();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getRho() in PointCP3: " + elapsed + " ms");
        total += elapsed;

        // test time of getTheta()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getTheta();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getTheta() in PointCP3: " + elapsed + " ms");
        total += elapsed;

        // test time of getDistance()
        // `pointCP` type "Cartesian"
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getDistance(pointCP);
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getDistance() in PointCP3: " + elapsed + " ms");
        total += elapsed;

        // test time of rotatePoint()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.rotatePoint(rotation);
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for rotatePoint() in PointCP3: " + elapsed + " ms");
        total += elapsed;

        System.out.println();
        System.out.println("*  Total time for pointCP3: " + total + " ms");
    }

    public static void testPointCP5Polar(PointCP5 point) {
        Random r = new Random();
        long start, end, elapsed, total;

        double rotation = r.nextDouble();

        // test time of getX()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getX();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getX() in PointCP2: " + elapsed + " ms");
        total = elapsed;

        // test time of getY()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getY();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getY() in PointCP2: " + elapsed + " ms");
        total += elapsed;

        // test time of getRho()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getRho();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getRho() in PointCP2: " + elapsed + " ms");
        total += elapsed;

        // test time of getTheta()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getTheta();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getTheta() in PointCP2: " + elapsed + " ms");
        total += elapsed;

        // test time of getDistance()
        // `pointCP` type "Cartesian"
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getDistance(point);
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getDistance() in PointCP2: " + elapsed + " ms");
        total += elapsed;

        // test time of rotatePoint()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.rotatePoint(rotation);
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for rotatePoint() in PointCP2: " + elapsed + " ms");
        total += elapsed;

        System.out.println();
        System.out.println("*  Total time for pointCP2: " + total + " ms");
    }

    public static void testPointCP5Cartesian(PointCP5 point) {
        Random r = new Random();
        long start, end, elapsed, total;

        double rotation = r.nextDouble();

        // test time of getX()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getX();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getX() in PointCP3: " + elapsed + " ms");
        total = elapsed;

        // test time of getY()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getY();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getY() in PointCP3: " + elapsed + " ms");
        total += elapsed;

        // test time of getRho()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getRho();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getRho() in PointCP3: " + elapsed + " ms");
        total += elapsed;

        // test time of getTheta()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getTheta();
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getTheta() in PointCP3: " + elapsed + " ms");
        total += elapsed;

        // test time of getDistance()
        // `pointCP` type "Cartesian"
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.getDistance(point);
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for getDistance() in PointCP3: " + elapsed + " ms");
        total += elapsed;

        // test time of rotatePoint()
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            point.rotatePoint(rotation);
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("*  Elapsed time for rotatePoint() in PointCP3: " + elapsed + " ms");
        total += elapsed;

        System.out.println();
        System.out.println("*  Total time for pointCP3: " + total + " ms");
    }


}