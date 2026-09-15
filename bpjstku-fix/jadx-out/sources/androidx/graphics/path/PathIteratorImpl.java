package androidx.graphics.path;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b!\u0018\u0000 *2\u00020\u0001:\u0001*B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u000bH'¢\u0006\u0004\b\u0017\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH'¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)"}, d2 = {"Landroidx/graphics/path/PathIteratorImpl;", "", "Landroid/graphics/Path;", "p0", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "p1", "", "p2", "<init>", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)V", "", "", "calculateSize", "(Z)I", "", "Landroidx/graphics/path/PathSegment$Type;", "", "Landroid/graphics/PointF;", "floatsToPoints", "([FLandroidx/graphics/path/PathSegment$Type;)[Landroid/graphics/PointF;", "hasNext", "()Z", "Landroidx/graphics/path/PathSegment;", "next", "()Landroidx/graphics/path/PathSegment;", "([FI)Landroidx/graphics/path/PathSegment$Type;", "peek", "()Landroidx/graphics/path/PathSegment$Type;", "conicEvaluation", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "getConicEvaluation", "()Landroidx/graphics/path/PathIterator$ConicEvaluation;", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "pointsData", "[F", "tolerance", "F", "getTolerance", "()F", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PathIteratorImpl {
    private static final byte[] $$a;
    private static final byte[] $$d;
    private final PathIterator.ConicEvaluation conicEvaluation;
    private final Path path;
    private final float[] pointsData;
    private final float tolerance;
    private static final int $$e = 171;
    private static final int $$b = 158;
    private static final Companion Companion = new Companion(null);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = 106 - r6
            int r5 = r5 + 98
            int r0 = 21 - r7
            byte[] r1 = androidx.graphics.path.PathIteratorImpl.$$a
            byte[] r0 = new byte[r0]
            int r7 = 20 - r7
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L20:
            int r3 = r3 + 1
            r4 = r1[r6]
        L24:
            int r6 = r6 + 1
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-5)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.graphics.path.PathIteratorImpl.a(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 53
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r1 = androidx.graphics.path.PathIteratorImpl.$$d
            int r5 = r5 * 4
            int r5 = r5 + 84
            byte[] r0 = new byte[r0]
            int r7 = r7 + 52
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r6
            r5 = r7
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2b:
            int r6 = r6 + 1
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-10)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.graphics.path.PathIteratorImpl.b(int, int, int, java.lang.Object[]):void");
    }

    public abstract int calculateSize(boolean p0);

    public abstract boolean hasNext();

    public abstract PathSegment.Type next(float[] p0, int p1);

    public abstract PathSegment.Type peek();

    public PathIteratorImpl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f) {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(conicEvaluation, "");
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = f;
        this.pointsData = new float[8];
    }

    public final Path getPath() {
        return this.path;
    }

    public /* synthetic */ PathIteratorImpl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i & 2) != 0 ? PathIterator.ConicEvaluation.AsQuadratics : conicEvaluation, (i & 4) != 0 ? 0.25f : f);
    }

    public final PathIterator.ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    public final float getTolerance() {
        return this.tolerance;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/graphics/path/PathIteratorImpl$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        byte[] bArr = {22, 102, 43, -6, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
        $$d = bArr;
        byte[] bArr2 = {70, -114, 113, 8, 42, -9, 2, -14, -49, 4, -26, 16, 46, -67, 6, -18, 2, 52, -41, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, 52, -26, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, 4, -26, 16, 46, -67, 6, -18, 2, 52, -42, -38, -3, 4, -10, 2, -3, -20, 29, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, 52, -26, -46, 6, -23, -5, -3, -20, 44, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, -8, 9, -8, 19, -34, 2, -21, 12, -22, -12, -8, 9, -8, 19, -34, 2, -21, 12, -22, -12, 68};
        $$a = bArr2;
        byte b = (byte) 0;
        Object[] objArr = new Object[1];
        a(b, (byte) (b | 102), (byte) (bArr2[11] - 1), objArr);
        String str = (String) objArr[0];
        ClassLoader classLoader = PathIteratorImpl.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.MeasureSpec.getSize(0) + 3414), 1559 - ExpandableListView.getPackedPositionGroup(0L), View.combineMeasuredStates(0, 0) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {str, classLoader, false, 1760643887, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1760643887};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 43043);
                int iRgb = Color.rgb(0, 0, 0) + 16780327;
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
                byte b2 = (byte) (bArr[7] - 1);
                byte b3 = b2;
                Object[] objArr4 = new Object[1];
                b(b2, b3, b3, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iRgb, threadPriority, -675216362, false, (String) objArr4[0], new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 518, Color.blue(0) + 76), Integer.TYPE});
            }
            Object[] objArr5 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr5[1])[0];
            int i2 = ((int[]) objArr5[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr5[0])[0];
                int i4 = ((int[]) objArr5[2])[0];
                int i5 = ((int[]) objArr5[1])[0];
                String[] strArr = (String[]) objArr5[3];
                int iMyPid = Process.myPid();
                int i6 = i3 + (((~((-39724737) | iMyPid)) | 1342246930) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 826961448 + ((~((~iMyPid) | (-39724737))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
                Object[] objArr6 = {new int[1], new int[]{i5}, new int[]{i4}, strArr};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr5[3];
                if (strArr2 != null) {
                    for (String str2 : strArr2) {
                        arrayList.add(str2);
                    }
                }
                Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                int i9 = ((int[]) objArr5[0])[0];
                int i10 = ((int[]) objArr5[2])[0];
                int i11 = ((int[]) objArr5[1])[0];
                String[] strArr3 = (String[]) objArr5[3];
                int[] iArr = {i10};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i12 = ~iUptimeMillis;
                int i13 = ~(133244513 | i12);
                int i14 = i9 + (-549940702) + ((1477349504 | i13) * (-712)) + (((~(iUptimeMillis | 1610594017)) | (~(i12 | (-1477349505)))) * (-712)) + (((-1571786946) | i13) * 712);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
                Object[] objArr7 = {new int[1], new int[]{i11}, iArr, strArr3};
            }
            try {
                byte[] bArr3 = $$a;
                Object[] objArr8 = new Object[1];
                a(bArr3[3], (byte) 97, bArr3[9], objArr8);
                Class<?> cls = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                a(bArr3[3], (byte) 81, b, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                byte b4 = bArr3[3];
                Object[] objArr10 = new Object[1];
                a(b4, (byte) (b4 | 53), (byte) (-bArr3[38]), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                a((byte) (-bArr3[38]), bArr3[12], (byte) (-bArr3[21]), objArr11);
                Object objInvoke = cls.getMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0]);
                Object[] objArr12 = new Object[1];
                a(bArr3[3], (byte) 37, bArr3[14], objArr12);
                Class<?> cls4 = Class.forName((String) objArr12[0]);
                byte b5 = (byte) (-bArr3[38]);
                byte b6 = (byte) (-bArr3[37]);
                Object[] objArr13 = new Object[1];
                a(b5, b6, (byte) (b6 & 15), objArr13);
                Object objInvoke2 = cls4.getMethod((String) objArr13[0], new Class[0]).invoke(PathIteratorImpl.class, new Object[0]);
                if (Build.VERSION.SDK_INT > 24) {
                    Object[] objArr14 = new Object[1];
                    a((byte) (-bArr3[58]), b, bArr3[41], objArr14);
                    Method declaredMethod = cls.getDeclaredMethod((String) objArr14[0], cls2, cls3);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, objInvoke2, str);
                    return;
                }
                byte b7 = (byte) (-bArr3[58]);
                byte b8 = b7;
                Object[] objArr15 = new Object[1];
                a(b7, b8, b8, objArr15);
                Method declaredMethod2 = cls.getDeclaredMethod((String) objArr15[0], cls3, cls2);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(objInvoke, str, objInvoke2);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause == null) {
                    throw e2;
                }
                throw cause;
            }
        } catch (Throwable th) {
            Throwable cause2 = th.getCause();
            if (cause2 == null) {
                throw th;
            }
            throw cause2;
        }
    }

    public static /* synthetic */ PathSegment.Type next$default(PathIteratorImpl pathIteratorImpl, float[] fArr, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: next");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return pathIteratorImpl.next(fArr, i);
    }

    public final PathSegment next() {
        PathSegment.Type next = next(this.pointsData, 0);
        if (next == PathSegment.Type.Done) {
            return PathSegmentUtilities.getDoneSegment();
        }
        if (next == PathSegment.Type.Close) {
            return PathSegmentUtilities.getCloseSegment();
        }
        return new PathSegment(next, floatsToPoints(this.pointsData, next), next == PathSegment.Type.Conic ? this.pointsData[6] : 0.0f);
    }

    private final PointF[] floatsToPoints(float[] p0, PathSegment.Type p1) {
        int i = WhenMappings.$EnumSwitchMapping$0[p1.ordinal()];
        if (i == 1) {
            return new PointF[]{new PointF(p0[0], p0[1])};
        }
        if (i == 2) {
            return new PointF[]{new PointF(p0[0], p0[1]), new PointF(p0[2], p0[3])};
        }
        if (i == 3 || i == 4) {
            return new PointF[]{new PointF(p0[0], p0[1]), new PointF(p0[2], p0[3]), new PointF(p0[4], p0[5])};
        }
        if (i == 5) {
            return new PointF[]{new PointF(p0[0], p0[1]), new PointF(p0[2], p0[3]), new PointF(p0[4], p0[5]), new PointF(p0[6], p0[7])};
        }
        return new PointF[0];
    }
}
