package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class isConnected extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<getSensorAspectRatio> TuitionPaymentFragmentbindingInflater1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private String b;
    private static final byte[] $$c = {87, 51, -85, 78};
    private static final int $$f = 71;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {83, -4, -55, -17, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 59, -6, -10, 13, -20, 14, -12, -7, 11, -72, 63, -7, -14, -1, -1, 11, -72, 70, -17, -8, 0, -5, 12, -73, 73, -3, -23, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -21, 4, 2, -13, 2, 2, -10, -33, 34, -11, 3, -14, 16, -18, 10, -68};
    private static final int $$e = 42;
    private static final byte[] $$a = {12, 11, -9, -106, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 106;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1218a = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1694318821655763641L;
    private static int d = -981105359;
    private static char g = 34097;

    /* JADX INFO: loaded from: classes5.dex */
    public class TuitionPaymentFragmentbindingInflater1 extends RecyclerView.ViewHolder {
        public TextView TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public TextView TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentbindingInflater1(View view) {
            super(view);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TextView) view.findViewById(R.id.item_name);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TextView) view.findViewById(R.id.item_price);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends RecyclerView.ViewHolder {
        public View TuitionPaymentFragmentbindingInflater1;
        public TextView TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public TextView TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public View b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view) {
            super(view);
            this.b = view.findViewById(R.id.divider);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TextView) view.findViewById(R.id.total_amount);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TextView) view.findViewById(R.id.text_order_id);
            this.TuitionPaymentFragmentbindingInflater1 = view.findViewById(R.id.item_details_container);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
            try {
                isConnected isconnected = isConnected.this;
                isConnected.b(isconnected, !isConnected.b(isconnected));
                isConnected.this.notifyDataSetChanged();
                if (isConnected.TuitionPaymentFragmentspecialinlinedviewModeldefault3(isConnected.this) != null && isConnected.b(isConnected.this)) {
                    isConnected.TuitionPaymentFragmentspecialinlinedviewModeldefault3(isConnected.this);
                }
            } finally {
                ViewPortBuilder.b();
            }
        }
    }

    public isConnected(List<getSensorAspectRatio> list, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, String str) {
        this.b = str;
        this.TuitionPaymentFragmentbindingInflater1 = list;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3(isConnected isconnected) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        f1218a = i2 % 128;
        int i3 = i2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = isconnected.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 != 0) {
            return tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean b(isConnected isconnected) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 95;
        f1218a = i3 % 128;
        int i4 = i3 % 2;
        boolean z = isconnected.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i4 == 0) {
            int i5 = 30 / 0;
        }
        int i6 = i2 + 73;
        f1218a = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.isConnected.$$a
            int r7 = r7 + 4
            int r8 = r8 + 84
            int r6 = r6 * 52
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isConnected.c(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 8
            int r0 = r8 + 38
            int r6 = r6 * 15
            int r6 = r6 + 84
            int r7 = r7 * 45
            int r7 = 48 - r7
            byte[] r1 = defpackage.isConnected.$$d
            byte[] r0 = new byte[r0]
            int r8 = r8 + 37
            r2 = 0
            if (r1 != 0) goto L19
            r6 = r7
            r4 = r8
            r3 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L30:
            int r7 = r7 + r4
            int r7 = r7 + 3
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isConnected.f(byte, short, short, java.lang.Object[]):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        int i = 2 % 2;
        int i2 = f1218a;
        int i3 = i2 + 39;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return 1;
        }
        int i5 = i2 + 79;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        List<getSensorAspectRatio> list = this.TuitionPaymentFragmentbindingInflater1;
        if (i6 == 0) {
            return list.size();
        }
        list.size();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 11;
        f1218a = i3 % 128;
        int i4 = i3 % 2;
        if (this.TuitionPaymentFragmentbindingInflater1.get(i).TuitionPaymentFragmentbindingInflater1.equalsIgnoreCase("item.header")) {
            int i5 = f1218a + 117;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return 1002;
        }
        if (!this.TuitionPaymentFragmentbindingInflater1.get(i).TuitionPaymentFragmentbindingInflater1.equalsIgnoreCase("item")) {
            return super.getItemViewType(i);
        }
        int i7 = f1218a + 7;
        asBinder = i7 % 128;
        return i7 % 2 != 0 ? 9447 : 1003;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int itemViewType = getItemViewType(i);
        if (itemViewType != 1002) {
            if (itemViewType == 1003) {
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) viewHolder;
                tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setText(this.TuitionPaymentFragmentbindingInflater1.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setText(this.TuitionPaymentFragmentbindingInflater1.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                return;
            } else {
                int i3 = f1218a + 65;
                asBinder = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TuitionPaymentFragmentspecialinlinedviewModeldefault1) viewHolder;
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setText(this.TuitionPaymentFragmentbindingInflater1.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setText(this.b);
        if (!this.TuitionPaymentFragmentbindingInflater1.get(i).b || !this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.setVisibility(8);
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.b.setVisibility(8);
            return;
        }
        int i4 = asBinder + 41;
        f1218a = i4 % 128;
        if (i4 % 2 == 0) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.setVisibility(1);
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.b.setVisibility(1);
        } else {
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.setVisibility(0);
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.b.setVisibility(0);
        }
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $10 + 49;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8327 - ((byte) KeyEvent.getModifierMetaStateMask())), 1235 - ((Process.getThreadPriority(0) + 20) >> 6), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 35, -653973969, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.blue(0), 2765 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13, 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (Process.myTid() >> 22)), 301 - AndroidCharacter.getMirror('0'), 22 - TextUtils.indexOf("", "", 0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - View.MeasureSpec.getMode(0)), 2891 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16, 2012627446, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) d) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) g) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            int i6 = $11 + 15;
                            $10 = i6 % 128;
                            int i7 = i6 % 2;
                            i2 = 2;
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
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public static /* synthetic */ boolean b(isConnected isconnected, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        int i3 = i2 % 128;
        f1218a = i3;
        int i4 = i2 % 2;
        Object obj = null;
        isconnected.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 81;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
            int iLastIndexOf = 875 - TextUtils.lastIndexOf("", '0', 0, 0);
            int iAxisFromString = 9 - MotionEvent.axisFromString("");
            byte b2 = $$a[5];
            byte b3 = (byte) (-b2);
            byte b4 = b2;
            Object[] objArr3 = new Object[1];
            c(b3, b4, (byte) (b4 & 14), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, iLastIndexOf, iAxisFromString, 252381699, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{24456, 2185, 32910, 45309}, new char[]{15117, 50258, 47922, 42096}, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{51862, 1009, 46279, 42541, 20758, 3653, 346, 20074, 60562, 59593, 59498, 41950, 50018, 36986, 32689, 51930, 33245, 53386, 21181, 18374, 18618, 1498}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{24456, 2185, 32910, 45309}, new char[]{32106, 37653, 65469, 61998}, (char) (12031 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0') - 1114434178, new char[]{45894, 55256, 27028, 22984, 30722, 13087, 20055, 48988, 44504, 31137, 37803, 60567, 22213, 10395, 48676}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int i3 = 877 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 10;
            byte[] bArr = $$a;
            byte b5 = bArr[7];
            Object[] objArr6 = new Object[1];
            c(b5, bArr[5], b5, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, i3, iResolveSizeAndState, 2009631821, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = f1218a + 65;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRed = (char) Color.red(0);
                int iCombineMeasuredStates = 876 - View.combineMeasuredStates(0, 0);
                int iRed = Color.red(0) + 10;
                byte[] bArr2 = $$a;
                byte b6 = (byte) (-bArr2[5]);
                Object[] objArr7 = new Object[1];
                c(b6, (byte) (b6 | 50), bArr2[54], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRed, iCombineMeasuredStates, iRed, 256017550, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int i6 = ((((-770843892) + ((~((-2157186) | i)) * (-301))) + (((~(1029963401 | i)) | (~((~i) | 1070273630))) * (-301))) + ((1029963401 | (~((-1070273631) | i))) * 301)) - 747617627;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{24456, 2185, 32910, 45309}, new char[]{48101, 56870, 63441, 42457}, (char) (55799 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), Process.myTid() >> 22, new char[]{54761, 430, 39472, 57399, 8028, 23892, 50981, 308, 1576, 19118, 59380, 11973, 20699, 51634, 49680, 11781, 63926, 8612, 6815, 30778, 4528, 14258, 21176, 42847, 47108, 51468}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{24456, 2185, 32910, 45309}, new char[]{50347, 19008, 42523, 2162}, (char) (29350 - TextUtils.indexOf("", "")), TextUtils.indexOf("", ""), new char[]{37644, 63285, 58224, 22981, 61389, 44702, 49391, 4103, 3523, 19034, 21965, 46867, 42772, 60916, 41007, 'r', 56426, 56119}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(i), -747617627};
                byte[] bArr3 = $$d;
                byte b7 = (byte) (-bArr3[35]);
                byte b8 = b7;
                Object[] objArr12 = new Object[1];
                f(b7, b8, b8, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b9 = bArr3[42];
                byte b10 = b9;
                Object[] objArr13 = new Object[1];
                f(b9, b10, b10, objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                if (applicationContext != null) {
                    int i9 = f1218a + 5;
                    asBinder = i9 % 128;
                    int i10 = i9 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int fadingEdgeLength = 876 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int i11 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
                        byte[] bArr4 = $$a;
                        byte b11 = (byte) (-bArr4[5]);
                        Object[] objArr15 = new Object[1];
                        c(b11, (byte) (b11 | 50), bArr4[54], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(doubleTapTimeout, fadingEdgeLength, i11, 256017550, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(new char[]{24456, 2185, 32910, 45309}, new char[]{15117, 50258, 47922, 42096}, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getCapsMode("", 0, 0), new char[]{51862, 1009, 46279, 42541, 20758, 3653, 346, 20074, 60562, 59593, 59498, 41950, 50018, 36986, 32689, 51930, 33245, 53386, 21181, 18374, 18618, 1498}, objArr16);
                        Class<?> cls4 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(new char[]{24456, 2185, 32910, 45309}, new char[]{32106, 37653, 65469, 61998}, (char) (View.MeasureSpec.getMode(0) + 12031), (-1114434179) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{45894, 55256, 27028, 22984, 30722, 13087, 20055, 48988, 44504, 31137, 37803, 60567, 22213, 10395, 48676}, objArr17);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                            int i12 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
                            int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0');
                            byte[] bArr5 = $$a;
                            byte b12 = bArr5[7];
                            Object[] objArr18 = new Object[1];
                            c(b12, bArr5[5], b12, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter, i12, iIndexOf, 2009631821, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cArgb = (char) Color.argb(0, 0, 0, 0);
                            int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 876;
                            int iLastIndexOf2 = 9 - TextUtils.lastIndexOf("", '0', 0, 0);
                            byte b13 = $$a[5];
                            byte b14 = (byte) (-b13);
                            byte b15 = b13;
                            Object[] objArr19 = new Object[1];
                            c(b14, b15, (byte) (b15 & 14), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cArgb, offsetAfter2, iLastIndexOf2, 252381699, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr14;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i16 = ~i;
            int i17 = i15 + (-1263457044) + (((~(990013414 | i16)) | (-1030323644) | (~((-990013415) | i))) * (-564)) + ((~((-956327331) | i)) * 1128) + (((~(i16 | (-1030323644))) | 33686084) * 564);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
        } else {
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i20 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i21 = i20 + 861090834 + ((~(670034815 | iIdentityHashCode)) * 623) + (((~iIdentityHashCode) | 558416162) * (-623)) + (((~(iIdentityHashCode | 634380603)) | (~(594070374 | iIdentityHashCode)) | (-670034816)) * 623);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr2[1])[0] = i23 ^ (i23 << 5);
        }
        if (i != 1002) {
            if (i == 1003) {
                return new TuitionPaymentFragmentbindingInflater1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_item_details, viewGroup, false));
            }
            int i24 = f1218a + 43;
            asBinder = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = 72 / 0;
            }
            return null;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        int i26 = ((int[]) objArr2[1])[0];
        int i27 = i26 * i26;
        int i28 = -(394440841 * i26);
        int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
        int i30 = -(i26 * (-861554993));
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        int i32 = (i31 & 1296956304) + (1296956304 | i31);
        int i33 = i32 >> 19;
        int i34 = ((((i33 | (-16383)) << 1) - (i33 ^ (-16383))) / 8192) + 1;
        int i35 = -(((i32 & i34) + (i34 | i32)) ^ ((((i32 >> 27) - 63) / 32) + 1));
        int i36 = (i35 ^ 1) + ((i35 & 1) << 1);
        int i37 = i36 >> 19;
        int i38 = ((i37 ^ (-16383)) + ((i37 & (-16383)) << 1)) / 8192;
        int i39 = (i38 ^ 1) + ((i38 & 1) << 1);
        View viewInflate = layoutInflaterFrom.inflate(R.layout.item_item_header, viewGroup, (boolean) (0 / (((-((i39 ^ 1) + ((i39 & 1) << 1))) & i36) * 1166)));
        viewInflate.setOnClickListener(new b());
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewInflate);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r0 = 1 - r6
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r1 = defpackage.isConnected.$$c
            int r8 = 104 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2f
        L16:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isConnected.$$g(int, byte, byte):java.lang.String");
    }
}
