package androidx.core.graphics;

import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class PathParser {
    private static final String LOGTAG = "PathParser";

    static float[] copyOfRange(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int iMin = Math.min(i3, length - i);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, i, fArr2, 0, iMin);
        return fArr2;
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        try {
            PathDataNode.nodesToPath(createNodesFromPathData(str), path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(String.valueOf(str)), e2);
        }
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 1;
        while (i2 < str.length()) {
            int iNextStart = nextStart(str, i2);
            String strTrim = str.substring(i, iNextStart).trim();
            if (!strTrim.isEmpty()) {
                addNode(arrayList, strTrim.charAt(0), getFloats(strTrim));
            }
            i = iNextStart;
            i2 = iNextStart + 1;
        }
        if (i2 - i == 1 && i < str.length()) {
            addNode(arrayList, str.charAt(i), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[0]);
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            pathDataNodeArr2[i] = new PathDataNode(pathDataNodeArr[i]);
        }
        return pathDataNodeArr2;
    }

    public static boolean canMorph(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            if (pathDataNodeArr[i].mType != pathDataNodeArr2[i].mType || pathDataNodeArr[i].mParams.length != pathDataNodeArr2[i].mParams.length) {
                return false;
            }
        }
        return true;
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i = 0; i < pathDataNodeArr2.length; i++) {
            pathDataNodeArr[i].mType = pathDataNodeArr2[i].mType;
            for (int i2 = 0; i2 < pathDataNodeArr2[i].mParams.length; i2++) {
                pathDataNodeArr[i].mParams[i2] = pathDataNodeArr2[i].mParams[i2];
            }
        }
    }

    private static int nextStart(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c, float[] fArr) {
        arrayList.add(new PathDataNode(c, fArr));
    }

    static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;

        ExtractFloatResult() {
        }
    }

    private static float[] getFloats(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                extract(str, i, extractFloatResult);
                int i3 = extractFloatResult.mEndPosition;
                if (i < i3) {
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                    i2++;
                }
                i = extractFloatResult.mEndWithNegOrDot ? i3 : i3 + 1;
            }
            return copyOfRange(fArr, 0, i2);
        } catch (NumberFormatException e2) {
            StringBuilder sb = new StringBuilder("error in parsing \"");
            sb.append(str);
            sb.append("\"");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0035  */
    private static void extract(String str, int i, ExtractFloatResult extractFloatResult) {
        extractFloatResult.mEndWithNegOrDot = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = i; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == ' ') {
                z2 = false;
                z3 = true;
            } else if (cCharAt != 'E' && cCharAt != 'e') {
                switch (cCharAt) {
                    case ',':
                        z2 = false;
                        z3 = true;
                        break;
                    case '-':
                        if (i2 == i || z2) {
                            z2 = false;
                        } else {
                            extractFloatResult.mEndWithNegOrDot = true;
                            z2 = false;
                            z3 = true;
                        }
                        break;
                    case '.':
                        if (z) {
                            extractFloatResult.mEndWithNegOrDot = true;
                            z2 = false;
                            z3 = true;
                        } else {
                            z2 = false;
                            z = true;
                        }
                        break;
                    default:
                        z2 = false;
                        break;
                }
            } else {
                z2 = true;
            }
            if (z3) {
                extractFloatResult.mEndPosition = i2;
            }
        }
        extractFloatResult.mEndPosition = i2;
    }

    public static void interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, float f, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3) {
        if (!interpolatePathDataNodes(pathDataNodeArr, pathDataNodeArr2, pathDataNodeArr3, f)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    @Deprecated
    public static boolean interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3, float f) {
        if (pathDataNodeArr.length != pathDataNodeArr2.length || pathDataNodeArr2.length != pathDataNodeArr3.length) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        if (!canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
            return false;
        }
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            pathDataNodeArr[i].interpolatePathDataNode(pathDataNodeArr2[i], pathDataNodeArr3[i], f);
        }
        return true;
    }

    public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
        float[] fArr = new float[6];
        char c = 'm';
        for (PathDataNode pathDataNode : pathDataNodeArr) {
            PathDataNode.addCommand(path, fArr, c, pathDataNode.mType, pathDataNode.mParams);
            c = pathDataNode.mType;
        }
    }

    public static class PathDataNode {
        public final float[] mParams;
        public char mType;

        public char getType() {
            return this.mType;
        }

        public float[] getParams() {
            return this.mParams;
        }

        PathDataNode(char c, float[] fArr) {
            this.mType = c;
            this.mParams = fArr;
        }

        PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            this.mParams = PathParser.copyOfRange(fArr, 0, fArr.length);
        }

        @Deprecated
        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            PathParser.nodesToPath(pathDataNodeArr, path);
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f) {
            this.mType = pathDataNode.mType;
            int i = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i >= fArr.length) {
                    return;
                }
                this.mParams[i] = (fArr[i] * (1.0f - f)) + (pathDataNode2.mParams[i] * f);
                i++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void addCommand(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            int i2;
            int i3;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            char c3 = c2;
            boolean z = false;
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr[2];
            float f18 = fArr[3];
            float f19 = fArr[4];
            float f20 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i2 = 7;
                    i = i2;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    i = i2;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                default:
                    i = 2;
                    break;
            }
            float f21 = f15;
            float f22 = f16;
            float f23 = f19;
            float f24 = f20;
            int i4 = 0;
            char c4 = c;
            while (i4 < fArr2.length) {
                if (c3 != 'A') {
                    if (c3 == 'C') {
                        i3 = i4;
                        int i5 = i3 + 2;
                        int i6 = i3 + 3;
                        int i7 = i3 + 4;
                        int i8 = i3 + 5;
                        path.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i5], fArr2[i6], fArr2[i7], fArr2[i8]);
                        f21 = fArr2[i7];
                        float f25 = fArr2[i8];
                        float f26 = fArr2[i5];
                        float f27 = fArr2[i6];
                        f22 = f25;
                        f18 = f27;
                        f17 = f26;
                    } else if (c3 != 'H') {
                        if (c3 == 'Q') {
                            i3 = i4;
                            int i9 = i3 + 1;
                            int i10 = i3 + 2;
                            int i11 = i3 + 3;
                            path.quadTo(fArr2[i3], fArr2[i9], fArr2[i10], fArr2[i11]);
                            f = fArr2[i3];
                            f2 = fArr2[i9];
                            f21 = fArr2[i10];
                            f22 = fArr2[i11];
                        } else if (c3 == 'V') {
                            i3 = i4;
                            path.lineTo(f21, fArr2[i3]);
                            f22 = fArr2[i3];
                        } else if (c3 != 'a') {
                            if (c3 != 'c') {
                                if (c3 != 'h') {
                                    if (c3 != 'q') {
                                        if (c3 != 'v') {
                                            if (c3 != 'L') {
                                                if (c3 == 'M') {
                                                    f9 = fArr2[i4];
                                                    f10 = fArr2[i4 + 1];
                                                    if (i4 > 0) {
                                                        path.lineTo(f9, f10);
                                                    } else {
                                                        path.moveTo(f9, f10);
                                                        f21 = f9;
                                                        f22 = f10;
                                                    }
                                                } else if (c3 == 'S') {
                                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                        f21 = (f21 * 2.0f) - f17;
                                                        f22 = (f22 * 2.0f) - f18;
                                                    }
                                                    float f28 = f21;
                                                    int i12 = i4 + 1;
                                                    int i13 = i4 + 2;
                                                    int i14 = i4 + 3;
                                                    path.cubicTo(f28, f22, fArr2[i4], fArr2[i12], fArr2[i13], fArr2[i14]);
                                                    f = fArr2[i4];
                                                    f2 = fArr2[i12];
                                                    f3 = fArr2[i13];
                                                    f4 = fArr2[i14];
                                                } else if (c3 == 'T') {
                                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                        f21 = (f21 * 2.0f) - f17;
                                                        f22 = (f22 * 2.0f) - f18;
                                                    }
                                                    int i15 = i4 + 1;
                                                    path.quadTo(f21, f22, fArr2[i4], fArr2[i15]);
                                                    i3 = i4;
                                                    f18 = f22;
                                                    f17 = f21;
                                                    f21 = fArr2[i4];
                                                    f22 = fArr2[i15];
                                                } else if (c3 == 'l') {
                                                    int i16 = i4 + 1;
                                                    path.rLineTo(fArr2[i4], fArr2[i16]);
                                                    f21 += fArr2[i4];
                                                    f8 = fArr2[i16];
                                                } else if (c3 == 'm') {
                                                    float f29 = fArr2[i4];
                                                    f21 += f29;
                                                    float f30 = fArr2[i4 + 1];
                                                    f22 += f30;
                                                    if (i4 > 0) {
                                                        path.rLineTo(f29, f30);
                                                    } else {
                                                        path.rMoveTo(f29, f30);
                                                    }
                                                } else if (c3 == 's') {
                                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                        f11 = f21 - f17;
                                                        f12 = f22 - f18;
                                                    } else {
                                                        f11 = 0.0f;
                                                        f12 = 0.0f;
                                                    }
                                                    int i17 = i4 + 1;
                                                    int i18 = i4 + 2;
                                                    int i19 = i4 + 3;
                                                    path.rCubicTo(f11, f12, fArr2[i4], fArr2[i17], fArr2[i18], fArr2[i19]);
                                                    f5 = fArr2[i4] + f21;
                                                    f6 = fArr2[i17] + f22;
                                                    f21 += fArr2[i18];
                                                    f7 = fArr2[i19];
                                                } else if (c3 == 't') {
                                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                        f13 = f21 - f17;
                                                        f14 = f22 - f18;
                                                    } else {
                                                        f14 = 0.0f;
                                                        f13 = 0.0f;
                                                    }
                                                    int i20 = i4 + 1;
                                                    path.rQuadTo(f13, f14, fArr2[i4], fArr2[i20]);
                                                    float f31 = f13 + f21;
                                                    f18 = f14 + f22;
                                                    f21 = fArr2[i4] + f21;
                                                    f22 = fArr2[i20] + f22;
                                                    f17 = f31;
                                                }
                                                i3 = i4;
                                                f24 = f22;
                                                f23 = f21;
                                            } else {
                                                int i21 = i4 + 1;
                                                path.lineTo(fArr2[i4], fArr2[i21]);
                                                f9 = fArr2[i4];
                                                f10 = fArr2[i21];
                                            }
                                            f21 = f9;
                                            f22 = f10;
                                        } else {
                                            path.rLineTo(0.0f, fArr2[i4]);
                                            f8 = fArr2[i4];
                                        }
                                        f22 += f8;
                                    } else {
                                        int i22 = i4 + 1;
                                        int i23 = i4 + 2;
                                        int i24 = i4 + 3;
                                        path.rQuadTo(fArr2[i4], fArr2[i22], fArr2[i23], fArr2[i24]);
                                        f5 = fArr2[i4] + f21;
                                        f6 = fArr2[i22] + f22;
                                        f21 += fArr2[i23];
                                        f7 = fArr2[i24];
                                    }
                                    f22 += f7;
                                    f17 = f5;
                                    f18 = f6;
                                } else {
                                    path.rLineTo(fArr2[i4], 0.0f);
                                    f21 += fArr2[i4];
                                }
                                i3 = i4;
                            } else {
                                int i25 = i4 + 2;
                                int i26 = i4 + 3;
                                int i27 = i4 + 4;
                                int i28 = i4 + 5;
                                path.rCubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i25], fArr2[i26], fArr2[i27], fArr2[i28]);
                                float f32 = fArr2[i25];
                                float f33 = fArr2[i26];
                                f3 = fArr2[i27] + f21;
                                f4 = fArr2[i28] + f22;
                                f = f32 + f21;
                                f2 = f33 + f22;
                            }
                            f21 = f3;
                            f22 = f4;
                            i3 = i4;
                        } else {
                            int i29 = i4 + 5;
                            int i30 = i4 + 6;
                            i3 = i4;
                            drawArc(path, f21, f22, fArr2[i29] + f21, fArr2[i30] + f22, fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                            f21 += fArr2[i29];
                            f22 += fArr2[i30];
                        }
                        f17 = f;
                        f18 = f2;
                    } else {
                        i3 = i4;
                        path.lineTo(fArr2[i3], f22);
                        f21 = fArr2[i3];
                    }
                    i4 = i3 + i;
                    c4 = c2;
                    c3 = c4;
                    z = false;
                } else {
                    i3 = i4;
                    int i31 = i3 + 5;
                    int i32 = i3 + 6;
                    drawArc(path, f21, f22, fArr2[i31], fArr2[i32], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                    f21 = fArr2[i31];
                    f22 = fArr2[i32];
                }
                f18 = f22;
                f17 = f21;
                i4 = i3 + i;
                c4 = c2;
                c3 = c4;
                z = false;
            }
            fArr[z ? 1 : 0] = f21;
            fArr[1] = f22;
            fArr[2] = f17;
            fArr[3] = f18;
            fArr[4] = f23;
            fArr[5] = f24;
        }

        private static void drawArc(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            float f8 = f5;
            float f9 = f6;
            while (true) {
                double radians = Math.toRadians(f7);
                double dCos = Math.cos(radians);
                double dSin = Math.sin(radians);
                double d3 = f;
                double d4 = f2;
                double d5 = f8;
                double d6 = ((d3 * dCos) + (d4 * dSin)) / d5;
                double d7 = f9;
                double d8 = ((((double) (-f)) * dSin) + (d4 * dCos)) / d7;
                float f10 = f9;
                double d9 = f4;
                double d10 = ((((double) f3) * dCos) + (d9 * dSin)) / d5;
                double d11 = ((((double) (-f3)) * dSin) + (d9 * dCos)) / d7;
                double d12 = d6 - d10;
                double d13 = d8 - d11;
                double d14 = (d6 + d10) / 2.0d;
                double d15 = (d8 + d11) / 2.0d;
                double d16 = (d12 * d12) + (d13 * d13);
                if (d16 == 0.0d) {
                    return;
                }
                double d17 = (1.0d / d16) - 0.25d;
                if (d17 < 0.0d) {
                    float fSqrt = (float) (Math.sqrt(d16) / 1.99999d);
                    f8 *= fSqrt;
                    f9 = fSqrt * f10;
                } else {
                    double dSqrt = Math.sqrt(d17);
                    double d18 = d12 * dSqrt;
                    double d19 = dSqrt * d13;
                    if (z == z2) {
                        d = d14 - d19;
                        d2 = d15 + d18;
                    } else {
                        d = d14 + d19;
                        d2 = d15 - d18;
                    }
                    double dAtan2 = Math.atan2(d8 - d2, d6 - d);
                    double dAtan3 = Math.atan2(d11 - d2, d10 - d) - dAtan2;
                    if (z2 != (dAtan3 >= 0.0d)) {
                        dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
                    }
                    double d20 = d * d5;
                    double d21 = d2 * d7;
                    arcToBezier(path, (d20 * dCos) - (d21 * dSin), (d20 * dSin) + (d21 * dCos), d5, d7, d3, d4, radians, dAtan2, dAtan3);
                    return;
                }
            }
        }

        private static void arcToBezier(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int iCeil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d7);
            double dSin = Math.sin(d7);
            double dCos2 = Math.cos(d8);
            double dSin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * dCos;
            double d13 = d4 * dSin;
            double d14 = d11 * dSin;
            double d15 = d4 * dCos;
            double d16 = d9 / ((double) iCeil);
            double d17 = d6;
            double d18 = (dSin2 * d12) - (dCos2 * d13);
            double d19 = (dSin2 * d14) + (dCos2 * d15);
            double d20 = d8;
            int i = 0;
            double d21 = d5;
            while (i < iCeil) {
                double d22 = d20 + d16;
                double dSin3 = Math.sin(d22);
                double dCos3 = Math.cos(d22);
                double d23 = d16;
                double d24 = (d + ((d10 * dCos) * dCos3)) - (d13 * dSin3);
                double d25 = d2 + (d10 * dSin * dCos3) + (d15 * dSin3);
                double d26 = (d12 * dSin3) - (d13 * dCos3);
                double d27 = (dSin3 * d14) + (dCos3 * d15);
                double d28 = d22 - d20;
                double dTan = Math.tan(d28 / 2.0d);
                double dSin4 = (Math.sin(d28) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) (d21 + (d18 * dSin4)), (float) (d17 + (d19 * dSin4)), (float) (d24 - (dSin4 * d26)), (float) (d25 - (dSin4 * d27)), (float) d24, (float) d25);
                i++;
                d17 = d25;
                d21 = d24;
                dSin = dSin;
                d20 = d22;
                d19 = d27;
                iCeil = iCeil;
                d18 = d26;
                dCos = dCos;
                d10 = d3;
                d16 = d23;
            }
        }
    }

    private PathParser() {
    }
}
