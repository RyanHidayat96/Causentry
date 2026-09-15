package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class search extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private String[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {56, 94, 119, -19};
    private static final int $$f = 251;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {30, 17, -35, 104, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 27, -20, 21, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 70};
    private static final int $$e = 86;
    private static final byte[] $$a = {8, -36, 87, -65, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
    private static final int $$b = 101;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static long b = 3842302262623401510L;

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends RecyclerView.ViewHolder {
        public DefaultTextView TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view) {
            super(view);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (DefaultTextView) view.findViewById(R.id.bank_name);
        }
    }

    public search(String[] strArr, Context context) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = strArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 97
            byte[] r0 = defpackage.search.$$a
            int r1 = 11 - r7
            int r6 = r6 * 10
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r7 = 10 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r8 + 1
            int r8 = r3 + (-5)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.search.a(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 15
            int r7 = r7 + 84
            byte[] r0 = defpackage.search.$$d
            int r5 = r5 + 4
            int r6 = r6 * 3
            int r1 = r6 + 50
            byte[] r1 = new byte[r1]
            int r6 = r6 + 49
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r5 = r5 + 1
            r4 = r0[r5]
            int r3 = r3 + 1
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + 3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.search.d(int, byte, int, java.lang.Object[]):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        String[] strArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 == 0) {
            return strArr.length;
        }
        int length = strArr.length;
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) viewHolder;
        DefaultTextView defaultTextView = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder();
        sb.append(i + 1);
        sb.append(".   ");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i]);
        defaultTextView.setText(sb.toString());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (i % 2 == 0) {
            int i3 = TuitionPaymentFragmentbindingInflater1 + 53;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setBackgroundColor(ContextCompat.getColor(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, R.color.light_gray));
        } else {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setBackgroundColor(ContextCompat.getColor(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, R.color.white));
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setLayoutParams(layoutParams);
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 77;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 64837), Process.getGidForName("") + 1357, 38 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 47773), View.resolveSizeAndState(0, 0, 0) + 468, 13 - (Process.myTid() >> 22), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $10 + 113;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) throws Throwable {
        Object[] objArr;
        char c;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int iResolveSize = View.resolveSize(0, 0) + 876;
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
            byte b2 = $$a[11];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, iResolveSize, minimumFlingVelocity, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{8450, 24223, 63292, 64432, 8547, 17073, 53208, 44802, 20589, 54198, 24280, 15966, 50029, 41132, 60818, 52515, 29307, 12716, 31944, 23573, 58735, 48796, 3024, 58143, 5217, 4020}, (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{24137, 54944, 49682, 14499, 24108, 51852, 64243, 27667, 12090, 23429, 27638, 64817, 48172, 10369, 55550, 3607, 3360, 47501, 18935}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 877;
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 10;
            int i3 = $$b;
            Object[] objArr5 = new Object[1];
            a((byte) (i3 & 3), $$a[8], (byte) (i3 & 3), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, bitsPerPixel, longPressTimeout, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                int iLastIndexOf = 875 - TextUtils.lastIndexOf("", '0');
                int threadPriority = 10 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte b4 = (byte) ($$b & 3);
                Object[] objArr6 = new Object[1];
                a(b4, (byte) (b4 + 2), $$a[11], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iLastIndexOf, threadPriority, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = (~((-754056802) | iIdentityHashCode)) | 74520161;
            int i7 = 1521273620 + (i6 * 992) + ((i6 | (~((~iIdentityHashCode) | (-34209933)))) * (-496)) + ((iIdentityHashCode | (-713746573)) * 496) + 1175150816;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            c = 2;
        } else {
            try {
                Object[] objArr8 = {Integer.valueOf(i), 1175150816};
                byte[] bArr = $$d;
                byte b5 = bArr[35];
                byte b6 = (byte) (-b5);
                Object[] objArr9 = new Object[1];
                d(b6, (byte) (b6 + 1), b5, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                byte b7 = (byte) (-bArr[14]);
                byte b8 = bArr[35];
                Object[] objArr10 = new Object[1];
                d(b7, b8, (byte) (b8 - 1), objArr10);
                objArr = (Object[]) cls2.getMethod((String) objArr10[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c3 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int fadingEdgeLength = 876 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iBlue = Color.blue(0) + 10;
                    byte b9 = (byte) ($$b & 3);
                    Object[] objArr11 = new Object[1];
                    a(b9, (byte) (b9 + 2), $$a[11], objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, fadingEdgeLength, iBlue, 1324201839, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new char[]{8450, 24223, 63292, 64432, 8547, 17073, 53208, 44802, 20589, 54198, 24280, 15966, 50029, 41132, 60818, 52515, 29307, 12716, 31944, 23573, 58735, 48796, 3024, 58143, 5217, 4020}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new char[]{24137, 54944, 49682, 14499, 24108, 51852, 64243, 27667, 12090, 23429, 27638, 64817, 48172, 10369, 55550, 3607, 3360, 47501, 18935}, 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int windowTouchSlop = 876 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int offsetAfter = 10 - TextUtils.getOffsetAfter("", 0);
                        int i10 = $$b;
                        Object[] objArr14 = new Object[1];
                        a((byte) (i10 & 3), $$a[8], (byte) (i10 & 3), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, windowTouchSlop, offsetAfter, 254769921, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "");
                        int mode2 = 876 - View.MeasureSpec.getMode(0);
                        int scrollDefaultDelay = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        byte b10 = $$a[11];
                        byte b11 = b10;
                        Object[] objArr15 = new Object[1];
                        a(b10, b11, b11, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, mode2, scrollDefaultDelay, -1199417970, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i11 = TuitionPaymentFragmentbindingInflater1 + 93;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                    c = 2;
                    int i12 = i11 % 2;
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
        int i13 = ((int[]) objArr[c])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[1])[0];
            int i16 = ((int[]) objArr[0])[0];
            int i17 = ((int[]) objArr[2])[0];
            new int[1][0] = i16;
            new int[1][0] = i17;
            int i18 = ~i;
            int i19 = i15 + (-942559356) + (((~((-94374548) | i18)) | 134684776) * (-828)) + ((i18 | (-94374548)) * (-828)) + 832713588;
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            int[] iArr = {i21 ^ (i21 << 5)};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                int i22 = 0;
                while (i22 < strArr.length) {
                    int i23 = TuitionPaymentFragmentbindingInflater1 + 73;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i23 % 128;
                    if (i23 % 2 != 0) {
                        arrayList.add(strArr[i22]);
                        i22 += 12;
                    } else {
                        arrayList.add(strArr[i22]);
                        i22++;
                    }
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i24 = ((int[]) objArr[1])[0];
            Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i25 = ~iElapsedRealtime;
            int i26 = i24 + 1133544442 + ((627959761 | i25) * (-757)) + ((~(661649405 | iElapsedRealtime)) * 1514) + (((~(iElapsedRealtime | (-33689645))) | (~(i25 | 587649532)) | 73999873) * 757);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr16[1])[0] = i28 ^ (i28 << 5);
        }
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(LayoutInflater.from(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3).inflate(R.layout.bank_item_viewholder, (ViewGroup) null));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            byte[] r0 = defpackage.search.$$c
            int r8 = r8 * 2
            int r8 = r8 + 107
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r7 = r7 + r4
            int r8 = r8 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.search.$$g(byte, byte, short):java.lang.String");
    }
}
