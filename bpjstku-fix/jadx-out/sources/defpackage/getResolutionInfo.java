package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class getResolutionInfo extends Fragment {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f972a;
    private static int asBinder;
    private static long asInterface;
    private static int g;
    RequestManager TuitionPaymentFragmentbindingInflater1;
    Fragment TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final notifyOnImageCloseListeners TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Set<getResolutionInfo> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final getUseCaseConfigBuilder b;
    private getResolutionInfo d;
    private static final byte[] $$c = {49, 84, -120, 101};
    private static final int $$f = 47;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 103 - r6
            int r8 = r8 + 1
            int r7 = r7 + 4
            byte[] r0 = defpackage.getResolutionInfo.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r6 = r7
            r3 = r8
            r4 = r2
            goto L23
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r3 = r0[r7]
        L23:
            int r7 = r7 + 1
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getResolutionInfo.e(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.getResolutionInfo.$$d
            int r7 = r7 + 79
            int r8 = r8 + 4
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L29
        L10:
            r3 = r2
        L11:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L29:
            int r8 = r8 + r7
            int r7 = r8 + (-2)
            r8 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getResolutionInfo.f(byte, byte, short, java.lang.Object[]):void");
    }

    public getResolutionInfo() {
        this(new notifyOnImageCloseListeners());
    }

    private getResolutionInfo(notifyOnImageCloseListeners notifyonimagecloselisteners) {
        this.b = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new HashSet();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = notifyonimagecloselisteners;
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $11 + 89;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(f972a[i * i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cResolveSize = (char) View.resolveSize(0, 0);
                        int iLastIndexOf = 2186 - TextUtils.lastIndexOf("", '0', 0);
                        int i6 = 39 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        byte b = (byte) ($$f & 2);
                        byte b2 = (byte) (b - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, iLastIndexOf, i6, 841711447, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(asInterface), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33018 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 3012, 26 - Color.argb(0, 0, 0, 0), 321985076, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char size = (char) (36505 - View.MeasureSpec.getSize(0));
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3376;
                                int size2 = 17 - View.MeasureSpec.getSize(0);
                                byte b5 = (byte) ($$f & 1);
                                byte b6 = (byte) (b5 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, scrollBarFadeDuration, size2, -968507904, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } else {
                int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(f972a[i + i7])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int iArgb = 2187 - Color.argb(0, 0, 0, 0);
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 40;
                    byte b7 = (byte) ($$f & 2);
                    byte b8 = (byte) (b7 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iArgb, touchSlop, 841711447, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(asInterface), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33017 - KeyEvent.normalizeMetaState(0)), 3012 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 26, 321985076, false, $$g(b9, b10, b10), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char tapTimeout = (char) (36505 - (ViewConfiguration.getTapTimeout() >> 16));
                    int i8 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3377;
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 17;
                    byte b11 = (byte) ($$f & 1);
                    byte b12 = (byte) (b11 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(tapTimeout, i8, threadPriority, -968507904, false, $$g(b11, b12, b12), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i9 = $11 + 1;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 36506);
                    int i10 = 3376 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iIndexOf = 17 - TextUtils.indexOf("", "", 0);
                    byte b13 = (byte) ($$f & 1);
                    byte b14 = (byte) (b13 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf2, i10, iIndexOf, -968507904, false, $$g(b13, b14, b14), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                throw null;
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr9 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char keyRepeatTimeout = (char) (36505 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                int iAxisFromString = MotionEvent.axisFromString("") + 3377;
                int iArgb2 = 17 - Color.argb(0, 0, 0, 0);
                byte b15 = (byte) ($$f & 1);
                byte b16 = (byte) (b15 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(keyRepeatTimeout, iAxisFromString, iArgb2, -968507904, false, $$g(b15, b16, b16), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9);
        }
        objArr[0] = new String(cArr);
        int i11 = $11 + 57;
        $10 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    void b(Activity activity) {
        int i = 2 % 2;
        getResolutionInfo getresolutioninfo = this.d;
        if (getresolutioninfo != null) {
            getresolutioninfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remove(this);
            this.d = null;
            int i2 = g + 17;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        }
        getResolutionInfo getresolutioninfoB = Glide.b(activity).g.b(activity.getFragmentManager(), (Fragment) null);
        this.d = getresolutioninfoB;
        if (equals(getresolutioninfoB)) {
            return;
        }
        int i4 = g + 51;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        } else {
            this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
            int i5 = 96 / 0;
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(activity);
        try {
            b(activity);
            int i4 = asBinder + 87;
            g = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 48 / 0;
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022 A[PHI: r1
  0x0022: PHI (r1v5 getResolutionInfo) = (r1v4 getResolutionInfo), (r1v10 getResolutionInfo) binds: [B:8:0x0020, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Fragment
    public final void onDetach() {
        getResolutionInfo getresolutioninfo;
        int i = 2 % 2;
        int i2 = asBinder + 101;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDetach();
            getresolutioninfo = this.d;
            int i3 = 69 / 0;
            if (getresolutioninfo != null) {
                getresolutioninfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remove(this);
                this.d = null;
            }
        } else {
            super.onDetach();
            getresolutioninfo = this.d;
            if (getresolutioninfo != null) {
                getresolutioninfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remove(this);
                this.d = null;
            }
        }
        int i4 = asBinder + 51;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements getUseCaseConfigBuilder {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{fragment=");
            sb.append(getResolutionInfo.this);
            sb.append("}");
            return sb.toString();
        }
    }

    @Override // android.app.Fragment
    public final void onStart() throws Throwable {
        Object[] objArr;
        String str;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        char c;
        int i;
        Object[] objArr5;
        int i2;
        String str2;
        Object[] objArr6;
        String str3;
        Object[] objArr7;
        int i3;
        Object[] objArr8;
        int i4;
        Object[] objArr9;
        Object[] objArr10;
        Object[] objArr11;
        int i5;
        int i6 = 2 % 2;
        Object[] objArr12 = new Object[1];
        c(31 - TextUtils.lastIndexOf("", '0'), 22 - ExpandableListView.getPackedPositionGroup(0L), (char) (Drawable.resolveOpacity(0, 0) + 12304), objArr12);
        String str4 = (String) objArr12[0];
        Object[] objArr13 = new Object[1];
        c(54 - View.combineMeasuredStates(0, 0), 15 - TextUtils.getCapsMode("", 0, 0), (char) ExpandableListView.getPackedPositionGroup(0L), objArr13);
        String str5 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        c(ViewConfiguration.getScrollBarFadeDuration() >> 16, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr14);
        String str6 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        c(16 - KeyEvent.getDeadChar(0, 0), 16 - TextUtils.getOffsetBefore("", 0), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), objArr15);
        String str7 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        c(ExpandableListView.getPackedPositionChild(0L) + 70, 26 - Color.alpha(0), (char) (49011 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr16);
        String str8 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        c(Process.getGidForName("") + 96, 18 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (65334 - (ViewConfiguration.getTouchSlop() >> 8)), objArr17);
        String str9 = (String) objArr17[0];
        int i7 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i8 = ~iIdentityHashCode;
        int i9 = ~((-673735193) | i8);
        int i10 = ~(1503722735 | iIdentityHashCode);
        if (i7 != (-328519600) + ((i9 | i10) * 1150) + (((~((-1503722736) | i8)) | i10) * (-575)) + (((~(i8 | 673735192)) | (~((-673735193) | iIdentityHashCode))) * 575)) {
            int i11 = (-1041637468) % 2;
            throw new ArithmeticException();
        }
        int i12 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMyPid = Process.myPid();
        int i13 = ~iMyPid;
        if (i12 != (-1091459136) + (((~((-1670710040) | i13)) | 908345925) * 226) + (((~(i13 | (-1100022035))) | 337657920 | (~((-908345926) | iMyPid))) * (-113)) + ((~(iMyPid | (-1670710040))) * 113)) {
            int i14 = 1477013968 % 2;
            throw new ArithmeticException();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cBlue = (char) (29944 - Color.blue(0));
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1756;
            int packedPositionChild = 22 - ExpandableListView.getPackedPositionChild(0L);
            byte[] bArr = $$a;
            byte b = bArr[10];
            short s = bArr[7];
            Object[] objArr18 = new Object[1];
            e(b, s, (byte) (s | 37), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, bitsPerPixel, packedPositionChild, 986134021, false, (String) objArr18[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29945);
                int iRgb = Color.rgb(0, 0, 0) + 16778971;
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 23;
                byte[] bArr2 = $$a;
                Object[] objArr19 = new Object[1];
                e(bArr2[10], (short) (bArr2[208] - 1), (byte) 52, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iRgb, edgeSlop, 1599039318, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr20[0])[0]}, new int[]{((int[]) objArr20[1])[0]}, (Object[]) objArr20[2], new int[1], (String[]) objArr20[4]};
            int i15 = (~Process.myTid()) | 749085360;
            int i16 = 615340712 + (i15 * 495) + (((~i15) | 537141888) * 495) + 1009432731;
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr[3])[0] = i18 ^ (i18 << 5);
            str5 = str5;
        } else {
            int iIntValue = ((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr21 = {-1144320170};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - TextUtils.getOffsetBefore("", 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1727, 29 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrB$7879113 = onScroll.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr21), 1009432731, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (29945 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int iRgb2 = Color.rgb(0, 0, 0) + 16778971;
                    int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte[] bArr3 = $$a;
                    Object[] objArr22 = new Object[1];
                    e(bArr3[10], (short) (bArr3[208] - 1), (byte) 52, objArr22);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iRgb2, iIndexOf, 1599039318, false, (String) objArr22[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$7879113);
                try {
                    long jLongValue = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char mirror = (char) (29992 - AndroidCharacter.getMirror('0'));
                        int windowTouchSlop = 1755 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 24;
                        byte[] bArr4 = $$a;
                        Object[] objArr23 = new Object[1];
                        e(bArr4[10], (short) (bArr4[0] + 1), (byte) 52, objArr23);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mirror, windowTouchSlop, modifierMetaStateMask, 1596667560, false, (String) objArr23[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
                        int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 1756;
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23;
                        byte[] bArr5 = $$a;
                        byte b2 = bArr5[10];
                        short s2 = bArr5[7];
                        Object[] objArr24 = new Object[1];
                        e(b2, s2, (byte) (s2 | 37), objArr24);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollDefaultDelay, modifierMetaStateMask2, doubleTapTimeout, 986134021, false, (String) objArr24[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArrB$7879113;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i19 = ((int[]) objArr[1])[0];
        int i20 = ((int[]) objArr[0])[0];
        if (i20 != i19) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str10 : strArr) {
                    arrayList.add(str10);
                }
            }
            throw new RuntimeException(String.valueOf(i20));
        }
        int i21 = g + 51;
        asBinder = i21 % 128;
        int i22 = i21 % 2;
        int i23 = ((int[]) objArr[3])[0];
        Object[] objArr25 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i24 = ~iIdentityHashCode2;
        int i25 = (~((-847144384) | i24)) | 304881722;
        int i26 = ~(iIdentityHashCode2 | (-92279297));
        int i27 = i23 + (-1355595787) + ((i25 | i26) * (-502)) + ((i26 | (~(i24 | (-542262662)))) * TypedValues.PositionType.TYPE_DRAWPATH);
        int i28 = (i27 << 13) ^ i27;
        int i29 = i28 ^ (i28 >>> 17);
        ((int[]) objArr25[3])[0] = i29 ^ (i29 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char mirror2 = (char) ('0' - AndroidCharacter.getMirror('0'));
            int i30 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2267;
            int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 34;
            byte[] bArr6 = $$a;
            Object[] objArr26 = new Object[1];
            e(bArr6[10], (short) (bArr6[208] - 1), (byte) 52, objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(mirror2, i30, modifierMetaStateMask3, -887667012, false, (String) objArr26[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                int absoluteGravity = 2267 - Gravity.getAbsoluteGravity(0, 0);
                int bitsPerPixel2 = 32 - ImageFormat.getBitsPerPixel(0);
                byte[] bArr7 = $$a;
                byte b3 = bArr7[10];
                short s3 = bArr7[7];
                Object[] objArr27 = new Object[1];
                e(b3, s3, (byte) (s3 | 37), objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cResolveOpacity, absoluteGravity, bitsPerPixel2, -654680577, false, (String) objArr27[0], null);
            }
            Object[] objArr28 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr28[0])[0];
            int i32 = ((int[]) objArr28[3])[0];
            String[] strArr2 = (String[]) objArr28[1];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i33 = ~iFreeMemory;
            int i34 = ~(379513681 | i33);
            int i35 = (((1825373483 + ((151064578 | i34) * (-712))) + (((~(iFreeMemory | 530578259)) | (~(i33 | (-151064579)))) * (-712))) + (((-429199635) | i34) * 712)) - 2087105531;
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr2[2])[0] = i37 ^ (i37 << 5);
            str9 = str9;
            str = str5;
        } else {
            Context applicationContext = (Context) Class.forName(str8).getMethod(str9, new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr29 = {applicationContext, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, -2087105531};
                byte[] bArr8 = $$d;
                Object[] objArr30 = new Object[1];
                f(bArr8[26], bArr8[19], bArr8[132], objArr30);
                Class<?> cls = Class.forName((String) objArr30[0]);
                Object[] objArr31 = new Object[1];
                f((byte) (-bArr8[276]), bArr8[5], bArr8[90], objArr31);
                Object[] objArr32 = (Object[]) cls.getMethod((String) objArr31[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr29);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                        char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                        int i38 = 2267 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i39 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32;
                        byte[] bArr9 = $$a;
                        byte b4 = bArr9[10];
                        short s4 = bArr9[7];
                        Object[] objArr33 = new Object[1];
                        e(b4, s4, (byte) (s4 | 37), objArr33);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf2, i38, i39, -654680577, false, (String) objArr33[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, objArr32);
                    try {
                        str = str5;
                        long jLongValue2 = ((Long) Class.forName(str4).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf3 = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                            char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2267;
                            int maximumDrawingCacheSize = 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            Object[] objArr34 = new Object[1];
                            e($$a[10], (short) 141, (byte) 52, objArr34);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c3, iKeyCodeFromString, maximumDrawingCacheSize, -874156483, false, (String) objArr34[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf3);
                        Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                            int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 2268;
                            int iIndexOf2 = TextUtils.indexOf("", "") + 33;
                            byte[] bArr10 = $$a;
                            Object[] objArr35 = new Object[1];
                            e(bArr10[10], (short) (bArr10[208] - 1), (byte) 52, objArr35);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cLastIndexOf, packedPositionChild2, iIndexOf2, -887667012, false, (String) objArr35[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf4);
                    } catch (Exception unused2) {
                        throw new RuntimeException();
                    }
                } else {
                    str9 = str9;
                    str = str5;
                    objArr32 = objArr32;
                }
                objArr2 = objArr32;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i40 = ((int[]) objArr2[3])[0];
        int i41 = ((int[]) objArr2[0])[0];
        if (i41 != i40) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr2[1];
            if (strArr3 != null) {
                int i42 = g + 27;
                asBinder = i42 % 128;
                int i43 = i42 % 2;
                for (String str11 : strArr3) {
                    arrayList2.add(str11);
                }
            }
            throw new RuntimeException(String.valueOf(i41));
        }
        Object[] objArr36 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i44 = ((int[]) objArr2[2])[0];
        int i45 = ((int[]) objArr2[0])[0];
        int i46 = ((int[]) objArr2[3])[0];
        String[] strArr4 = (String[]) objArr2[1];
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i47 = i44 + 1860739323 + (((~(iIdentityHashCode3 | 713525043)) | (-95188273)) * (-668)) + ((713525043 | (~((-95188273) | iIdentityHashCode3))) * 1336) + ((iIdentityHashCode3 | (-86536193)) * 668);
        int i48 = (i47 << 13) ^ i47;
        int i49 = i48 ^ (i48 >>> 17);
        ((int[]) objArr36[2])[0] = i49 ^ (i49 << 5);
        int i50 = g + 53;
        asBinder = i50 % 128;
        int i51 = i50 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char mirror3 = (char) (AndroidCharacter.getMirror('0') - '0');
            int doubleTapTimeout2 = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iMakeMeasureSpec = 10 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte[] bArr11 = $$a;
            Object[] objArr37 = new Object[1];
            e(bArr11[19], (short) 193, (byte) (-bArr11[9]), objArr37);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(mirror3, doubleTapTimeout2, iMakeMeasureSpec, -1199417970, false, (String) objArr37[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null);
        long jLongValue3 = ((Long) Class.forName(str4).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 876;
            int doubleTapTimeout3 = 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            byte[] bArr12 = $$a;
            byte b5 = (byte) (-bArr12[14]);
            Object[] objArr38 = new Object[1];
            e(b5, (short) (b5 | 200), bArr12[7], objArr38);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(scrollBarFadeDuration, scrollBarFadeDuration2, doubleTapTimeout3, 254769921, false, (String) objArr38[0], null);
        }
        if (j == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char c4 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                int i52 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 875;
                int iIndexOf3 = TextUtils.indexOf("", "", 0, 0) + 10;
                byte[] bArr13 = $$a;
                Object[] objArr39 = new Object[1];
                e(bArr13[19], (short) 203, bArr13[25], objArr39);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c4, i52, iIndexOf3, 1324201839, false, (String) objArr39[0], null);
            }
            Object[] objArr40 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr40[0])[0]}, new int[1], new int[]{((int[]) objArr40[2])[0]}, (String[]) objArr40[3]};
            int i53 = ~new Random().nextInt();
            int i54 = (-2084487820) + (((~(i53 | 872342099)) | 68652) * (-160)) + (((~(i53 | 832031870)) | 872342099) * 160) + 77341532;
            int i55 = (i54 << 13) ^ i54;
            int i56 = i55 ^ (i55 >>> 17);
            ((int[]) objArr3[1])[0] = i56 ^ (i56 << 5);
        } else {
            Object[] objArr41 = {Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), 77341532};
            byte[] bArr14 = $$d;
            Object[] objArr42 = new Object[1];
            f((byte) (bArr14[355] - 1), bArr14[4], (short) (bArr14[29] + 1), objArr42);
            Class<?> cls2 = Class.forName((String) objArr42[0]);
            Object[] objArr43 = new Object[1];
            f((byte) (-bArr14[369]), bArr14[5], (short) 105, objArr43);
            objArr3 = (Object[]) cls2.getMethod((String) objArr43[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr41);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                int iIndexOf4 = TextUtils.indexOf("", "") + 876;
                int modifierMetaStateMask4 = 9 - ((byte) KeyEvent.getModifierMetaStateMask());
                byte[] bArr15 = $$a;
                Object[] objArr44 = new Object[1];
                e(bArr15[19], (short) 203, bArr15[25], objArr44);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cNormalizeMetaState, iIndexOf4, modifierMetaStateMask4, 1324201839, false, (String) objArr44[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArr3);
            try {
                long jLongValue4 = ((Long) Class.forName(str4).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 876;
                    int offsetAfter = 10 - TextUtils.getOffsetAfter("", 0);
                    byte[] bArr16 = $$a;
                    byte b6 = (byte) (-bArr16[14]);
                    Object[] objArr45 = new Object[1];
                    e(b6, (short) (b6 | 200), bArr16[7], objArr45);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cArgb, deadChar, offsetAfter, 254769921, false, (String) objArr45[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                    char cBlue2 = (char) Color.blue(0);
                    int i57 = 876 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 10;
                    byte[] bArr17 = $$a;
                    Object[] objArr46 = new Object[1];
                    e(bArr17[19], (short) 193, (byte) (-bArr17[9]), objArr46);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cBlue2, i57, tapTimeout, -1199417970, false, (String) objArr46[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf6);
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        }
        int i58 = ((int[]) objArr3[2])[0];
        int i59 = ((int[]) objArr3[0])[0];
        if (i59 != i58) {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr5 = (String[]) objArr3[3];
            if (strArr5 != null) {
                for (String str12 : strArr5) {
                    arrayList3.add(str12);
                }
            }
            throw new RuntimeException(String.valueOf(i59));
        }
        int i60 = ((int[]) objArr3[1])[0];
        Object[] objArr47 = {new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
        int iIdentityHashCode4 = System.identityHashCode(this);
        int i61 = ~iIdentityHashCode4;
        int i62 = i60 + 1854270488 + (((~(682755324 | i61)) | 723065553) * (-90)) + (((~(682755324 | iIdentityHashCode4)) | 10617900) * (-45)) + (((~(iIdentityHashCode4 | (-723065554))) | 682755324 | (~(i61 | 723065553))) * 45);
        int i63 = (i62 << 13) ^ i62;
        int i64 = i63 ^ (i63 >>> 17);
        ((int[]) objArr47[1])[0] = i64 ^ (i64 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
            char c5 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
            int doubleTapTimeout4 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 651;
            int iGreen = Color.green(0) + 44;
            byte[] bArr18 = $$a;
            Object[] objArr48 = new Object[1];
            e(bArr18[10], (short) (bArr18[0] + 1), (byte) 52, objArr48);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c5, doubleTapTimeout4, iGreen, -459846511, false, (String) objArr48[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null);
        long jLongValue5 = ((Long) Class.forName(str4).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
            char bitsPerPixel3 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
            int packedPositionGroup = 651 - ExpandableListView.getPackedPositionGroup(0L);
            int i65 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43;
            byte[] bArr19 = $$a;
            Object[] objArr49 = new Object[1];
            e((byte) (bArr19[19] - 1), (short) 210, bArr19[7], objArr49);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(bitsPerPixel3, packedPositionGroup, i65, -873460649, false, (String) objArr49[0], null);
        }
        if (j2 == ((jLongValue5 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null) << 52) >>> 52)) >> 12)) {
            int i66 = g + 39;
            asBinder = i66 % 128;
            int i67 = i66 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char cIndexOf3 = (char) TextUtils.indexOf("", "", 0, 0);
                int fadingEdgeLength = 651 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 44;
                byte[] bArr20 = $$a;
                byte b7 = bArr20[10];
                short s5 = bArr20[7];
                Object[] objArr50 = new Object[1];
                e(b7, s5, (byte) (s5 | 37), objArr50);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cIndexOf3, fadingEdgeLength, edgeSlop2, -1595579076, false, (String) objArr50[0], null);
            }
            Object[] objArr51 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).get(null);
            objArr4 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i68 = ((int[]) objArr51[2])[0];
            int i69 = ((int[]) objArr51[0])[0];
            int i70 = ~((int) Process.getStartUptimeMillis());
            int i71 = (-627838047) + (((~(i70 | 997982063)) | (~((-989862150) | i70))) * (-184)) + ((5775362 | (~((-995637512) | i70)) | (~(992206701 | i70))) * 184) + 662349166;
            int i72 = (i71 << 13) ^ i71;
            int i73 = i72 ^ (i72 >>> 17);
            ((int[]) objArr4[3])[0] = i73 ^ (i73 << 5);
            c = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), 1610 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 25, 2145681644, false, null, new Class[0]);
            }
            Object[] objArr52 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).newInstance(null), 1093746918, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 651;
                int iIndexOf5 = 43 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte[] bArr21 = $$a;
                Object[] objArr53 = new Object[1];
                e((byte) (bArr21[19] - 1), (short) 210, bArr21[7], objArr53);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cMakeMeasureSpec, scrollBarSize, iIndexOf5, 2075921419, false, (String) objArr53[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 695, (ViewConfiguration.getFadingEdgeLength() >> 16) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - KeyEvent.normalizeMetaState(0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 793, 83 - TextUtils.getTrimmedLength("")), Integer.TYPE, Integer.TYPE});
            }
            objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).invoke(null, objArr52);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int iArgb = Color.argb(0, 0, 0, 0) + 651;
                int iIndexOf6 = 44 - TextUtils.indexOf("", "");
                byte[] bArr22 = $$a;
                byte b8 = bArr22[10];
                short s6 = bArr22[7];
                Object[] objArr54 = new Object[1];
                e(b8, s6, (byte) (s6 | 37), objArr54);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cMyPid, iArgb, iIndexOf6, -1595579076, false, (String) objArr54[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, objArr4);
            try {
                long jLongValue6 = ((Long) Class.forName(str4).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue6);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                    char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                    int packedPositionChild3 = 650 - ExpandableListView.getPackedPositionChild(0L);
                    int i74 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43;
                    byte[] bArr23 = $$a;
                    Object[] objArr55 = new Object[1];
                    e((byte) (bArr23[19] - 1), (short) 210, bArr23[7], objArr55);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(cAxisFromString, packedPositionChild3, i74, -873460649, false, (String) objArr55[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue6 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                    char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                    int iGreen2 = Color.green(0) + 651;
                    int iIndexOf7 = TextUtils.indexOf((CharSequence) "", '0') + 45;
                    byte[] bArr24 = $$a;
                    Object[] objArr56 = new Object[1];
                    e(bArr24[10], (short) (bArr24[0] + 1), (byte) 52, objArr56);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cLastIndexOf2, iGreen2, iIndexOf7, -459846511, false, (String) objArr56[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf8);
                c = 0;
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        int i75 = ((int[]) objArr4[c])[c];
        int i76 = ((int[]) objArr4[2])[c];
        if (i76 == i75) {
            int i77 = asBinder + 97;
            g = i77 % 128;
            int i78 = i77 % 2;
            Object[] objArr57 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i79 = ((int[]) objArr4[3])[0];
            int i80 = ((int[]) objArr4[2])[0];
            int i81 = ((int[]) objArr4[0])[0];
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i82 = i79 + ((((~((-562908701) | iIdentityHashCode5)) | 554189824) * (-283)) - 2074638951) + ((~(iIdentityHashCode5 | (-8718877))) * 283);
            int i83 = i82 ^ (i82 << 13);
            int i84 = i83 ^ (i83 >>> 17);
            ((int[]) objArr57[3])[0] = i84 ^ (i84 << 5);
            i = 0;
        } else {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr6 = (String[]) objArr4[1];
            if (strArr6 != null) {
                for (String str13 : strArr6) {
                    arrayList4.add(str13);
                }
            }
            int[] iArr = new int[i76];
            int i85 = i76 - 1;
            iArr[i85] = 1;
            Toast.makeText((Context) null, iArr[((i76 * i85) % 2) - 1], 1).show();
            Object[] objArr58 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i86 = ((int[]) objArr4[3])[0];
            int i87 = ((int[]) objArr4[2])[0];
            int i88 = ((int[]) objArr4[0])[0];
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i89 = i86 + (((~((-447939686) | iIdentityHashCode6)) * 521) - 1680220404) + (((~((~iIdentityHashCode6) | (-447939686))) | (-452951808)) * 521);
            int i90 = (i89 << 13) ^ i89;
            int i91 = i90 ^ (i90 >>> 17);
            i = 0;
            ((int[]) objArr58[3])[0] = i91 ^ (i91 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(i, i);
            int iCombineMeasuredStates = 1031 - View.combineMeasuredStates(i, i);
            int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', i);
            Object[] objArr59 = new Object[1];
            e($$a[10], (short) 141, (byte) 52, objArr59);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cCombineMeasuredStates, iCombineMeasuredStates, iLastIndexOf, 1357589585, false, (String) objArr59[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).getLong(null);
        long jLongValue7 = ((Long) Class.forName(str4).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
            char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int iIndexOf8 = TextUtils.indexOf("", "") + 1031;
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 15;
            byte[] bArr25 = $$a;
            Object[] objArr60 = new Object[1];
            e(bArr25[10], (short) (bArr25[208] - 1), (byte) 52, objArr60);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(scrollBarSize2, iIndexOf8, jumpTapTimeout, 1344079056, false, (String) objArr60[0], null);
        }
        if (j3 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char doubleTapTimeout5 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int i92 = 1032 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int iArgb2 = Color.argb(0, 0, 0, 0) + 15;
                byte[] bArr26 = $$a;
                Object[] objArr61 = new Object[1];
                e((byte) (bArr26[19] - 1), (short) 210, bArr26[7], objArr61);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(doubleTapTimeout5, i92, iArgb2, 632103528, false, (String) objArr61[0], null);
            }
            Object[] objArr62 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).get(null);
            objArr5 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i93 = ((int[]) objArr62[3])[0];
            int i94 = ((int[]) objArr62[1])[0];
            String[] strArr7 = (String[]) objArr62[0];
            int i95 = (int) Runtime.getRuntime().totalMemory();
            int i96 = (-1304470575) + ((~(i95 | 565947440)) * 216);
            int i97 = ~i95;
            int i98 = ((i96 + ((868216054 | i97) * (-216))) + (((~(i97 | 565947440)) | (-321667271)) * 216)) - 1444668833;
            int i99 = (i98 << 13) ^ i98;
            int i100 = i99 ^ (i99 >>> 17);
            ((int[]) objArr5[2])[0] = i100 ^ (i100 << 5);
        } else {
            int iIntValue2 = ((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue();
            Object[] objArr63 = {-1144320170};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 46038), 1133 - ImageFormat.getBitsPerPixel(0), 18 - TextUtils.getOffsetBefore("", 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr64 = {Integer.valueOf(iIntValue2), 0, -1444668833, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).newInstance(objArr63), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                char c6 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i101 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 15;
                Object[] objArr65 = new Object[1];
                e($$a[10], (short) 141, (byte) 52, objArr65);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(c6, i101, iMakeMeasureSpec2, 1298546779, false, (String) objArr65[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1116 - ExpandableListView.getPackedPositionChild(0L), (Process.myTid() >> 22) + 17), Boolean.TYPE});
            }
            objArr5 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).invoke(null, objArr64);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                char c7 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int iNormalizeMetaState = 1031 - KeyEvent.normalizeMetaState(0);
                int scrollBarSize3 = (ViewConfiguration.getScrollBarSize() >> 8) + 15;
                byte[] bArr27 = $$a;
                Object[] objArr66 = new Object[1];
                e((byte) (bArr27[19] - 1), (short) 210, bArr27[7], objArr66);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(c7, iNormalizeMetaState, scrollBarSize3, 632103528, false, (String) objArr66[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, objArr5);
            try {
                long jLongValue8 = ((Long) Class.forName(str4).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf9 = Long.valueOf(jLongValue8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                    char cMyPid2 = (char) (Process.myPid() >> 22);
                    int iResolveOpacity = 1031 - Drawable.resolveOpacity(0, 0);
                    int i102 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14;
                    byte[] bArr28 = $$a;
                    Object[] objArr67 = new Object[1];
                    e(bArr28[10], (short) (bArr28[208] - 1), (byte) 52, objArr67);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(cMyPid2, iResolveOpacity, i102, 1344079056, false, (String) objArr67[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, lValueOf9);
                Long lValueOf10 = Long.valueOf(jLongValue8 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                    char c8 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int iAlpha = 1031 - Color.alpha(0);
                    int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0) + 15;
                    Object[] objArr68 = new Object[1];
                    e($$a[10], (short) 141, (byte) 52, objArr68);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c8, iAlpha, iMakeMeasureSpec3, 1357589585, false, (String) objArr68[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf10);
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
        }
        int i103 = ((int[]) objArr5[1])[0];
        int i104 = ((int[]) objArr5[3])[0];
        if (i104 == i103) {
            Object[] objArr69 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i105 = ((int[]) objArr5[2])[0];
            int i106 = ((int[]) objArr5[3])[0];
            int i107 = ((int[]) objArr5[1])[0];
            String[] strArr8 = (String[]) objArr5[0];
            int iNextInt = new Random().nextInt(1639598309);
            int i108 = i105 + ((~(iNextInt | (-589177144))) * TypedValues.CycleType.TYPE_EASING) + 672557869 + (((~((~iNextInt) | (-589177144))) | 279022720) * TypedValues.CycleType.TYPE_EASING);
            int i109 = (i108 << 13) ^ i108;
            int i110 = i109 ^ (i109 >>> 17);
            i2 = 0;
            ((int[]) objArr69[2])[0] = i110 ^ (i110 << 5);
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr9 = (String[]) objArr5[0];
            if (strArr9 != null) {
                int i111 = g + 99;
                asBinder = i111 % 128;
                int i112 = i111 % 2;
                for (String str14 : strArr9) {
                    arrayList5.add(str14);
                }
            }
            int[] iArr2 = new int[i104];
            int i113 = i104 - 1;
            iArr2[i113] = 1;
            Toast.makeText((Context) null, iArr2[((i104 * i113) % 2) - 1], 1).show();
            Object[] objArr70 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i114 = ((int[]) objArr5[2])[0];
            int i115 = ((int[]) objArr5[3])[0];
            int i116 = ((int[]) objArr5[1])[0];
            String[] strArr10 = (String[]) objArr5[0];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i117 = ~iIdentityHashCode7;
            int i118 = i114 + ((((~((-34361685) | i117)) | (~(243195743 | iIdentityHashCode7))) * 988) - 657511647) + (((~(iIdentityHashCode7 | (-35446111))) | 1084426 | (~(i117 | 243195743))) * 988);
            int i119 = (i118 << 13) ^ i118;
            int i120 = i119 ^ (i119 >>> 17);
            i2 = 0;
            ((int[]) objArr70[2])[0] = i120 ^ (i120 << 5);
        }
        super.onStart();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
            char c9 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', i2, i2) + 877;
            int i121 = 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            byte[] bArr29 = $$a;
            byte b9 = bArr29[10];
            short s7 = bArr29[7];
            Object[] objArr71 = new Object[1];
            e(b9, s7, (byte) (s7 | 37), objArr71);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(c9, iLastIndexOf2, i121, -1650998592, false, (String) objArr71[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).getLong(null);
        long jLongValue9 = ((Long) Class.forName(str4).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
            char cIndexOf4 = (char) TextUtils.indexOf("", "", 0, 0);
            int iLastIndexOf3 = 875 - TextUtils.lastIndexOf("", '0', 0, 0);
            int gidForName = Process.getGidForName("") + 11;
            byte[] bArr30 = $$a;
            Object[] objArr72 = new Object[1];
            e(bArr30[10], (short) (bArr30[208] - 1), (byte) 52, objArr72);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(cIndexOf4, iLastIndexOf3, gidForName, 2012020043, false, (String) objArr72[0], null);
        }
        if (j4 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                char c10 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 876;
                int i122 = 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                Object[] objArr73 = new Object[1];
                e($$a[10], (short) 141, (byte) 52, objArr73);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(c10, longPressTimeout, i122, 2012931276, false, (String) objArr73[0], null);
            }
            Object[] objArr74 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).get(null);
            objArr6 = new Object[]{new int[]{((int[]) objArr74[0])[0]}, new int[1], new int[]{((int[]) objArr74[2])[0]}, (String[]) objArr74[3]};
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i123 = 1107050084 + (((~(774394875 | iIdentityHashCode8)) | (-814705105)) * (-948)) + ((~((~iIdentityHashCode8) | (-277293057))) * (-948)) + 83339929;
            int i124 = (i123 << 13) ^ i123;
            int i125 = i124 ^ (i124 >>> 17);
            ((int[]) objArr6[1])[0] = i125 ^ (i125 << 5);
            str2 = str9;
        } else {
            str2 = str9;
            Context applicationContext2 = (Context) Class.forName(str8).getMethod(str2, new Class[0]).invoke(null, null);
            if (applicationContext2 != null) {
                applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : applicationContext2.getApplicationContext();
            }
            Object[] objArr75 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, -484405987};
            byte b10 = (byte) ($$e & 381);
            byte[] bArr31 = $$d;
            byte b11 = bArr31[145];
            Object[] objArr76 = new Object[1];
            f(b10, b11, (short) (b11 | 137), objArr76);
            Class<?> cls3 = Class.forName((String) objArr76[0]);
            Object[] objArr77 = new Object[1];
            f((byte) (-bArr31[369]), bArr31[5], (short) 105, objArr77);
            Object[] objArr78 = (Object[]) cls3.getMethod((String) objArr77[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr75);
            if (applicationContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                    char c11 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
                    int modifierMetaStateMask5 = ((byte) KeyEvent.getModifierMetaStateMask()) + 11;
                    Object[] objArr79 = new Object[1];
                    e($$a[10], (short) 141, (byte) 52, objArr79);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(c11, keyRepeatTimeout, modifierMetaStateMask5, 2012931276, false, (String) objArr79[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, objArr78);
                try {
                    long jLongValue10 = ((Long) Class.forName(str4).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                        char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
                        int i126 = 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte[] bArr32 = $$a;
                        Object[] objArr80 = new Object[1];
                        e(bArr32[10], (short) (bArr32[208] - 1), (byte) 52, objArr80);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cResolveOpacity2, threadPriority, i126, 2012020043, false, (String) objArr80[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue10 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                        char scrollBarSize4 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int iArgb3 = 876 - Color.argb(0, 0, 0, 0);
                        int i127 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
                        byte[] bArr33 = $$a;
                        byte b12 = bArr33[10];
                        short s8 = bArr33[7];
                        Object[] objArr81 = new Object[1];
                        e(b12, s8, (byte) (s8 | 37), objArr81);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(scrollBarSize4, iArgb3, i127, -1650998592, false, (String) objArr81[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            } else {
                objArr78 = objArr78;
            }
            objArr6 = objArr78;
        }
        if (((int[]) objArr6[0])[0] != ((int[]) objArr6[2])[0]) {
            throw null;
        }
        int i128 = ((int[]) objArr6[1])[0];
        Object[] objArr82 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
        int i129 = ~iFreeMemory2;
        int i130 = (-937177438) + (((~((-390927465) | i129)) | 285474856) * (-1188));
        int i131 = (~(iFreeMemory2 | 390927464)) | 285474856;
        int i132 = ~(431237693 | i129);
        int i133 = i128 + i130 + ((i131 | i132) * 594) + (((~(390927464 | i129)) | (-536690302) | i132) * 594);
        int i134 = (i133 << 13) ^ i133;
        int i135 = i134 ^ (i134 >>> 17);
        ((int[]) objArr82[1])[0] = i135 ^ (i135 << 5);
        int i136 = g + 111;
        asBinder = i136 % 128;
        int i137 = i136 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
            char c12 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
            int i138 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 875;
            int iBlue = 10 - Color.blue(0);
            byte[] bArr34 = $$a;
            Object[] objArr83 = new Object[1];
            e((byte) (bArr34[19] - 1), (short) 210, bArr34[7], objArr83);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(c12, i138, iBlue, 252381699, false, (String) objArr83[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str4).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            int gidForName2 = Process.getGidForName("") + 877;
            int modifierMetaStateMask6 = ((byte) KeyEvent.getModifierMetaStateMask()) + 11;
            byte[] bArr35 = $$a;
            Object[] objArr84 = new Object[1];
            e(bArr35[10], (short) (bArr35[0] + 1), (byte) 52, objArr84);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(offsetBefore, gidForName2, modifierMetaStateMask6, 2009631821, false, (String) objArr84[0], null);
        }
        if (j5 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                char c13 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 876;
                int iResolveSizeAndState = 10 - View.resolveSizeAndState(0, 0, 0);
                byte b13 = $$a[7];
                byte b14 = b13;
                Object[] objArr85 = new Object[1];
                e(b14, (short) (b14 | 210), b13, objArr85);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(c13, pressedStateDuration, iResolveSizeAndState, 256017550, false, (String) objArr85[0], null);
            }
            Object[] objArr86 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).get(null);
            objArr7 = new Object[]{new int[]{((int[]) objArr86[0])[0]}, new int[1], new int[]{((int[]) objArr86[2])[0]}, (String[]) objArr86[3]};
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i139 = ~iIdentityHashCode9;
            int i140 = 254179776 + (((~((-316879974) | i139)) | 272760864) * (-1188));
            int i141 = (~(iIdentityHashCode9 | 316879973)) | 272760864;
            int i142 = ~(357190202 | i139);
            int i143 = ((i140 + ((i141 | i142) * 594)) + ((((~(316879973 | i139)) | (-401309312)) | i142) * 594)) - 1484522123;
            int i144 = (i143 << 13) ^ i143;
            int i145 = i144 ^ (i144 >>> 17);
            ((int[]) objArr7[1])[0] = i145 ^ (i145 << 5);
            str3 = str;
        } else {
            Context applicationContext3 = (Context) Class.forName(str8).getMethod(str2, new Class[0]).invoke(null, null);
            if (applicationContext3 != null) {
                applicationContext3 = ((applicationContext3 instanceof ContextWrapper) && ((ContextWrapper) applicationContext3).getBaseContext() == null) ? null : applicationContext3.getApplicationContext();
            }
            Object[] objArr87 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), -1484522123};
            byte[] bArr36 = $$d;
            Object[] objArr88 = new Object[1];
            f((byte) (-bArr36[276]), bArr36[26], (short) 258, objArr88);
            Class<?> cls4 = Class.forName((String) objArr88[0]);
            byte b15 = (byte) (-bArr36[369]);
            byte b16 = bArr36[5];
            Object[] objArr89 = new Object[1];
            f(b15, b16, (short) (b16 | 290), objArr89);
            Object[] objArr90 = (Object[]) cls4.getMethod((String) objArr89[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr87);
            if (applicationContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                    char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                    int threadPriority2 = 876 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int iAxisFromString = 9 - MotionEvent.axisFromString("");
                    byte b17 = $$a[7];
                    byte b18 = b17;
                    Object[] objArr91 = new Object[1];
                    e(b18, (short) (b18 | 210), b17, objArr91);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(capsMode, threadPriority2, iAxisFromString, 256017550, false, (String) objArr91[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, objArr90);
                try {
                    str3 = str;
                    long jLongValue12 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                        char cMyPid3 = (char) (Process.myPid() >> 22);
                        int iAlpha2 = 876 - Color.alpha(0);
                        int iAlpha3 = Color.alpha(0) + 10;
                        byte[] bArr37 = $$a;
                        Object[] objArr92 = new Object[1];
                        e(bArr37[10], (short) (bArr37[0] + 1), (byte) 52, objArr92);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cMyPid3, iAlpha2, iAlpha3, 2009631821, false, (String) objArr92[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue12 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                        char c14 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i146 = 877 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10;
                        byte[] bArr38 = $$a;
                        Object[] objArr93 = new Object[1];
                        e((byte) (bArr38[19] - 1), (short) 210, bArr38[7], objArr93);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(c14, i146, scrollDefaultDelay2, 252381699, false, (String) objArr93[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, lValueOf14);
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            } else {
                str3 = str;
                objArr90 = objArr90;
            }
            objArr7 = objArr90;
        }
        int i147 = ((int[]) objArr7[2])[0];
        int i148 = ((int[]) objArr7[0])[0];
        if (i148 == i147) {
            int i149 = ((int[]) objArr7[1])[0];
            Object[] objArr94 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode10 = System.identityHashCode(this);
            int i150 = i149 + ((((~((-1026578421) | iIdentityHashCode10)) | 939541012) * (-283)) - 357555728) + ((~(iIdentityHashCode10 | (-87037409))) * 283);
            int i151 = (i150 << 13) ^ i150;
            int i152 = i151 ^ (i151 >>> 17);
            ((int[]) objArr94[1])[0] = i152 ^ (i152 << 5);
            i3 = 0;
        } else {
            int[] iArr3 = new int[i148];
            int i153 = i148 - 1;
            iArr3[i153] = 1;
            Toast.makeText((Context) null, iArr3[((i148 * i153) % 2) - 1], 1).show();
            int i154 = ((int[]) objArr7[1])[0];
            Object[] objArr95 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i155 = i154 + (-1703544620) + (((~(737300883 | iMaxMemory)) | 67708520) * 576) + (((~((~iMaxMemory) | 805009403)) | 709902592) * 576) + 345401856;
            int i156 = (i155 << 13) ^ i155;
            int i157 = i156 ^ (i156 >>> 17);
            i3 = 0;
            ((int[]) objArr95[1])[0] = i157 ^ (i157 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
            char c15 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31532);
            int iCombineMeasuredStates2 = View.combineMeasuredStates(i3, i3) + 921;
            int iIndexOf9 = 27 - TextUtils.indexOf((CharSequence) "", '0');
            byte[] bArr39 = $$a;
            Object[] objArr96 = new Object[1];
            e((byte) (bArr39[19] - 1), (short) 210, bArr39[7], objArr96);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(c15, iCombineMeasuredStates2, iIndexOf9, -1048449946, false, (String) objArr96[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                char size = (char) (View.MeasureSpec.getSize(0) + 31533);
                int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 921;
                int i158 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 28;
                byte[] bArr40 = $$a;
                byte b19 = bArr40[10];
                short s9 = bArr40[7];
                Object[] objArr97 = new Object[1];
                e(b19, s9, (byte) (s9 | 37), objArr97);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(size, fadingEdgeLength2, i158, -1142834547, false, (String) objArr97[0], null);
            }
            Object[] objArr98 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).get(null);
            objArr8 = new Object[]{new int[1], new int[]{((int[]) objArr98[1])[0]}, (Object[]) objArr98[2], new int[]{((int[]) objArr98[3])[0]}, (String[]) objArr98[4]};
            int iMyTid = Process.myTid();
            int i159 = ~iMyTid;
            int i160 = ((((-1388783162) + ((362973213 | i159) * (-757))) + ((~((-1075398243) | iMyTid)) * 1514)) + (((~(iMyTid | 1438371455)) | ((~(i159 | (-1411106431))) | 335708188)) * 757)) - 1094167963;
            int i161 = (i160 << 13) ^ i160;
            int i162 = i161 ^ (i161 >>> 17);
            ((int[]) objArr8[0])[0] = i162 ^ (i162 << 5);
        } else {
            Context applicationContext4 = (Context) Class.forName(str8).getMethod(str2, new Class[0]).invoke(null, null);
            if (applicationContext4 != null) {
                applicationContext4 = ((applicationContext4 instanceof ContextWrapper) && ((ContextWrapper) applicationContext4).getBaseContext() == null) ? null : applicationContext4.getApplicationContext();
            }
            Object[] objArr99 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, -1094167963};
            byte[] bArr41 = $$d;
            Object[] objArr100 = new Object[1];
            f(bArr41[534], bArr41[145], (short) 347, objArr100);
            Class<?> cls5 = Class.forName((String) objArr100[0]);
            Object[] objArr101 = new Object[1];
            f(bArr41[93], bArr41[22], (short) 396, objArr101);
            Object[] objArr102 = (Object[]) cls5.getMethod((String) objArr101[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr99);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                char c16 = (char) (31533 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                int edgeSlop3 = 921 - (ViewConfiguration.getEdgeSlop() >> 16);
                int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 28;
                byte[] bArr42 = $$a;
                byte b20 = bArr42[10];
                short s10 = bArr42[7];
                Object[] objArr103 = new Object[1];
                e(b20, s10, (byte) (s10 | 37), objArr103);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(c16, edgeSlop3, offsetAfter2, -1142834547, false, (String) objArr103[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, objArr102);
            try {
                long jLongValue13 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char cLastIndexOf3 = (char) (31532 - TextUtils.lastIndexOf("", '0', 0, 0));
                    int i163 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 920;
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 28;
                    byte[] bArr43 = $$a;
                    Object[] objArr104 = new Object[1];
                    e(bArr43[10], (short) (bArr43[208] - 1), (byte) 52, objArr104);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cLastIndexOf3, i163, touchSlop, -778300370, false, (String) objArr104[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue13 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                    char offsetAfter3 = (char) (31533 - TextUtils.getOffsetAfter("", 0));
                    int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0, 0) + 922;
                    int i164 = 28 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr44 = $$a;
                    Object[] objArr105 = new Object[1];
                    e((byte) (bArr44[19] - 1), (short) 210, bArr44[7], objArr105);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(offsetAfter3, iLastIndexOf4, i164, -1048449946, false, (String) objArr105[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf16);
                objArr8 = objArr102;
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        int i165 = ((int[]) objArr8[1])[0];
        int i166 = ((int[]) objArr8[3])[0];
        if (i166 == i165) {
            int i167 = ((int[]) objArr8[0])[0];
            Object[] objArr106 = {new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode11 = System.identityHashCode(this);
            int i168 = ~iIdentityHashCode11;
            int i169 = (~((-1111787321) | i168)) | 1074003992 | (~(662292323 | i168));
            int i170 = i167 + 688155521 + (((~(iIdentityHashCode11 | (-624508996))) | i169) * 590) + (i169 * (-1180)) + (((~((-662292324) | i168)) | (~(i168 | 1111787320))) * 590);
            int i171 = (i170 << 13) ^ i170;
            int i172 = i171 ^ (i171 >>> 17);
            ((int[]) objArr106[0])[0] = i172 ^ (i172 << 5);
            i4 = 0;
        } else {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr11 = (String[]) objArr8[4];
            if (strArr11 != null) {
                for (String str15 : strArr11) {
                    arrayList6.add(str15);
                }
            }
            int[] iArr4 = new int[i166];
            int i173 = i166 - 1;
            iArr4[i173] = 1;
            Toast.makeText((Context) null, iArr4[((i166 * i173) % 2) - 1], 1).show();
            int i174 = ((int[]) objArr8[0])[0];
            Object[] objArr107 = {new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iMyTid2 = Process.myTid();
            int i175 = ~iMyTid2;
            int i176 = 472914295 + (((~((-743899173) | i175)) | 742850596 | (~((-1030180472) | i175)) | (~(1031229047 | iMyTid2))) * (-84));
            int i177 = (~(iMyTid2 | (-1030180472))) | 743899172;
            int i178 = ~(i175 | 1030180471);
            int i179 = i174 + i176 + ((i177 | i178) * (-84)) + (((-1031229048) | i178) * 84);
            int i180 = (i179 << 13) ^ i179;
            int i181 = i180 ^ (i180 >>> 17);
            i4 = 0;
            ((int[]) objArr107[0])[0] = i181 ^ (i181 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
            char cResolveSizeAndState = (char) (53893 - View.resolveSizeAndState(i4, i4, i4));
            int iBlue2 = 1320 - Color.blue(i4);
            int iIndexOf10 = 36 - TextUtils.indexOf("", "", i4);
            byte[] bArr45 = $$a;
            Object[] objArr108 = new Object[1];
            e((byte) (bArr45[19] - 1), (short) 210, bArr45[7], objArr108);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(cResolveSizeAndState, iBlue2, iIndexOf10, -1433084963, false, (String) objArr108[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char touchSlop2 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 53893);
                int iResolveSize = View.resolveSize(0, 0) + 1320;
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 36;
                byte[] bArr46 = $$a;
                Object[] objArr109 = new Object[1];
                e(bArr46[10], (short) (bArr46[208] - 1), (byte) 52, objArr109);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(touchSlop2, iResolveSize, keyRepeatDelay, -1920778747, false, (String) objArr109[0], null);
            }
            Object[] objArr110 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).get(null);
            objArr9 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i182 = ((int[]) objArr110[0])[0];
            int i183 = ((int[]) objArr110[3])[0];
            String[] strArr12 = (String[]) objArr110[2];
            int iIdentityHashCode12 = System.identityHashCode(this);
            int i184 = (-384413458) + ((~(799014367 | iIdentityHashCode12)) * (-301)) + (((~((-596784596) | iIdentityHashCode12)) | (~((~iIdentityHashCode12) | 773843229))) * (-301)) + (((~(iIdentityHashCode12 | (-773843230))) | (-596784596)) * 301) + 1733811882;
            int i185 = (i184 << 13) ^ i184;
            int i186 = i185 ^ (i185 >>> 17);
            ((int[]) objArr9[1])[0] = i186 ^ (i186 << 5);
        } else {
            Context applicationContext5 = (Context) Class.forName(str8).getMethod(str2, new Class[0]).invoke(null, null);
            if (applicationContext5 != null) {
                if ((applicationContext5 instanceof ContextWrapper) && ((ContextWrapper) applicationContext5).getBaseContext() == null) {
                    applicationContext5 = null;
                } else {
                    applicationContext5 = applicationContext5.getApplicationContext();
                    int i187 = asBinder + 21;
                    g = i187 % 128;
                    int i188 = i187 % 2;
                }
            }
            int iIntValue3 = ((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue();
            Object[] objArr111 = {-1077209694};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b((char) (47977 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1300, ((Process.getThreadPriority(0) + 20) >> 6) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr112 = {applicationContext5, "com.bpjstku", 1733811882, Integer.valueOf(iIntValue3), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).newInstance(objArr111), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                char cLastIndexOf4 = (char) (53892 - TextUtils.lastIndexOf("", '0'));
                int iIndexOf11 = 1319 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int iIndexOf12 = 36 - TextUtils.indexOf("", "", 0, 0);
                byte[] bArr47 = $$a;
                Object[] objArr113 = new Object[1];
                e(bArr47[10], (short) (bArr47[208] - 1), (byte) 52, objArr113);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(cLastIndexOf4, iIndexOf11, iIndexOf12, 819724799, false, (String) objArr113[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 57878), TextUtils.indexOf((CharSequence) "", '0', 0) + 1395, 75 - TextUtils.indexOf("", "", 0)), Boolean.TYPE});
            }
            Object[] objArr114 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).invoke(null, objArr112);
            if (applicationContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    char c17 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 53894);
                    int iLastIndexOf5 = 1319 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 36;
                    byte[] bArr48 = $$a;
                    Object[] objArr115 = new Object[1];
                    e(bArr48[10], (short) (bArr48[208] - 1), (byte) 52, objArr115);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(c17, iLastIndexOf5, iResolveSizeAndState2, -1920778747, false, (String) objArr115[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, objArr114);
                try {
                    long jLongValue14 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue14);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                        char cResolveOpacity3 = (char) (53893 - Drawable.resolveOpacity(0, 0));
                        int bitsPerPixel4 = 1319 - ImageFormat.getBitsPerPixel(0);
                        int iIndexOf13 = TextUtils.indexOf("", "", 0) + 36;
                        byte[] bArr49 = $$a;
                        byte b21 = bArr49[10];
                        short s11 = bArr49[7];
                        Object[] objArr116 = new Object[1];
                        e(b21, s11, (byte) (s11 | 37), objArr116);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cResolveOpacity3, bitsPerPixel4, iIndexOf13, -1273706634, false, (String) objArr116[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                        char cKeyCodeFromString = (char) (53893 - KeyEvent.keyCodeFromString(""));
                        int capsMode2 = 1320 - TextUtils.getCapsMode("", 0, 0);
                        int iMyTid3 = (Process.myTid() >> 22) + 36;
                        byte[] bArr50 = $$a;
                        Object[] objArr117 = new Object[1];
                        e((byte) (bArr50[19] - 1), (short) 210, bArr50[7], objArr117);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(cKeyCodeFromString, capsMode2, iMyTid3, -1433084963, false, (String) objArr117[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            } else {
                objArr114 = objArr114;
            }
            objArr9 = objArr114;
        }
        int i189 = ((int[]) objArr9[3])[0];
        int i190 = ((int[]) objArr9[0])[0];
        if (i190 != i189) {
            throw new RuntimeException(String.valueOf(i190));
        }
        Object[] objArr118 = {new int[]{i}, new int[1], strArr, new int[]{i}};
        int i191 = ((int[]) objArr9[1])[0];
        int i192 = ((int[]) objArr9[0])[0];
        int i193 = ((int[]) objArr9[3])[0];
        String[] strArr13 = (String[]) objArr9[2];
        int iNextInt2 = new Random().nextInt(2008003333);
        int i194 = i191 + 1892384628 + (((~(iNextInt2 | 1251412940)) | (-119214885)) * (-465)) + ((1251412940 | (~((-119214885) | iNextInt2))) * 930) + ((iNextInt2 | (-84414497)) * 465);
        int i195 = (i194 << 13) ^ i194;
        int i196 = i195 ^ (i195 >>> 17);
        ((int[]) objArr118[1])[0] = i196 ^ (i196 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
            char c18 = (char) (43043 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int fadingEdgeLength3 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 3111;
            int i197 = 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            Object[] objArr119 = new Object[1];
            e($$a[10], (short) 141, (byte) 52, objArr119);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(c18, fadingEdgeLength3, i197, -1272852037, false, (String) objArr119[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char defaultSize = (char) (43042 - View.getDefaultSize(0, 0));
                int iLastIndexOf6 = 3110 - TextUtils.lastIndexOf("", '0');
                int i198 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21;
                byte[] bArr51 = $$a;
                byte b22 = bArr51[10];
                short s12 = bArr51[7];
                Object[] objArr120 = new Object[1];
                e(b22, s12, (byte) (s12 | 37), objArr120);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(defaultSize, iLastIndexOf6, i198, 154975793, false, (String) objArr120[0], null);
            }
            Object[] objArr121 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).get(null);
            int i199 = ((int[]) objArr121[2])[0];
            int i200 = ((int[]) objArr121[1])[0];
            String[] strArr14 = (String[]) objArr121[3];
            int[] iArr5 = {i200};
            int iFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
            int i201 = (-1744362186) + (((~iFreeMemory3) | 134298449) * 1324) + (((~(iFreeMemory3 | 1233353553)) | (~(471677905 | iFreeMemory3))) * (-1324)) + 1805254047;
            int i202 = (i201 << 13) ^ i201;
            int i203 = i202 ^ (i202 >>> 17);
            ((int[]) objArr10[0])[0] = i203 ^ (i203 << 5);
            objArr10 = new Object[]{new int[1], iArr5, new int[]{i199}, strArr14};
        } else {
            Object[] objArr122 = {null, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, 73347743};
            byte[] bArr52 = $$d;
            byte b23 = bArr52[201];
            byte b24 = bArr52[93];
            Object[] objArr123 = new Object[1];
            f(b23, b24, (short) (b24 | 396), objArr123);
            Class<?> cls6 = Class.forName((String) objArr123[0]);
            Object[] objArr124 = new Object[1];
            f((byte) (-bArr52[276]), bArr52[5], bArr52[90], objArr124);
            Object[] objArr125 = (Object[]) cls6.getMethod((String) objArr124[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr122);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char packedPositionGroup2 = (char) (ExpandableListView.getPackedPositionGroup(0L) + 43042);
                int iIndexOf14 = TextUtils.indexOf("", "", 0) + 3111;
                int iIndexOf15 = 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte[] bArr53 = $$a;
                byte b25 = bArr53[10];
                short s13 = bArr53[7];
                Object[] objArr126 = new Object[1];
                e(b25, s13, (byte) (s13 | 37), objArr126);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(packedPositionGroup2, iIndexOf14, iIndexOf15, 154975793, false, (String) objArr126[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, objArr125);
            try {
                long jLongValue15 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf19 = Long.valueOf(jLongValue15);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                    char maxKeyCode = (char) (43042 - (KeyEvent.getMaxKeyCode() >> 16));
                    int fadingEdgeLength4 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 3111;
                    int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
                    byte[] bArr54 = $$a;
                    Object[] objArr127 = new Object[1];
                    e(bArr54[10], (short) (bArr54[208] - 1), (byte) 52, objArr127);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(maxKeyCode, fadingEdgeLength4, maximumDrawingCacheSize2, -1269618118, false, (String) objArr127[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf19);
                Long lValueOf20 = Long.valueOf(jLongValue15 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                    char longPressTimeout2 = (char) (43042 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 3111;
                    int offsetBefore2 = 22 - TextUtils.getOffsetBefore("", 0);
                    Object[] objArr128 = new Object[1];
                    e($$a[10], (short) 141, (byte) 52, objArr128);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(longPressTimeout2, jumpTapTimeout2, offsetBefore2, -1272852037, false, (String) objArr128[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf20);
                objArr10 = objArr125;
            } catch (Exception unused10) {
                throw new RuntimeException();
            }
        }
        int i204 = ((int[]) objArr10[1])[0];
        int i205 = ((int[]) objArr10[2])[0];
        if (i205 == i204) {
            int i206 = ((int[]) objArr10[0])[0];
            int i207 = ((int[]) objArr10[2])[0];
            int i208 = ((int[]) objArr10[1])[0];
            String[] strArr15 = (String[]) objArr10[3];
            int[] iArr6 = {i208};
            int iNextInt3 = new Random().nextInt(1463758535);
            int i209 = ~iNextInt3;
            int i210 = (~((-537733350) | i209)) | 67621;
            int i211 = ~(iNextInt3 | 1704963837);
            int i212 = i206 + 1738977200 + ((i210 | i211) * (-502)) + ((i211 | (~(i209 | (-537665729)))) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i213 = (i212 << 13) ^ i212;
            int i214 = i213 ^ (i213 >>> 17);
            ((int[]) objArr[0])[0] = i214 ^ (i214 << 5);
            Object[] objArr129 = {new int[1], iArr6, new int[]{i207}, strArr15};
        } else {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr16 = (String[]) objArr10[3];
            if (strArr16 != null) {
                int i215 = 0;
                while (i215 < strArr16.length) {
                    int i216 = asBinder + 97;
                    g = i216 % 128;
                    if (i216 % 2 != 0) {
                        arrayList7.add(strArr16[i215]);
                        i215 += 84;
                    } else {
                        arrayList7.add(strArr16[i215]);
                        i215++;
                    }
                }
            }
            Toast.makeText((Context) null, i205 / (((i205 - 1) * i205) % 2), 0).show();
            int i217 = ((int[]) objArr10[0])[0];
            int i218 = ((int[]) objArr10[2])[0];
            int i219 = ((int[]) objArr10[1])[0];
            String[] strArr17 = (String[]) objArr10[3];
            int[] iArr7 = {i218};
            int[] iArr8 = {i219};
            int iMyPid2 = Process.myPid();
            int i220 = ~iMyPid2;
            int i221 = i217 + 1971714354 + (((~((-102807941) | i220)) | (~((-22085643) | iMyPid2)) | (~((-1477329937) | iMyPid2))) * 765) + (((~((-124893583) | i220)) | 102807940) * 1530) + (((~(iMyPid2 | (-124893583))) | (~(i220 | (-1477329937)))) * 765);
            int i222 = (i221 << 13) ^ i221;
            int i223 = i222 ^ (i222 >>> 17);
            ((int[]) objArr[0])[0] = i223 ^ (i223 << 5);
            Object[] objArr130 = {new int[1], iArr8, iArr7, strArr17};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
            char jumpTapTimeout3 = (char) (37567 - (ViewConfiguration.getJumpTapTimeout() >> 16));
            int iRgb3 = (-16776591) - Color.rgb(0, 0, 0);
            int i224 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13;
            byte[] bArr55 = $$a;
            Object[] objArr131 = new Object[1];
            e((byte) (bArr55[19] - 1), (short) 210, bArr55[7], objArr131);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(jumpTapTimeout3, iRgb3, i224, -477065106, false, (String) objArr131[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null);
        long jLongValue16 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char capsMode3 = (char) (TextUtils.getCapsMode("", 0, 0) + 37567);
            int iIndexOf16 = TextUtils.indexOf((CharSequence) "", '0', 0) + 626;
            int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 14;
            Object[] objArr132 = new Object[1];
            e($$a[10], (short) 141, (byte) 52, objArr132);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(capsMode3, iIndexOf16, iKeyCodeFromString2, -976899241, false, (String) objArr132[0], null);
        }
        if (j6 == ((jLongValue16 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char c19 = (char) (37568 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int iIndexOf17 = 624 - TextUtils.indexOf((CharSequence) "", '0', 0);
                int iKeyCodeFromString3 = 14 - KeyEvent.keyCodeFromString("");
                byte[] bArr56 = $$a;
                Object[] objArr133 = new Object[1];
                e(bArr56[10], (short) (bArr56[208] - 1), (byte) 52, objArr133);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(c19, iIndexOf17, iKeyCodeFromString3, -973632554, false, (String) objArr133[0], null);
            }
            Object[] objArr134 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).get(null);
            int i225 = ((int[]) objArr134[2])[0];
            int i226 = ((int[]) objArr134[0])[0];
            String[] strArr18 = (String[]) objArr134[3];
            int[] iArr9 = {i225};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i227 = (-300688064) + (((~((-245814361) | iUptimeMillis)) | 235148304) * 345) + (((~((-245814361) | (~iUptimeMillis))) | 1342775456) * 345) + ((~(iUptimeMillis | (-235148305))) * 345) + 933860905;
            int i228 = (i227 << 13) ^ i227;
            int i229 = i228 ^ (i228 >>> 17);
            ((int[]) objArr11[1])[0] = i229 ^ (i229 << 5);
            objArr11 = new Object[]{new int[]{i226}, new int[1], iArr9, strArr18};
            i5 = 0;
        } else {
            Context applicationContext6 = (Context) Class.forName(str8).getMethod(str2, new Class[0]).invoke(null, null);
            if (applicationContext6 != null) {
                int i230 = asBinder + 91;
                g = i230 % 128;
                if (i230 % 2 != 0) {
                    boolean z = applicationContext6 instanceof ContextWrapper;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                applicationContext6 = ((applicationContext6 instanceof ContextWrapper) && ((ContextWrapper) applicationContext6).getBaseContext() == null) ? null : applicationContext6.getApplicationContext();
            }
            int iIntValue4 = ((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue();
            Object[] objArr135 = new Object[1];
            c(113 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 63, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr135);
            String str16 = (String) objArr135[0];
            Object[] objArr136 = new Object[1];
            c(TextUtils.lastIndexOf("", '0') + 178, TextUtils.indexOf("", "", 0) + 64, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20286), objArr136);
            Object[] objArr137 = {applicationContext6, new String[]{str16, (String) objArr136[0]}, Integer.valueOf(iIntValue4), 17, 933860905};
            byte[] bArr57 = $$d;
            Object[] objArr138 = new Object[1];
            f(bArr57[10], (byte) (-bArr57[9]), (short) 441, objArr138);
            Class<?> cls7 = Class.forName((String) objArr138[0]);
            byte b26 = (byte) (-bArr57[369]);
            byte b27 = bArr57[5];
            Object[] objArr139 = new Object[1];
            f(b26, b27, (short) (b27 | 458), objArr139);
            objArr11 = (Object[]) cls7.getMethod((String) objArr139[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr137);
            int i231 = ((int[]) objArr11[0])[0];
            int i232 = ((int[]) objArr11[2])[0];
            if (applicationContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                    char bitsPerPixel5 = (char) (37566 - ImageFormat.getBitsPerPixel(0));
                    int i233 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 624;
                    int jumpTapTimeout4 = 14 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    byte[] bArr58 = $$a;
                    Object[] objArr140 = new Object[1];
                    e(bArr58[10], (short) (bArr58[208] - 1), (byte) 52, objArr140);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(bitsPerPixel5, i233, jumpTapTimeout4, -973632554, false, (String) objArr140[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr11);
                try {
                    long jLongValue17 = ((Long) Class.forName(str4).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                        char cAlpha = (char) (37567 - Color.alpha(0));
                        int iRed = 625 - Color.red(0);
                        int iNormalizeMetaState2 = 14 - KeyEvent.normalizeMetaState(0);
                        Object[] objArr141 = new Object[1];
                        e($$a[10], (short) 141, (byte) 52, objArr141);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(cAlpha, iRed, iNormalizeMetaState2, -976899241, false, (String) objArr141[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                        char cResolveSizeAndState2 = (char) (37567 - View.resolveSizeAndState(0, 0, 0));
                        int edgeSlop4 = 625 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 14;
                        byte[] bArr59 = $$a;
                        Object[] objArr142 = new Object[1];
                        e((byte) (bArr59[19] - 1), (short) 210, bArr59[7], objArr142);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cResolveSizeAndState2, edgeSlop4, trimmedLength, -477065106, false, (String) objArr142[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
            i5 = 0;
        }
        int i234 = ((int[]) objArr11[i5])[i5];
        int i235 = ((int[]) objArr11[2])[i5];
        if (i235 != i234) {
            int i236 = i5;
            ArrayList arrayList8 = new ArrayList();
            String[] strArr19 = (String[]) objArr11[3];
            if (strArr19 != null) {
                for (int i237 = i236; i237 < strArr19.length; i237++) {
                    arrayList8.add(strArr19[i237]);
                }
            }
            throw new RuntimeException(String.valueOf(i235));
        }
        Object[] objArr143 = new Object[4];
        int[] iArr10 = new int[1];
        objArr143[i5] = iArr10;
        objArr143[1] = new int[1];
        int[] iArr11 = new int[1];
        objArr143[2] = iArr11;
        int i238 = ((int[]) objArr11[1])[i5];
        int i239 = ((int[]) objArr11[2])[i5];
        int i240 = ((int[]) objArr11[i5])[i5];
        String[] strArr20 = (String[]) objArr11[3];
        iArr11[i5] = i239;
        iArr10[i5] = i240;
        int iMyTid4 = Process.myTid();
        int i241 = i238 + (-281883150) + (((~(iMyTid4 | 1052040755)) | (-1073741560)) * 305) + (((~((~iMyTid4) | 1052040755)) | (-771697366)) * 305);
        int i242 = (i241 << 13) ^ i241;
        int i243 = i242 ^ (i242 >>> 17);
        ((int[]) objArr143[1])[0] = i243 ^ (i243 << 5);
        objArr143[3] = strArr20;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        int i = 2 % 2;
        int i2 = g + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onStop();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
        int i4 = g + 39;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = g + 29;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDestroy();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
            throw null;
        }
        super.onDestroy();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
        getResolutionInfo getresolutioninfo = this.d;
        if (getresolutioninfo != null) {
            getresolutioninfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remove(this);
            this.d = null;
            int i3 = g + 77;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Override // android.app.Fragment
    public final String toString() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43041);
            int mode = View.MeasureSpec.getMode(0) + 3111;
            int iCombineMeasuredStates = 22 - View.combineMeasuredStates(0, 0);
            Object[] objArr2 = new Object[1];
            e($$a[10], (short) 141, (byte) 52, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, mode, iCombineMeasuredStates, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31, 22 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 12304), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(KeyEvent.keyCodeFromString("") + 54, 15 - TextUtils.getOffsetBefore("", 0), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43042);
            int i3 = 3112 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int gidForName = Process.getGidForName("") + 23;
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            e(bArr[10], (short) (bArr[208] - 1), (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i3, gidForName, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = asBinder + 107;
            g = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 43042);
                int mirror = AndroidCharacter.getMirror('0') + 3063;
                int absoluteGravity = 22 - Gravity.getAbsoluteGravity(0, 0);
                byte[] bArr2 = $$a;
                byte b = bArr2[10];
                short s = bArr2[7];
                Object[] objArr6 = new Object[1];
                e(b, s, (byte) (s | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, mirror, absoluteGravity, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i7};
            int i8 = ~new Random().nextInt(1278345487);
            int i9 = (-1620457825) + (((~((-1575289847) | i8)) | (-129741613)) * (-983)) + (((~(i8 | (-129741613))) | 35303432) * 983) + 1537596337;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
            objArr = new Object[]{new int[1], iArr, new int[]{i6}, strArr};
            int i12 = asBinder + 119;
            g = i12 % 128;
            int i13 = i12 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            c((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 16 - TextUtils.indexOf("", "", 0, 0), (char) ('0' - AndroidCharacter.getMirror('0')), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(View.MeasureSpec.makeMeasureSpec(0, 0) + 16, 16 - View.resolveSize(0, 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 1537596337};
                byte[] bArr3 = $$d;
                Object[] objArr11 = new Object[1];
                f((byte) (-bArr3[185]), bArr3[200], (short) 515, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                f((byte) (-bArr3[276]), bArr3[5], bArr3[90], objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char capsMode = (char) (43042 - TextUtils.getCapsMode("", 0, 0));
                    int maxKeyCode = 3111 - (KeyEvent.getMaxKeyCode() >> 16);
                    int iAxisFromString = MotionEvent.axisFromString("") + 23;
                    byte[] bArr4 = $$a;
                    byte b2 = bArr4[10];
                    short s2 = bArr4[7];
                    Object[] objArr13 = new Object[1];
                    e(b2, s2, (byte) (s2 | 37), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, maxKeyCode, iAxisFromString, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(32 - View.getDefaultSize(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 12304), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 54, Color.blue(0) + 15, (char) ('0' - AndroidCharacter.getMirror('0')), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 43042);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 3111;
                        int size = 22 - View.MeasureSpec.getSize(0);
                        byte[] bArr5 = $$a;
                        Object[] objArr16 = new Object[1];
                        e(bArr5[10], (short) (bArr5[208] - 1), (byte) 52, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec, scrollBarSize, size, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cArgb = (char) (43042 - Color.argb(0, 0, 0, 0));
                        int iAxisFromString2 = 3110 - MotionEvent.axisFromString("");
                        int i14 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
                        Object[] objArr17 = new Object[1];
                        e($$a[10], (short) 141, (byte) 52, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cArgb, iAxisFromString2, i14, -1272852037, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[2])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 == null) {
                throw null;
            }
            while (i2 < strArr2.length) {
                int i15 = g + 21;
                asBinder = i15 % 128;
                if (i15 % 2 == 0) {
                    arrayList.add(strArr2[i2]);
                    i2 += 12;
                } else {
                    arrayList.add(strArr2[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i16 = ((int[]) objArr[0])[0];
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr2 = {i17};
        int iIdentityHashCode = System.identityHashCode(this);
        int i19 = i16 + 563330354 + (((-73336001) | iIdentityHashCode) * 376) + (((~((~iIdentityHashCode) | 820895025)) | (-889183730)) * (-376)) + (((~(iIdentityHashCode | (-820895026))) | 884136433) * 376);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr[0])[0] = i21 ^ (i21 << 5);
        Object[] objArr18 = {new int[1], new int[]{i18}, iArr2, strArr3};
        int i22 = asBinder + 97;
        g = i22 % 128;
        if (i22 % 2 != 0) {
            int i23 = 5 % 5;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        sb.append(parentFragment);
        int i24 = ((int[]) objArr18[0])[0];
        int i25 = i24 * i24;
        int i26 = -(2107496665 * i24);
        int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
        int i28 = -(i24 * (-99544257));
        int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
        int i30 = (i29 & 110563472) + (110563472 | i29);
        int i31 = ((i30 >> 29) - 15) / 8;
        int i32 = (-(((i30 - (~((((i30 >> 27) - 63) / 32) + 1))) - 1) ^ (((i31 | 1) << 1) - (i31 ^ 1)))) + 1;
        int i33 = i32 >> 22;
        int i34 = (((i33 | (-2047)) << 1) - (i33 ^ (-2047))) / 1024;
        int i35 = (i34 ^ 1) + ((i34 & 1) << 1);
        sb.append("22;17;27;}".substring(2565 / ((i32 & (-((i35 & 1) + (i35 | 1)))) * 285)));
        return sb.toString();
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = g + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = 2024534886 + ((iIdentityHashCode | 631659809) * (-859));
        int i6 = ~iIdentityHashCode;
        if (i4 != i5 + (((~(iIdentityHashCode | (-547358722))) | (~(631659809 | i6))) * 859) + (((~(1461647352 | i6)) | (-2009006074)) * 859)) {
            throw null;
        }
        int i7 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i8 = ~iIdentityHashCode2;
        if (i7 != (-1442502713) + (((~(i8 | 1995927419)) | (-1995964412) | (~((-583091554) | iIdentityHashCode2))) * 717) + (((~(iIdentityHashCode2 | 1995927419)) | (~(i8 | (-583091554))) | (-1995964412)) * 717)) {
            int i9 = 1945040736 % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i10 = asBinder + 87;
        g = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 2 / 0;
        }
    }

    static {
        byte[] bArr = new byte[582];
        System.arraycopy("Y\\¸+\u001a\u0005ûü\u000fä\u0016\fõþ\u0005#ö\r÷\b\u0001ä\u0013\u001aöú\u000b\bÔ.ñ\b\bú\u000b\bð\t\u0007ø\u0007\u0007ûä'ú\b÷\u0015ó\u000fÁ\bÁFõþ\u0004\u0013÷\u000fñ\u0015¸=\u0007\bó\u000fþõ\rÄCõ\u0013ô\u000f\u0006ñ\u000f\u0003½\u0017 \r\u0002ø\u0001\u0004\nÚ.\u0000\u0005þû\u0011ï\u0003\fûì\u0015\u0013ô\u000f\u0006ñ\u000f#ö\r÷\b\u0001ä\u0013\u001aöú\u000b\bÔ.ñ\b\bú\u000b\b\u0001ÿ÷\u0000\bú\rÿ\u0007\u0000ÿ\u0007ù\u0001\u0014õþ\u0014Ø$÷\u0003\tú\u0003\u0003ý\u0016ù\n¿\u000e\u0000Ã6\u0010ü\u000b\u0003ù\f»D\u0004õ\u0010ô\u000b\bï\u0015÷\b\u0001Â5\u0004\u0002\u000e\bû\b¼A\u0004÷\u0003\tÄ\u001d-ó\nÖ6\u0001ý÷\u0003ÿ\t\rÞ\u0013\u0013\u0004÷ü\b\tó\u000f\b²2#ö\r÷\b\u0001ä\u0013\u001aöú\u000b\bÔ.ñ\b\bú\u000b\bð\t\u0007ø\u0007\u0007ûä'ú\b÷\u0015ó\u000fÁ\u001bûÙ.\u0001\b\u0000ÿÿß&\u0005þÛ5þó\u000fþõ\ré(÷\böÿ\u0011÷üë\u0017\u000e÷\u0004ÿÒ#ö\r÷\b\u0001ä\u0013\u001aöú\u000b\bÔ.ñ\b\bú\u000b\b\u0001ÿ÷\u0000\bú\rÿ\u0007\u0000ÿ\u0007ù\u0001\u0014õþ\u0014Ø$÷\u0003\tú\u0003\u0003ý\u0016ù\nÁ\u000e\u0000Ã;\n\u0002ú\u0007ûË5\u000fø\u0010ÿüýÌ@ÿû\u0012ñ\u0013ùþ\u0010½Dþ÷\u0004\u0004\u0010½5\u0011ûÇA\u0004÷\u0003\tÄN\u0002ë\u0011!Ö!\u0004\nç$õ\u0010\u0002ô\u0001á \r\u0002ø\u0001\u0004\næ!Ö!\u0004\nç$õ\u0010\u0002ô\u0001ã3ñ\u000b\bÖ\u001b\u000fø\nû\u000f\u0006\u0007úÿ\u0007ÂG\bü\u0003ó\nÃ$$ÿö\u0004\u0010\u0002Ú+#ö\r÷\b\u0001ä\u0013\u001aöú\u000b\bÔ.ñ\b\bú\u000b\b\u0001ÿ÷\u0000\bú\rÿ\u0007\u0000ÿ\u0007ù\u0001\u0014õþ\u0014Ø$÷\u0003\tú\u0003\u0003ý\u0016ù\nÀ÷\u000e÷\u0004ÿ\u0010\u0001æ\u0015\u0010\u0004ù\nÀ1\u000fø\u0010ÿüý\u0016í\u0000\u000eú\u000fñ\u0004\u000e\u0005õ\u0006\u0006ö\b\u0000\u0000\u0000\u0011\u0006\u0003ÿõñ\u000f\füí\u001bü\u0013\u0003ÿõï\u0015\u000e\u0006ò\u0010\u0003".getBytes("ISO-8859-1"), 0, bArr, 0, 582);
        $$d = bArr;
        $$e = 231;
        $$a = new byte[]{88, ByteCompanionObject.MAX_VALUE, -112, -47, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
        $$b = 186;
        g = 0;
        asBinder = 1;
        f972a = new char[]{45558, 53766, 30236, 39436, 15966, 16919, 58911, 2607, 44579, 12897, 22017, 64044, 7723, 41559, 50755, 27204, 45557, 53763, 30223, 39427, 15876, 16914, 58890, 2616, 44556, 12846, 22049, 64061, 7707, 41548, 50754, 27212, 33261, 57881, 17950, 43535, 3599, 29186, 54794, 14975, 40507, 556, 26220, 51734, 11825, 37440, 63042, 23132, 48721, Typography.lessOrEqual, 34374, 59970, 20083, 45680, 45561, 53771, 30219, 39453, 15875, 16926, 58906, 2579, 44577, 12846, 22078, 64033, 7729, 41550, 50755, 3727, 28027, 51580, 9581, 33133, 64864, 22888, 46365, 4439, 36173, 59728, 17673, 41323, 7474, 31008, 54578, 12584, 44332, 2364, 25910, 49446, 15633, 39182, 62726, 20743, 52489, 20169, 11556, 35118, 25897, 49443, 48419, 6460, 62774, 20738, 52489, 43272, 1290, 57613, 23924, 14692, 38262, 29045, 60783, 45486, 53762, 30220, 39436, 15889, 16921, 58904, 2679, 44669, 12841, 22068, 64096, 7741, 41542, 50759, 27164, 36379, 4614, 46604, 55896, 32309, 33340, 9785, 19059, 61041, 29224, 38528, 15060, 24283, 58007, 1730, 43712, 52933, 21158, 63224, 6900, 48865, 49898, 26342, 35520, 11970, 45722, 54918, 31373, 40670, 8934, 18101, 60092, 3821, 37543, 13986, 23292, 65364, 851, 42844, 51987, 28493, 62279, 6006, 47911, 57130, 25397, 34660, 11067, 65217, 40248, 14640, 54629, 29054, 3440, 43298, 17736, 57631, 32023, 6492, 46345, 20739, 60719, 35198, 9507, 49440, 23866, 63794, 38192, 12555, 52482, 26966, 1305, 41288, 15637, 55742, 30178, 4581, 44532, 18929, 58879, 33275, 7579, 47553, 21954, 61914, 36224, 10625, 50605, 25000, 65012, 39402, 13757, 53681, 28041, 2443, 42372, 16779, 56778, 31133, 5530, 45116, 19553, 59491, 33917, 8233, 48167, 22606, 62543, 36887, 11357, 51294, 25601};
        asInterface = 4751112726225146471L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, byte r6, short r7) {
        /*
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r5 = r5 * 3
            int r5 = 115 - r5
            byte[] r0 = defpackage.getResolutionInfo.$$c
            int r6 = r6 * 2
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r4 = r5
            r5 = r6
            r3 = r2
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
        L29:
            int r5 = r5 + r4
            int r7 = r7 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getResolutionInfo.$$g(byte, byte, short):java.lang.String");
    }
}
