package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class Easing {
    private static final String ACCELERATE = "cubic(0.4, 0.05, 0.8, 0.7)";
    private static final String ANTICIPATE = "cubic(0.36, 0, 0.66, -0.56)";
    private static final String ANTICIPATE_NAME = "anticipate";
    private static final String DECELERATE = "cubic(0.0, 0.0, 0.2, 0.95)";
    private static final String LINEAR = "cubic(1, 1, 0, 0)";
    private static final String OVERSHOOT = "cubic(0.34, 1.56, 0.64, 1)";
    private static final String OVERSHOOT_NAME = "overshoot";
    private static final String STANDARD = "cubic(0.4, 0.0, 0.2, 1)";
    String mStr = "identity";
    static Easing sDefault = new Easing();
    private static final String STANDARD_NAME = "standard";
    private static final String ACCELERATE_NAME = "accelerate";
    private static final String DECELERATE_NAME = "decelerate";
    private static final String LINEAR_NAME = "linear";
    public static String[] NAMED_EASING = {STANDARD_NAME, ACCELERATE_NAME, DECELERATE_NAME, LINEAR_NAME};

    public double get(double d) {
        return d;
    }

    public double getDiff(double d) {
        return 1.0d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x007a  */
    public static Easing getInterpolator(String str) {
        byte b;
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new CubicEasing(str);
        }
        if (str.startsWith("spline")) {
            return new StepCurve(str);
        }
        if (str.startsWith("Schlick")) {
            return new Schlick(str);
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1354466595:
                if (!str.equals(ACCELERATE_NAME)) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1263948740:
                if (!str.equals(DECELERATE_NAME)) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -1197605014:
                if (!str.equals(ANTICIPATE_NAME)) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1102672091:
                if (!str.equals(LINEAR_NAME)) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -749065269:
                if (!str.equals(OVERSHOOT_NAME)) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 1312628413:
                if (!str.equals(STANDARD_NAME)) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return new CubicEasing(ACCELERATE);
        }
        if (b == 1) {
            return new CubicEasing(DECELERATE);
        }
        if (b == 2) {
            return new CubicEasing(ANTICIPATE);
        }
        if (b == 3) {
            return new CubicEasing(LINEAR);
        }
        if (b == 4) {
            return new CubicEasing(OVERSHOOT);
        }
        if (b == 5) {
            return new CubicEasing(STANDARD);
        }
        PrintStream printStream = System.err;
        StringBuilder sb = new StringBuilder("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
        sb.append(Arrays.toString(NAMED_EASING));
        printStream.println(sb.toString());
        return sDefault;
    }

    public String toString() {
        return this.mStr;
    }

    static class CubicEasing extends Easing {
        private static double sDError = 1.0E-4d;
        private static double sError = 0.01d;
        double mX1;
        double mX2;
        double mY1;
        double mY2;

        CubicEasing(String str) {
            this.mStr = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.mX1 = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i);
            this.mY1 = Double.parseDouble(str.substring(i, iIndexOf3).trim());
            int i2 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i2);
            this.mX2 = Double.parseDouble(str.substring(i2, iIndexOf4).trim());
            int i3 = iIndexOf4 + 1;
            this.mY2 = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        CubicEasing(double d, double d2, double d3, double d4) {
            setup(d, d2, d3, d4);
        }

        void setup(double d, double d2, double d3, double d4) {
            this.mX1 = d;
            this.mY1 = d2;
            this.mX2 = d3;
            this.mY2 = d4;
        }

        private double getX(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.mX1 * d2 * d3 * d) + (this.mX2 * d3 * d * d) + (d * d * d);
        }

        private double getY(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.mY1 * d2 * d3 * d) + (this.mY2 * d3 * d * d) + (d * d * d);
        }

        private double getDiffX(double d) {
            double d2 = 1.0d - d;
            double d3 = this.mX1;
            double d4 = this.mX2;
            return (d2 * 3.0d * d2 * d3) + (d2 * 6.0d * d * (d4 - d3)) + (d * 3.0d * d * (1.0d - d4));
        }

        private double getDiffY(double d) {
            double d2 = 1.0d - d;
            double d3 = this.mY1;
            double d4 = this.mY2;
            return (d2 * 3.0d * d2 * d3) + (d2 * 6.0d * d * (d4 - d3)) + (d * 3.0d * d * (1.0d - d4));
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double getDiff(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > sDError) {
                d2 *= 0.5d;
                d3 = getX(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (getY(d5) - getY(d4)) / (getX(d5) - getX(d4));
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double get(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > sError) {
                d2 *= 0.5d;
                d3 = getX(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double x = getX(d4);
            double d5 = d3 + d2;
            double x2 = getX(d5);
            double y = getY(d4);
            return (((getY(d5) - y) * (d - x)) / (x2 - x)) + y;
        }
    }
}
