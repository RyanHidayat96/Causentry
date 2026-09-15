package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.models.snap.EnabledPayment;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdanew0androidxcameracorestreamsharingStreamSharing extends RecyclerView.Adapter<TuitionPaymentFragmentspecialinlinedviewModeldefault3> {
    private static final String b = "UobListAdapter";
    public List<getCropRectOfReferenceAspectRatio> TuitionPaymentFragmentbindingInflater1 = new ArrayList();
    private TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {117, 50, 102, 124};
    private static final int $$f = 135;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {36, -74, -79, -21, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 59, -6, -10, 13, -20, 14, -12, -7, 11, -72, 63, -7, -14, -1, -1, 11, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -18, 8, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -70};
    private static final int $$e = 12;
    private static final byte[] $$a = {106, -93, -11, -74, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 189;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int asBinder = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59746, 59756, 59705, 59746, 59744, 59749, 59771, 59757, 59752, 59728, 59728, 59759, 59751, 59770, 59747, 59757, 59747, 59855, 59405, 59405, 59900, 59855, 59889, 59892, 59406, 59395, 59889, 59407, 59900, 59889, 59900, 59888, 59395, 59893, 59873, 59396, 59393, 59892, 59399, 59892, 59393, 59890, 59868, 59708, 59751, 59749, 59745, 59753, 59757, 59745, 59749, 59771, 59731, 59729, 59770, 59746, 59744, 59769, 59768, 59751, 59747};

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i);
    }

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends RecyclerView.ViewHolder {
        public LinearLayout TuitionPaymentFragmentbindingInflater1;
        public DefaultTextView TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public ImageView TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public TextView TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public TextView b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view, final TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            super(view);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TextView) view.findViewById(R.id.text_payment_method_name);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (ImageView) view.findViewById(R.id.img_payment_method_icon);
            this.b = (TextView) view.findViewById(R.id.text_payment_method_description);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (DefaultTextView) view.findViewById(R.id.text_option_unavailable);
            this.TuitionPaymentFragmentbindingInflater1 = (LinearLayout) view.findViewById(R.id.layout_payment_unavailable);
            view.setOnClickListener(new View.OnClickListener() { // from class: lambdanew0androidxcameracorestreamsharingStreamSharing.TuitionPaymentFragmentspecialinlinedviewModeldefault3.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                    try {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault3.this.getAdapterPosition());
                        }
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
        }
    }

    public lambdanew0androidxcameracorestreamsharingStreamSharing(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = 53 - r6
            int r8 = r8 * 52
            int r8 = r8 + 4
            byte[] r0 = defpackage.lambdanew0androidxcameracorestreamsharingStreamSharing.$$a
            int r7 = 103 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r8]
        L27:
            int r8 = r8 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdanew0androidxcameracorestreamsharingStreamSharing.a(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.lambdanew0androidxcameracorestreamsharingStreamSharing.$$d
            int r7 = r7 * 48
            int r7 = r7 + 4
            int r6 = r6 * 15
            int r6 = r6 + 84
            int r5 = r5 * 4
            int r5 = 53 - r5
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r0[r7]
        L28:
            int r6 = r6 + r4
            int r6 = r6 + 3
            int r7 = r7 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdanew0androidxcameracorestreamsharingStreamSharing.d(short, int, short, java.lang.Object[]):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int size = this.TuitionPaymentFragmentbindingInflater1.size();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return size;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) viewHolder;
        if (i3 % 2 != 0) {
            this.TuitionPaymentFragmentbindingInflater1.get(i);
            throw null;
        }
        getCropRectOfReferenceAspectRatio getcroprectofreferenceaspectratio = this.TuitionPaymentFragmentbindingInflater1.get(i);
        if (getcroprectofreferenceaspectratio != null) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setText(this.TuitionPaymentFragmentbindingInflater1.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setImageResource(this.TuitionPaymentFragmentbindingInflater1.get(i).TuitionPaymentFragmentbindingInflater1);
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.b.setText(this.TuitionPaymentFragmentbindingInflater1.get(i).b);
            String str = b;
            StringBuilder sb = new StringBuilder("Bank Item: ");
            sb.append(this.TuitionPaymentFragmentbindingInflater1.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            Logger.d(str, sb.toString());
            if (TextUtils.isEmpty(getcroprectofreferenceaspectratio.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                return;
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            if (getcroprectofreferenceaspectratio.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(EnabledPayment.STATUS_DOWN)) {
                int i6 = asBinder + 125;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                if (i6 % 2 != 0) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.setVisibility(0);
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.itemView.setClickable(true);
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setVisibility(0);
                } else {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.setVisibility(0);
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.itemView.setClickable(false);
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setVisibility(0);
                }
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        int i3 = asBinder + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
            int maximumFlingVelocity = 876 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int windowTouchSlop = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte[] bArr = $$a;
            byte b2 = (byte) (-bArr[5]);
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 + 4), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, maximumFlingVelocity, windowTouchSlop, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
            int gidForName = Process.getGidForName("") + 877;
            int gidForName2 = 9 - Process.getGidForName("");
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b3, bArr2[54], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, gidForName, gidForName2, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 876;
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 11;
                byte[] bArr3 = $$a;
                byte b4 = bArr3[5];
                Object[] objArr6 = new Object[1];
                a((byte) (-b4), bArr3[7], (byte) (-b4), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, offsetBefore, packedPositionChild, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i5 = ~i;
            int i6 = (((-1488192276) + (((-412635537) | i5) * 494)) + (((~(i5 | (-446193085))) | 107425325) * 494)) - 1051237165;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{37, 26, 150, 12}, true, null, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{63, 18, 0, 17}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i9 = asBinder + 79;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                if (i9 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    throw null;
                }
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i10 = asBinder + 115;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                    int i11 = i10 % 2;
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(i), -1051237165};
                byte[] bArr4 = $$d;
                byte b5 = (byte) (-bArr4[35]);
                byte b6 = b5;
                Object[] objArr11 = new Object[1];
                d(b5, b6, (byte) (b6 - 1), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr4[35];
                byte b8 = (byte) (b7 + 1);
                Object[] objArr12 = new Object[1];
                d(b8, b8, (byte) (-b7), objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 876;
                        int keyRepeatDelay = 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[5];
                        Object[] objArr14 = new Object[1];
                        a((byte) (-b9), bArr5[7], (byte) (-b9), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, offsetAfter, keyRepeatDelay, 256017550, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        c(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                            int size = 876 - View.MeasureSpec.getSize(0);
                            int gidForName3 = 9 - Process.getGidForName("");
                            byte[] bArr6 = $$a;
                            byte b10 = bArr6[7];
                            Object[] objArr17 = new Object[1];
                            a(b10, bArr6[54], b10, objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, size, gidForName3, 2009631821, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                            int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 876;
                            int trimmedLength = 10 - TextUtils.getTrimmedLength("");
                            byte[] bArr7 = $$a;
                            byte b11 = (byte) (-bArr7[5]);
                            Object[] objArr18 = new Object[1];
                            a(b11, (byte) (b11 + 4), bArr7[7], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maxKeyCode, offsetAfter2, trimmedLength, 252381699, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr13;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i12 = ((int[]) objArr[2])[0];
        int i13 = ((int[]) objArr[0])[0];
        if (i13 == i12) {
            int i14 = asBinder + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((int[]) objArr[1])[0];
            int i17 = ((int[]) objArr[0])[0];
            int i18 = ((int[]) objArr[2])[0];
            new int[1][0] = i17;
            new int[1][0] = i18;
            int i19 = ~i;
            int i20 = i16 + 1858126516 + (((~(418334329 | i19)) | 51386374) * 168) + ((~((-51386375) | i)) * 168) + (((~(i | 469720703)) | (~(i19 | (-458644559))) | 407258184) * 168);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            int[] iArr = {i22 ^ (i22 << 5)};
        } else {
            int[] iArr2 = new int[i13];
            int i23 = i13 - 1;
            iArr2[i23] = 1;
            Toast.makeText((Context) null, iArr2[((i13 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArr[1])[0];
            int i25 = ((int[]) objArr[0])[0];
            int i26 = ((int[]) objArr[2])[0];
            new int[1][0] = i25;
            new int[1][0] = i26;
            int i27 = ~i;
            int i28 = (~((-657621432) | i27)) | 53510165;
            int i29 = ~(i | (-13199937));
            int i30 = i24 + 1132609282 + ((i28 | i29) * (-502)) + ((i29 | (~(i27 | (-604111267)))) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            int[] iArr3 = {i32 ^ (i32 << 5)};
        }
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_row_payment_methods, viewGroup, false), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cArgb = (char) Color.argb(i3, i3, i3, i3);
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(i3) + 1271;
                        int packedPositionType = ExpandableListView.getPackedPositionType(j) + 18;
                        byte b2 = (byte) ($$f & 29);
                        byte b3 = (byte) (b2 - 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, bitsPerPixel, packedPositionType, 407021364, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i3 = 0;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i5) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i9 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 3225 - (KeyEvent.getMaxKeyCode() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 13, 2133916302, false, $$g((byte) ($$f & 30), b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i10 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char size = (char) (29944 - View.MeasureSpec.getSize(0));
                        int i11 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1754;
                        int packedPositionType2 = 23 - ExpandableListView.getPackedPositionType(0L);
                        byte length2 = (byte) $$c.length;
                        byte b5 = (byte) (length2 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, i11, packedPositionType2, 387247676, false, $$g(length2, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 41242), KeyEvent.normalizeMetaState(0) + 1705, 22 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1434471773, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i12 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i12, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i12);
            int i13 = $10 + 31;
            $11 = i13 % 128;
            i = 2;
            int i14 = i13 % 2;
        } else {
            i = 2;
        }
        if (z) {
            int i15 = $10 + 43;
            $11 = i15 % 128;
            int i16 = i15 % i;
            char[] cArr6 = new char[i5];
            int i17 = 0;
            while (true) {
                setvideostabilizationmode.b = i17;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                i17 = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i18 = $11 + 119;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = 0;
            while (true) {
                setvideostabilizationmode.b = i20;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i20 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, int r8) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r6 = 105 - r6
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r1 = defpackage.lambdanew0androidxcameracorestreamsharingStreamSharing.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2d
        L16:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L2d:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdanew0androidxcameracorestreamsharingStreamSharing.$$g(int, int, int):java.lang.String");
    }
}
