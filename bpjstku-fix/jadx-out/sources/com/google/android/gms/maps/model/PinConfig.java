package com.google.android.gms.maps.model;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public class PinConfig extends AbstractSafeParcelable {
    public static final int BITMAP_LENGTH_DP = 37;
    public static final int BITMAP_WIDTH_DP = 26;
    public static final Parcelable.Creator<PinConfig> CREATOR = new zzr();
    public static final int DEFAULT_PIN_BACKGROUND_COLOR = -1424587;
    public static final int DEFAULT_PIN_BORDER_COLOR = -3857889;
    public static final int DEFAULT_PIN_GLYPH_COLOR = -5041134;
    private final int zza;
    private final int zzb;
    private final Glyph zzc;

    /* JADX INFO: loaded from: classes6.dex */
    public static class Builder {
        private int zza = PinConfig.DEFAULT_PIN_BACKGROUND_COLOR;
        private int zzb = PinConfig.DEFAULT_PIN_BORDER_COLOR;
        private Glyph zzc = new Glyph(PinConfig.DEFAULT_PIN_GLYPH_COLOR);

        public PinConfig build() {
            return new PinConfig(this.zza, this.zzb, this.zzc);
        }

        public Builder setBackgroundColor(int i) {
            this.zza = i;
            return this;
        }

        public Builder setBorderColor(int i) {
            this.zzb = i;
            return this;
        }

        public Builder setGlyph(Glyph glyph) {
            this.zzc = glyph;
            return this;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static class Glyph extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Glyph> CREATOR;
        public static final float DEFAULT_CIRCLE_RADIUS_DP = 5.0f;
        private static char[] TuitionPaymentFragmentbindingInflater1 = null;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        public static final float X_COORDINATE_DP = 13.0f;
        public static final float Y_COORDINATE_DP = 13.0f;
        private String zza;
        private BitmapDescriptor zzb;
        private int zzc;
        private int zzd;
        private static final byte[] $$c = {86, -48, ByteCompanionObject.MIN_VALUE, 88};
        private static final int $$d = 203;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {80, -8, 43, 65, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$b = 85;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int d = 1;
        private static int b = 1;

        public Glyph(int i) {
            this.zzd = ViewCompat.MEASURED_STATE_MASK;
            this.zzc = i;
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
        private static void c(int r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 4
                int r7 = r7 + 4
                int r8 = r8 * 2
                int r8 = 53 - r8
                int r9 = r9 * 3
                int r9 = 84 - r9
                byte[] r0 = com.google.android.gms.maps.model.PinConfig.Glyph.$$a
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r9 = r7
                r3 = r8
                r4 = r2
                goto L2d
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r3
                r3 = r6
            L2d:
                int r3 = r3 + r7
                int r7 = r9 + 1
                int r9 = r3 + (-11)
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.PinConfig.Glyph.c(int, short, byte, java.lang.Object[]):void");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = d + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            int iHash = Objects.hash(this.zza, this.zzb, Integer.valueOf(this.zzc));
            int i4 = d + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 59 / 0;
            }
            return iHash;
        }

        public Glyph(BitmapDescriptor bitmapDescriptor) {
            this.zzc = PinConfig.DEFAULT_PIN_GLYPH_COLOR;
            this.zzd = ViewCompat.MEASURED_STATE_MASK;
            this.zzb = bitmapDescriptor;
        }

        public Glyph(String str) {
            this(str, ViewCompat.MEASURED_STATE_MASK);
        }

        public Glyph(String str, int i) {
            this.zzc = PinConfig.DEFAULT_PIN_GLYPH_COLOR;
            this.zza = str;
            this.zzd = i;
        }

        Glyph(String str, IBinder iBinder, int i, int i2) {
            BitmapDescriptor bitmapDescriptor;
            this.zzc = PinConfig.DEFAULT_PIN_GLYPH_COLOR;
            this.zzd = ViewCompat.MEASURED_STATE_MASK;
            this.zza = str;
            if (iBinder == null) {
                bitmapDescriptor = null;
            } else {
                BitmapDescriptor bitmapDescriptor2 = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
                d = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
                bitmapDescriptor = bitmapDescriptor2;
            }
            this.zzb = bitmapDescriptor;
            this.zzc = i;
            this.zzd = i2;
            int i6 = d + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            int i7 = i6 % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
        
            if (r8.zzb == null) goto L22;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r8) {
            /*
                r7 = this;
                r0 = 2
                int r1 = r0 % r0
                r1 = 1
                if (r7 != r8) goto L7
                return r1
            L7:
                boolean r2 = r8 instanceof com.google.android.gms.maps.model.PinConfig.Glyph
                r3 = 0
                if (r2 == 0) goto L92
                com.google.android.gms.maps.model.PinConfig$Glyph r8 = (com.google.android.gms.maps.model.PinConfig.Glyph) r8
                int r2 = r7.zzc
                int r4 = r8.zzc
                if (r2 != r4) goto L92
                java.lang.String r2 = r7.zza
                java.lang.String r4 = r8.zza
                boolean r2 = java.util.Objects.equals(r2, r4)
                if (r2 == 0) goto L92
                int r2 = com.google.android.gms.maps.model.PinConfig.Glyph.d
                int r2 = r2 + 69
                int r4 = r2 % 128
                com.google.android.gms.maps.model.PinConfig.Glyph.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r4
                int r2 = r2 % r0
                if (r2 != 0) goto L8b
                int r2 = r7.zzd
                int r5 = r8.zzd
                if (r2 != r5) goto L92
                com.google.android.gms.maps.model.BitmapDescriptor r2 = r7.zzb
                if (r2 != 0) goto L37
                com.google.android.gms.maps.model.BitmapDescriptor r5 = r8.zzb
                if (r5 != 0) goto L44
            L37:
                if (r2 == 0) goto L45
                int r4 = r4 + 57
                int r5 = r4 % 128
                com.google.android.gms.maps.model.PinConfig.Glyph.d = r5
                int r4 = r4 % r0
                com.google.android.gms.maps.model.BitmapDescriptor r4 = r8.zzb
                if (r4 != 0) goto L45
            L44:
                return r3
            L45:
                com.google.android.gms.maps.model.BitmapDescriptor r8 = r8.zzb
                if (r2 == 0) goto L8a
                int r4 = com.google.android.gms.maps.model.PinConfig.Glyph.d
                int r5 = r4 + 37
                int r6 = r5 % 128
                com.google.android.gms.maps.model.PinConfig.Glyph.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r6
                int r5 = r5 % r0
                if (r8 == 0) goto L8a
                int r4 = r4 + 33
                int r1 = r4 % 128
                com.google.android.gms.maps.model.PinConfig.Glyph.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r1
                int r4 = r4 % r0
                if (r4 == 0) goto L75
                com.google.android.gms.dynamic.IObjectWrapper r0 = r2.zza()
                java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r0)
                com.google.android.gms.dynamic.IObjectWrapper r8 = r8.zza()
                java.lang.Object r8 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r8)
                boolean r8 = java.util.Objects.equals(r0, r8)
                r0 = 31
                int r0 = r0 / r3
                return r8
            L75:
                com.google.android.gms.dynamic.IObjectWrapper r0 = r2.zza()
                java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r0)
                com.google.android.gms.dynamic.IObjectWrapper r8 = r8.zza()
                java.lang.Object r8 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r8)
                boolean r8 = java.util.Objects.equals(r0, r8)
                return r8
            L8a:
                return r1
            L8b:
                int r8 = r8.zzd
                r8 = 0
                r8.hashCode()
                throw r8
            L92:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.PinConfig.Glyph.equals(java.lang.Object):boolean");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
            d = i3 % 128;
            int i4 = i3 % 2;
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeString(parcel, 2, getText(), false);
            BitmapDescriptor bitmapDescriptor = this.zzb;
            SafeParcelWriter.writeIBinder(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
            SafeParcelWriter.writeInt(parcel, 4, getGlyphColor());
            SafeParcelWriter.writeInt(parcel, 5, getTextColor());
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
            d = i5 % 128;
            int i6 = i5 % 2;
        }

        public String getText() throws Throwable {
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 46400), 40 - Gravity.getAbsoluteGravity(0, 0), KeyEvent.getDeadChar(0, 0) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            Object obj = null;
            int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object[] objArr = new Object[1];
            a(new char[]{'\b', 23, 20, 5, 2, 0, 17, '\n', 6, 16, 14, 22, 1, '\f', 22, 21, '\t', 7, 21, 2, 17, 18}, (byte) (ImageFormat.getBitsPerPixel(0) + 79), Color.blue(0) + 22, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(new char[]{21, 23, 4, '\b', '\n', 21, 20, 15, 23, 0, 23, 22, 3, '\t', 13897}, (byte) (TextUtils.lastIndexOf("", '0') + 75), 15 - Color.green(0), objArr2);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
            long j = -1;
            long j2 = ((808961353809619073L ^ j) | 1288295820932339914L) ^ j;
            long jMyTid = (((long) Process.myTid()) | 1288295820932339914L) ^ j;
            long j3 = (((long) 659) * 1288295820932339914L) + (((long) (-657)) * 808961353809619073L) + (((long) (-658)) * ((((j ^ 1288295820932339914L) | 808961353809619073L) ^ j) | j2 | jMyTid));
            long j4 = 658;
            long j5 = j3 + (j4 * j2) + (j4 * (jMyTid | j2));
            long j6 = jLongValue;
            int i3 = 0;
            while (true) {
                if (i3 == 10) {
                    Object[] objArr3 = new Object[1];
                    a(new char[]{'\b', 2, 18, '\b', 17, 2, '\b', 23, 17, 14, 22, 4, 16, 1, 23, 5}, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 41), 15 - ExpandableListView.getPackedPositionChild(0L), objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    a(new char[]{0, 19, 23, 15, 24, 1, 22, 1, 3, '\b', '\f', '\n', 11, 6, 20, 0}, (byte) (84 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 16 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr5 = {-60653369};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 46038), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1133, 18 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                        }
                        Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -522779967, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cArgb = (char) Color.argb(0, 0, 0, 0);
                            int i4 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1031;
                            int size = View.MeasureSpec.getSize(0) + 15;
                            byte b2 = $$a[7];
                            byte b3 = b2;
                            Object[] objArr7 = new Object[1];
                            c(b2, b3, b3, objArr7);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, i4, size, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.getDeadChar(0, 0) + 45993), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1117, 16 - ExpandableListView.getPackedPositionChild(0L)), Boolean.TYPE});
                        }
                        Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                        int i5 = ((int[]) objArr8[1])[0];
                        int i6 = ((int[]) objArr8[3])[0];
                        if (i6 == i5) {
                            break;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[0];
                        if (strArr != null) {
                            for (String str : strArr) {
                                arrayList.add(str);
                            }
                        }
                        int[] iArr = new int[i6];
                        int i7 = i6 - 1;
                        iArr[i7] = 1;
                        Toast.makeText((Context) null, iArr[((i6 * i7) % 2) - 1], 1).show();
                        break;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                d = i8 % 128;
                int i9 = i8 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37836), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58, KeyEvent.keyCodeFromString("") + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i10 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(obj);
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
                d = i11 % 128;
                int i12 = i11 % 2;
                long j7 = j6;
                int i13 = 0;
                while (true) {
                    for (int i14 = 0; i14 != 8; i14++) {
                        i10 = (((((int) (j7 >> i14)) & 255) + (i10 << 6)) + (i10 << 16)) - i10;
                    }
                    if (i13 != 0) {
                        break;
                    }
                    int i15 = d + 121;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                    int i16 = i15 % 2;
                    i13++;
                    j7 = j5;
                }
                if (i10 == i2) {
                    break;
                }
                j6 -= 1024;
                i3++;
                obj = null;
            }
            String str2 = this.zza;
            int i17 = d + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
            int i18 = i17 % 2;
            return str2;
        }

        private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
            int i2;
            char c = 2;
            int i3 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
            int i4 = 1770390596;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char size = (char) View.MeasureSpec.getSize(0);
                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 2267;
                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 33;
                            byte b3 = (byte) ($$d & 7);
                            byte b4 = (byte) (b3 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, threadPriority, touchSlop, -1927765101, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i5++;
                        i4 = 1770390596;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i6 = $11 + 35;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cRed = (char) Color.red(0);
                int deadChar = KeyEvent.getDeadChar(0, 0) + 2267;
                int i8 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33;
                byte b5 = (byte) ($$d & 7);
                byte b6 = (byte) (b5 - 3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, deadChar, i8, -1927765101, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i9 = $11 + 91;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    i2 = i + 41;
                    cArr4[i2] = (char) (cArr[i2] >> b2);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b2);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = deinitsession;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = deinitsession;
                        objArr4[9] = deinitsession;
                        objArr4[8] = Integer.valueOf(cCharValue);
                        objArr4[7] = deinitsession;
                        objArr4[6] = deinitsession;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = deinitsession;
                        objArr4[3] = deinitsession;
                        objArr4[c] = Integer.valueOf(cCharValue);
                        objArr4[1] = deinitsession;
                        objArr4[0] = deinitsession;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cMyTid = (char) ((Process.myTid() >> 22) + 49267);
                            int i10 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3262;
                            int iLastIndexOf = 29 - TextUtils.lastIndexOf("", '0');
                            byte b7 = (byte) ($$d & 6);
                            byte b8 = (byte) (b7 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, i10, iLastIndexOf, -127612708, false, $$e(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            try {
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b9 = (byte) 0;
                                    byte b10 = b9;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 22878), 593 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16, 1570859318, false, $$e(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i12];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                        } else {
                            int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    c = 2;
                }
            }
            int i16 = $11 + 55;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            for (int i18 = 0; i18 < i; i18++) {
                cArr4[i18] = (char) (cArr4[i18] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        static {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            TuitionPaymentFragmentbindingInflater1();
            CREATOR = new zzj();
            int i = b + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public BitmapDescriptor getBitmapDescriptor() {
            int i = 2 % 2;
            int i2 = d;
            int i3 = i2 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            BitmapDescriptor bitmapDescriptor = this.zzb;
            int i5 = i2 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 16 / 0;
            }
            return bitmapDescriptor;
        }

        public int getGlyphColor() {
            int i = 2 % 2;
            int i2 = d + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.zzc;
            }
            throw null;
        }

        public int getTextColor() {
            int i = 2 % 2;
            int i2 = d + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.zzd;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void TuitionPaymentFragmentbindingInflater1() {
            TuitionPaymentFragmentbindingInflater1 = new char[]{60041, 60052, 60034, 60058, 60050, 60042, 60088, 60049, 60054, 60043, 60073, 60040, 60117, 60045, 60051, 60063, 60056, 60048, 60053, 60060, 60062, 60047, 60055, 60083, 60072};
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 57188;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(short r6, int r7, int r8) {
            /*
                byte[] r0 = com.google.android.gms.maps.model.PinConfig.Glyph.$$c
                int r8 = r8 * 3
                int r8 = 4 - r8
                int r7 = r7 * 4
                int r1 = r7 + 1
                int r6 = 116 - r6
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L27
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L22:
                r3 = r0[r8]
                r5 = r3
                r3 = r8
                r8 = r5
            L27:
                int r8 = -r8
                int r6 = r6 + r8
                int r8 = r3 + 1
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.PinConfig.Glyph.$$e(short, int, int):java.lang.String");
        }
    }

    PinConfig(int i, int i2, Glyph glyph) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = glyph;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getBackgroundColor());
        SafeParcelWriter.writeInt(parcel, 3, getBorderColor());
        SafeParcelWriter.writeParcelable(parcel, 4, getGlyph(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public int getBackgroundColor() {
        return this.zza;
    }

    public int getBorderColor() {
        return this.zzb;
    }

    public Glyph getGlyph() {
        return this.zzc;
    }
}
