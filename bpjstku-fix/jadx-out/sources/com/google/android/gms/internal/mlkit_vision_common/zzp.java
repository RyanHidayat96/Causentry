package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.RandomAccess;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzp extends zzl implements List, RandomAccess {
    private static char[] TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final zzac zza;
    private static final byte[] $$c = {107, 48, 57, 107};
    private static final int $$f = 98;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {82, Base64.padSymbol, -66, -42, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 60, -4, -4, -5, 8, -24, 1, 9, -5, -3, -1, -4, -67, 73, -3, -27, 13, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -69};
    private static final int $$e = 188;
    private static final byte[] $$a = {92, 126, -38, -95, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 128;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int b = 0;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        zza = new zzn(zzu.zza, 0);
        int i = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    zzp() {
    }

    private static void a(int i, short s, short s2, Object[] objArr) {
        int i2 = 98 - (s2 * 14);
        byte[] bArr = $$a;
        int i3 = s * 52;
        int i4 = (i * 52) + 4;
        byte[] bArr2 = new byte[53 - i3];
        int i5 = 52 - i3;
        int i6 = -1;
        if (bArr == null) {
            i4++;
            i2 = (i4 + i5) - 11;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i7 = bArr[i4];
                i4++;
                i2 = (i2 + i7) - 11;
            }
        }
    }

    private static void d(byte b2, short s, int i, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = 51 - (s * 48);
        int i3 = i * 4;
        int i4 = (b2 * 15) + 84;
        byte[] bArr2 = new byte[53 - i3];
        int i5 = 52 - i3;
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + i4 + 3;
        }
        while (true) {
            i2++;
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = i4 + bArr[i2] + 3;
        }
    }

    static zzp zzg(Object[] objArr) {
        zzp zzpVarZzh;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            zzpVarZzh = zzh(objArr, objArr.length);
            int i3 = 18 / 0;
        } else {
            zzpVarZzh = zzh(objArr, objArr.length);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return zzpVarZzh;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (indexOf(obj) >= 0) {
            return true;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 2 % 2;
        int iHashCode = 1;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int size = size();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (i6 < size) {
            iHashCode = (iHashCode * 31) + get(i6).hashCode();
            i6++;
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 / 3;
            }
        }
        return iHashCode;
    }

    static zzp zzh(Object[] objArr, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (i != 0) {
            return new zzu(objArr, i);
        }
        zzp zzpVar = zzu.zza;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return zzpVar;
        }
        throw null;
    }

    public static zzp zzi(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {obj};
            zzt.zza(objArr, 1);
            return zzh(objArr, 1);
        }
        Object[] objArr2 = new Object[0];
        objArr2[0] = obj;
        zzt.zza(objArr2, 1);
        return zzh(objArr2, 1);
    }

    public static zzp zzj(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {obj, obj2, obj3};
            zzt.zza(objArr, 3);
            return zzh(objArr, 3);
        }
        Object[] objArr2 = new Object[5];
        objArr2[0] = obj;
        objArr2[0] = obj2;
        objArr2[3] = obj3;
        zzt.zza(objArr2, 3);
        return zzh(objArr2, 3);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            int i5 = i3 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = iterator();
            Iterator it2 = list.iterator();
            while (it.hasNext()) {
                if (!it2.hasNext()) {
                    return false;
                }
                if (!zzb.zza(it.next(), it2.next())) {
                    int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                    return i8 % 2 == 0;
                }
            }
            return !it2.hasNext();
        }
        for (int i9 = 0; i9 < size; i9++) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
            if (i10 % 2 != 0) {
                zzb.zza(get(i9), list.get(i9));
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!zzb.zza(get(i9), list.get(i9))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 37567);
            int defaultSize = 625 - View.getDefaultSize(0, 0);
            int iAlpha = Color.alpha(0) + 14;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr3 = new Object[1];
            a(b2, (byte) (-bArr[5]), b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, defaultSize, iAlpha, -477065106, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new int[]{0, 22, 0, 5}, false, new byte[]{1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new int[]{22, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char size = (char) (37567 - View.MeasureSpec.getSize(0));
            int i2 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 625;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 15;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            Object[] objArr6 = new Object[1];
            a(b3, b3, (byte) (-bArr2[5]), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size, i2, iLastIndexOf, -976899241, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollDefaultDelay = (char) (37567 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int tapTimeout = 625 - (ViewConfiguration.getTapTimeout() >> 16);
                int scrollBarSize = 14 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte[] bArr3 = $$a;
                byte b4 = bArr3[5];
                Object[] objArr7 = new Object[1];
                a((byte) (-b4), bArr3[7], (byte) (-b4), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, tapTimeout, scrollBarSize, -973632554, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i3 = ((int[]) objArr8[2])[0];
            int i4 = ((int[]) objArr8[0])[0];
            String[] strArr = (String[]) objArr8[3];
            int[] iArr = {i4};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = (((587771192 + (((~((-1757653481) | iIdentityHashCode)) | (-1811152873)) * (-502))) + ((~((~iIdentityHashCode) | (-1745068233))) * (-502))) + (((~(iIdentityHashCode | (-66084641))) | (-1757653481)) * TypedValues.PositionType.TYPE_DRAWPATH)) - 2019271795;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i3}, strArr};
        } else {
            Object[] objArr9 = new Object[1];
            c(new int[]{37, 26, 9, 26}, true, null, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new int[]{63, 18, 154, 14}, false, new byte[]{1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            c(new int[]{81, 16, 128, 5}, false, new byte[]{1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(new int[]{97, 16, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr13 = new Object[1];
            c(new int[]{113, 64, 82, 0}, false, new byte[]{0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0}, objArr13);
            String str = (String) objArr13[0];
            Object[] objArr14 = new Object[1];
            c(new int[]{177, 64, 186, 34}, true, new byte[]{0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0}, objArr14);
            String[] strArr2 = {str, (String) objArr14[0]};
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr15 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, -2019271795};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[41];
                byte b6 = b5;
                Object[] objArr16 = new Object[1];
                d(b5, b6, b6, objArr16);
                Class<?> cls4 = Class.forName((String) objArr16[0]);
                byte b7 = (byte) (bArr4[41] - 1);
                byte b8 = b7;
                Object[] objArr17 = new Object[1];
                d(b7, b8, b8, objArr17);
                objArr = (Object[]) cls4.getMethod((String) objArr17[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr15);
                int i10 = ((int[]) objArr[0])[0];
                int i11 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) (37566 - TextUtils.indexOf((CharSequence) "", '0'));
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 625;
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 14;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[5];
                        Object[] objArr18 = new Object[1];
                        a((byte) (-b9), bArr5[7], (byte) (-b9), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, minimumFlingVelocity, iResolveOpacity, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr19 = new Object[1];
                        c(new int[]{0, 22, 0, 5}, false, new byte[]{1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0}, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        c(new int[]{22, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 37567);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 625;
                            int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 14;
                            byte[] bArr6 = $$a;
                            byte b10 = bArr6[7];
                            Object[] objArr21 = new Object[1];
                            a(b10, b10, (byte) (-bArr6[5]), objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionGroup, iMakeMeasureSpec, packedPositionGroup2, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cMyPid = (char) (37567 - (Process.myPid() >> 22));
                            int i12 = 625 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int iResolveSizeAndState = 14 - View.resolveSizeAndState(0, 0, 0);
                            byte[] bArr7 = $$a;
                            byte b11 = bArr7[7];
                            byte b12 = b11;
                            Object[] objArr22 = new Object[1];
                            a(b11, (byte) (-bArr7[5]), b12, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyPid, i12, iResolveSizeAndState, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                        int i14 = i13 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i15 = ((int[]) objArr[0])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 == i15) {
            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
            int i18 = i17 % 2;
            int i19 = ((int[]) objArr[1])[0];
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[0])[0];
            String[] strArr3 = (String[]) objArr[3];
            int iNextInt = new Random().nextInt();
            int i22 = i19 + (-230863111) + (((~((~iNextInt) | (-530945150))) | 1292792971) * (-235)) + (((~((-530945150) | iNextInt)) | 1292792971) * (-470)) + (((~(iNextInt | (-312574069))) | 1074421890) * 235);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr2[1])[0] = i24 ^ (i24 << 5);
            objArr2 = new Object[]{new int[]{i21}, new int[1], new int[]{i20}, strArr3};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr4 = (String[]) objArr[3];
            if (strArr4 != null) {
                int i25 = 0;
                while (i25 < strArr4.length) {
                    int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
                    if (i26 % 2 == 0) {
                        arrayList.add(strArr4[i25]);
                        i25 += 66;
                    } else {
                        arrayList.add(strArr4[i25]);
                        i25++;
                    }
                }
            }
            int[] iArr2 = new int[i16];
            int i27 = i16 - 1;
            iArr2[i27] = 1;
            Toast.makeText((Context) null, iArr2[((i16 * i27) % 2) - 1], 1).show();
            int i28 = ((int[]) objArr[1])[0];
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[0])[0];
            String[] strArr5 = (String[]) objArr[3];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i31 = ~iElapsedRealtime;
            int i32 = i28 + (-1832826223) + (((~(i31 | 1182746853)) | (-1719650536) | (~((-104087586) | iElapsedRealtime))) * 717) + (((~(iElapsedRealtime | 1182746853)) | (~(i31 | (-104087586))) | (-1719650536)) * 717);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr2[1])[0] = i34 ^ (i34 << 5);
            objArr2 = new Object[]{new int[]{i30}, new int[1], new int[]{i29}, strArr5};
        }
        if (obj == null) {
            return -1;
        }
        int size2 = size();
        int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i35 % 128;
        int i36 = i35 % 2;
        for (int i37 = 0; i37 < size2; i37++) {
            int i38 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i38 % 128;
            int i39 = i38 % 2;
            if (obj.equals(get(i37))) {
                int i40 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i40 % 128;
                int i41 = i40 % 2;
                return i37;
            }
        }
        int i42 = ((int[]) objArr2[1])[0];
        int i43 = i42 * i42;
        int i44 = -(1310189354 * i42);
        int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
        int i46 = -(i42 * (-824063884));
        int i47 = (((i45 | i46) << 1) - (i46 ^ i45)) - (-1786075489);
        int i48 = i47 >> 24;
        int i49 = (i48 - 511) / 256;
        int i50 = ((i49 | 1) << 1) - (i49 ^ 1);
        int i51 = (i47 ^ i50) + ((i47 & i50) << 1);
        int i52 = ((i48 ^ (-511)) + ((i48 & (-511)) << 1)) / 256;
        int i53 = -(((i52 ^ 1) + ((i52 & 1) << 1)) ^ i51);
        int i54 = ((i53 | 9) << 1) - (i53 ^ 9);
        int i55 = i54 >> 22;
        return (-10125) / (((-(((((i55 | (-2047)) << 1) - (i55 ^ (-2047))) / 1024) + 2)) & i54) * 1125);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        zzac zzacVarZzk = zzk(0);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return zzacVarZzk;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = 2 % 2;
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            if (obj.equals(get(size))) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
                return size;
            }
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 == 0) {
            return -1;
        }
        throw null;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        zzac zzacVarZzk = zzk(0);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return zzacVarZzk;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ List subList(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        zzp zzpVarZzf = zzf(i, i2);
        if (i5 == 0) {
            int i6 = 69 / 0;
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        if (i7 % 2 != 0) {
            return zzpVarZzf;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    int zza(Object[] objArr, int i) {
        int i2 = 2 % 2;
        int size = size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 == 0) {
                objArr[i3] = get(i3);
                i3 += 70;
            } else {
                objArr[i3] = get(i3);
                i3++;
            }
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return size;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    /* JADX INFO: renamed from: zzd */
    public final zzab iterator() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        zzac zzacVarZzk = zzk(0);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return zzacVarZzk;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        zzac zzacVarZzk = zzk(i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return zzacVarZzk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r5 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r4 = com.google.android.gms.internal.mlkit_vision_common.zzu.zza;
        r5 = com.google.android.gms.internal.mlkit_vision_common.zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
        com.google.android.gms.internal.mlkit_vision_common.zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if ((r5 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        return new com.google.android.gms.internal.mlkit_vision_common.zzo(r3, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r5 == size()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r5 == size()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.mlkit_vision_common.zzp zzf(int r4, int r5) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.internal.mlkit_vision_common.zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r1 = r1 + 33
            int r2 = r1 % 128
            com.google.android.gms.internal.mlkit_vision_common.zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1d
            int r1 = r3.size()
            com.google.android.gms.internal.mlkit_vision_common.zzf.zzc(r4, r5, r1)
            int r5 = r5 >> r4
            int r1 = r3.size()
            if (r5 != r1) goto L2c
            goto L2b
        L1d:
            int r1 = r3.size()
            com.google.android.gms.internal.mlkit_vision_common.zzf.zzc(r4, r5, r1)
            int r5 = r5 - r4
            int r1 = r3.size()
            if (r5 != r1) goto L2c
        L2b:
            return r3
        L2c:
            if (r5 != 0) goto L3e
            com.google.android.gms.internal.mlkit_vision_common.zzp r4 = com.google.android.gms.internal.mlkit_vision_common.zzu.zza
            int r5 = com.google.android.gms.internal.mlkit_vision_common.zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r5 = r5 + 59
            int r1 = r5 % 128
            com.google.android.gms.internal.mlkit_vision_common.zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L3c
            return r4
        L3c:
            r4 = 0
            throw r4
        L3e:
            com.google.android.gms.internal.mlkit_vision_common.zzo r0 = new com.google.android.gms.internal.mlkit_vision_common.zzo
            r0.<init>(r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_common.zzp.zzf(int, int):com.google.android.gms.internal.mlkit_vision_common.zzp");
    }

    public final zzac zzk(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            zzf.zzb(i, size(), FirebaseAnalytics.Param.INDEX);
            isEmpty();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzf.zzb(i, size(), FirebaseAnalytics.Param.INDEX);
        if (isEmpty()) {
            return zza;
        }
        zzn zznVar = new zzn(this, i);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return zznVar;
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = TuitionPaymentFragmentbindingInflater1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 83;
                $10 = i10 % 128;
                int i11 = i10 % i;
                try {
                    Object[] objArr2 = new Object[i5];
                    objArr2[i3] = Integer.valueOf(cArr[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) (ExpandableListView.getPackedPositionForGroup(i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i3) == 0L ? 0 : -1));
                        int iIndexOf = 1270 - TextUtils.indexOf("", "", i3, i3);
                        int iCombineMeasuredStates = View.combineMeasuredStates(i3, i3) + 18;
                        byte b2 = (byte) 5;
                        byte b3 = (byte) (b2 - 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, iCombineMeasuredStates, 407021364, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i9++;
                    i = 2;
                    i3 = 0;
                    i5 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i12 = $10 + 83;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i4, cArr3, 0, i6);
        if (bArr != null) {
            int i14 = $11 + 25;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr4 = new char[i6];
            setvideostabilizationmode.b = 0;
            char c2 = 0;
            while (setvideostabilizationmode.b < i6) {
                int i16 = $10 + 43;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i18 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 3226 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Color.alpha(0) + 13, 2133916302, false, $$g((byte) 6, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i18] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i19 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char offsetAfter = (char) (29944 - TextUtils.getOffsetAfter("", 0));
                        int i20 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
                        int iIndexOf2 = 23 - TextUtils.indexOf("", "", 0);
                        byte length2 = (byte) $$c.length;
                        byte b5 = (byte) (length2 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter, i20, iIndexOf2, 387247676, false, $$g(length2, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i19] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 41241), 1705 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 21, -1434471773, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i21 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i21, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i21);
        }
        if (z) {
            int i22 = $11 + 47;
            $10 = i22 % 128;
            int i23 = 2;
            int i24 = i22 % 2;
            char[] cArr6 = new char[i6];
            setvideostabilizationmode.b = 0;
            int i25 = $11 + 89;
            $10 = i25 % 128;
            int i26 = i25 % 2;
            while (setvideostabilizationmode.b < i6) {
                int i27 = $10 + 11;
                $11 = i27 % 128;
                int i28 = i27 % i23;
                cArr6[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
                i23 = 2;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i29 = 0;
            while (true) {
                setvideostabilizationmode.b = i29;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                int i30 = $10 + 5;
                $11 = i30 % 128;
                int i31 = i30 % 2;
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i29 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{59690, 59740, 59750, 59746, 59756, 59757, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59705, 59747, 59757, 59747, 59770, 59751, 59759, 59728, 59728, 59752, 59757, 59771, 59749, 59744, 59746, 59750, 59745, 59749, 59760, 59770, 59734, 59785, 59766, 59769, 59764, 59769, 59766, 59751, 59713, 59708, 59762, 59762, 59745, 59708, 59750, 59769, 59763, 59760, 59750, 59772, 59745, 59764, 59400, 59392, 59903, 59897, 59393, 59395, 59407, 59403, 59895, 59407, 59395, 59405, 59395, 59401, 59405, 59398, 59399, 59767, 59901, 59896, 59879, 59874, 59872, 59886, 59872, 59872, 59852, 59846, 59885, 59884, 59873, 59841, 59851, 59711, 59757, 59759, 59746, 59770, 59749, 59749, 59773, 59755, 59743, 59745, 59750, 59742, 59730, 59746, 59759, 59721, 59798, 59836, 59838, 59832, 59832, 59837, 59819, 59778, 59818, 59827, 59796, 59796, 59836, 59838, 59798, 59779, 59789, 59790, 59796, 59796, 59779, 59778, 59797, 59838, 59819, 59797, 59792, 59791, 59798, 59797, 59779, 59776, 59796, 59792, 59788, 59788, 59784, 59789, 59797, 59838, 59796, 59789, 59779, 59818, 59836, 59797, 59789, 59798, 59793, 59789, 59797, 59799, 59779, 59788, 59799, 59796, 59777, 59779, 59798, 59839, 59837, 59797, 59799, 59781, 59404, 59897, 59897, 59896, 59899, 59899, 59404, 59406, 59406, 59405, 59395, 59395, 59899, 59877, 59877, 59877, 59879, 59878, 59404, 59405, 59406, 59414, 59400, 59406, 59412, 59395, 59405, 59406, 59879, 59878, 59404, 59415, 59415, 59413, 59395, 59878, 59401, 59407, 59878, 59405, 59413, 59407, 59879, 59878, 59406, 59404, 59896, 59395, 59395, 59899, 59878, 59878, 59876, 59899, 59395, 59412, 59406, 59879, 59400, 59414, 59405, 59879, 59878};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r5, short r6, short r7) {
        /*
            int r5 = 105 - r5
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r1 = com.google.android.gms.internal.mlkit_vision_common.zzp.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r5
            r5 = r6
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
        L27:
            int r5 = r5 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_common.zzp.$$g(short, short, short):java.lang.String");
    }
}
